package omkar;

public class A27_MobileNumber {

	boolean isStringHasAlldigits(String input) {
		boolean flag = true;
		for (int index = 0; index < input.length(); index++) {
			if (!Character.isDigit(input.charAt(index))) {
				flag = false;
				break;
				}
			}
			return flag;
		}

		void validatePhoneNo(String name) {

			if (name.length() == 14) 
			{
				if (name.startsWith("+91 ")) 
				{
				  String last10char = name.substring(4);
				  if (isStringHasAlldigits(last10char) == true) {
					  if(last10char.startsWith("9")||last10char.startsWith("8")||last10char.startsWith("8")) 
							System.out.println("The " + name + " is a valid number ith length"+ name.length());
					    else
					    	System.out.println("The " + name + " is not a valid number with length"+ name.length());
		            }
				}
				else
					System.out.println("The " + name + " is not a valid number with length"+ name.length());
			}

			else if(name.length() == 13) 
			{
			   if(name.charAt(3)==' '&& name.charAt(7)==' '&& name.charAt(10)==' ') 
			   {
				   String namewithoutspace=name.replaceAll(" ", "");
				   if(namewithoutspace.startsWith("9")||namewithoutspace.startsWith("8")||namewithoutspace.startsWith("8")) 
				   {
					   if (isStringHasAlldigits(namewithoutspace) == true)
						System.out.println("The " + name + " is a valid number ith length"+ name.length());
					   else
						System.out.println("The " + name + " is not a valid number with length"+ name.length());
				   }
			   }

				else
					System.out.println("The " + name + " is not a valid number ith length"+ name.length());
		   }
			
			else if(name.length()==11)
			{
				if (name.startsWith("0")) 
				{
					String last10char1 = name.substring(1);
					if(last10char1.startsWith("9")||last10char1.startsWith("8")||last10char1.startsWith("8")) 
					{
						if (isStringHasAlldigits(last10char1) == true)
						System.out.println("The " + name + " is a valid number ith length"+ name.length());
						else
						System.out.println("The " + name + " is not a valid number ith length"+ name.length());
				   }
				}
				else
					System.out.println("The " + name + " is not a valid number ith length"+ name.length());
			}

			else if(name.length()==10)			
			{
			   if (isStringHasAlldigits(name) == true) 
			   {
				   if(name.startsWith("9")||name.startsWith("8")||name.startsWith("8")) 			  
					   System.out.println("The " + name + " is a valid number with lenth"+ name.length());
				   else
					   System.out.println("The " + name + " is not  a valid number with lenth"+ name.length());			   
			   }

			   else
					System.out.println("The " + name + " is not a valid number ith length"+ name.length());

			 }
			else
			System.out.println("The " + name + " is not  a valid number with lenth"+ name.length());
		}

		public static void main(String[] args) 
		{
			A27_MobileNumber a27_MobileNumber = new A27_MobileNumber();
			a27_MobileNumber.validatePhoneNo("+91 9765463742");//valid no
			a27_MobileNumber.validatePhoneNo("976 546 37 42");//valid no
			a27_MobileNumber.validatePhoneNo("09765463742");//valid no
			a27_MobileNumber.validatePhoneNo("9765463742");//valid no
			a27_MobileNumber.validatePhoneNo("9765463742");//valid no
			
			a27_MobileNumber.validatePhoneNo("+919765463742");//invalid no
			a27_MobileNumber.validatePhoneNo("097 654 637 42");//Invalid
			a27_MobileNumber.validatePhoneNo("+91 1765463742");//Invalid issue
			a27_MobileNumber.validatePhoneNo("976 546 3742");//Invalid 
			a27_MobileNumber.validatePhoneNo("976546A742");//Invalid 
	        a27_MobileNumber.validatePhoneNo("3765463742");//Invalid issue	        
	        a27_MobileNumber.validatePhoneNo("165463742");//invalid
		}
	}

