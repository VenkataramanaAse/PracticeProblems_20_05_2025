package Collections;
import java.util.*;
public class ComparableEx {

	
	public static void main(String[] args) {
		
		List<Student>stList=new ArrayList<>();
		
		stList.add(new Student(20,"venkat"));
		stList.add(new Student(10,"akhil"));
		stList.add(new Student(30,"Bhavi"));
		
		Collections.sort(stList);
		
		for(Student s: stList) {
			System.out.println(s);
		}
	}
}
