package poojaRajguru;
import java.util.Scanner;

public class A21_DigitsInString {
	 void getDigit(String str) {
		 String dgt = "";
		 for(int index = 0; index < str.length(); index++) {
			 char c = str.charAt(index);
			 if(Character.isDigit(c)) {
				 dgt = dgt + c;
			 }
		 }
		 System.out.println("The Digits are in entered String are : " + dgt);			
	 }
	public static void main(String[] args) {
		A21_DigitsInString a21 = new A21_DigitsInString();
		System.out.println("Enter Your String");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		a21.getDigit(str);
		sc.close();
	}
}
	
