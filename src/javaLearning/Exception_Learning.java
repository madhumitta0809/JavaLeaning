package javaLearning;



public class Exception_Learning {
	public static void main(String[] args) {

		try {
			int n=5/0; 
			System.out.println(n);
			System.out.println("heyy");

		} 
		
		
		  catch(ArithmeticException e) 
		{ 
			  //e.printStackTrace();
		  System.out.println("handled here by arithmatic exception"); 
		  System.out.println(e);
			System.out.println(e.getMessage());
			}
		 


		catch(Throwable e) { 
			System.out.println("handled");
			

		}

		finally
		{ 
			System.out.println("No matter what happens i will execute");

		}
		
		try {
			//System.out.println(6/3);
			System.out.println("guessing/expecting exception here");
			throw new NullPointerException("explicitly throwing null pointer exception");
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
			System.out.println("null pointer exception is handled");
			
			//throw new RuntimeException();
			
			
		}
		
		finally {
			System.out.println("i will be used to close connections");
		}

		System.out.println("madhumitta");
		

	}
}
