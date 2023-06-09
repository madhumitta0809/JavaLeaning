package javaLearning;

public class Child extends Parent {
	
	int z;
	  public Child()
	  { System.out.println("Im child constructor");
	  System.out.println(super.z);
	  System.out.println(z);
	  
	  
	  }
	 

	public static void main(String[] args) {
		Child c=new Child();
		


	}

}
