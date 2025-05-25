package Collections;
import java.util.*;
public class Count_Each_Word {

	public static void main(String [] args) {
		String s="Core nuts technologies located in Bangalore Core nuts technologies located in hyderabad Core nuts technologies in Hyderabad Core nuts technologies in Bangalore"; 
		
		String[] words=s.split(" ");
		
		Map<String , Integer> word=new LinkedHashMap<>();
		
		for(String st:words) {
			
			if(word.containsKey(st)) {
				word.put(st, word.get(st)+1);
			}
			else {
				word.put(st,1);
			}
			
			
			
		}
		
		for(String key:word.keySet()) {
			System.out.println(key+" __ "+word.get(key));
		}
	}
	
	
}
