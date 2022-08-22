package com.pension.service;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.pension.entity.PensionerDetail;
import com.pension.exceptions.NotFoundException;
import com.pension.util.DateUtil;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PensionServiceImpl implements PensionService {
	
	@Value("${errorMessage}")
	private String AADHAR_NUMBER_NOT_FOUND;
	

		public  PensionerDetail findPensionerByAadhar(String aadhaar) throws NotFoundException {	
		String line = "";		
		BufferedReader br = new BufferedReader(			
				new InputStreamReader(this.getClass().getResourceAsStream("/details.csv")));	
		try {			
			while ((line = br.readLine()) != null) // returns a Boolean value			
				{				// convert record into strings		
				String[] person = line.split(",");			
				// if Aadhaar number is found, then return the details		
				if (aadhaar.contentEquals(person[0])) {			
					//log.info("Details found");	
					PensionerDetail pensionerDetail = new PensionerDetail();
					pensionerDetail.setName(person[1]);
					pensionerDetail.setDob(DateUtil.parseDate(person[2]));
					pensionerDetail.setPan(person[3]);
					pensionerDetail.setSalary(Double.parseDouble(person[4]));
					pensionerDetail.setAllowances(Double.parseDouble(person[5]));
					pensionerDetail.setPensionType(person[6]);
					pensionerDetail.setBankName(person[7]);
					pensionerDetail.setAccountNumber(Long.parseLong(person[8]));
					pensionerDetail.setBankType(person[9]);
					System.out.println(pensionerDetail.getName());
					return pensionerDetail;			
					}
				}		
			} catch (NumberFormatException | IOException | ParseException e) {		
				throw new NotFoundException(AADHAR_NUMBER_NOT_FOUND);		
				}		
		throw new NotFoundException(AADHAR_NUMBER_NOT_FOUND);	
				}
	}
