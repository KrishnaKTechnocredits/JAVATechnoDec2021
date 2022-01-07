package yogiraj;

public class Assignment17
{
	
	
	int max = 0; 
	
	String name = "";
	public void printVowelCount()
	{
		String[] a = {"hi","priyanka", "sandip", "aakanksha", "pallavi", "apurva"};
		
		
		
		for(int i = 0; i<a.length; i++)
		{
			String str = a[i];
			
			int count =0;
			
			for (int j = 0; j < str.length(); j++) 
			 {
				if (str.charAt(j) == 'a' || str.charAt(i) == 'e' || str.charAt(j) == 'i' || str.charAt(j) == 'o'
						|| str.charAt(j) == 'u') 
				{
					count++;
					
					if(count>max)
					{
						max = count;
						
						name = a[i];
					}
				}
			 }
		}
		
		System.out.println("Program 2 to print name with highest vowel is "+name);
	}
	public void printConsecutiveTriplets() 
	{
		int[] a = { 10, 13, 14, 15, 16, 19, 20, 22, 23, 24 };

		for (int i = 0; i < a.length; i++)
		{
			for (int j = i + 1; j < a.length; j++) 
			{
				if (a[j] - a[i] == 1) 
				{
					for (int n = j + 1; n < a.length; n++) 
					{
						if (a[n] - a[j] == 1) 
						{
							System.out.println(a[i] + " " + " " + a[j] + " " + a[n]);
						}
					}
				}
			}

		}
	}

	public static void main(String[] args) 
	{
		Assignment17 a = new Assignment17();

		System.out.println("Program 1 to print triplets ");
		
		a.printConsecutiveTriplets() ;
		
		a.printVowelCount();

	}

}
