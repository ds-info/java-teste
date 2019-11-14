package br.net.erponline.model.entity;

import br.net.erponline.model.exceptions.DomainException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		
		result.append("Account: ");
		result.append("Number: " + String.format("%d", this.number));
		result.append(", Holder: " + this.holder);
		result.append(", Balance: " + String.format("%.2f", this.balance));
		result.append(", withdrawLimit: " + String.format("%.2f", this.withdrawLimit));
		
		return result.toString();
	}


	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void deposit(Double amount) {
		this.balance += amount;
	}
	
	public void withdraw(Double amount) {
		if (amount > this.withdrawLimit) {
			throw new DomainException("The amount exceds withdraw limit");
		}
		if (amount > this.balance) {
			throw new DomainException("Not enough Balance");
		}
		
		this.balance -= amount;
	}	
}