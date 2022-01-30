/*Assignment-29 : 25th Jan'2022
WAP to find out the total sum of all the numbers present in the given string without using Character class method.
Input  : I have 15 years and 3 months of automation experience
Output : Expected Sum  = 8
Hint   : Using exception handling (i.e. try catch block). 
 */
package anjali;

public class Anjali_Assignment29 {
	
	void sumOfNumUsingException(String name)
	{
		int sum=0;
		String arr[]=name.split(" ");
		for(int index=0;index<arr.length;index++)
		{
			try
			{
				int num=Integer.parseInt(arr[index]);
			    sum=sum+num;
			}
			catch(NumberFormatException ae)
			{}
			
		}System.out.println(sum);
		
	}

	public static void main(String[] args) {
		 Anjali_Assignment29  anjali_Assignment29 = new  Anjali_Assignment29();
		 anjali_Assignment29.sumOfNumUsingException("I have 15 years and 3 months of automation experience");
	}

}
