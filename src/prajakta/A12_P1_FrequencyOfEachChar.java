package prajakta;

import java.util.Scanner;

public class A12_P1_FrequencyOfEachChar {
	   int stringOccurrence(String input, char ch) {
		        int count = 0;
		        for(int index = 0;index < input.length(); index++) {
		        	   if (input.charAt(index) == ch)
		        		        count++;
		        }
		        return count;
	   }
	   
	   void countOccurrence(String input) {
		       for(int index = 0; index < input.length(); index++) {
		    	       char ch = input.charAt(index);
		    	       int count = stringOccurrence(input, ch);
		    	       System.out.println(ch + " : " + count);
		       }
	   }
	   
	   public static void main(String[] a) {
		      A12_P1_FrequencyOfEachChar a12_freq = new A12_P1_FrequencyOfEachChar();
		      Scanner sc = new Scanner(System.in);
		      System.out.println("Enter the input string");
		      String input = sc.next();
		      a12_freq.countOccurrence(input);
		      sc.close();
	   }

}

