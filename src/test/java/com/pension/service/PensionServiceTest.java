/**
 * 
 */
package com.pension.service;



import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.text.ParseException;

//import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import com.pension.entity.PensionerDetail;
import com.pension.exceptions.NotFoundException;
import com.pension.util.DateUtil;

/**
 * 
 *         This is the service test class
 * 
 *         Test cases for the Pension Detail Service
 *
 */
@SpringBootTest
class PensionServiceTest {

    @Autowired
    PensionServiceImpl pds;

    @Value("${errorMessage}")
    private String AADHAAR_NUMBER_NOT_FOUND;

    /**
     * Test the Pensioner Detail service is null or not
     */

    @Test
    void testNotNullPensionDetailServiceObject() {
        assertNotNull(pds);
    }

    /**
     * Test Case for the Correct Details Returned From Service With Correct
     * AadharNumber
     */

    @Test
    void testCorrectDetailsReturnedFromServiceWithCorrectAadharNumber()
            throws IOException, NotFoundException, NumberFormatException,
            com.pension.exceptions.NotFoundException, ParseException, NullPointerException {
        final String aadhaarNumber = "123456789012";

        PensionerDetail pensionerDetail = new PensionerDetail("Achyuth", DateUtil.parseDate("12-09-1956"),
                "BHMER12436",Double.parseDouble("27000"),Double.parseDouble("10000"), "self","ICICI",Long.parseLong("12345678"), "private");
        assertEquals(pds.findPensionerByAadhar(aadhaarNumber).getPan(), pensionerDetail.getPan());
        assertEquals(pds.findPensionerByAadhar(aadhaarNumber).getSalary(),pensionerDetail.getSalary());
    }

    /**
     * Test Case for the incorrect details returned From Service With Invalid
     * Aadhaar Number
     */

    @Test
    void testForIncorrectAadharNumber() {
        final String aadhaarNumber = "12345678";

        NotFoundException exception = assertThrows(NotFoundException.class,
                () -> pds.findPensionerByAadhar(aadhaarNumber));
        assertEquals(exception.getMessage(), AADHAAR_NUMBER_NOT_FOUND);
        assertNotNull(exception);
    }
}