package yogeshNimbalkar;

import java.util.Scanner;

// find some of numbers from given string e.g. te12ch22nocre3dits4 => 12+22+3+4 = 41
public class A23_SumOfNosInString {

	int getSumOfNumbers(String str) {
		String temp ="";
		int sum = 0;
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch)) {
				temp = temp + ch;
			}else {
				if(!temp.equals("")) {
					sum += Integer.parseInt(temp);
					temp = "";
				}
			}
		}
		if(!temp.equals("")) {
			sum += Integer.parseInt(temp);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		A23_SumOfNosInString sumofnumbers = new A23_SumOfNosInString();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String input = scanner.next();
		System.out.println("Sum = " + sumofnumbers.getSumOfNumbers(input));
		scanner.close();
	}
}
