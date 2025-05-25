package Generics;

public class Box<T> implements Container<T> {
	
	private T value;

	public void set(T value) {
		this.value=value;
	}
	
	public T get() {
		return value;
	}
	
	
	//Question number 3 --------
	
	public <T> void printArray(T[] array){
		for( T element:array) {
			System.out.println(element);
		}
	}
	
	public<T> T firstElement(T[]array) {
		return array.length>0?array[0]:null;
	}
}
