package javaLearning;

import java.util.LinkedList;

public class LinkedlistLearning {
	public String toString()
	{
		return "abc";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		LinkedList<Object>l=new LinkedList<Object>();
		
		l.add("Rohit");
		l.add("Sky");
		l.add("green");
		l.add("Kishan");
		l.add("Malinga");
		 
		System.out.println(l);
		
		l.addFirst("Sachin");
		l.addLast("Arjun");
		l.add("sky");
		l.add("green");
		
		System.out.println(l);
		
		
		System.out.println(l.get(2));
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		
		
		LinkedList<Object>l2=new LinkedList<Object>();
		l2.addAll(l);
		
		System.out.println(l2);
		l2.removeFirstOccurrence("green");
		l2.removeFirst();
		l2.removeLast();
		l2.removeLastOccurrence("green");
	
		l2.remove(2);
		l2.remove("Malinga");
		l2.remove();//removes first element
		System.out.println(l2);
		
		l.poll();//removes first element
		System.out.println(l);
		l.pollFirst();//removes first element
		System.out.println(l);
		l.pollLast();//remove last ele
		
		
		System.out.println(l);
		
		l.add(null);
		System.out.println(l);
		
		LinkedlistLearning o=new LinkedlistLearning();
		l.add(o);
		l.add(23);
		System.out.println(l);
		
		
		
		
	}

}
