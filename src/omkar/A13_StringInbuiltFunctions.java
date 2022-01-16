package omkar;


import java.util.Scanner;

public class A13_StringInbuiltFunctions {

	void printAllDuplicates(String str) {
		String duplicate = "";
		System.out.println(" Duplicate characters are : ");
		for(int i = 0; i<str.length(); i++) {
			if(str.indexOf(str.charAt(i)) != str.lastIndexOf(str.charAt(i))) {
				if(duplicate.indexOf(str.charAt(i)) == -1)
				{
					duplicate = duplicate + str.charAt(i);
					System.out.print(" " + str.charAt(i));
				}
			}				
		}			
	}
	
	void printAllUniques(String str) {
		System.out.println(" Unique characters are : ");
		for(int i = 0; i<str.length(); i++) {
			if(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i)))
				System.out.print(" " + str.charAt(i));				
		}
	}
	
	char firstUniqueChar(String str) {
		char uniqueChar = ' ';
		for(int i = 0; i<str.length(); i++) {
			if(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i)))
			{
				uniqueChar = str.charAt(i);
				break;
			}
		}
		return uniqueChar;
	}
	
	char firstDuplicateChar(String str) {
		char duplicateChar = ' ';
		for(int i = 0; i<str.length(); i++) {
			if(str.indexOf(str.charAt(i)) != str.lastIndexOf(str.charAt(i)))
			{
				duplicateChar = str.charAt(i);
				break;
			}
		}
		return duplicateChar;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A13_StringInbuiltFunctions stringInbuiltFunctions = new A13_StringInbuiltFunctions();
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter a string : ");
		String str = scanner.next();
		stringInbuiltFunctions.printAllDuplicates(str);
		System.out.println();
		stringInbuiltFunctions.printAllUniques(str);
		System.out.println();
		System.out.println(" First Unique char from String " + str + " is : " + stringInbuiltFunctions.firstUniqueChar(str));
		System.out.println();
		System.out.println(" First Duplicate char from String " + str + " is : " + stringInbuiltFunctions.firstDuplicateChar(str));
		scanner.close();
	}
}
