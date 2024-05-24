package packageTest;

import java.util.*;
//import java.util.HashSet;
//import java.util.Set;

public class TwoArraysWithSameElements {

	public static void main(String[] args) {
		
		Integer[] a1 = {1,2,3};
		Integer[] a2 = {1,2};
		
System.out.println(isSame(a1, a2));
		

	}
	
	public static boolean isSame(Object[] array1, Object[] array2) {
		
		Set<Object> unique1 = new HashSet<>(Arrays.asList(array1));
		Set<Object> unique2 = new HashSet<>(Arrays.asList(array2));
		
		if(unique1.size()!=unique2.size()) {
			return false;
		}
		for(Object obj:unique1) {
			if(!unique2.contains(obj)) {
				return false;
			}
		}
		return true;
	}

}
