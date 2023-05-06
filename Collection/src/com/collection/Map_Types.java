package com.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map_Types {

	public static void main(String[] args) {
		//HashMap
		Map<Object, Object> m = new HashMap<>();
		m.put("Tamil", 75);
		m.put("English",67);
		m.put("Maths", 87.58);
		m.put("Science", 72);
		m.put("S.Science", 80);
		m.put("Tamil", 90);
		System.out.println("HashMap : "+m);
		for (Map.Entry<Object, Object> entry : m.entrySet()) {
			Object key = entry.getKey();
			Object val = entry.getValue();
			System.out.println(entry);
		}
		System.out.println();
		//LinkedHashMap
		Map<Object, Object> m1 = new LinkedHashMap<>();
		m1.put("Tamil", 75);
		m1.put("English",67);
		m1.put("Maths", 87.58);
		m1.put("Science", 72);
		m1.put("S.Science", 80);
		m1.put("Tamil", 90);
		System.out.println("LinkedHashMap : "+m1);
		for (Map.Entry<Object, Object> entry : m1.entrySet()) {
			Object key = entry.getKey();
			Object val = entry.getValue();
			System.out.println(entry);	
		}
		System.out.println();
		//TreeMap
		Map<Object, Object> m2 = new TreeMap<>();
		m2.put("Tamil", 75);
		m2.put("English",67);
		m2.put("Maths", 87.58);
		m2.put("Science", 72);
		m2.put("S.Science", 80);
		m2.put("Tamil", 90);
		System.out.println("TreeMap : "+m2);
		for (Map.Entry<Object, Object> entry : m2.entrySet()) {
			Object key = entry.getKey();
			Object val = entry.getValue();
			System.out.println(entry);
			
		}
	}

}
