package shamli;

public class Assignment23Program3 {

	String returnExpectedString(String input)
	{
		String finalString="";
		String lowercase="";
		String digit="";
		String uppercase="";
		String special="";
		
		for(int index=0;index<input.length();index++)
		{
			char ch=input.charAt(index);
			if(Character.isLowerCase(ch))
			{
				lowercase=lowercase+ch;
			}
			else if(Character.isUpperCase(ch))
			{
				uppercase=uppercase+ch;
			}
			else if(Character.isDigit(ch))
			{
				digit=digit+ch;
			}
			else 
			{
				special=special+ch;
			}
		}
		finalString=lowercase+digit+uppercase+special;
		return finalString;
	}
	
	public static void main(String[] args) {
		Assignment23Program3 assignment23program3= new Assignment23Program3();
		String input="Tech2n6o7cred2dtis1$78%Tchhjh*";
		String outputString=assignment23program3.returnExpectedString(input);
		System.out.println(outputString);
	}
}
