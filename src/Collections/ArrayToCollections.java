package Collections;

import java.util.*;

public class ArrayToCollections {

	
	public static void main(String[] args) {
		
		String [] strArray= {"venkat","bhavi","pavan"};
		Integer [] intArray= {10,20,30};
		
		List<String>strList=new ArrayList<>(Arrays.asList(strArray));
		
		System.out.println(" String List "+strList);
		
		List<Integer> intList=new ArrayList<>(Arrays.asList(intArray));
		System.out.println("Integer List "+intList);
		
	}
}
