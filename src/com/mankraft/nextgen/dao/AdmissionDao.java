package com.mankraft.nextgen.dao;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.mankraft.nextgen.form.Admission;
import com.mankraft.nextgen.form.ParentDeclaration;

@Component
@Repository
public interface AdmissionDao {

	static final Logger LOGGER = Logger.getLogger(AdmissionDao.class);

	public int saveAdmission(Admission admission);

	public int parentDeclaration(ParentDeclaration p);

}
