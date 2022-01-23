package yogeshNimbalkar;

import java.util.Scanner;

//Find the difference between even and odd numbers from given string.
public class A23_DiffEvenOddNumInStr {

	int getSumOfNumbers(String str) {
		String temp ="";
		int sum = 0;
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch)) {
				temp = temp + ch;
			}else {
				if(!temp.equals("")) {
					if(Integer.parseInt(temp) % 2  == 0) {
						sum += Integer.parseInt(temp);
						temp = "";
					}else {
						sum -= Integer.parseInt(temp);
						temp ="";
					}
				}
			}
		}
		if(!temp.equals("")) {
			if(Integer.parseInt(temp)%2 == 0) {
				sum += Integer.parseInt(temp);
			}else {
				sum -= Integer.parseInt(temp);
			}		
		}
		return sum;
	}
	
	public static void main(String[] args) {
		A23_DiffEvenOddNumInStr diffEvenOddNum = new A23_DiffEvenOddNumInStr();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String input = scanner.next();
		System.out.println("Difference between Even and Odd numbers is : " + diffEvenOddNum.getSumOfNumbers(input));
		scanner.close();
	}
}
