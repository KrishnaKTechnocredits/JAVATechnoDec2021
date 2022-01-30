package shamli;

public class Assignment24Program7 {

	void splitAndGetOutputString(String input)
	{
		
		String[] arr=input.split(" ");
		String output="";
		for(int index=0;index<arr.length;index++)
		{
			output =output+ " " +reverseCaseOfEachCharacterInWord(arr[index]);
		}
		output=output.trim();
		System.out.println(output);
	}
	
	String reverseCaseOfEachCharacterInWord(String word)
	{
		
		String reverseCaseWord="";
		for(int i=0;i<word.length();i++)
		{
			char ch=word.charAt(i);
			if(Character.isUpperCase(ch))
			{
				ch=Character.toLowerCase(ch);
			}
			else
			{
				ch=Character.toUpperCase(ch);
			}
			reverseCaseWord=reverseCaseWord+ch;
		}
		
		return reverseCaseWord;
	}
	
	public static void main(String[] args) {
		Assignment24Program7 assignment24program7= new Assignment24Program7();
		String input="AaShvI HeLlO gooD tEechNocRediTs";
		assignment24program7.splitAndGetOutputString(input);
	}

}
