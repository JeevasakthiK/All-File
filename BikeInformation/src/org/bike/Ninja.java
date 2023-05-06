package org.bike;

public class Ninja extends BMW {
	@Override
	public void milage() {
		super.milage();
	}

	@Override
	public void enginepower() {
		super.enginepower();
	}

	private void price() {
		System.out.println("Ninja     : 10Lak");
	}

	private void model() {
		System.out.println("Model     : Kawasaki Ninja 1000 ");

	}

	private void speed() {
		System.out.println("Top Speed : 250 ");
	}

	public static void main(String[] args) {
		Ninja n = new Ninja();
		n.milage();
		n.enginepower();
		n.price();
		n.speed();
		n.model();
	}
}
