package com.sapient.endure.intface;

public interface Account {
	
	public String withdraw(Long amount);
	public String deposit(Long amount);
	public String transfer(Long amount, String accountNo);
	public Long getAccBalance();
}
