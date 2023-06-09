package javaLearning;

public class StringBuffermethods  {
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("hey");
		s1.append("here");
		System.out.println(s1);
		System.out.println(s1.reverse());
		
		StringBuffer s=new StringBuffer("madhumathi");
		s.replace(5, 10, "mittaii");
		System.out.println(s);
		s.delete(5, 12);
		System.out.println(s);
		s.insert(4, "mitta");
		System.out.println(s);
		System.out.println(s.capacity());
		System.out.println(s);
		System.out.println(s.charAt(3)); 
		System.out.println(s.substring(2,4));
		System.out.println(s.length());
		System.out.println(s);
		
		
	}

}
