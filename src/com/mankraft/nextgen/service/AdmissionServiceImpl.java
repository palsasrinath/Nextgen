package com.mankraft.nextgen.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.mankraft.nextgen.dao.AdmissionDao;
import com.mankraft.nextgen.form.Admission;
import com.mankraft.nextgen.form.ParentDeclaration;


public class AdmissionServiceImpl implements AdmissionService{
	static final Logger LOGGER = Logger.getLogger(AdmissionServiceImpl.class);

	@Autowired
	private AdmissionDao admissionDAO;

	public void setAdmissionDAO(AdmissionDao admissionDAO) {
		this.admissionDAO = admissionDAO;
	}
    @Override
	@Transactional
	public void saveAdmission(Admission admission) {

    	admissionDAO.saveAdmission(admission);
		
	}
    @Override
	@Transactional
	public void parentDeclaration(ParentDeclaration p) {

    	admissionDAO.parentDeclaration(p);
		
	}

}
