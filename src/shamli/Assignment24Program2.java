package shamli;

public class Assignment24Program2 {

	void findTotalVowelsFromEachString(String str)
	{
		int count=0;
		for(int index=0;index<str.length();index++)
		{
			char ch=str.charAt(index);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				count++;
			}
		}
		System.out.println("No of vowels from "+str+" are : "+count);
	}
	
	void findVowels(String input)
	{
		String[] arr=input.split(" ");
		for(int index=0;index<arr.length;index++)
		{
			findTotalVowelsFromEachString(arr[index]);
		}
		
	}
	public static void main(String[] args) {
		Assignment24Program2 assignment24program2= new Assignment24Program2();
		String input="Aashvi Hello GM Technocredits";
		assignment24program2.findVowels(input);
	}

}
