package shamli;

public class Assignment23Program4 {
	
	void getDifferenceOfOddEven(String input)
	{
		int oddSum=0;
		int evenSum=0;
		int num=0;
		for(int index=0;index<input.length();index++)
		{
			char ch=input.charAt(index);
			if(Character.isDigit(ch))
				num=Character.getNumericValue(ch);
				if(num%2==0)
					evenSum=evenSum+num;
				else
					oddSum=oddSum+num;
		}
		int total=oddSum-evenSum;
		System.out.print(total);
			
	}

	public static void main(String[] args) {
		Assignment23Program4 assignment23program4= new Assignment23Program4();
		String input="tec5bd1fe4esr";
		assignment23program4.getDifferenceOfOddEven(input);

	}

}
