package br.net.erponline.model.entity;

import java.util.Date;

public class HourContract {
	private int id;
	private Date date;
	private double valuePerHour;
	private int hours;
	
	public HourContract() {
		
	}

	public HourContract(int id, Date date, double valuePerHour, int hours) {
		this.id = id;
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}

	@Override
	public String toString() {
		return "HourContract [id=" + id + 
			   ", date=" + date + 
			   ", valuePerHour=" + valuePerHour + 
			   ", hours=" + hours + "]";
	}

	public double totalValue() {
		return 0;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
}