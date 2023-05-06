package org.inm;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Ch8 {
	public static void main(String[] args) {
		
	
	List<Integer> li = new LinkedList<>();
	li.add(105);
	li.add(205);
	li.add(305);
	li.add(405);
	li.add(505);
	li.add(605);
	li.add(705);
	li.add(805);
	li.add(505);
	li.add(605);
	System.out.println(li);
	
	Set<Integer> s = new TreeSet<>();
	s.addAll(li);
	System.out.println(s);

}
}