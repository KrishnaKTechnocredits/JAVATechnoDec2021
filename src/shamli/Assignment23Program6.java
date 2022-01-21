package shamli;

public class Assignment23Program6 {

	String returnExpectedString(String input)
	{
		String oddString="";
		String evenString="";
		String bigLetter="";
		String output="";
		for(int index=0;index<input.length();index++)
		{
			char ch=input.charAt(index);
			if(Character.isDigit(ch))
			{
				if(Character.getNumericValue(ch)%2==0)
					evenString=evenString+ch;
				else
					oddString=oddString+ch;
			}
			else if(Character.isUpperCase(ch))
			{
				bigLetter=bigLetter+ch;
			}
			output=oddString+evenString+bigLetter;
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment23Program6 assignment23program6= new Assignment23Program6();
		String input="Ac50FS1fe4es2r";
		String outputString=assignment23program6.returnExpectedString(input);
		System.out.println(outputString);
	}
}
