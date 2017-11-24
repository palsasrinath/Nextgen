package com.mankraft.nextgen.dao;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.mankraft.nextgen.form.Admission;
import com.mankraft.nextgen.form.Enquiry;

public class EnquiryDaoImpl implements EnquiryDao {
	static final Logger LOGGER = Logger.getLogger(EnquiryDaoImpl.class);

	@Autowired
	private DriverManagerDataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public DriverManagerDataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DriverManagerDataSource dataSource) {
		this.dataSource = dataSource;
	}

	public int save(Enquiry e) throws DataAccessException {
		String sql = "insert into s_enquiry(sno,date,nameOfChild,dateOfBirth,age,gender,admissionToClass,fatherName,motherName,occupation,fatherResidentialAddress,motherResidentialAddress,residenceTelNo,additionalNo,email,fatherOffNo,fatherMob,motherOffNo,motherMob,timeSlot,preferred,transportRequirement,previousSchooling,aboutSchool,others,referenceNumber) values('" + e.getSno() + "','" + e.getDate() + "','"
				+ e.getNameOfChild() + "','" + e.getDateOfBirth() + "','" + e.getAge() + "','" + e.getGender() + "','"
				+ e.getAdmissionToClass() + "','" + e.getFatherName() + "','" + e.getMotherName() + "','"
				+ e.getOccupation() + "','" + e.getFatherResidentialAddress()+ "','" + e.getMotherResidentialAddress() + "','" + e.getResidenceTelNo() + "','"
				+ e.getAdditionalNo() + "','" + e.getEmail() + "','" + e.getFatherOffNo() + "','" + e.getFatherMob() + "','" + e.getMotherOffNo() + "','" + e.getMotherMob() + "','" + e.getTimeSlot() + "','" + e.getPreferred() + "','"
				+ e.getTransportRequirement() + "','" + e.getPreviousSchooling() + "','" + e.getAboutSchool() + "','"
				+ e.getOthers() + "','" + e.getReferenceNumber() + "')";
		return jdbcTemplate.update(sql);
	}

}
