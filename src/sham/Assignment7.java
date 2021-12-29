package sham;

class Assignment7
{
	
	void dispalyChar(String name)
	{
	//String name= "Technocredits";
	int len= name.length();
	int count=0;
	System.out.println("----This function is for print even number positions charecter from the string---- ");
	for(int i=1;i<len;i++)
	{
		if(i%2==0)
			System.out.print(name.charAt(i) + " ");
	}
	System.out.println(" ");
	}
	

	void findVowels(String name){
		int len= name.length();
		System.out.println("----This function is for Finding the vowels in the string---- ");
		for(int i=0;i<len;i++)
	{
			if(name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i'|| name.charAt(i)=='o'|| name.charAt(i)=='u')
			{
				System.out.println(name.charAt(i) + " ");
			}
	}
	}
	public static void main(String args[])
	{
		Assignment7 assignment= new Assignment7();
		assignment.dispalyChar("Technocredits");
		assignment.findVowels("Technocredits");
		
		
		
	}
}