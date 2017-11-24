package com.mankraft.nextgen.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.mankraft.nextgen.form.AdminForm;
import com.mankraft.nextgen.form.ChangePassword;
import com.mankraft.nextgen.form.Enquiry;
import com.mankraft.nextgen.form.PrincipalRegister;

@Service
public interface AdminService {
	
	static final Logger LOGGER = Logger.getLogger(AdminService.class);

	public void saveAdmin(AdminForm adminRegister);

	public boolean validateAdminLogin(AdminForm adminRegister);

	//public String changePassword(ChangePassword changePassword, String adminId);

	public String forgotPassword(ChangePassword changePassword);
	
	//public List<CustomerForm> getCustomers();
	
	//public List<String> getCustomerReferenceNumbers();


	public int getadminId(AdminForm adminForm);

	public List<Enquiry> getStudents();

	public String changePassword(ChangePassword changePassword);

	

	//public String assignAdmissionToStudent(AssignAdmissionToStudent assignAdmissionToStudent);

	//public String changePassword(ChangePassword changePassword);


}
