package br.net.erponline.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.net.erponline.model.entity.Account;
import br.net.erponline.model.exceptions.DomainException;

public class MainAccount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			
			System.out.println();
			System.out.print("Holder: ");
			String holder = sc.next();
					
			System.out.println();
			System.out.print("Balance: ");
			Double balance = sc.nextDouble();
			
			System.out.println();
			System.out.print("WithDraw: ");
			Double withdrawLimit = sc.nextDouble();
			
			Account account = new Account(number, holder, balance, withdrawLimit);
			System.out.println(account.toString());
	
			System.out.println();
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			Double amount = sc.nextDouble();
			
			account.withdraw(amount);
			System.out.println(account.toString());
		} catch (InputMismatchException e) {
			System.out.println("Invalid input format ");
		} catch (DomainException e) {
			System.out.println("Error withdraw: " + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
}