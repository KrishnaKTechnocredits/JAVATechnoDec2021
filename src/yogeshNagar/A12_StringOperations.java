package yogeshNagar;

import java.util.Scanner;

public class A12_StringOperations {
	
	void getReverseString(String name) {
		String reverseName = "";
		
		for(int index=name.length()-1;index>=0;index--) {
			reverseName = reverseName+ name.charAt(index);			
		}
		System.out.println(reverseName);
	}
	
	int getRepeatingCharCount(String name,char ch) {
		int count=0;
		for(int index=0; index<name.length(); index++) {
			if(name.charAt(index)==ch) {
				count++;
			}
		}
		return count;
	}

	void getFirstRepeatingChar(String name) {
		for(int index=0;index<name.length();index++) {
			int count = getRepeatingCharCount(name,name.charAt(index));
			if(count==2) {
				System.out.println("First repeating charcater ---- "+ name.charAt(index));
				break;
			}			
		}		
	}
	
	void getFirstNonRepeatingChar(String name) {
		for(int index=0;index<name.length();index++) {
			int count = getRepeatingCharCount(name,name.charAt(index));
			if(count==1) {
				System.out.println("First non repeating charcater ---- "+ name.charAt(index));
				break;
			}			
		}		
	}
	
	public static void main(String[] args) {
		A12_StringOperations stringOperation = new A12_StringOperations();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name for getting reverse ");
		stringOperation.getReverseString(scanner.next());	
		System.out.println("Enter name for getting first repeating char ");
		stringOperation.getFirstRepeatingChar(scanner.next());
		System.out.println("Enter name for getting fist non repeting char ");
		stringOperation.getFirstNonRepeatingChar(scanner.next());
		
		scanner.close();
	}
}
