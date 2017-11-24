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
import com.mankraft.nextgen.service.EnquiryService;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

@Component
@Controller
public class EnquiryController {

	static final Logger LOGGER = Logger.getLogger(EnquiryController.class);
	
	
	@Autowired
	EnquiryService enquiryService;// will inject dao from xml file

	
	@RequestMapping("/enquiryForm.htm")
	public ModelAndView showform() {
		return new ModelAndView("enquiryForm", "command", new Enquiry());
	}

	
	@RequestMapping(value = "/enquiryFormSubmit.htm", method = RequestMethod.POST)
	public String submitadminForm(@ModelAttribute("enquiryForm") Enquiry enquiry, BindingResult result,HttpServletRequest request,HttpServletResponse response)
			throws DataAccessException {

		String referenceNumber = null;
		try {
			referenceNumber = generateReferenceNumber();

			LOGGER.info("referenceNum in controller is" + referenceNumber);

			enquiry.setReferenceNumber(referenceNumber);

			enquiryService.save(enquiry);
			
			request.setAttribute("referenceNumber", referenceNumber);


			
		} catch (DataAccessException e) {
			e.printStackTrace();

			LOGGER.error("admission register error: failed due to incorrect data");

		}

		return "success.jsp";
	

	}
	private String generateReferenceNumber() {
		UUID refIdGen = UUID.randomUUID();

		long hi = refIdGen.getMostSignificantBits();
		long lo = refIdGen.getLeastSignificantBits();

		byte[] bytes = ByteBuffer.allocate(16).putLong(hi).putLong(lo).array();

		BigInteger bigInteger = new BigInteger(bytes);
		String referenceNumber = bigInteger.toString();

		String refNumber = (referenceNumber.substring(2, 7));

		return refNumber;
	}
	

}
