package com.collection;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Map_Eg {

	public static void main(String[] args) {
		Map<Integer, Object> mp = new TreeMap<>();
		mp.put(1, "100");
		mp.put(2, "200");
		mp.put(3, "25.02");
		mp.put(4, "Java");
		mp.put(5, null);
		mp.put(3, "35.2568");
		System.out.println("MAP : "+mp);
		System.out.println("________________________________________________");
		for (Map.Entry<Integer, Object> entry : mp.entrySet()) {
			Integer key = entry.getKey();
			Object val = entry.getValue();
			System.out.println(entry);
		}
		System.out.println("_________________________________________________");
		System.out.println("******MAP METHODS******");
		int size = mp.size();
		System.out.println("Size()          : "+size);
		Object object = mp.get(5);
		System.out.println("Get()           : "+object);
		Set<Integer> keySet = mp.keySet();
		System.out.println("KeySet()        : "+keySet);
		Collection<Object> values = mp.values();
		System.out.println("Values()        : "+values);
		mp.remove(5);
		System.out.println("Remove()        : "+mp);
		boolean containsKey = mp.containsKey(3);
		System.out.println("ContainsKey()   : "+containsKey);
		boolean containsValue = mp.containsValue(null);
		System.out.println("ContainsValue() : "+containsValue);
		Set<Entry<Integer, Object>> entrySet = mp.entrySet();
		System.out.println("EntrySet()      :  "+entrySet);
		System.out.println("__________________________________________________");
	}

}
