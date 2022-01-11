package yogiraj;

public class Assignmet19 
{
		public void isUpper(String str)
		{
			//String s = "TE1ch2noC2red9iTs";
			
			int count = 0;
			
			for(int i = 0; i < str.length(); i++)
			{
				if(Character.isUpperCase(str.charAt(i)))
				{
					count++;
				}
			}
			System.out.println("Total UpperCase characters -> " + count);	
		}
		
		public void isLower(String str)
		{
			//String s = "TE1ch2noC2red9iTs";
			
			int count = 0;
			
			for(int i = 0; i < str.length(); i++)
			{
				if(Character.isLowerCase(str.charAt(i)))
				{
					count++;
				}
			}
			System.out.println("Total LowerCase characters -> "+count);	
		}
		
		public void isDigit(String str)
		{
			//String s = "TE1ch2noC2red9iTs";
			
			int count = 0;
			
			for(int i = 0; i < str.length(); i++)
			{
				if(Character.isDigit(str.charAt(i)))
				{
					count++;
				}
			}
			System.out.println("Total Digits -> "+count);	
		}
		
		
	public static void main(String[] args) 
	{
		Assignmet19 a = new Assignmet19();
		
		a.isUpper("TE1ch2noC2red9iTs");
		
		a.isLower("TE1ch2noC2red9iTs");
		
		a.isDigit("TE1ch2noC2red9iTs");
	}

}
