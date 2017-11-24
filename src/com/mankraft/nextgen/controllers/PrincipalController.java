package com.mankraft.nextgen.controllers;



import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mankraft.nextgen.form.Enquiry;
import com.mankraft.nextgen.form.PrincipalRegister;
import com.mankraft.nextgen.service.PrincipalService;


@Component
@Controller
public class PrincipalController {

	static final Logger LOGGER = Logger.getLogger(PrincipalController.class);

	@Autowired
	private PrincipalService principalService;

	@RequestMapping(value = { "/principal.htm", "/principalDummyView.htm" }, method = RequestMethod.GET)
	public ModelAndView showprincipalRegisterPage(@ModelAttribute("principalRegister") PrincipalRegister principalRegister) {
		return new ModelAndView("principalRegister", "command", new PrincipalRegister());

	}

	@RequestMapping(value = { "/principalLoginView.htm" }, method = RequestMethod.GET)
	public ModelAndView showPrincipalLoginPage(@ModelAttribute("principalRegister") PrincipalRegister principalRegister) {
		return new ModelAndView("principalLogin", "command", new PrincipalRegister());

	}
	
	
	@RequestMapping(value = { "/principalHomeView.htm" }, method = RequestMethod.GET)
	public ModelAndView showPrincipalHomePage(@ModelAttribute("principalRegister") PrincipalRegister principalRegister) {
		return new ModelAndView("principalHome", "command", new PrincipalRegister());

	}

	@RequestMapping(value = "/principalLogin.htm", method = RequestMethod.POST)
	public ModelAndView submitprincipalLogin(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("principalRegister") PrincipalRegister principalRegister, BindingResult result) throws DataAccessException {

		Cookie ck = new Cookie("principalLoginCookie", "principalLogged");
		ck.setMaxAge(2592000);
		/*ck.setDomain("localhost");
		ck.setHttpOnly(true); 
		ck.setSecure(true); 
		ck.setComment("principalLoggin");*/ 
		response.addCookie(ck);

		boolean principalExists = false;

		try {

			principalExists = principalService.validatePrincipalLogin(principalRegister);

		} catch (DataAccessException e) {
			e.printStackTrace();

			LOGGER.error(" principal login error failed due to incorrect login details");
		}

		if (principalExists == true) {

			List<Enquiry> studentList = principalService.getStudents();
			
			String principal= principalRegister.getFirstName();
			
			//String principalName  =principal.substring(0, 9);
			
			LOGGER.info("students list is " + studentList);
			HttpSession session = request.getSession();
			session.setAttribute("studentList", studentList);
/*
			List<String> refNumber=principalService.getCustomerReferenceNumbers();
			LOGGER.info("referencNumber is  " +refNumber);
			session.setAttribute("refNumbers", refNumber);
			*/
			session.setAttribute("principal", principal);
			
			return new ModelAndView("principalHome", "command", new  PrincipalRegister());
		}

		return new ModelAndView("principalLogin", "command", new  PrincipalRegister());

	}

	@RequestMapping(value = "/principalSubmit.htm", method = RequestMethod.POST)
	public String submitPrincipalRegister(@ModelAttribute("principalRegister") PrincipalRegister principalRegister, BindingResult result)
			throws DataAccessException {

		try {

			principalService.savePrincipal(principalRegister);
		} catch (DataAccessException e) {
			e.printStackTrace();

			LOGGER.error("principal register error: failed due to incorrect data");

		}

		return "redirect:/principalLoginView.htm";

	}

	/*@RequestMapping(value = "/assignAccountNumber.htm", method = RequestMethod.POST)
	public String assignAccNoToCustomer(HttpServletRequest request, HttpServletResponse response,@ModelAttribute("assignAdmissionToStudent") AssignAdmissionToStudent assignAdmissionToStudent, BindingResult result)
			throws DataAccessException {

		try {

			String accBal=principalService.assignAdmissionToStudent(assignAdmissionToStudent);
		
			
		} catch (DataAccessException e) {
			e.printStackTrace();

		}

		return "redirect:assignAccNoToNewCustomerView.htm";

	}
	
	
	@RequestMapping(value = { "/assignAccNoToNewCustomerView.htm" }, method = RequestMethod.GET)
	public ModelAndView showAassignAccountNumberPage(@ModelAttribute("assignAdmissionToStudent") AssignAdmissionToStudent assignAdmissionToStudent) {
		return new ModelAndView("assignAccNoToNewCustomer", "command", new AssignAdmissionToStudent());

	}*/
	
	@RequestMapping(value = "/principalLogout.htm", method = RequestMethod.GET)
	public String submitPrincipalLogout(HttpSession session,HttpServletRequest request,HttpServletResponse response,
			@ModelAttribute("principalLogout") PrincipalRegister principalRegister, BindingResult result) throws DataAccessException {
			
		Cookie ck = new Cookie("principalLoginCookie", "");
		ck.setMaxAge(0);
		
		response.addCookie(ck);
		
		session.getAttribute("principalName");
		
		session.invalidate();
		
		return "redirect:/principalLoginView.htm";

	
	}
	

}

