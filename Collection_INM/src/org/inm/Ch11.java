package org.inm;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ch11 {
	public static void main(String[] args) {
		Set<Integer> s =new TreeSet<>();
		s.add(10);		
		s.add(20);		
		s.add(30);
		s.add(40);		
		s.add(50);
		s.add(60);
		s.add(70);
		s.add(80);
		s.add(90);
		s.add(10);
		s.add(20);
		System.out.println("Tree Set : "+s);
		int size = s.size();
		System.out.println("Size : "+size);
		System.out.println("___________________");
			
		Iterator<Integer> it = s.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());			
		}
		
			
			
		

	}

}
