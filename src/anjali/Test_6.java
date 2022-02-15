package anjali;

public class Test_6 {
	char firstNonReapChar(String name) 
	{
		char firstNonRepeatChar=' ';
		for(int index=0;index<name.length();index++) 
		{
			char ch=name.charAt(index);
			if(Character.isUpperCase(ch)) 
			{
				if(name.indexOf(ch)==name.lastIndexOf(ch)) 
				{
				  firstNonRepeatChar=ch;
				  break;
				}
			}
		}
		return firstNonRepeatChar;
	}
	
	
	String wordHaveMaxLength(String name) 
	{
		String arr[]=name.split(" ");
		int max=0;
 	    String wordHaveMaxLength="";
		for(int index=0;index<arr.length;index++) 
		{
			if(arr[index].length()>max)
			{
				max=arr[index].length();
			    wordHaveMaxLength=arr[index];
			}
		}
		return  wordHaveMaxLength;
		
	}
	
	int sumOfDigit(String name) 
	{
		String arr[]=name.split(" ");
		int sum=0;
		for(int index=0;index<arr.length;index++) 
		{
			int num=Integer.parseInt(arr[index]);
			sum=sum+num;
		}
		return sum;
	}

	public static void main(String[] args) {
		Test_6 test_6 = new Test_6();
		String input="tEChNoCrEdits";
		char output=test_6.firstNonReapChar(input);
		System.out.println("In String "+input+" the first non repeating Capital character is "+output);
		
		String MaxlenghthWord=test_6.wordHaveMaxLength("good morning technocredits hi hello");
		System.out.println(MaxlenghthWord+" is the word having maximum length");
		
		int outputSum=test_6.sumOfDigit("10 10 20 30");
		System.out.println("The sum od digits is given string is "+outputSum);
		

	}

}
