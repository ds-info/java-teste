package br.net.erponline.view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import br.net.erponline.model.entity.Reservation;

public class MainReservation {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Room number: ");
		int room = sc.nextInt();
		System.out.println();

		System.out.print("Check-In date: ");
		Date checkIn = sdf.parse(sc.next());
		System.out.println();
		
		System.out.print("Check-Out date: ");
		Date checkOut = sdf.parse(sc.next());
		System.out.println();

		if (checkOut.after(checkIn)) {
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
			
			Date now = new Date();
			if (checkIn.after(now) && checkOut.after(checkIn)) {
				reservation.updateDates(checkIn, checkOut);
				System.out.println(reservation.toString());
			} else {
				System.out.println("Error in reservation: Reservation dates for update must be future dates");
			}
		} else {
			System.out.println("Error in reservation: Check-Out date must be after Check-In date");
		}
				
		sc.close();
	}

}
