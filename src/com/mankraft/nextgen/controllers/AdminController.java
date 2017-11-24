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

import com.mankraft.nextgen.form.AdminForm;
import com.mankraft.nextgen.form.Enquiry;
import com.mankraft.nextgen.service.AdminService;

@Component
@Controller
public class AdminController {

	static final Logger LOGGER = Logger.getLogger(AdminController.class);

	@Autowired
	private AdminService adminService;

	@RequestMapping(value = { "/admin.htm", "/adminDummyView.htm" }, method = RequestMethod.GET)
	public ModelAndView showadminFormPage(@ModelAttribute("adminForm") AdminForm adminForm) {
		return new ModelAndView("adminRegister", "command", new AdminForm());

	}

	@RequestMapping(value = { "/adminLoginView.htm" }, method = RequestMethod.GET)
	public ModelAndView showAdminLoginPage(@ModelAttribute("adminForm") AdminForm adminForm) {
		return new ModelAndView("adminLogin", "command", new AdminForm());

	}
	
	
	@RequestMapping(value = { "/adminHomeView.htm" }, method = RequestMethod.GET)
	public ModelAndView showAdminHomePage(@ModelAttribute("adminForm") AdminForm adminForm) {
		return new ModelAndView("adminHome", "command", new AdminForm());

	}

	@RequestMapping(value = "/adminLogin.htm", method = RequestMethod.POST)
	public ModelAndView submitAdminLogin(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("adminForm") AdminForm adminForm, BindingResult result) throws DataAccessException {

		Cookie ck = new Cookie("adminLoginCookie", "adminLogged");
		ck.setMaxAge(2592000);
		/*ck.setDomain("localhost");
		ck.setHttpOnly(true); 
		ck.setSecure(true); 
		ck.setComment("adminLoggin");*/ 
		response.addCookie(ck);

		boolean adminExists = false;

		try {

			adminExists = adminService.validateAdminLogin(adminForm);

		} catch (DataAccessException e) {
			e.printStackTrace();

			LOGGER.error(" admin login error failed due to incorrect login details");
		}

		if (adminExists == true) {

			List<Enquiry> studentList = adminService.getStudents();
			
			String admin= adminForm.getEmail();
			
			String adminName = admin.substring(0, 9);
			
			LOGGER.info("students list is " + studentList);
			HttpSession session = request.getSession();
			session.setAttribute("studentList", studentList);
/*
			List<String> refNumber=adminService.getCustomerReferenceNumbers();
			LOGGER.info("referencNumber is  " +refNumber);
			session.setAttribute("refNumbers", refNumber);
			*/
			session.setAttribute("adminName", adminName);
			
			return new ModelAndView("adminHome", "command", new AdminForm());
		}

		return new ModelAndView("adminLogin", "command", new AdminForm());

	}

	@RequestMapping(value = "/adminSubmit.htm", method = RequestMethod.POST)
	public String submitadminForm(@ModelAttribute("adminForm") AdminForm adminForm, BindingResult result)
			throws DataAccessException {

		try {

			adminService.saveAdmin(adminForm);
		} catch (DataAccessException e) {
			e.printStackTrace();

			LOGGER.error("admin register error: failed due to incorrect data");

		}

		return "redirect:/adminLoginView.htm";

	}

	/*@RequestMapping(value = "/assignAccountNumber.htm", method = RequestMethod.POST)
	public String assignAccNoToCustomer(HttpServletRequest request, HttpServletResponse response,@ModelAttribute("assignAdmissionToStudent") AssignAdmissionToStudent assignAdmissionToStudent, BindingResult result)
			throws DataAccessException {

		try {

			String accBal=adminService.assignAdmissionToStudent(assignAdmissionToStudent);
		
			
		} catch (DataAccessException e) {
			e.printStackTrace();

		}

		return "redirect:assignAccNoToNewCustomerView.htm";

	}
	
	
	@RequestMapping(value = { "/assignAccNoToNewCustomerView.htm" }, method = RequestMethod.GET)
	public ModelAndView showAassignAccountNumberPage(@ModelAttribute("assignAdmissionToStudent") AssignAdmissionToStudent assignAdmissionToStudent) {
		return new ModelAndView("assignAccNoToNewCustomer", "command", new AssignAdmissionToStudent());

	}*/
	
	@RequestMapping(value = "/adminLogout.htm", method = RequestMethod.GET)
	public String submitAdminLogout(HttpSession session,HttpServletRequest request,HttpServletResponse response,
			@ModelAttribute("adminLogout") AdminForm adminForm, BindingResult result) throws DataAccessException {
			
		Cookie ck = new Cookie("adminLoginCookie", "");
		ck.setMaxAge(0);
		
		response.addCookie(ck);
		
		session.getAttribute("adminName");
		
		session.invalidate();
		
		return "redirect:/adminLoginView.htm";

	
	}
	

}
