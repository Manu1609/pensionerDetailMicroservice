package com.pension.service;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import com.pension.entity.PensionerDetail;

public interface PensionService {

	public PensionerDetail findPensionerByAadhar(String aadhaar) throws NotFoundException; 
}
