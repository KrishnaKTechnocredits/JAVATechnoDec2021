package rohini;

/*
Assignment 29 : 25th Jan'2022

WAP to find out the total sum of all the numbers present in the given string without using Character class method.
Input    : I have 15 years and 3 months of automation experience
Output : Expected Sum  = 8

Hint      : Using exception handling (i.e. try catch block). */


public class Rohini_Assignment29 {
	
	void AdditionUsingException(String Statement)
	{
		int sum=0;
		String strarr[]=Statement.split(" ");
		for(int index=0;index<strarr.length;index++)
		{
			try
			{
			 sum=sum+Integer.parseInt(strarr[index]);
			}
			catch(Exception e)
			{ 
				//System.out.println(e);
			}
			
		}System.out.println("Addition is "+sum);
		
	}

	public static void main(String[] args) {
		Rohini_Assignment29  rohiniAssignment29 = new  Rohini_Assignment29();
		rohiniAssignment29.AdditionUsingException("I have 14 years and 6  months of automation experience");
	}

}
