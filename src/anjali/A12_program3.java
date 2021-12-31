/*Assignment - 12
	3. find the first non repeating character from given string. [program-3]
   input : technocredits
   output : h
	4. find the first repeating character from given string. [program-3]
   input : shivangi
   output : i
	5. write a method to return the reverse string. [program-3]*/
package anjali;
import java.util.Scanner;
public class A12_program3 {

	int countOfCharInString(String input , char ch){    
		int index =0;
	    int count =0;
		for (index=0;index<input.length();index++) {
			if (input.charAt(index)==ch){
				count++;
			}
		}
			return count;
	}
	  
	void firstNonRepeatingCharacter(String name){
		int index;
	    int cnt=0;
	    for (index=0;index<name.length();index++) {
	    	cnt=countOfCharInString(name, name.charAt(index));
	    	//System.out.println("The count of character "+name.charAt(index)+" is  "+cnt);
	    	if (cnt==1) {
	    		System.out.println("The first non Reapeating char is "+name.charAt(index));
	    		break;
	    	}
		 }
	 }
	    
	void firstRepeatingCharacter(String name){
		int index;
	    int cnt=0;
	    for (index=0;index<name.length();index++) {
	    	cnt=countOfCharInString(name, name.charAt(index));
	    	//System.out.println("The count of character "+name.charAt(index)+" is  "+cnt);
	    	 if (cnt==2) {
	    		 System.out.println("The first Reapeating char is "+name.charAt(index));
	    		 break;
	    	}
		}
	}
	    
	String reverseString(String name){
		String Reverse="";
		for(int index=name.length()-1;index>=0;index--){
			Reverse=Reverse+name.charAt(index);
		 }
		 	return Reverse;
	 }
	    
	public static void main(String[] args) {
		A12_program3 anjaliTest1=new A12_program3();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the String");
	    String input=scanner.next();
		anjaliTest1.firstNonRepeatingCharacter(input);
		anjaliTest1.firstRepeatingCharacter(input);
		String reverse=anjaliTest1.reverseString(input);
		System.out.println(reverse);
		scanner.close();
			
			
		  
}
}
