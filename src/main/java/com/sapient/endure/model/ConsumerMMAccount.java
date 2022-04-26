package com.sapient.endure.model;

public class ConsumerMMAccount extends MMAccount {
	public static final int LIMIT_AMOUNT = 750;

	public ConsumerMMAccount(String name, String accountType, Long accBalance) {
		super(name, accountType, accBalance);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String withdraw(Long amount) {
		if (amount< LIMIT_AMOUNT) {
			accBalance =  accBalance - amount;
			return "Amount " + amount +"  Deducted";
		}else {
			return "Withdraw Limit Exceeded";
		}
	}

	@Override
	public String toString() {
		return "ConsumerMMAccount [AccountNumber: "+ accountNumber +"HolderName: "+ holderName +" Balance "+ accBalance +"]";
	}
	
	

}
