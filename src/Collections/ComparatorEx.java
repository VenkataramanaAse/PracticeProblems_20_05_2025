package Collections;
import java.util.*;
public class ComparatorEx {

	public static void main(String[] args) {
		
		List<Student2> stList=new ArrayList<>();
		stList.add(new Student2(20,"Venkat"));
		stList.add(new Student2(10,"Akhil"));
		stList.add(new Student2(30,"Bhavi"));
		
		Collections.sort(stList,new Comparator<Student2>(){
			
			public int compare(Student2 s1,Student2 s2) {
				return s1.name.compareTo(s2.name);
			}
		
	});
		
		
		for(Student2 s:stList) {
			System.out.println(s);
		}
		
	}
}
