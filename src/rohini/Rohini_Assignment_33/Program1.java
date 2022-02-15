package rohini.Rohini_Assignment_33;

import java.util.Scanner;

/*




 */

public class Program1 {

	int ascii;static char ch;

	//Program 1: Write a method which will return ascii value of given character.
	public int covertCharToAscii(char ch) {
		ascii=(int)ch;
		return ascii;
	}


	//2: Write a method which will return character of given Ascii value.
	public char covertAsciiToChar(int num) {
		ch=(char)num;
		return ch;
	}

	//Program 3: write a method which will print Ascii value of A to Z.

	public void covertCharToAsciiAtoZ() {
		for(char ch = 'A';ch<='Z';ch++) {
			ascii=(int)ch;


			System.out.println("Ascii Value of "+ch+" is: "+ascii);
		}
	}


	//Program 4: write a program which will print characters between ascii value 97 to 122.
	
	public void convertAsciiToChar() {
		int number;
		for(number =97;number<=122;number++)
			
		System.out.println("char Value of "+number+" is: "+(char)number);
	}


	public static void main(String[] args) {
		Program1 prg1 =new Program1();
		System.out.println("Ascii Value is: "+prg1.covertCharToAscii('A')+"\n");

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter ascii to convert in char  : ");
		int num1 = scanner.nextInt();
		System.out.println("Char Value of "+num1+" is: "+prg1.covertAsciiToChar(num1)+"\n");

		System.out.println("Value from A to Z is :");
		prg1.covertCharToAsciiAtoZ();
		
		System.out.println("\n Char Value of 97 to 122 is :");
		prg1.convertAsciiToChar();
		
		


 



	}

}
