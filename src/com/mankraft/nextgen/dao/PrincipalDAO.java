package com.mankraft.nextgen.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


import com.mankraft.nextgen.form.ChangePassword;
import com.mankraft.nextgen.form.Enquiry;
import com.mankraft.nextgen.form.PrincipalRegister;

@Component
@Repository
public interface PrincipalDAO {
	
	static final Logger LOGGER = Logger.getLogger(PrincipalDAO.class);

	public int savePrincipal(PrincipalRegister principalRegister);
	
	public boolean validatePrincipalLogin(PrincipalRegister principalRegister);

	//public String changePassword(ChangePassword changePassword);

	//public String forgotPassword(ChangePassword changePassword);


	//public List<String> getCustomerReferenceNumbers();

	//public List<CustomerForm> getCustomers();

	//public String assignAccNoToCustomer(AssignAccNoToCustomer assignAccNoToCustomer);

	//public int getadminId(AdminForm adminForm);

	public List<Enquiry> getStudents();

	public int getprincipalId(PrincipalRegister principalRegister);

	public String changePassword(ChangePassword changePassword);

	public String forgotPassword(ChangePassword changePassword);

	public static int save(PrincipalRegister ps) {
		// TODO Auto-generated method stub
		return 0;
	}

	

	//public String assignAdmissionToStudent(AssignAdmissionToStudent assignAccNoToCustomer);



}