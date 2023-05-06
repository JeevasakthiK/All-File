package org.inm;

import java.util.ArrayList;
import java.util.List;

public class Ch1 {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);
		System.out.println("Array List : " + li);
		int size = li.size();
		System.out.println("Size of List : " + size);

	}

}
