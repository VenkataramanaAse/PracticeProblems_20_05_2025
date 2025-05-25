package HashBasedCollections;

import java.util.ArrayList;
import java.util.*;

import Collections.Student2;

public class HashSetMain {

	public static void main(String [] argas) {
		Set<Student> stSet=new HashSet<>();
		stSet.add(new Student(20,"Venkat"));
		stSet.add(new Student(10,"Akhil"));
		stSet.add(new Student(30,"Bhavi"));
		stSet.add(new Student(10,"Akhil"));
		stSet.add(new Student(30,"Bhavi"));
		
		for(Student s:stSet) {
			System.out.println(s);
		}
	}
}
