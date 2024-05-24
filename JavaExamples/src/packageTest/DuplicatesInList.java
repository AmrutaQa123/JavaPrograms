package packageTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicatesInList {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(3);
		list1.add(2);

		m1(list1);

//	Set<Integer> set =  new HashSet<Integer>();
//	set.addAll(list1);
//	System.out.println(set);
	}

	// The below program is used to print unique elements
//	public static void m1(List<Integer> list) {
//		
//		for(int i=0; i<list.size(); i++) {
//			
//			int count = 0;
//
//			for(int j=0; j<list.size(); j++) {
//				if(list.get(i).equals(list.get(j))) {
//					//System.out.println("Duplicate values: " + list.get(j));
//					count++;
//				}
//			}
//			if(count==1) {
//				System.out.println(list.get(i));
//			}
//		}
//	}

	//to print duplicates elements 
	public static void m1(List<Integer> list) {

		for (int i = 0; i < list.size(); i++) {

		
			for (int j = i + 1; j < list.size(); j++) {

				if (list.get(i).equals(list.get(j))) {
					System.out.println("Duplicate values: " + list.get(i));
				}
			}
		}
	}

}
