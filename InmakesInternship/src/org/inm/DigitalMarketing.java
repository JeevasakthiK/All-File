package org.inm;

public class DigitalMarketing {
	private void blogging() {
		System.out.println("To Create Blogs");
	}
	private void searchEngine() {
		System.out.println("To Search Product");
	}
	private void contentMarketing() {
		System.out.println("Content Making");
	}
	private void socialMedia() {
		System.out.println("Facebook,Twitter,Instagram");
	}
	public static void main(String[] args) {
		System.out.println("*** Digital Marketing ***");
		DigitalMarketing d = new DigitalMarketing();
		d.blogging();
		d.searchEngine();
		d.contentMarketing();
		d.socialMedia();
	}

}
