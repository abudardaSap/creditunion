package com.sapient.endure.model;

import com.sapient.endure.intface.Account;

public class CDAccount implements Account{
	
	public static Long accBalance = 0L;
	public static String accountNumber = null;
	public static String holderName = null;
	public static String accountType = null;

	@Override
	public String withdraw(Long amount) {
		accBalance =  accBalance - amount;
		return "Amount " + amount +"  Deducted";
	}

	@Override
	public String deposit(Long amount) {
		accBalance =  accBalance + amount;
		return "Amount " + amount +"  Credited";
	}

	@Override
	public String transfer(Long amount, String accountNo) {
		if (accountNo.equals(accountNumber)) {
			accBalance =  accBalance - amount;
			return "Amount " + amount +"  Deducted";
		}else {
			accBalance =  accBalance + amount;
			return "Amount " + amount +" Credited";
		}
		
	}

	public CDAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CDAccount(String name, String accountType, Long accBalance) {
		super();
		this.holderName = name;
		this.accountType = accountType;
		this.accBalance = accBalance;
		
	}

	@Override
	public Long getAccBalance() {
		return accBalance;
	}
	

}
