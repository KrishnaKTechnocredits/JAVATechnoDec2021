package yogeshNimbalkar;

import java.util.Scanner;

//Print character of provided ASCII value.
public class A33_P2_CharOfAsciiValue {

	char getCharOfAscii(int value) {
		char ch = (char) value;
		return ch;
	}
	
	public static void main(String[] args) {
		A33_P2_CharOfAsciiValue program2 = new A33_P2_CharOfAsciiValue();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a ASCII value :");
		int value = sc.nextInt();
		if(value>=0 && value<=255) {
			System.out.println("Character at " + value + " is : " + program2.getCharOfAscii(value));
		}else {
			System.out.println("Please enter calue in the range of 0 to 255");
		}
		sc.close();
	}
}
