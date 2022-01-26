package shamli;

public class Assignment16 {
	
	void getCountOfVowelsFromStringArray(String[] name)
	{
		for(int index=0;index<name.length;index++)
			findCountOfVowelsFromString(name[index]);
	}
	void findCountOfVowelsFromString(String fname)
	{
		int count=0;
		for(int index=0; index<fname.length();index++)
		{ 
			if(fname.charAt(index)=='a' || fname.charAt(index)=='e' 
					|| fname.charAt(index)=='i' || fname.charAt(index)=='o' || fname.charAt(index)=='u')
			{
				count++;
			}
		}
		System.out.println(fname + " ---> " +count );
	}
	
	

	public static void main(String[] args) 
	{
		Assignment16 assignment16 = new Assignment16();
		String[] arr = {"priyanka", "swati", "acharya", "hevin"};
		assignment16.getCountOfVowelsFromStringArray(arr);
	}

}
