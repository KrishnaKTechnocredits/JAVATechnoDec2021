package shamli;

public class Assignment23Program2 {
	
	void getSumofNumbersFromString(String input)
	{
		String temp="";
		int sum=0;
		for(int index=0;index<input.length();index++)
		{
			
			char ch=input.charAt(index);
			if(Character.isDigit(ch))
			{
				temp=temp+ch;
			}
			else if(!temp.equals(""))
			{
				sum=sum+=Integer.parseInt(temp);
				temp="";
			}
		}
		if(!temp.equals(""))
			sum=sum+=Integer.parseInt(temp);
		System.out.println(sum);	
	}

	public static void main(String[] args) {
		Assignment23Program2 assignment23program2= new Assignment23Program2();
		String input="Tech2n6o7cred2dtis1";
		assignment23program2.getSumofNumbersFromString(input);

	}

}
