package Collections;
import java.util.*;
public class HashSet_Unique_employees {

	public static void main(String[] args) {
		
		Set<Employee> emp=new HashSet<>();
		
		emp.add(new Employee(101,"Venkat"));
		emp.add(new Employee(102,"Pavan"));
		emp.add(new Employee(104,"nani"));
		emp.add(new Employee(101,"Venkat"));
		emp.add(new Employee(102,"Pavan"));
		
		for(Employee e:emp) {
			System.out.println(e);
		}
		
	}
	
}
