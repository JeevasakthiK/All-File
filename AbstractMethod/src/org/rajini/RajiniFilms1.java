package org.rajini;

public class RajiniFilms1 implements RajiniFilms {

	@Override
	public void jailer() {
		System.out.println("Upcoming - Jailer");	
	}
	@Override
	public void annaathe() {
		System.out.println("2021 - Annaathe");	
	}
	@Override
	public void darbar() {
		System.out.println("2020 - Darbar");	
	}
	@Override
	public void petta() {
		System.out.println("2019 - Petta");	
	}
	@Override
	public void kaala() {
		System.out.println("2018 - Kaala");	
	}
	public static void main(String[] args) {
		RajiniFilms1 R = new RajiniFilms1();
		R.jailer();
		R.annaathe();
		R.darbar();
		R.petta();
		R.kaala();
	}
	

}
