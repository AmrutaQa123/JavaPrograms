package packageTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsExample {
	public static void main(String[] args) {
	
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	map.put(101, "Amruta");
	map.put(102, "Abcs");
	map.put(103, "Pavvi");
	map.put(102, "Ammu"); //102 key value will be replaced from Abcs to Ammu

	Set<Integer> keyset = map.keySet();   //101Amruta
	for(Integer key:keyset){              //  102Ammu 
	System.out.println(key);                               //103Pavvi
	System.out.println(map.get(key));
	System.out.println(map.get(300)); //null is printed
	} 
	}

}
