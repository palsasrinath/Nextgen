package com.mankraft.nextgen.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mankraft.nextgen.dao.AdminDAO;
import com.mankraft.nextgen.form.AdminForm;
import com.mankraft.nextgen.form.ChangePassword;
import com.mankraft.nextgen.form.Enquiry;
import com.mankraft.nextgen.form.PrincipalRegister;

@Service
public class AdminServiceImpl implements AdminService{

	static final Logger LOGGER = Logger.getLogger(AdminServiceImpl.class);

	@Autowired
	private AdminDAO adminDAO;

	public void setAdminDAO(AdminDAO adminDAO) {
		this.adminDAO = adminDAO;
	}

	@Override
	@Transactional
	public void saveAdmin(AdminForm adminRegister) {

		adminDAO.saveAdmin(adminRegister);
		
	}

	@Override
	public boolean validateAdminLogin(AdminForm adminRegister) {
		return adminDAO.validateAdminLogin(adminRegister);
	}

	@Override
	@Transactional
	public String changePassword(ChangePassword changePassword) {
		return adminDAO.changePassword(changePassword);
	}

	@Override
	public String forgotPassword(ChangePassword changePassword) {
		return adminDAO.forgotPassword(changePassword);
		
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
	public int getadminId(AdminForm adminForm) {

		return adminDAO.getadminId(adminForm);
	}

	@Override
	public List<Enquiry> getStudents() {
		return adminDAO.getStudents();
	}

	

	
	
}
