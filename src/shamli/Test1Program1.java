package shamli;

public class Test1Program1 
{
	int findCountOfChar(String name,char ch)
	{
		int count=0;
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)==ch)
			{
				count++;
			}
		}
		return count;
	}
	
	void findFirstNonRecuringCharFromString(String input)
	{
		for(int index=0;index<input.length();index++)
		{
			int count=findCountOfChar(input,input.charAt(index));
			if(count==1)
			{
				System.out.println("First Non recuring character from given string is : "+ input.charAt(index));
				break;
			}
		}
		
	}

	public static void main(String[] args)
	{
		Test1Program1 testprogram1= new Test1Program1();
		testprogram1.findFirstNonRecuringCharFromString("technocredits");
	}

}
