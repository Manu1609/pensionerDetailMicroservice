package com.pension;

import static org.assertj.core.api.Assertions.assertThat;

import java.text.ParseException;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pension.entity.PensionerDetail;
import com.pension.util.DateUtil;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PensionerDetailMicroserviceApplication.class)
class PensionerDetailMicroserviceApplicationTests {
	@Test
	void contextLoads() {
	}

	@Test
	void main() {
		PensionerDetailMicroserviceApplication.main(new String[] {});
	}

	@Test
	void testNoArgs() {
		assertThat(new PensionerDetail()).isNotNull();
	}

	@Test
	void testAllArgs() throws ParseException {
		PensionerDetail pensionerDetail = new PensionerDetail("Manoj", DateUtil.parseDate("16-09-1998"), "ABCD1234",
				Double.parseDouble("270000.00"), Double.parseDouble("10000"), "self", "ICICI",
				Long.parseLong("12345678"), "private");
	}

	@Test
	void testSetterMethod() throws ParseException {
		PensionerDetail pensionerDetail = new PensionerDetail();
		pensionerDetail.setName("Parthik");
		pensionerDetail.setDob(DateUtil.parseDate("16-09-1998"));
		pensionerDetail.setPan("BSDPS1495K");
		pensionerDetail.setSalary((double) 29000);
		pensionerDetail.setAllowances((double) 1200);
		pensionerDetail.setPensionType("self");
		pensionerDetail.setBankName("SBI");
		pensionerDetail.setAccountNumber((long) 12345678);
		pensionerDetail.setBankType("private");

		assertThat(assertThat(pensionerDetail).isNotNull());
	}

//	@Test
//	void testEqualAndHashCode() throws ParseException {
//		PensionerDetail pensionerDetail1 = new PensionerDetail("Parthik", DateUtil.parseDate("16-09-1998"),
//				"BSDPS1495K", Double.parseDouble("29000"), Double.parseDouble("1200"), "self", "SBI",
//				Long.parseLong("12345678"), "private");
//		PensionerDetail pensionerDetail2 = new PensionerDetail("Parthik", DateUtil.parseDate("16-09-1998"),
//				"BSDPS1495K", Double.parseDouble("29000"), Double.parseDouble("1200"), "self", "SBI",
//				Long.parseLong("12345678"), "private");
//
//		assertThat(assertThat(pensionerDetail1).isEqualTo(pensionerDetail2));
//	}
//
	@Test
	void testNotEqualAndHashCode() throws ParseException {
		PensionerDetail pensionerDetail1 = new PensionerDetail("Shubhm", DateUtil.parseDate("16-09-1998"), "BSDPS1495K",
				Double.parseDouble("29000"), Double.parseDouble("1200"), "self", "SBI", Long.parseLong("574748"),
				"private");
		PensionerDetail pensionerDetail2 = new PensionerDetail("Parthik", DateUtil.parseDate("16-09-1998"),
				"BSDPS1495K", Double.parseDouble("29000"), Double.parseDouble("1200"), "self", "SBI",
				Long.parseLong("9776546"), "private");

		assertThat(assertThat(pensionerDetail1).isNotEqualTo(pensionerDetail2));
	}
}