package Collections;
import java.util.*;
public class Student implements Comparable<Student> {
  int id;
  String name;
public Student(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}

public int compareTo(Student s) {
	return this.id-s.id;
}

@Override
public String toString() {
	return  id  +"_" + name ;
}
  
  
	
	
}
