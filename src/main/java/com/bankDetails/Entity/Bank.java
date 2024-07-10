package com.bankDetails.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Table(name="bankdet")
@Entity
public class Bank {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String bankname;
	private String ifsccode;
	private String branch;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBankName() {
		return bankname;
	}
	public void setBankName(String bankName) {
		this.bankname = bankName;
	}
	public String getIFSCCode() {
		return ifsccode;
	}
	public void setIFSCCode(String iFSCCode) {
		ifsccode = ifsccode;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	

}
