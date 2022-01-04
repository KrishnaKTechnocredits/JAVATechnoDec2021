/*	Assignment - 12 : 26th Dec'2021 
1. print freq of each character in given String. [Program-1]
*/

package amruta.Assignment_10to14;
import java.util.Scanner;
class FrequencyOfChar{
	
	void frequencyofAllChar(String str, char ch){
		
		for(int index = 0; index < str.length(); index++){
			//char ch = str.charAt(index);
			
			if(str.indexOf(ch) == index) {
				
				int count = 0;
					for(int innerindex = 0; innerindex < str.length(); innerindex++){
						
						if(str.charAt(innerindex) == ch)
							count++;
					}
				System.out.println("Frequency of char "+ch+" is - "+count);
			}
		}
	}
	

	
	public static void main(String[] args){
		FrequencyOfChar frequency = new FrequencyOfChar();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input string");
		String input = scanner.nextLine();
		System.out.println("Enter the target character");
		char targetchar = scanner.next().charAt(0);
		
		frequency.frequencyofAllChar(input,targetchar);
		
		scanner.close();
	}
}