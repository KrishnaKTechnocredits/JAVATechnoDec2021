package shamli;

public class Assignment7
{
	void printCharAtEven(String input)
	{
		for(int index=0;index<=input.length();index++)
		{
			if(index%2==0)
				System.out.print(input.charAt(index));
		}
	}
	
	void printVowels(String input)
	{
		for(int index=0;index<input.length();index++)
		{
			if(input.charAt(index)=='a' || input.charAt(index)=='e' ||input.charAt(index)=='i'
					|| input.charAt(index)=='o' || input.charAt(index)=='u')
			{
				System.out.print(input.charAt(index));
			}
		}
	}

	public static void main(String[] args)
	{
		Assignment7 assignment7 = new Assignment7();
		assignment7.printCharAtEven("TechnoCredits");
		System.out.println("--------------------");
		assignment7.printVowels("technocredits");
	}

}
