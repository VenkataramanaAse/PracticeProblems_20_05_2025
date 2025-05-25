package HashBasedCollections;

import java.util.*;


public class HashSetVSLinkedHashSet {
	
	public static void main(String [] args) {
		Set<String> hashSet=new HashSet<>();
		hashSet.add("Banana");
	    hashSet.add("Apple");
	    hashSet.add("Mango");
	    hashSet.add("Orange");
	    hashSet.add("Apple");
	    hashSet.add("Mango");
		
	    System.out.println("hash Set Elements no order,no duplicates");
	    for(String s:hashSet) {
	    	System.out.println(s);
	    }
	    
	    Set<String> linkedHashSet=new LinkedHashSet<>();
	    linkedHashSet.add("Banana");
	    linkedHashSet.add("Apple");
	    linkedHashSet.add("Mango");
	    linkedHashSet.add("Orange");
	    linkedHashSet.add("Apple");
	    linkedHashSet.add("Mango");
		
	    System.out.println("linke hash Set Elements insertion3 order,no duplicates");
	    for(String s:linkedHashSet) {
	    	System.out.println(s);
	    }
	
	}
	}
