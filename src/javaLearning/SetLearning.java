package javaLearning;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetLearning {
	
	public static void main(String[] args) {
		
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(5);
		hs.add(4);
		hs.add(1);
		hs.add(9);
		hs.add(null);
		hs.add(5);
		hs.add(4);
		hs.add(null);
		System.out.println("HashSet:"+hs);
		
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		lhs.add(5);
		lhs.add(4);
		lhs.add(1);
		lhs.add(9);
		lhs.add(null);
		lhs.add(5);
		lhs.add(4);
		lhs.add(null);
		System.out.println("LinkedHashSet"+lhs);
		
		TreeSet<Integer>ts=new TreeSet<Integer>();
		ts.add(5);
		ts.add(4);
		ts.add(1);
		ts.add(9);
		ts.add(null);
		ts.add(5);
		ts.add(4);
		System.out.println("TreeSet"+ts);
		
	}

}
