package poojaRajguru;
import java.util.Scanner;
/*Program to get sum of digits that are in entered string*/
public class A20_StringDigitsSum {	
	void getSum(String str) {
		int sum = 0;
		for(int index = 0; index <str.length(); index++) {
			char s = str.charAt(index);
			if(Character.isDigit(s)) {
				sum = sum + Character.getNumericValue(s);
			}
		}
		System.out.println("The Sum is : " + sum);
	}
	public static void main(String[] args) {
		A20_StringDigitsSum a20 = new A20_StringDigitsSum();
		System.out.println("Enter Your String : ");
		Scanner sc= new Scanner(System.in);
		String str = sc.next();		
		a20.getSum(str);
		sc.close();
	}
}
