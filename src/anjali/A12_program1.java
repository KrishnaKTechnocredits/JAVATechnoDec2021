/*Assignment - 12 

Write 4 different programs to satisfy below requirements, please take input from user using Scanner class. 

1. print freq of each character in given String. [Program-1]*/
package anjali;

import java.util.Scanner;

public class A12_program1 {
	
	

	void freqOfEachCharacterInGivenString(String name)
	{
		A11_Assignment assignment11 = new A11_Assignment();		
		String z="";  
		for(int index=0;index<name.length();index++) 
		{
			//if(!z.contains(String.valueOf(name.charAt(index))))
			{
				int count=assignment11.totalOccOfChar(name,name.charAt(index));
				System.out.println("The Frey of character "+name.charAt(index)+" is "+count);
				//z=z+String.valueOf(name.charAt(index));
			}
		
		}
	 }

	public static void main(String[] args) {
		A12_program1 a12_scannerprogram1Example = new A12_program1 ();
		Scanner scanner = new Scanner(System. in);
		System.out.println("Enter string");
		String inputString = scanner. next();
		a12_scannerprogram1Example.freqOfEachCharacterInGivenString(inputString);
		}

}
