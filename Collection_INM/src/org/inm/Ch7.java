package org.inm;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Ch7 {

	public static void main(String[] args) {
		List<Integer> li = new LinkedList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);
		li.add(10);
		System.out.println(li);
		
		Set<Integer> s = new HashSet<>();
		s.addAll(li);
		System.out.println(s);

	}

}
