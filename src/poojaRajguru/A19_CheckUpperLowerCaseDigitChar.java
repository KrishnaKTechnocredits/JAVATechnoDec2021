/*Program to check Upper case and lower case letters and the digits and the characters*/
package poojaRajguru;
import java.util.*;

public class A19_CheckUpperLowerCaseDigitChar {
	public static void main(String[] args) {
		A19_CheckUpperLowerCaseDigitChar a19 = new A19_CheckUpperLowerCaseDigitChar();
		System.out.println("Enter your string : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		a19.checkUpperLowerCaseDigitChar(str);
		sc.close();
	}	
	void checkUpperLowerCaseDigitChar(String str){
		int upper=0,lower=0,digit=0;
		for(int index =0;index<str.length();index++) {
			if(Character.isLetter(str.charAt(index))) {
				if(Character.isUpperCase(str.charAt(index))) {
					upper++;
				}
				else
				{
					lower++;
				}
			}else if(Character.isDigit(str.charAt(index))){
				digit++;
			}
	}
		System.out.println("String is = " + str );
		System.out.println("Upper case letters are = " + upper );
		System.out.println("Lower case letters are = " + lower );
		System.out.println("Digits in Given String are = " + digit );		
	}	
}