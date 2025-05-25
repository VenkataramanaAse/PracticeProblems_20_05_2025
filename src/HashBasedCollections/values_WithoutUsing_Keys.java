package HashBasedCollections;
import java.util.*;
public class values_WithoutUsing_Keys {

	public static void main(String[] args) {
		Map<Integer,String> st=new HashMap<>();
		
		st.put(101, "Venkat");
		st.put(102, "Ramana");
		st.put(103, "Nani");
		st.put(104, "Pavan");
		
		for(String val:st.values()) {
			System.out.println(val);
		}
		
	}
	
}
