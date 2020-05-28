package com.Deadlybeat.repository.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "policy_tbl")
public class Policy {

	@Id
	@Column(name = "folio_number")	
	private int id;
	private String policyHolderName;
	private String company;
	private String policyName;
	private String policyType; // FD or SIP
	private String fundType; // midcap small cap large cap
	private String createdDate;
	private String maturityDate;
	private String maturityYears;
	private int   investedAmount;
	private int   maturityAmount;
	
	public Policy() {
		super();
	}
	

	public Policy(int id, String policyHolderName, String company, String policyName,
			String policyType, String fundType, String createdDate, String maturityDate, String maturityYears,
			int investedAmount, int maturityAmount) {
		super();
		this.id = id;
		this.policyHolderName = policyHolderName;
		this.company = company;
		this.policyName = policyName;
		this.policyType = policyType;
		this.fundType = fundType;
		this.createdDate = createdDate;
		this.maturityDate = maturityDate;
		this.maturityYears = maturityYears;
		this.investedAmount = investedAmount;
		this.maturityAmount = maturityAmount;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPolicyHolderName() {
		return policyHolderName;
	}
	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getPolicyType() {
		return policyType;
	}
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public String getFundType() {
		return fundType;
	}
	public void setFundType(String fundType) {
		this.fundType = fundType;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getMaturityDate() {
		return maturityDate;
	}
	public void setMaturityDate(String maturityDate) {
		this.maturityDate = maturityDate;
	}
	public String getMaturityYears() {
		return maturityYears;
	}
	public void setMaturityYears(String maturityYears) {
		this.maturityYears = maturityYears;
	}
	public int getInvestedAmount() {
		return investedAmount;
	}
	public void setInvestedAmount(int investedAmount) {
		this.investedAmount = investedAmount;
	}
	public int getMaturityAmount() {
		return maturityAmount;
	}
	public void setMaturityAmount(int maturityAmount) {
		this.maturityAmount = maturityAmount;
	}
	
}
