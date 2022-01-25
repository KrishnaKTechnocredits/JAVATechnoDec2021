package shamli;

/*
WAP to reverse each word on the same index
Input    : "Hi techno hello"
Output : "iH onhcet olleh"
*/

public class Assignment24Program4 {

	void combinedStringWithReverseWords(String input)
	{
		String[] arr=input.split(" ");
		String output="";
		for(int index=0;index<arr.length;index++)
		{
			output=output+reverseWord(arr[index])+" ";
		}
		output.trim();
		System.out.println(output);
	}
	
	String reverseWord(String word)
	{
		String reverseword="";
		for(int i=word.length()-1;i>=0;i--)
		{
			char ch=word.charAt(i);
			reverseword=reverseword+ch;
		}
		return reverseword;
	}
	
	public static void main(String[] args)
	{
		Assignment24Program4 assignment24program4= new Assignment24Program4();
		String input="Aashvi Hello GM Technocredits";
		assignment24program4.combinedStringWithReverseWords(input);
	}
}
