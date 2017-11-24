package com.mankraft.nextgen.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.mankraft.nextgen.form.Enquiry;

@Service
public interface EnquiryService {

	static final Logger LOGGER = Logger.getLogger(EnquiryService.class);
	void save(Enquiry enquiry);

}
