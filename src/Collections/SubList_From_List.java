package Collections;
import java.util.*;
public class SubList_From_List {

	public static void main(String[] args) {
	
		List<String> names=new ArrayList<>();
		names.add("Venkat");
		names.add("Pavan");
		names.add("Nani");
		names.add("Sidhu");
		names.add("Ramana");
		names.add("Ram");
		
		List<String>listNames=new ArrayList<>();
		listNames.addAll(names);
		
		System.out.println("=====From main List====");
		for(String s:listNames) {
			System.out.println(s);
		}
		
		List<String>subList=listNames.subList(1, 4);
		
		System.out.println("====== From Sub List======");
		for(String s:subList) {
			System.out.println(s);
		}	
	}
	
}
