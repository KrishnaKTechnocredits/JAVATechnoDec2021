package kalyani;

public class A21_FindDigitInString {

	   String sumOfDigits(String input) {
		   int sum = 0;
		   String temp = "";
		   for(int index =0; index<input.length(); index++) {
			   char ch = input.charAt(index);
			   if (Character.isDigit(ch)) {
				   sum = sum + (Character.getNumericValue(ch));
		    	   temp = temp+ch;
			   }
		   }
		   System.out.println("Sum of digits in given string is: " + sum);
		   return temp;
	   }

	   public static void main(String[] args) {
		   A21_FindDigitInString assign21 = new A21_FindDigitInString();
		   String str = assign21.sumOfDigits("T433985Chrirvds88tr");
		   System.out.println("Present digits in string is: "+str);
	   }
}