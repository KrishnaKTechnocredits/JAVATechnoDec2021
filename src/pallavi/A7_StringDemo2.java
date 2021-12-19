/*Assignment - 7 : 19th Dec'2021  
Create only one program having following 2 methods. 
1.Print all characters at even position from given string.
input : technocredits
output : ehordt
2. Print only vowels from given string.
input : technocredits
output : eoei*/

package pallavi;

class A7_StringDemo2{

	void printEvenChar(String input){
		
		System.out.println("Characters at even position in "+input+" are: ");
		for(int index=0;index<input.length();index++) {
			if(index%2==1)
				System.out.println(input.charAt(index++));
		}	
	}
	
	void findVowels(String input){
	
		System.out.println("Vowels in string "+input+" are: ");
		for(int index=0;index<input.length();index++){
			if(input.charAt(index)=='a' || input.charAt(index)=='e' || input.charAt(index)=='i' || input.charAt(index)=='o' || input.charAt(index)=='u')
				System.out.println(input.charAt(index));
		}
	}
	
	public static void main(String[] arr){
	
		A7_StringDemo2 a7_StringDemo2=new A7_StringDemo2();
		a7_StringDemo2.printEvenChar("technocredits");
		a7_StringDemo2.findVowels("technocredits");
	}
}