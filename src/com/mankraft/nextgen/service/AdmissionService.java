package com.mankraft.nextgen.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.mankraft.nextgen.form.Admission;
import com.mankraft.nextgen.form.Enquiry;
import com.mankraft.nextgen.form.ParentDeclaration;

@Service
public interface AdmissionService {
	static final Logger LOGGER = Logger.getLogger(AdmissionService.class);

	public void saveAdmission(Admission admission);

	public void parentDeclaration(ParentDeclaration p);
}
