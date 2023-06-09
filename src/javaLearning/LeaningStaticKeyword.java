package javaLearning;

public class LeaningStaticKeyword {
	static {
		System.out.println("im static1");
		System.out.println("heeeyyy");
	}
	static {
		System.out.println("im static 2");
	}
	public static void method1()
	{
		System.out.println("Method1");
		
	}
	public void method2()
	{
		System.out.println("Method2");
		method1();
	}
	public static void main(String[] args) {
		LeaningStaticKeyword o=new LeaningStaticKeyword();
		method1();
		o.method2();
				
	}

}
