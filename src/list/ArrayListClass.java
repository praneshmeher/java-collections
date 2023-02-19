package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("A");
		System.out.println(list);
		
		list.set(2, "C");
		System.out.println(list);
		
		list.add(1, "D");
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
		
		list.remove("B");
		System.out.println(list);
		
	}

}
