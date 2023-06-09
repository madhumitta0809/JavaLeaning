package javaprograms;

public class Swap {

	public void temp()
	{
		int f=6;
		int s=10;
		
		int temp;
		temp=f;
		f=s;
		s=temp;
		System.out.println(f+"  "+s);
	}
	
	public void withouttemp()
	{
		int a=9;
		int b=4;
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println(a+" "+b);
	}
	
	public static void main(String[] args) {
		Swap o=new Swap();
		o.temp();
		o.withouttemp();
		
	}
}
