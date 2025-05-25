package Collections;

import java.util.*;

public class List_Forward_Backward {
	public static void main(String[] args) {

		List<String> e = new ArrayList<>();

		e.add("Venkat");
		e.add("Pavan");
		e.add("Ram");
		e.add("Nani");
		e.add("Sidhu");
		System.out.println("=====for forward Iteration========");
		for (String s : e) {
			System.out.println(s);
		}

		System.out.println("====== for back ward Iteration=======");
		ListIterator<String> i = e.listIterator(e.size());

		while (i.hasPrevious()) {
			System.out.println(i.previous());
		}
	}

}
