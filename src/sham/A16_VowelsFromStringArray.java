package sham;

public class A16_VowelsFromStringArray {
	int grandTotalVowels;
	void findVowelsFromString(String name)
	{
	//	
		//String name="ganesha";
		int count=0;
		for(int index=0;index<name.length();index++)
		{
			if(name.charAt(index)=='a'||name.charAt(index)=='e'||name.charAt(index)=='i'||name.charAt(index)=='o'||name.charAt(index)=='u')
			{
				//System.out.println("Vowel from String "+name+" is:----->"+ name.charAt(index));
				count++;
				grandTotalVowels++;
			}
		}
		System.out.println("Vowel Count from "+name+" is :"+count);
	}

	void findVowelsFromStringArray()
	{
		String name[]= {"priyanka", "swati", "acharya", "hevin" };
		for(int i=0;i<name.length;i++)
		{
			findVowelsFromString(name[i]);
		}
		System.out.println("---------------------------------------------------");
		System.out.println("Total vowels from Array is: "+grandTotalVowels);
		System.out.println("---------------------------------------------------");
	}

	public static void main(String[] args) {
		
		A16_VowelsFromStringArray vowelString= new A16_VowelsFromStringArray();
		//vowelString.findVowelsFromString("ganesharao");
		vowelString.findVowelsFromStringArray();
		
	}

}
