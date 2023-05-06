package org.car;

import java.awt.Window;

public class Lancer extends Skoda {
	@Override
	public void price(int price) {
		super.price(price);
	}

	@Override
	public void model() {
		super.model();
	}

	private void seater(int i) {
		System.out.println("Seater : " + i);

	}

	private void window(int i) {
		System.out.println("Window : " + i);

	}

	private void milage() {
		System.out.println("Milage 15");

	}

	private void enginePower() {
		System.out.println("Engine power : 148rpm");

	}

	public static void main(String[] args) {
		Lancer l = new Lancer();
		l.price(1500000);
		l.model();
		l.seater(8);
		l.window(4);
		l.milage();
		l.enginePower();

	}
}
