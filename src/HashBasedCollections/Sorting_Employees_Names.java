package HashBasedCollections;
import java.util.*;
public class Sorting_Employees_Names {

	public static void main(String [] args) {
		
		List<Employee> emp=new ArrayList<>();
		emp.add(new Employee(101, "Venkat"));
		emp.add(new Employee(102, "Ramana"));
		emp.add(new Employee(103, "Nani"));
		emp.add(new Employee(104, "Pavan"));
		System.out.println("Sorting using Names ");
		Collections.sort(emp, new Comparator<Employee>() {
			
			public int compare(Employee e1,Employee e2) {
				return e1.name.compareTo(e2.name);
			}
		});
		
		for(Employee e:emp) {
			System.out.println(e);
		}
		
	}
	
}
