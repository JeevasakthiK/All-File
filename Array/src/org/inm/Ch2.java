package org.inm;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Ch2 {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(50);
		li.add(60);
		System.out.println(li);
		int size = li.size();
		System.out.println("Size Of List : "+size);
		int last = li.lastIndexOf(10);
		System.out.println("Last Index Of 10 : "+last);
		int indexOf = li.indexOf(10);
		System.out.println("first index Of 10 :"+indexOf);
		Integer value = li.get(3);
		System.out.println("Value of index 3 : "+value);
		Integer remove = li.remove(4);
		System.out.println("After remove :" + li);
		boolean contains = li.contains(remove);
		System.out.println(contains);
		Integer set = li.set(4, 50);
		System.out.println("After Set :"+li);
		
	}

}
