package tanu;

class Assignment27{

	void phonePattern(String number) {
		String firstspace = "";
		String secondspace = "";
		String thirdspace = "";
		String fourthspace = "";
		String[] arrnumber;
	if(number.length() == 14)
	{
		arrnumber = number.split(" ");
		
		if(arrnumber.length == 2)
		{
			firstspace = arrnumber[0];
			secondspace = arrnumber[1];
			if(firstspace.startsWith("+"))
			{
				if(secondspace.startsWith("9") || secondspace.startsWith("8") || secondspace.startsWith("7"))
				{
					System.out.println("Valid Number");
				}
				else
				{
					System.out.println("Invalid Number 1");
				}
			}
			else
			{
				System.out.println("Invalid Number 2");
			}
		}
		else
		{
			System.out.println("Invalid Number 3");
		}
	}
	else if(number.length() == 13) {
        arrnumber = number.split(" ");
		
		if(arrnumber.length == 4)
		{
			firstspace = arrnumber[0];
			secondspace = arrnumber[1];
			thirdspace = arrnumber[2];
			fourthspace = arrnumber[3];
			if(firstspace.length()==3 && (firstspace.startsWith("9") || firstspace.startsWith("8") || firstspace.startsWith("7")))
			{
				if(secondspace.length()==3 && thirdspace.length()==2 && fourthspace.length()==2)
				{
					System.out.println("Valid Number");
				}
				else
				{
					System.out.println("Invalid Number 1");
				}
			}
			else
			{
				System.out.println("Invalid Number 2" + secondspace);
			}
		}
		else
		{
			System.out.println("Invalid Number 3" + arrnumber.length);
		}
		
	}
	else if(number.length() == 11) {
		if(number.startsWith("0") && (number.charAt(1) == '9') || number.charAt(1) == '8' || number.charAt(1) == '7')
		{
			System.out.println("Valid Number");
		}		
		else
		{
			System.out.println("Invalid Number");
		}
	}
	else if(number.length() == 10) {
		if(number.startsWith("9"))
		{
			System.out.println("Valid Number");
		}		
		else
		{
			System.out.println("Invalid Number");
		}
	}
	else
	{
		System.out.println("Invalid Number");
	}
	}

public static void main(String[] args){
Assignment27 assignment = new Assignment27();
assignment.phonePattern("  00000000 ");
}

}