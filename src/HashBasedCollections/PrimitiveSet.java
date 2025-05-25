package HashBasedCollections;
import java.util.*;
public class PrimitiveSet {

	
	public static void main(String[] args) {
		Set<Integer>set=new TreeSet<>();
		
		set.add(30);
		set.add(10);
		set.add(40);
		set.add(10);
		set.add(40);
		
		for(Integer v:set) {
			System.out.println(v);
		}
		
		
	}
}
