package com.sapient.endure.utils;

import java.util.concurrent.atomic.AtomicInteger;

public class Utility {
	public static AtomicInteger tempAccountNo =new AtomicInteger(100000);
	
	public String generateAccountNum(String accountType, String accountDet) {
		String genAccountNo = accountType+ accountDet + String.valueOf(tempAccountNo.getAndIncrement());
		return genAccountNo;
	}
}
