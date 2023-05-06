package com.collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Types {
	public static void main(String[] args) {
		Set<Integer> h = new HashSet<>();//print random order
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(null);
		h.add(10);// its not allow duplicate values
		h.add(null);//its allow single null value only
		h.add(40);
		h.add(50);
		System.out.println("**** SET Methods ****");
		System.out.println("Hashset       : "+h);
		// its print insertion order
		Set<Object> lh = new LinkedHashSet<>();
		lh.add(10);
		lh.add(null);
		lh.add(20);
		lh.add(15.55);
		lh.add("Linkedhashset");
		lh.add(10);
		System.out.println("Linkedhash Set: "+lh);
		//its print ascending order
		Set<Character> t = new TreeSet<>();
		t.add('B');
		t.add('A');
		t.add('D');
		t.add('C');
		System.out.println("Tree Set      : "+t);
		System.out.println("===============================================");
		int size = h.size();
		System.out.println("Size of hashset list: "+size);
		// set is value based remove() its not allow index of list
		h.remove(null);
		System.out.println("After hashset list : "+h);
		
		boolean contains = lh.contains(null);
		System.out.println("Set Contains : "+contains);
		
		h.clear();
		System.out.println("HashSet Clear : "+h);
		System.out.println("==============================================");
		
		
		lh.addAll(t);
		System.out.println("addAll() : "+lh);
		
		h.retainAll(lh);
		System.out.println("RetainAll() : "+h);
		
		h.removeAll(t);
		System.out.println("Remove all : "+h);
		System.out.println("===============================================");
		
	}

}
