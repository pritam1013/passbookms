package com.capg.pecunia.passbook.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class AccountDetails {
	@Id
	private long accountNumber;
	private String customerName;
	@OneToMany(mappedBy = "AccountDetails", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<PassbookDetails> transactions;
	private long mobileNumber;
	private String branch;
	public AccountDetails(long accountNumber, String customerName, List<PassbookDetails> transactions, long mobileNumber,
			String branch) {
		super();
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.transactions = transactions;
		this.mobileNumber = mobileNumber;
		this.branch = branch;
	}
	/**
	 * @return the accountNumber
	 */
	public long getAccountNumber() {
		return accountNumber;
	}
	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * @return the transactions
	 */
	public List<PassbookDetails> getTransactions() {
		return transactions;
	}
	/**
	 * @param transactions the transactions to set
	 */
	public void setTransactions(List<PassbookDetails> transactions) {
		this.transactions = transactions;
	}
	/**
	 * @return the mobileNumber
	 */
	public long getMobileNumber() {
		return mobileNumber;
	}
	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	/**
	 * @return the branch
	 */
	public String getBranch() {
		return branch;
	}
	/**
	 * @param branch the branch to set
	 */
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "AccountDetails [accountNumber=" + accountNumber + ", customerName=" + customerName + ", transactions="
				+ transactions + ", mobileNumber=" + mobileNumber + ", branch=" + branch + "]";
	}
	
}
