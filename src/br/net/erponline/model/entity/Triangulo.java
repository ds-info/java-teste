package br.net.erponline.model.entity;

public class Triangulo {
	private double ladoA;
	private double ladoB;
	private double ladoC;
	
	public Triangulo() {
		super();
	}
	
	public Triangulo(double ladoA, double ladoB, double ladoC) {
		super();
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}

	public double getLadoA() {
		return ladoA;
	}
	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}
	public double getLadoB() {
		return ladoB;
	}
	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}
	public double getLadoC() {
		return ladoC;
	}
	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}

	public double calcularArea() {
		double p = (this.ladoA + this.ladoB + this.ladoC) /2 ;
		
		return Math.sqrt(p * (p - this.ladoA) * (p - this.ladoB) * (p - this.ladoC) );
	}
}