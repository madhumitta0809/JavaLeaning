package javaLearning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListLearning {
public static void main(String[] args) {
	List<String> l1=new ArrayList<String>();
	l1.add("Ms.Dhoni");
	l1.add("Ruturaj");
	l1.add("convey");
	l1.add("jadeja");
	l1.add("pathirana");
	l1.add("convey");
	System.out.println(l1);
	System.out.println(l1.get(1));
	
	List<String>l2=new ArrayList<String>(l1);
	System.out.println(l2);
	
	l2.clear();
	System.out.println(l2.isEmpty());
	System.out.println(l2);
	
	
	l2.addAll(l1);
	System.out.println(l2.isEmpty());
	System.out.println(l2);
	
	l2.remove(3);
	System.out.println(l2);
	l2.remove("convey");
	System.out.println(l2);
	

	
	l2.set(2, "jadeja");
	l2.set(3, "rahane");
	System.out.println(l2);
	
	l2.add(3, "pathirana");
	System.out.println(l2);
	System.out.println("-------------------------------------");
	for (String string : l2) {
		System.out.println("using foreach "+string);
		
	}
	System.out.println("-------------------------------------");
	
	for(int i=0;i<l1.size();i++)
	{
		System.out.println("using for loop "+l1.get(i));
	}
	
	System.out.println("-------------------------------------");
	
	ListIterator<String> i=l1.listIterator();
	while(i.hasNext())
	{
		System.out.println("using Listiterator forward:"+i.next());
	}
	
	System.out.println("-------------------------------------");
	
	//ListIterator<String> r=l1.listIterator();
	while(i.hasPrevious())
	{
		System.out.println("using Listiterator reverse:"+i.previous());
		
	}
	
	System.out.println("-------------------------------------");

	
	Iterator<String> iterator=l1.iterator();
	while(iterator.hasNext())
	{
		System.out.println("using iterator:"+iterator.next());
	}
	
	
}
}
