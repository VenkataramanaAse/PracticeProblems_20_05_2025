package Collections;
import java.util.*;

public class Add_Student_Elements_To_ArrayLIst_Main {

	public static void main(String[] args) {
		
		List<Add_Student_Elements_To_ArrayLIst>student=new ArrayList<>();
		
		
		student.add(new Add_Student_Elements_To_ArrayLIst(101,"venkat","10 B"));
		student.add(new Add_Student_Elements_To_ArrayLIst(102,"pavan","10C"));
		student.add(new Add_Student_Elements_To_ArrayLIst(103,"king","10 A"));
		System.out.println("=====Using for each loop=========");
		for(Add_Student_Elements_To_ArrayLIst st:student) {
			System.out.println(st);
		}
		
		
		System.out.println("=======using Iterator==========");
		Iterator<Add_Student_Elements_To_ArrayLIst>stitr=student.iterator();
		while(stitr.hasNext()) {
			System.out.println(stitr.next());
		}
	}
}
