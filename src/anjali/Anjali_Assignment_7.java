/*Assignment - 7 : 19th Dec'2021  
Create only one program having the following 2 methods. 

1.Print all characters at an even position from the given string.
input : technocredits
output : ehordt

2. Print only vowels from a given string.
input : technocredits
output : eoei

 */
package anjali;

public class Anjali_Assignment_7 {
	
	void printAllCharAtEven(String name){
		for(int index=1;index<name.length();index=index+2){
			System.out.println("The Chracter at Even position are : "+name.charAt(index));
		}
	}

	void printVowelInString(String name){
		for(int index=0;index<name.length();index++){
			if(name.charAt(index)=='a'||name.charAt(index)=='e'||name.charAt(index)=='i'
					||name.charAt(index)=='o'||name.charAt(index)=='u')
				System.out.println("The vowel in given string are : "+name.charAt(index));
		}
	}
	public static void main(String[] args){
		Anjali_Assignment_7 a7=new Anjali_Assignment_7();
		a7.printAllCharAtEven("technocredits");
		System.out.println("**************************");
		a7.printVowelInString("technocredits");



	}

}
