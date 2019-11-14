package br.net.erponline.view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import br.net.erponline.model.entity.Reservation;
import br.net.erponline.model.exceptions.DomainException;

public class MainReservation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Room number: ");
			int room = sc.nextInt();
			System.out.println();
	
			System.out.print("Check-In date: ");
			Date checkIn = sdf.parse(sc.next());
			System.out.println();
			
			System.out.print("Check-Out date: ");
			Date checkOut = sdf.parse(sc.next());
			System.out.println();
	
			Reservation reservation = new Reservation(room, checkIn, checkOut);
			System.out.println(reservation.toString());
	
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.print("Enter date for update the reservation");
	
			System.out.print("Check-In date: ");
			checkIn = sdf.parse(sc.next());
			System.out.println();
			
			System.out.print("Check-Out date: ");
			checkOut = sdf.parse(sc.next());
			System.out.println();
			
			reservation.updateDates(checkIn, checkOut);
			System.out.println(reservation.toString());
		} catch (ParseException e) {
			System.out.println("Invalid date format");
		} catch (DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected exception");
		}
						
		sc.close();
	}
}