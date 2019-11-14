package br.net.erponline.model.entity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.net.erponline.model.entity.enums.WorkerLevel;

public class Worker {
	private int id;
	private String name;
	private WorkerLevel level;
	private double baseSalary;
	private Departament departament;
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker() {

	}

	public Worker(int id, String name, WorkerLevel level, double baseSalary, Departament departament) {
		this.id = id;
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departament = departament;
	}

	@Override
	public String toString() {
		return "Worker [id=" + id + 
			   ", name=" + name + 
			   ", level=" + level + 
			   ", baseSalary=" + baseSalary + 
			   ", departament=" + departament + 
			   ", contracts=" + contracts + "]";
	}

	public void addContract(HourContract contract) {
		this.contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	public double income(int year, int month) {
		double sum = this.baseSalary;
		Calendar calendar = Calendar.getInstance();
		
		for (HourContract contract : contracts) {
			
			calendar.setTime(contract.getDate());
			int c_year = calendar.YEAR; 
			int c_month = calendar.MONTH + 1; 
			
			
			if (( c_year == year) && (c_month == month)) {
				sum += contract.totalValue();
			}
		}
		return sum;
	}
	
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return this.level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public double getBaseSalary() {
		return this.baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Departament getDepartament() {
		return this.departament;
	}

	public void setDepartament(Departament departament) {
		this.departament = departament;
	}

	public List<HourContract> getContracts() {
		return this.contracts;
	}
}