package prajakta;

public class A21_FindDigitsString {

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
		      System.out.println("Sum of digits in input string is: " + sum);
		      return temp;
	   }
	
	   public static void main(String[] args) {
		      A21_FindDigitsString a21 = new A21_FindDigitsString();
		      String str = a21.sumOfDigits("T433Chrirtr");
		      System.out.println("digit string is: "+str);
	   }
}
