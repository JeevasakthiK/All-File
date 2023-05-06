package org.inm;

import java.util.LinkedHashSet;
import java.util.Set;

public class Ch3 {

	public static void main(String[] args) {
		Set<Integer> li = new LinkedHashSet<>();
		li.add(10);
		li.add(10);
		li.add(20);
		li.add(50);
		li.add(60);
		li.add(80);
		li.add(60);
		li.add(50);
		System.out.println(li);
		
	}

}
