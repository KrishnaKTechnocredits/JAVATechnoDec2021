package prajakta;

public class A20_SumOfDigit {
       void sumOfDigitForString(String input) {
    	       int sum = 0;
    	       for(int index=0; index<input.length(); index++) {
    	    	       char ch = input.charAt(index);
    	    	       if(Character.isDigit(ch)) {
    	    	    	       int number = Character.getNumericValue(ch); // this methodis used to get he numeric value
    	    	    	       sum = sum+number;
    	    	       }
    	       }
    	       System.out.println("Total sum of digits is "+sum);
       }
       
       public static void main(String[] args) {
    	       A20_SumOfDigit sumofdigit = new A20_SumOfDigit();
    	       sumofdigit.sumOfDigitForString("TE1ch2noC2re9iTs");
       }
}
