package com.mankraft.nextgen.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.mankraft.nextgen.form.ChangePassword;
import com.mankraft.nextgen.form.Enquiry;
import com.mankraft.nextgen.form.PrincipalRegister;

public class PrincipalDAOImpl implements PrincipalDAO {

	static final Logger LOGGER = Logger.getLogger(PrincipalDAOImpl.class);

	@Autowired
	private DriverManagerDataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	/**
	 * @return the jdbcTemplate
	 */
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	/**
	 * @param jdbcTemplate
	 *            the jdbcTemplate to set
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	/**
	 * @return the dataSource
	 */
	public DriverManagerDataSource getDataSource() {
		return dataSource;
	}

	/**
	 * @param dataSource
	 *            the dataSource to set
	 */
	public void setDataSource(DriverManagerDataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public int savePrincipal(PrincipalRegister principalRegister) throws DataAccessException {

		String sql = "insert into t_principal_register(first_name,last_Name,email,password,conformpassword,mobileNumber,gender,mobileNumber,address,city,state)  values('"
				+ principalRegister.getFirstName() + "','" + principalRegister.getLastName() + "','" + principalRegister.getEmail() + "', '"
				+ principalRegister.getPassword() + "','" +principalRegister.getConformpassword() + "','" + principalRegister.getMobile() + "','"
				+  principalRegister.getGender() + " ',' " + principalRegister.getAddress() + "','" + principalRegister.getCity() + "',  '"
				+ principalRegister.getState() + "')";
		return jdbcTemplate.update(sql);
	}

	@Override
	public boolean validatePrincipalLogin(PrincipalRegister principalRegister) {

		String sql = "SELECT count(*) from  t_principal_register WHERE email = ? and password=?";

		boolean userExists = false;

		String email = principalRegister.getEmail();

		String password = principalRegister.getPassword();

		int rowcount = jdbcTemplate.queryForObject(sql, new Object[] { email, password }, Integer.class);
		if (rowcount == 1) {
			userExists = true;
		}
		return userExists;
	}

	@Override
	public String changePassword(ChangePassword changePassword) {

		String newPassword = changePassword.getNewPassword();
		String conformPassword = changePassword.getConformPassword();
		String oldPassword = changePassword.getOldPassword();

		String passwordChange = "passowordChangeSuccess";
		
		

		String sql = "update   t_principal_register SET password= '" + newPassword + "' , conformPassword='" + conformPassword
				+ "' where oldPassword='" + oldPassword + "'";
		LOGGER.info(sql);

		int rowcount = jdbcTemplate.update(sql);
		
		LOGGER.info(rowcount);
		
		String sql2 = "update   t_principal_register SET password= '" + newPassword + "' , conformPassword='" + conformPassword + "', oldPassword= '" + newPassword + "' ";
		LOGGER.info(sql2);

		int rowcount1 = jdbcTemplate.update(sql2);

		LOGGER.info(rowcount1);
		
		
		
		if (rowcount == 1) {

			String sql3 = "update  t_principal_register SET oldPassword= '" + newPassword + "' where password='" + newPassword
					+ "'";
			LOGGER.info(sql3);

			int rowcount2 = jdbcTemplate.update(sql);

			return passwordChange;
		}
		return "passowordChangeFailed";
	}

	@Override
	public String forgotPassword(ChangePassword changePassword) {

		String sql = "update  t_principal_register SET newPassword='" + changePassword.getNewPassword() + "' where userName='"+ changePassword.getUserName() + "'";
		
		LOGGER.info(sql);

		int record = jdbcTemplate.update(sql);

		return null;
	}

	public List<Enquiry> getStudents() {

		return jdbcTemplate.query(
				"select nameOfChild,fatherName,residenceTelNo,email,referenceNumber from s_enquiry",
				new RowMapper<Enquiry>() {

					@Override
					public Enquiry mapRow(java.sql.ResultSet rs, int row) throws SQLException {
						Enquiry e = new Enquiry();
						e.setNameOfChild(rs.getString("nameOfChild"));
						e.setFatherName(rs.getString("fatherName"));
						e.setResidenceTelNo(rs.getString("residenceTelNo"));
						e.setEmail(rs.getString("email"));
						e.setReferenceNumber(rs.getString("referenceNumber"));
						//e.setAdmissionStatus(rs.getString("admissionStatus"));
						return e;
					}

				});
	}

	@Override
	public int getprincipalId(PrincipalRegister  principalRegister) {
		// TODO Auto-generated method stub
		return 0;
	}

	

	/*@Override
	public List<String> getCustomerReferenceNumbers() {
		
		//String sql="select referenceNumber from t_customer_create group by referenceNumber";
		String sql="select referenceNumber from t_customer_create where account_number is null";
		
		List<String> referenceNumbersList = getJdbcTemplate().query(sql, new RowMapper<String>(){

			@Override
			public String mapRow(java.sql.ResultSet rs, int rowNum) throws SQLException {
				return rs.getString(1);
			}
			
					
       });
		return referenceNumbersList;
	}
*/
	/*@Override
	public String assignAdmissionToStudent(AssignAdmissionToStudent assignAccNoToCustomer) {
		
		
		
		String referenceNumber = assignAccNoToCustomer.getReferenceNumber();
		
		String selUserNameSql = "SELECT userName from t_customer_create WHERE referenceNumber = ?";


		String userName = (String)jdbcTemplate.queryForObject(selUserNameSql, new Object[] {referenceNumber}, String.class);
		
			
       String sql = "update t_customer_create set account_number='" + assignAccNoToCustomer.getAccountNumber() + "' where "
				+ "referenceNumber='" + assignAccNoToCustomer.getReferenceNumber() + "'";  

		LOGGER.info(sql);

		int record = jdbcTemplate.update(sql);
		
		String sql2="update customer_finance set account_balance=5000,account_number='"+assignAccNoToCustomer.getAccountNumber()+"' where userName='" + userName +"'";

		LOGGER.info(sql2);

		int record2 = jdbcTemplate.update(sql2);
	
		
	    return "";

	}*/

	

	
}
