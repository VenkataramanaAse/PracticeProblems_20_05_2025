package Collections;
import java.util.*;
public class Add_Primitive_Datatypes_ToArrayList {
public static void main(String[] args) {
	List <Integer> listInt=new ArrayList<>();
	List<Double>listDouble=new ArrayList<>();
	List<Short>listShort=new ArrayList<>();
	List<Byte>listByte=new ArrayList<>();
    List<Long>listLong=new ArrayList<>();
    
    listInt.add(1);
    listInt.add(10);
    listInt.add(30);
    
    
    System.out.println("========Using Normal For Each loop");
    for(Integer lint:listInt) {
    	System.out.println(lint);
    }
    
    
    listDouble.add(1.0);
    listDouble.add(10.0);
    listDouble.add(30.0);
    
    for(Double ldb:listDouble) {
    	System.out.println(ldb);
    }
    
    listShort.add((short) 1000);
    listShort.add((short)2000);
    listShort.add((short)3000);
    
    for(Short sh:listShort) {
    	System.out.println(sh);
    }
    listByte.add((byte)10);
    listByte.add((byte)1000);
    listByte.add((byte)2000);
    for(Byte by:listByte) {
    	System.out.println(by);
    }
    listLong.add((long)79890070);
    listLong.add((long)8976936);
    listLong.add((long)9869876);
    
    for(Long lng:listLong) {
    	System.out.println(lng);
    }
	
    
    System.out.println("=========  Using  Iterator========");
    Iterator<Integer>intItr=listInt.iterator();
    while(intItr.hasNext()) {
    	System.out.println(intItr.next());
    }
    
    Iterator<Double>dbItr=listDouble.iterator();
    while(dbItr.hasNext()) {
    	System.out.println(dbItr.next());
    }
    
    Iterator<Short>shItr=listShort.iterator();
    while(shItr.hasNext()) {
    	System.out.println(shItr.next());
    }
    
    Iterator<Byte>btItr=listByte.iterator();
    while(btItr.hasNext()) {
    	System.out.println(btItr.next());
    }
    
    Iterator<Long>lgItr=listLong.iterator();
    while(lgItr.hasNext()) {
    	System.out.println(lgItr.next());
    }
    
    
    
    		}
}
