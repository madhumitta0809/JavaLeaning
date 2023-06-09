package javaLearning;

public class StringMethods {
	public static void main(String[] args) {
		String name="Madhu";
		String s="";
		System.out.println(name);
		System.out.println(name.charAt(3));
		System.out.println(name.length());
		System.out.println(name.equals("MADHU"));
		System.out.println(name.equalsIgnoreCase("MADHU"));
		System.out.println(name.isEmpty());
		System.out.println(s.isEmpty());
		System.out.println(name.contains("h"));
		System.out.println(name.substring(2));
		System.out.println(name.substring(1,3));
		System.out.println(name.concat("mitta"));
		System.out.println(name);
		name=name.concat("mitta");
		
		System.out.println(name);
		System.out.println(name.indexOf("t"));
		System.out.println(name.indexOf("t",8));
		System.out.println(name.indexOf("a",8));
		System.out.println(name.indexOf("itt",5));
		String m="   Madhu mitta ";
		System.out.println(m);
		System.out.println(m.trim());
		int n=8;
		System.out.println(String.valueOf(n));
		int f=10000;
		String g=String.valueOf(f);
		System.out.println(g);
		String up="METHMADHKIH";
		System.out.println(up.toLowerCase());
		String lc="nfjfjfjjf";
		System.out.println(lc.toUpperCase());
		System.out.println(String.join("/","08","09","1999"));
		String j="madhu";
		String bi="mitta";
		System.out.println(String.join("@",j,bi));
		String splitstring="hey!how!are!you";
		String[] ss=splitstring.split("!");
		for (String string : ss) {
			System.out.println(string);
			
			
			
			
			
			
			
		}
		
		
		
		
				
		
	}
	
	
	

}
