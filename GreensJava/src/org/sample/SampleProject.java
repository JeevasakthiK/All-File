package org.sample;

public class SampleProject {
	public static void main(String[] args) {
		System.out.println("My Sample Project");
		byte a = 123;
		System.out.println(a);
		short b = -32767 ;
		System.out.println(b);
		char c = 'Y';
		System.out.println(c);
		int d = 2345334;
		System.out.println(d);
		long e = 287654456L;
		System.out.println(e);
		float f = 24.04f;
		System.out.println(f);
		double g = 24.0492;
		System.out.println(g);
		boolean h = true ;
		System.out.println(h);
		int memory = System.identityHashCode(c);
		System.out.println(memory);
		int memory1 = System.identityHashCode(e);
		System.out.println(memory1);
		int memory2 =System.identityHashCode(h);
		System.out.println(memory2);
		
	
	}

}
