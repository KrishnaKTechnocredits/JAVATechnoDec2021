package yogiraj;

public class Assignment27  
{
public void validateNumber()
{
		//String number = "+91 9765463742";
		
		String number = "976 546 37 42";				
										
		String [] temp;
		
		int i = 0;

		boolean flag = false;
		
		if(number.startsWith("+91") && number.charAt(3)==' ' && number.length() == 14 && number.charAt(4)=='9') 
		{

			temp = number.split(" ");
			
			while(i < temp[1].length())
			{
				if(Character.isDigit(temp[1].charAt(i)))
				{
					flag = true;
				}
				else
				{
				 break;
				}
				i++;

			 }
		}
				
		while(i<number.length())
		{
			if(number.startsWith("9") && number.length() == 13 && number.charAt(3)==' ' && number.charAt(7)==' ' && number.charAt(10)==' ')
			{
				if(Character.isDigit(number.charAt(i)) || number.charAt(i)==' ')
					{
						flag = true;
					}
					else
					{
						flag = false;
						
						i = 0;
						
						break;
					}
				//i++;	

   			 }
			
		 	if(number.startsWith("09") && number.length()==11)
		 	{

		 		if(Character.isDigit(number.charAt(i)) && !(number.charAt(i)==' '))
				{
					flag = true;
				}
				else
				{
					flag = false;
					
					break;
				}
		 		//i++;
		 	}
		 	
		 	if(number.startsWith("9") && number.length()==10)
		 	{
		 		if(Character.isDigit(number.charAt(i)))
		 		{
		 			flag = true;
		 		}
		 		
		 		else
		 		{
		 			break;
		 		}
		 	}
		 	i++;
		}
		
		if(flag)
		{
			System.out.println("Valid number");
		}
		else
		{
			System.out.println("Invalid");
		}
}
	public static void main(String[] args) 
	{
		Assignment27 a = new Assignment27();
		
		a.validateNumber();
	}

}
