package abhishek;
import java.util.Scanner;
class Assignment19 {
	int upperCaseCount = 0, lowerCaseCount = 0,totalCount =0 , digitCount=0;

		int checkString(String input) {
			for(int index =0 ; index< input.length(); index++) {
				char ch = input.charAt(index);
				if(Character.isLetter(ch)) {
					if(Character.isUpperCase(ch)) 
						upperCaseCount++;
					if(Character.isLowerCase(ch)) 
						lowerCaseCount++;
			}
				else if(Character.isDigit(ch))
					digitCount++;

				else
					System.out.println("String contains Special Character");
			}	
			System.out.println("Total Upper case characters are - " +upperCaseCount);
			System.out.println("Total Lower case characters are - " +lowerCaseCount);
			System.out.println("Total Digits present in given String are - " +digitCount);
			return upperCaseCount+lowerCaseCount;
		}

	public static void main(String[] args) {
			Assignment19 assignment19 = new Assignment19();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String");
		String input = sc.nextLine();
		System.out.println("\nInput String is = "+ input+"\n");
		System.out.println("\nTotal Letters Present in String = " +assignment19.checkString(input));
	}
}