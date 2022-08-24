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

}
