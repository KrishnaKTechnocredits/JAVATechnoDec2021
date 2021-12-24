/* Assignment - 7 : 19th Dec'2021  
Create only one program having following 2 methods. 

1.Print all characters at even position from given string.
input : technocredits
output : ehordt

2. Print only vowels from given string.
input : technocredits
output : eoei
 */

package amruta.Assignment_07;

public class FindVowels {

	void findEvaenPositionChar(String input) {
		System.out.println("Character at Even position are as below : ");
		String temp = "";
		for(int index =0;index<input.length();index++) {
			if ((index+1) % 2 == 0)
				temp = temp + input.charAt(index);
		}
		System.out.println(temp); 
	}

	void findVowels(String input) {
		System.out.println("Vowels from given String : ");
		String temp = "";
		for(int index =0; index<input.length();index++){
			if(input.charAt(index)=='a' || input.charAt(index)=='e' || input.charAt(index)=='i' || input.charAt(index)=='o' || input.charAt(index)=='u')
				temp =temp + input.charAt(index);
		}	
		System.out.println(temp);
	}

	public static void main(String[] args) {
		FindVowels findvowels = new FindVowels();
		findvowels.findEvaenPositionChar("technocredits");
		findvowels.findVowels("technocredits");
	}

}
