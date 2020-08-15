package com.capg.pecunia.passbook.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonBackReference;
@Entity
public class PassbookDetails {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "accountNumber")
	@JsonBackReference
	private long accountNumber; 
	@Id
	private long transaction_id;
	private double transAmount;
	@DateTimeFormat(pattern="yyyy-MM-ddThh:mm:ss")
	private LocalDate transDate;
	private double transClosingBalance;
	
	
	
	public PassbookDetails(long accountNumber, long transaction_id, double transAmount, LocalDate transDate,
			double transClosingBalance) {
		super();
		this.accountNumber = accountNumber;
		this.transaction_id = transaction_id;
		this.transAmount = transAmount;
		this.transDate = transDate;
		this.transClosingBalance = transClosingBalance;
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public long getTransaction_id() {
		return transaction_id;
	}
	
	public void setTransaction_id(long transaction_id) {
		this.transaction_id = transaction_id;
	}
	
	public double getTransAmount() {
		return transAmount;
	}
	/**
	 * @param transAmount the transAmount to set
	 */
	public void setTransAmount(double transAmount) {
		this.transAmount = transAmount;
	}
	/**
	 * @return the transDate
	 */
	public LocalDate getTransDate() {
		return transDate;
	}
	/**
	 * @param transDate the transDate to set
	 */
	public void setTransDate(LocalDate transDate) {
		this.transDate = transDate;
	}
	/**
	 * @return the transClosingBalance
	 */
	public double getTransClosingBalance() {
		return transClosingBalance;
	}
	
	public void setTransClosingBalance(double transClosingBalance) {
		this.transClosingBalance = transClosingBalance;
	}
	@Override
	public String toString() {
		return "Transaction [accountNumber=" + accountNumber + ", transaction_id=" + transaction_id + ", transAmount="
				+ transAmount + ", transDate=" + transDate + ", transClosingBalance=" + transClosingBalance + "]";
	}
	

}
