package org.inm;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ch19 {

	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<>();
		m.put(10, "java");
		m.put(20,"sql");
		m.put(30, "opps");
		m.put(40, "Sql");
		m.put(50, "oracle");
		m.put(60, "DB");
		m.put(10, "Selenium");
		m.put(50, "psql");
		m.put(60, "Hadoop");
		System.out.println(m);
		
		for (Map.Entry<Integer, String> entry : m.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println("\n"+entry);
			
		}
		Set<Integer> key = m.keySet();
		System.out.println("\nKey : "+key);
		Collection<String> values = m.values();
		System.out.println("\nValue : "+ values);
		
		String getkey = m.get(50);
		System.out.println("\nValue of key 50 : "+getkey);
	}

}
