package com.SingleTurnClasses;

import java.util.Scanner;

class MovieHall {
	private int seats = 50;
	private static MovieHall m = null;
	private MovieHall() {};
	public static MovieHall getInstance() {
		if(m == null) m = new MovieHall();
		return m;
	}
	public void reserveSeats(int n) {
		if(n > seats) {
			System.out.println("Tickets is Not Available");
			return;
		}
		seats -= n;
		System.out.println(n+" Seats are Reserved");
	}
}

class Booking {
	static void bookTickets() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Tickets : ");
		int t = scanner.nextInt();
		MovieHall m = MovieHall.getInstance();
		m.reserveSeats(t);
	}
}

public class Test_1 {

	public static void main(String[] args) {
		Booking.bookTickets();
		Booking.bookTickets();
		Booking.bookTickets();

	}

}
//Tickets : 40
//40 Seats are Reserved
//Tickets : 30
//Tickets is Not Available
//Tickets : 10
//10 Seats are Reserved
