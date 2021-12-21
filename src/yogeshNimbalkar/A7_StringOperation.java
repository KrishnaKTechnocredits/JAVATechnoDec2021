package yogeshNimbalkar;

//Assignment - 7 : 19 Dec 2021
class A7_StringOperation{
	
	void printCharAtEvenPos(String input){
		System.out.println("Characters at even positions are :");
		for(int index=0; index < input.length(); index++)
			if(index % 2 != 0)
				System.out.print(input.charAt(index));
	}
	
	void printVowels(String input){
		System.out.println("Vowels in given string are :");
		for(int index=0; index < input.length(); index++)
			if(input.charAt(index)=='a' || input.charAt(index)=='e' || input.charAt(index)=='i'|| input.charAt(index)=='o' || input.charAt(index)=='u' || input.charAt(index)=='A' || input.charAt(index)=='E' || input.charAt(index)=='I'|| input.charAt(index)=='O' || input.charAt(index)=='U')
				System.out.print(input.charAt(index));
	}
	
	public static void main(String[] args){
		A7_StringOperation stringOperation = new A7_StringOperation();
		stringOperation.printCharAtEvenPos("technocredits");
		System.out.println();
		stringOperation.printVowels("technocredits");
	}
}