package shamli;

public class Assignment24Program3 {

	String[] processString(String input)
	{
		String[] arr=input.split(" ");
		String[] output=new String[arr.length];
		for(int index=0;index<arr.length;index++)
		{
			output[index]=filterDigitFromString(arr[index]);
		}
		return output;
	}
	
	String filterDigitFromString(String input)
	{
		String temp="";
		for(int index=0;index<input.length();index++)
		{
			char ch=input.charAt(index);
			if(Character.isDigit(ch))
			{
				temp=temp+ch;
			}
		}
	return temp;
	}
	
	public static void main(String[] args) {
		Assignment24Program3 assignment24program3= new Assignment24Program3();
		String input="Aa15shvi H4ello 2GM Techn758ocredits";
		String[] digitArr=assignment24program3.processString(input);
		System.out.println("Digits from String are as follows : " );
		for(int i=0;i<digitArr.length;i++)
		{
			System.out.print(digitArr[i]+" ");
		}
	}
}

