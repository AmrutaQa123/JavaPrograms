package packageTest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AmrutaPractice {
	public static void main(String[] args) {
		
		int[] arr = {1,2,2,3,4,4,5};
		
		Set<Object> set = new HashSet<>();
		for(int i =0; i<arr.length; i++) {
		set.add(arr[i]);
		}
		System.out.println(set);	
	}
}

