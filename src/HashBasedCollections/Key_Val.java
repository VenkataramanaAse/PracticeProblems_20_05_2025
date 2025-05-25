package HashBasedCollections;
import java.util.*;
public class Key_Val {

	
	public static void main(String[] args) {
		
		Map<Integer,String>st=new HashMap<>();
		st.put(101, "Venkat");
		st.put(102, "Ramana");
		st.put(103, "Nani");
		st.put(104, "Pavan");
		
		for(Map.Entry<Integer, String> entry:st.entrySet()) {
			System.out.println(entry.getKey()+" === "+entry.getValue());
		}
		
	}
}
