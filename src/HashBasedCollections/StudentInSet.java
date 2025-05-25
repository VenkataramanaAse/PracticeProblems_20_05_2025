package HashBasedCollections;

import java.util.*;

public class StudentInSet {
	public static void main(String[] args) {

		Set<Student2> set = new TreeSet<>(new Comparator<Student2>() {

			
			
			@Override
			public int compare(Student2 o1, Student2 o2) {

				return Integer.compare(o1.id, o2.id);
			}

		});
		
		set.add(new Student2(20,"Venkat"));
		set.add(new Student2(10,"Akhil"));
		set.add(new Student2(30,"Bhavi"));
		set.add(new Student2(10,"Akhil"));
		set.add(new Student2(30,"Bhavi"));
		
		
		for(Student2 s:set) {
			System.out.println(s);
		}
	}

}
