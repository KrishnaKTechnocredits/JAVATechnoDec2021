package shamli;

/*
WAP to convert first character of word with capital letter
Input    : "anvit harsh dipali"
Output : "Anvit Harsh Dipali"
*/

public class Assignment24Program5 {

	void splitAndGetOutputString(String input)
	{
		
		String[] arr=input.split(" ");
		String output="";
		for(int index=0;index<arr.length;index++)
		{
			output =output+ " " +processWord(arr[index]);
		}
		output=output.trim();
		System.out.println(output);
	}
	
	String processWord(String word)
	{
		String temp="";
		for(int i=0;i<word.length();i++) 
		{
			char ch=word.charAt(0);
			ch=Character.toUpperCase(ch);
			temp=ch+word.substring(1,word.length());
		}
		return temp;
	}
	
	public static void main(String[] args) {
		Assignment24Program5 assignment24program5= new Assignment24Program5();
		String input="aashvi hello good technocredits";
		assignment24program5.splitAndGetOutputString(input);
	}

}
