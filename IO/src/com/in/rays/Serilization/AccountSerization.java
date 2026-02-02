package com.in.rays.Serilization;

public class AccountSerization  {

	public String acctype;
	public double balance;
	
	public AccountSerization(String acctype, double balance) {
		this.acctype = acctype;
		this.balance = balance;
		
	}
	
	public String toStrig() {
		return "acctype : " + acctype + " " + "balance : " + balance;
	}
}
