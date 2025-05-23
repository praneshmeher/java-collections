package set;

import java.util.HashSet;
import java.util.Set;

import utility.Employee;

public class HashSetClass {
	
	public static void main(String[] args) {
		
		Set<Employee> set = new HashSet<>();
		Employee e1 = new Employee(1,"Pranesh");
		
		set.add(e1);
		System.out.println(set.contains(e1));
		
		e1.setName("Ganesh");
		System.out.println(set.contains(e1));
		
		Set<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(1);
		set1.add(2);
		set1.add(2);
		System.out.println(set1);
		
	}

}
