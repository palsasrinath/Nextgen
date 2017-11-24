package com.mankraft.nextgen.dao;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.mankraft.nextgen.form.Admission;
import com.mankraft.nextgen.form.ParentDeclaration;


public class AdmissionDAOImpl  implements AdmissionDao{
	static final Logger LOGGER = Logger.getLogger(AdmissionDAOImpl.class);

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
	public int saveAdmission(Admission a) throws DataAccessException {

		String sql = "insert into s_admission (sno,regNo,admToCls,dateofAdm,gender,photo,fname,lname,dob,nationality,mothertng,place,state,domicle,relationship,parentFName,parentLName,mobile,email,fatherEduQualification,motherEduQualification,guardian,address,transportRequirement,dayCare) values('" + a.getSno() + "','" + a.getRegNo() + "','"
				+ a.getAdmToCls() + "','" + a.getDateOfAdm() + "','" + a.getGender() + "','" +a.getPhoto() + "','" +a.getFname() + "','" +a.getLname() + "','" +a.getDob() + "','" +a.getNationality()+ "','" +a.getMothertng() + "','" +a.getPlace() + "','" +a.getState() + "','" +a.getDomicle() + "','" +a.getRelationship()+ "','" +a.getParentFName() + "','" +a.getParentLName() + "','" +a.getMobile() + "','" +a.getEmail() + "','" +a.getFatherEduQualification() + "','" +a.getMotherEduQualification() + "','" +a.getGuardian() + "','" +a.getAddress() + "','" +a.getTransportRequirement() + "','" +a.getDayCare() + "')";
		return jdbcTemplate.update(sql);
	}

	@Override
	public int parentDeclaration(ParentDeclaration p) {
		String sql= "insert into s_parent_declaration (parent,student,photos,records,birth) values ('" + p.getParent() + "','" + p.getStudent() + "','" + p.getPhotos() + "','" + p.getRecords() + "','" + p.getBirth() + "')";
		
		return jdbcTemplate.update(sql);
	}

	

}
