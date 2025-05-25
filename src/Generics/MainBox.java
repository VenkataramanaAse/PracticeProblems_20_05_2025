package Generics;

public class MainBox {

	public static void main ( String [] args) {
		
		Box b=new Box();
		Box <String> str= new Box<>();
		str.set("venkat");
		System.out.println("String Value =" +str.get());
		
		Box<Integer> inte= new Box<>();
		inte.set(150170);
		System.out.println("Integer Value = "+inte.get());
		
		Box<Double> db=new Box<>();
		db.set(14000.0);
		System.out.println(db.get());
		String [] strarray= {"venkat","vamshi","Pavan"};
		Integer [] intArray= {10,20,30};
		
		System.out.println("String Array");
		b.<String>printArray(strarray);
		
		System.out.println("Integer Array");
		b.<Integer>printArray(intArray);
		
	System.out.println(b.<String>firstElement(strarray));
	System.out.println(b.<Integer>firstElement(intArray));
		
		
		
	}
	
}
