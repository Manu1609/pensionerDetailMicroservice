package com.pension.controller;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.pension.entity.PensionerDetail;
import com.pension.exceptions.NotFoundException;
import com.pension.service.PensionServiceImpl;
import com.pension.util.DateUtil;

@WebMvcTest
class PensionControllerTest {

	@Value("${errorMessage}")
	private String AADHAR_NUMBER_NOT_FOUND;
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private PensionServiceImpl service;

//	@Test
//	void testFindPensionerFromController() throws Exception {
//		
//		final String aadhar = "123456789032";
//		PensionerDetail pensionerDetail = new PensionerDetail("Yuvaraj",DateUtil.parseDate("16-04-1999"),
//				"TYUOI09874",Double.parseDouble("70000"),Double.parseDouble("12002"),"self","Statebank",Long.parseLong("12345697"),"public");
//		when(service.findPensionerByAadhar(aadhar)).thenReturn(pensionerDetail);
//		mockMvc.perform(get("/find/{aadhar}",aadhar)
//				.accept(MediaType.APPLICATION_JSON))
//				.andExpect(status().isOk())
//				.andExpect(jsonPath("$.name", Matchers.equalTo("Yuvaraj")))
//				.andExpect(jsonPath("$.pan", Matchers.equalTo("TYUOI09874")))
//				.andExpect(jsonPath("$.dob", Matchers.equalTo("16-04-1999")))
//				.andExpect(jsonPath("$.accountNumber", Matchers.equalTo("12345697")));
//	}
	
//	@Test
//	void testForAadharNumberNotFound() throws Exception {
//		final String aadhar = "123456666080";
//		
//		when(service.findPensionerByAadhar(ArgumentMatchers.any()))
//		.thenThrow(new NotFoundException(AADHAR_NUMBER_NOT_FOUND));
//		
//		mockMvc.perform(get("/find/{aadhar}",aadhar)
//				.accept(MediaType.APPLICATION_JSON))
//		.andExpect(status().is4xxClientError())
//		.andExpect(jsonPath("$.message", Matchers.equalTo(AADHAR_NUMBER_NOT_FOUND)));
//	}

}
