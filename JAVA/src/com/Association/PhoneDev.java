package com.Association;

import java.util.Scanner;

class Jio {
	String simName;
	Jio(String simName) {
		this.simName = simName;
	}
	public void callImplemantationForJio() {
		System.out.println(simName + " Sim connects 5g for calling");
	}
}
class Airtel {
	String simName;
	Airtel(String simName) {
		this.simName = simName;
	}
	public void callImplemantationForAirtel() {
		System.out.println(simName + " Sim connects 3g for calling");
	}
}
class Battery {
	String batteryName;
	Battery(String batteryName) {
		this.batteryName = batteryName;
	}
}
class Phone {
	String name;
	Jio jio;
	Airtel airtel;
	Battery battery;
	
	Phone(String name, Battery battery) {
		this.name = name;
		this.battery = battery;
	}
	
	public void call() {
		System.out.println("1.Jio \n2.Airtel");
		@SuppressWarnings("resource")
		int selectSim = new Scanner(System.in).nextInt();
		switch (selectSim) {
		case 1: jio = new Jio("Jio");
				jio.callImplemantationForJio();
				break;
		case 2: airtel = new Airtel("Airtel");
				airtel.callImplemantationForAirtel();
		}
	}
}

public class PhoneDev {
	public static void main(String[] args) {
		Phone p1 = new Phone("Samsung", new Battery("LI-ION"));
		p1.call();
	}
}
