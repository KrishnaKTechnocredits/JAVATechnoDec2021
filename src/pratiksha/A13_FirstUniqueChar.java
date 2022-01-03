package pratiksha;

import java.util.Scanner;

public class A13_FirstUniqueChar {

	
	void firstUniqueChar(String name) {
		char ch =' ';
		
		for(int index =0; index <=name.length();index++) {
			
			ch= name.charAt(index);
			if(name.indexOf(ch)== name.lastIndexOf(ch) ) {
				System.out.println("First Unique Character is:" +ch);
				break;
			}
		}
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		A13_FirstUniqueChar uniqueChar = new A13_FirstUniqueChar();
		System.out.println("Enter String:");
		String input = sc.next();
		uniqueChar.firstUniqueChar(input);
	}

}
