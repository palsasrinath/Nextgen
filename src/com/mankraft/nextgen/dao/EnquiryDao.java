package com.mankraft.nextgen.dao;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.mankraft.nextgen.form.Admission;
import com.mankraft.nextgen.form.Enquiry;

@Component
@Repository
public interface EnquiryDao {

	static final Logger LOGGER = Logger.getLogger(EnquiryDao.class);


	public int save(Enquiry enquiry);

}
