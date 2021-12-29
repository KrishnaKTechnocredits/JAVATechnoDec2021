package yogiraj;

public class StringOccurance 
{
	char ch;
	
	public int notRepeatingChar(String checkOccurance , char ch)
	{
		this.ch = ch;
		
		int count=0;

		for(int i =0; i<checkOccurance.length(); i++)
		{
			if(ch == checkOccurance.charAt(i))
			{
				count++;
			}
		}
				
		return count;
	}
		public static void main(String[] args) 
		{
			int cnt= 0;
			String name = "technocredits";
		
			StringOccurance s = new StringOccurance();
			
			
		
			for(int i = 0; i<name.length(); i++)
			{
				cnt = s.notRepeatingChar(name , name.charAt(i));
				
				if(cnt == 1)
				{
					System.out.println("First non repeating chat is   "+name.charAt(i));
					break;
				}
			}
		}
	}
	


