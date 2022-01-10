package shamli;
import java.util.Scanner;

public class Assignment20 {
	int sumOfAllDigitsInString(String input)
	{
		int sum=0;
		for(int index=0;index<input.length();index++)
		{
			char ch=input.charAt(index);
			if(Character.isDigit(ch))
			{
				int num = Character.getNumericValue(ch);
				sum = sum + num;
			}
		}
		return sum;
	}

	public static void main(String[] args) 
	{
		Assignment20 assignment20 = new Assignment20();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a input String : ");
		String input=scanner.nextLine();
		int sumOfDigits = assignment20.sumOfAllDigitsInString(input);
		System.out.println("Sum of all the digits from input String : " +sumOfDigits );
		scanner.close();
	}

}
