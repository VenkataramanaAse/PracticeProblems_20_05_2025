package Collections;
import java.util.*;
public class CollectionToArray {
public static void main(String[] args) {
	
	List<String> col=new ArrayList<>();
	col.add("Java");
	col.add("Python");
	col.add("c++");
	
	String [] array=col.toArray(new String[0]);
	
	System.out.println("Array Elements");
	for(String ele:array) {
		System.out.println(ele);
	}
	
}
}
