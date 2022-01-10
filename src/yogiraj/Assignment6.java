package yogiraj;

public class Assignment6 
{
	public void printAllChar()
	{
		String s = "Techno";
		
		for(int i = 0; i<s.length(); i++)
		{
			System.out.println(s.charAt(i));
		}
	}
	
	public void countGivenchar(String s , char ch)
	{
		int count = 0;
		
		for(int i = 0; i<s.length(); i++)
		{
			if(s.charAt(i)==ch)
			{
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) 
	{
		Assignment6 a = new Assignment6();
		
		System.out.println("Printing All characters from the given string   ");
		
		a.printAllChar();
		
		System.out.println("Count of a given character is   ");

		
		a.countGivenchar("akanksha", 'a');
	}

}
