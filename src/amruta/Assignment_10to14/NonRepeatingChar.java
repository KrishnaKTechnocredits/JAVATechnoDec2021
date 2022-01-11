/*		Assignment - 12 : 26th Dec'2021 

3. find the first non repeating character from given string. [program-3]
   input : technocredits
   output : h    */
  
package amruta.Assignment_10to14;
import java.util.Scanner;
 
class NonRepeatingChar{
	
	void printFirstNonrepeatedChar(String input) {
		System.out.println("\nFirst Unique character from given string " + input + " is :");
		System.out.println("-------------------------------------------------------------------");
		
		String str = input.toLowerCase();
		
			for (int index = 0; index < str.length(); index++) {
				char ch = str.charAt(index);
				
				if (str.indexOf(ch) == str.lastIndexOf(ch)) {
					System.out.println(ch);
					break;
				}
			}
	}
	
	public static void main(String[] args){
		NonRepeatingChar nonrepeatingchar = new NonRepeatingChar();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String name = sc.nextLine();
		
		nonrepeatingchar.printFirstNonrepeatedChar(name);
		sc.close();
	}
}