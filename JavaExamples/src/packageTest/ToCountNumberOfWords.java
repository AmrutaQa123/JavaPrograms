package packageTest;

import java.util.*;

public class ToCountNumberOfWords {

	public static void main(String[] args) {

		String str = "This word contains two times this and two times two";
		String[] split = str.split(" ");

		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < split.length; i++) {
			if (map.containsKey(split[i])) {
				int count = map.get(split[i]);
				map.put(split[i], count + 1);
			} else {
				map.put(split[i], 1);
			}
		}
		System.out.println(map);
	}

}
