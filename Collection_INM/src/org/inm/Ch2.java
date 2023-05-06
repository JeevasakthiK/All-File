package org.inm;

import java.util.LinkedList;
import java.util.List;

public class Ch2 {
	public static void main(String[] args) {
		List<Integer> li = new LinkedList<>();
		li.add(100);
		li.add(200);
		li.add(300);
		li.add(400);
		li.add(500);
		li.add(600);
		li.add(700);
		System.out.println("Linked List : " + li);
		int size = li.size();
		System.out.println("Size Of List : " + size);
	}

}
