package jayashri;

public class A27_ValidatePhoneNumber {
	boolean isStringHasAlldigits(String input) {
		boolean flag = true;
		for (int index = 0; index < input.length(); index++) {
			if (!Character.isDigit(input.charAt(index)))
			{
				flag = false;
				break;
			}
		}
		return flag;
	}

	void validatePhoneNo(String number) {
	
		if (number.length() == 14) 
		{
			if (number.startsWith("+91 ")) 
			{
			  String last10char = number.substring(4);
			  if (isStringHasAlldigits(last10char) == true) {
				  if(last10char.startsWith("9")||last10char.startsWith("8")||last10char.startsWith("8")) 
						System.out.println(number + " is a valid phone number");
				    else
				    	System.out.println(number + " is not valid phone number");
	            }
			}
			else
				System.out.println(number + " is a valid phone number");
		}
			
			
		else if(number.length() == 13) 
		{
		   if(number.charAt(3)==' '&& number.charAt(7)==' '&& number.charAt(10)==' ') 
		   {
			   String numberwithoutspace=number.replaceAll(" ", "");
			   if(numberwithoutspace.startsWith("9")||numberwithoutspace.startsWith("8")||numberwithoutspace.startsWith("8")) 
			   {
				   if (isStringHasAlldigits(numberwithoutspace) == true)
					System.out.println(number + " is a valid phone number");
				   else
					System.out.println(number + " is not valid phone number");
			   }
		   }
		   
			else
				System.out.println(number + " is not valid phone number");
	   }
			
			
			
		else if(number.length()==11)
		{
			if (number.startsWith("0")) 
			{
				String last10char1 = number.substring(1);
				if(last10char1.startsWith("9")||last10char1.startsWith("8")||last10char1.startsWith("8")) 
				{
					if (isStringHasAlldigits(last10char1) == true)
					System.out.println(number + " is a valid phone number");
					else
					System.out.println(number + " is not valid phone number");
			   }
			}
			else
				System.out.println(number + " is not valid phone number");
		}
			
			
		else if(number.length()==10)			
		{
		   if (isStringHasAlldigits(number) == true) 
		   {
			   if(number.startsWith("9")||number.startsWith("8")||number.startsWith("8")) 			  
				   System.out.println(number + " is a valid phone number");
			   else
				   System.out.println(number + " is not valid phone number");			   
		   }
			
		   else
				System.out.println(number + " is not valid phone number");
		   
		 }
		else
		System.out.println(number + " is not valid phone number");
	
	
	}

	public static void main(String[] args) 
	{
		A27_ValidatePhoneNumber a27_validatephonenum = new A27_ValidatePhoneNumber();	
		
		a27_validatephonenum.validatePhoneNo("+919765463742"); 
		a27_validatephonenum.validatePhoneNo("976546A742");
		a27_validatephonenum.validatePhoneNo("09765463742");
		a27_validatephonenum.validatePhoneNo("9765463742");
        a27_validatephonenum.validatePhoneNo("3765463742");
        a27_validatephonenum.validatePhoneNo("9765463742");
		a27_validatephonenum.validatePhoneNo("097 654 637 42");
		a27_validatephonenum.validatePhoneNo("+91 1765463742");
		a27_validatephonenum.validatePhoneNo("976 546 3742");
		a27_validatephonenum.validatePhoneNo("+91 9765463742");
		a27_validatephonenum.validatePhoneNo("976 546 37 42");
        a27_validatephonenum.validatePhoneNo("165463742");

	}
}
