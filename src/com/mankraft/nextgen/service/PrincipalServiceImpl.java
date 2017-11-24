package com.mankraft.nextgen.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.mankraft.nextgen.dao.PrincipalDAO;

import com.mankraft.nextgen.form.ChangePassword;
import com.mankraft.nextgen.form.Enquiry;
import com.mankraft.nextgen.form.PrincipalRegister;

@Service
public class PrincipalServiceImpl implements PrincipalService{

	static final Logger LOGGER = Logger.getLogger(PrincipalServiceImpl.class);

	@Autowired
	private PrincipalDAO principalDAO;

	public void setPrincipalDAO(PrincipalDAO principalDAO) {
		this.principalDAO = principalDAO;
	}

	@Override
	@Transactional
	public void savePrincipal(PrincipalRegister principalRegister) {

		principalDAO.savePrincipal(principalRegister);
		
	}

	@Override
	public boolean validatePrincipalLogin(PrincipalRegister principalRegister) {
		return principalDAO.validatePrincipalLogin(principalRegister);
	}

	@Override
	@Transactional
	public String changePassword(ChangePassword changePassword) {
		return principalDAO.changePassword(changePassword);
	}

	@Override
	public String forgotPassword(ChangePassword changePassword) {
		return principalDAO.forgotPassword(changePassword);
		
	}

	/*@Override
	public List<Enquiry> getCustomers() {
		return adminDAO.getCustomers();
	}*/

	/*@Override
	public List<String> getCustomerReferenceNumbers() {
		return adminDAO.getCustomerReferenceNumbers();
	}*/

	/*@Override
	public String assignAdmissionToStudent(AssignAdmissionToStudent assignAccNoToCustomer) {
		return adminDAO.assignAdmissionToStudent(assignAccNoToCustomer);
	}*/

	

	@Override
	public List<Enquiry> getStudents() {
		return principalDAO.getStudents();
	}

	

	


	



	
}
