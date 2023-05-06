package org.inm;

import java.util.Set;
import java.util.TreeSet;

public class Ch6 {

	public static void main(String[] args) {
		Set<Integer> li = new TreeSet<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		li.add(70);
		li.add(80);
		li.add(90);
		li.add(10);
		li.add(20);
		System.out.println("TreeSet : "+li);
	}

}
