package org.inm;

public class Manual {
	private void sdlc() {
		System.out.println("Software Development LifeCycle");
	}
	private void stlc() {
		System.out.println("Software Testing LifeCycle");
	}
	private void bugLifecycle() {
		System.out.println("Bug LifeCycle");
	}
	public static void main(String[] args) {
		System.out.println("***Manual***");
		Manual m = new Manual();
		m.sdlc();
		m.stlc();
		m.bugLifecycle();
		
	}
	

}
