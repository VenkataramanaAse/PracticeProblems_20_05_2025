package Collections;

public class Add_Student_Elements_To_ArrayLIst {

	int studentId;
	String studentName;
	String studentClass;
	public Add_Student_Elements_To_ArrayLIst(int studentId, String studentName, String studentClass) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentClass = studentClass;
	}
	@Override
	public String toString() {
		return "[studentId=" + studentId + ", studentName=" + studentName
				+ ", studentClass=" + studentClass + "]";
	}
	
	
	
}
