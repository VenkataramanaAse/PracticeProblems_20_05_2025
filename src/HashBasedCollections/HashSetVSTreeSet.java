package HashBasedCollections;
import java.util.*;
public class HashSetVSTreeSet {
;public static void main(String [] args) {
	
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
    
    Set<String> treeSet=new TreeSet<>();
	treeSet.add("Banana");
    treeSet.add("Apple");
    treeSet.add("Mango");
    treeSet.add("Orange");
    treeSet.add("Apple");
    treeSet.add("Mango");
	
    System.out.println("Tree Set Elements natural sorting order,no duplicates");
    for(String s:treeSet) {
    	System.out.println(s);
    }
    
}
}
