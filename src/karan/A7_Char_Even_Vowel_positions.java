package karan;

public class A7_Char_Even_Vowel_positions {
/*	Assignment - 7 : 19th Dec'2021  
	Create only one program having following 2 methods. 

	1.Print all characters at even position from given string.
	input : technocredits
	output : ehordt

	2. Print only vowels from given string.
	input : technocredits
	output : eoei
*/
	void dispalyChar(String input){
		System.out.println("Output:");
		for(int index=1;index<input.length();index+=2){
			System.out.print(input.charAt(index) + " ");
		}		
	}
	void findVowels(String input){ 
		System.out.println("\n Output:");
		for(int index=0;index<input.length();index++){
			if(input.charAt(index)=='a' || input.charAt(index)=='e' || input.charAt(index)=='i'|| input.charAt(index)=='o'|| input.charAt(index)=='u'){
					System.out.println(input.charAt(index) + " ");
			}
		}
	}
	public static void main(String args[]){
			A7_Char_Even_Vowel_positions assignment_A7= new A7_Char_Even_Vowel_positions();
			assignment_A7.dispalyChar("Technocredits");
			assignment_A7.findVowels("Technocredits");
	}
}
	

