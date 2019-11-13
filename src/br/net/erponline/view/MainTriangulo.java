package br.net.erponline.view;

import java.util.Scanner;

import br.net.erponline.entity.Triangulo;

public class MainTriangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Triangulo triangulo01 = new Triangulo();
		Triangulo triangulo02 = new Triangulo();
		
		double area01;
		double area02;
		
		System.out.println("Digite os 3 lados do 1º triângulo");
		triangulo01.setLadoA(sc.nextDouble());
		triangulo01.setLadoB(sc.nextDouble());
		triangulo01.setLadoC(sc.nextDouble());

		System.out.println("Digite os 3 lados do 2º triângulo");
		triangulo02.setLadoA(sc.nextDouble());
		triangulo02.setLadoB(sc.nextDouble());
		triangulo02.setLadoC(sc.nextDouble());
		
		area01 = triangulo01.calcularArea();
		area02 = triangulo02.calcularArea();
		
		System.out.printf("Área do triângulo01 %.2f \n", area01);
		System.out.printf("Área do triângulo02 %.2f \n", area02);
		
		if (area01 > area02) {
			System.out.println("triangulo01 maior que triangulo02");
		} else if (area01 < area02) {
			System.out.println("triangulo01 maenor que triangulo02");			
		} else {
			System.out.println("triangulo01 igual triangulo02");			
		}
	}
}