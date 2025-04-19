package map;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

import utility.Employee;

public class HashMapClass {
	
	public static void main(String[] args) {
		
		Map<Employee, String> map = new HashMap<>();
		Employee e1 = new Employee(1,"Pranesh");
		
		map.put(e1, "Barclays");
		System.out.println(map.get(e1));	// Barclays
		
		e1.setName("Ganesh");
		System.out.println(map.get(e1));	// null
		
		Map<Integer, Integer> map1= new HashMap<>();
		map1.put(3, 0);
		map1.put(3, 1);
		System.out.println(map1);			// {3=1}
		
		for(Entry<Integer, Integer> e:map1.entrySet()) {
			System.out.println(e);
		}
		
		for(Integer v: map1.values()) {
			System.out.println(v);
		}
		
		for(Integer k:map1.keySet()) {
			System.out.println(k);
		}
		
	}

}
