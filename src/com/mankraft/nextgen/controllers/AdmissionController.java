package com.mankraft.nextgen.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mankraft.nextgen.form.Admission;
import com.mankraft.nextgen.form.Enquiry;
import com.mankraft.nextgen.form.ParentDeclaration;
import com.mankraft.nextgen.service.AdmissionService;
import org.apache.log4j.Logger;

@Component
@Controller
public class AdmissionController {

	static final Logger LOGGER = Logger.getLogger(EnquiryController.class);

	@Autowired
	AdmissionService admissionService;

	@RequestMapping(value = "/admissionForm.htm", method = RequestMethod.GET)
	public ModelAndView showform() {
		return new ModelAndView("admissionForm", "command", new Admission());
	}

	@RequestMapping(value = "/admissionFormSubmit.htm", method = RequestMethod.POST)
	public String submitadminForm(@ModelAttribute("admission") Admission admission, BindingResult result)
			throws DataAccessException {

		try {

			admissionService.saveAdmission(admission);
		} catch (DataAccessException e) {
			e.printStackTrace();

			LOGGER.error("admission register error: failed due to incorrect data");

		}

		return "redirect:/parentDeclarationView.htm";

	}
	
	@RequestMapping(value = {"/parentDeclarationView.htm" }, method = RequestMethod.GET)
	public ModelAndView showParentDeclarationPage(@ModelAttribute("declaration") ParentDeclaration parentDeclaration) {
		return new ModelAndView("declarationByParentForm", "command", new ParentDeclaration());

	}
	@RequestMapping(value = "/parentFormSubmit.htm", method = RequestMethod.POST)
	public String submitenquiryForm(@ModelAttribute("declaration") ParentDeclaration p, BindingResult result)
			throws DataAccessException {

		try {

			admissionService.parentDeclaration(p);
		} catch (DataAccessException e) {
			e.printStackTrace();

			LOGGER.error("enquiry register error: failed due to incorrect data");

		}

		return "parentDeclared";

	}
	
}

