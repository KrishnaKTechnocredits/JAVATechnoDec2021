package pranoti;

public class A7_StringOperations {
	
	void evenPositionChar(String name) {
		System.out.println("characters at even position from given string " +name+" are :");
		for(int index=0; index<name.length();index++) {
			if(index % 2 == 1) 
				System.out.println(name.charAt(index));
		}
	}
	
	void printVowels(String name) {
		System.out.println("Vowels from given string " +name+ " are:");
		for(int index = 0;index<name.length();index++){
			if(name.charAt(index)=='a' || name.charAt(index)=='e' || name.charAt(index)=='i' || name.charAt(index)=='o' || name.charAt(index)=='u')
				System.out.println(name.charAt(index));
		}
	}
	
	public static void main(String[] args) {
		A7_StringOperations stringOperations =new A7_StringOperations();
		stringOperations.evenPositionChar("technocredits");
		stringOperations.printVowels("technocredits");
	}
}
