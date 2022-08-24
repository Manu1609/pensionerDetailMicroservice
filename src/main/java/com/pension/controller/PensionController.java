package com.pension.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pension.entity.PensionerDetail;
import com.pension.service.PensionServiceImpl;

@Controller
@RequestMapping("/pension")
public class PensionController {

	@Autowired
	private PensionServiceImpl pensionService;
	
	@GetMapping("/healthcheck")
	public ResponseEntity<String> healthcheck() {
		return new ResponseEntity<>("Healthcheck-ok",HttpStatus.OK);
	}

	@GetMapping(value = "/find/{aadhar}")
	public ResponseEntity<PensionerDetail> findPensionerByAadhar(@PathVariable("aadhar") String aadhar) {
		PensionerDetail pensionerDetail = pensionService.findPensionerByAadhar(aadhar);
		return new ResponseEntity<PensionerDetail>(pensionerDetail, HttpStatus.OK);
	}
	
//	
}
