package HashBasedCollections;
import java.util.*;
public class Employee_HashMap {

	public static void main(String[] args) {
		
		Map<Employee,String> emp=new HashMap<>();
		
		emp.put(new Employee(101,"Venkat"), "Developer");
		emp.put(new Employee(102,"Pavan"), "HR");
		emp.put(new Employee(103,"Nani"), "Tester");
		
		
		for(Map.Entry<Employee,String> entry:emp.entrySet() ){
			
			System.out.println(entry.getKey()+" === "+entry.getValue());
		}
		
	}
	
}
