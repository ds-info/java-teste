package br.net.erponline.model.entity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import br.net.erponline.model.exceptions.DomainException;

public class Reservation {
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");  
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
		if (!checkOut.after(checkIn)){
			throw new DomainException("Check-Out date must be after Check-In date");
		} 

		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	public Integer getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		
		result.append("Reservation: ");
		result.append(String.format("Room %d", this.roomNumber));
		result.append(String.format(", checkIn %s", sdf.format(this.checkIn)));
		result.append(String.format(", checkOut %s", sdf.format(this.checkOut)));
		result.append(String.format(", %d nights", this.duration()));
		
		return result.toString();
	}
	
	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public void updateDates(Date checkIn, Date checkOut) {
		Date now = new Date();
		if (!checkIn.after(now) || !checkOut.after(now)) {
			throw new DomainException("Reservation dates for update must be future dates");
		} 
		if (!checkOut.after(checkIn)){
			throw new DomainException("Check-Out date must be after Check-In date");
		} 
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
}