package com.pension.entity;



import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;


public class PensionerDetail {


	private String name;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "YYYY-MM-dd", timezone="IST")
	private Date dob;
	private String pan;
	private Double salary;
	private Double allowances;
	private String pensionType;
	private String bankName;
	private Long accountNumber;
	private String bankType;
	/**
	 * @param name
	 * @param dob
	 * @param pan
	 * @param salary
	 * @param allowances
	 * @param pensionType
	 * @param bankName
	 * @param accountNumber
	 * @param bankType
	 */
	public PensionerDetail(String name, Date dob, String pan, Double salary, Double allowances, String pensionType,
			String bankName, Long accountNumber, String bankType) {
		super();
		this.name = name;
		this.dob = dob;
		this.pan = pan;
		this.salary = salary;
		this.allowances = allowances;
		this.pensionType = pensionType;
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		this.bankType = bankType;
	}
	
	public PensionerDetail() {
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}
	/**
	 * @return the pan
	 */
	public String getPan() {
		return pan;
	}
	/**
	 * @param pan the pan to set
	 */
	public void setPan(String pan) {
		this.pan = pan;
	}
	/**
	 * @return the salary
	 */
	public Double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	/**
	 * @return the allowances
	 */
	public Double getAllowances() {
		return allowances;
	}
	/**
	 * @param allowances the allowances to set
	 */
	public void setAllowances(Double allowances) {
		this.allowances = allowances;
	}
	/**
	 * @return the pensionType
	 */
	public String getPensionType() {
		return pensionType;
	}
	/**
	 * @param pensionType the pensionType to set
	 */
	public void setPensionType(String pensionType) {
		this.pensionType = pensionType;
	}
	/**
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}
	/**
	 * @param bankName the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	/**
	 * @return the accountNumber
	 */
	public Long getAccountNumber() {
		return accountNumber;
	}
	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	/**
	 * @return the bankType
	 */
	public String getBankType() {
		return bankType;
	}
	/**
	 * @param bankType the bankType to set
	 */
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	
	
	
}
