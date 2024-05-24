package packageTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class withoutDuplicatesUsingSet {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Tata");
		list.add("Tata"); 
		list.add("Hyndai");
		list.add("Hyndai");
		list.add("Kia");
		
		System.out.println("With duplicates" +list);
		
		Set<String> set = new HashSet<>();
		set.addAll(list);
		
		System.out.println("without duplicates" +set);
		
	}

}
