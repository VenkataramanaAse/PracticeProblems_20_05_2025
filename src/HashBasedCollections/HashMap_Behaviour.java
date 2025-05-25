package HashBasedCollections;

import java.util.*;

public class HashMap_Behaviour {

	public static void main(String[] args) {

		Map<Integer, String> st = new HashMap<>();

		st.put(101, "Venkat");
		st.put(102, "Ramana");
		st.put(103, "Nani");
		st.put(104, "Pavan");

		System.out.println("Using Entry Set");
		for (Map.Entry<Integer, String> entry : st.entrySet()) {

			System.out.println(entry.getKey() + " === " + entry.getValue());
		}

		System.out.println();
		System.out.println("Using Key Set  ");
		for (Integer key : st.keySet()) {
			System.out.println(key + " === " + st.get(key));
		}
		System.out.println();
		System.out.println("Using Values ");

		for (String val : st.values()) {

			System.out.println(val);
		}
		System.out.println();
		System.out.println("Using Iterator  ");
        Iterator<Map.Entry<Integer, String>> iterator=st.entrySet().iterator();
        
        while(iterator.hasNext()) {
        	Map.Entry<Integer, String>entry=iterator.next();
        	
        	System.out.println(entry.getKey()+" === "+entry.getValue());
        }
	}
}
