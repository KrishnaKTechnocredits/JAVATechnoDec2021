package shital;

class A7{

	void printEvenAndOddPosition(String name){
		System.out.println("Even position of string: ");
		for(int index=0;index<name.length();index++)
			if(index%2==1)
			System.out.println(name.charAt(index));
	}
	
	void printVowel(String name){
		System.out.println("Print Vowel letters: ");
		for(int index=0;index<name.length();index++)
		if(name.charAt(index)=='a' || name.charAt(index)=='e' || name.charAt(index)=='i' || name.charAt(index)=='o' || name.charAt(index)=='u'){
			System.out.println(name.charAt(index));
		}
	}
  
	public static void main(String[] args){
		A7 assignment7=new A7();
		assignment7.printEvenAndOddPosition("technocredits");
		assignment7.printVowel("technocredits");
	}
}
