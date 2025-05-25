package HashBasedCollections;
import java.util.*;
import java.util.Map.Entry;
public class Sorting_HashMap_Keys {

	public static void main(String [] args) {
		
		Map<Employee,Integer> emp=new HashMap<>();
		
		emp.put(new Employee(101,"Venkat"),1);
		emp.put(new Employee(102,"Pavan"),2);
		emp.put(new Employee(103,"Nani"),5);
		emp.put( new Employee(104,"Sidhu"),7);
		emp.put(new Employee(105,"Jethu"),4);
		
		List<Map.Entry< Employee,Integer>> empList=new ArrayList<>(emp.entrySet());
		
		Collections.sort(empList,new Comparator<Map.Entry<Employee,Integer>>(){

			@Override
			public int compare(Map.Entry< Employee,Integer> o1, Map.Entry< Employee,Integer> o2) {
				
				return o1.getKey().getName().compareTo(o2.getKey().getName());
			}
			
			
		});
		
		for(Map.Entry<Employee, Integer> e:empList) {
			System.out.println(e.getKey()+" === "+e.getValue());
		}
		
	}
	
}
