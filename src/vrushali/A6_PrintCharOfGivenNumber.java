package vrushali;

public class A6_PrintCharOfGivenNumber {

	void printChar(String name){
		System.out.println("All character from " + name+ " String are: ");
		for(int index = 0; index<name.length(); index++) {
			System.out.println(name.charAt(index));
		}
	}

	void printCharInReverse(String name) {
		System.out.println("Characters in reverse order from " + name+ " string are: ");
		for(int index= name.length()-1; index>=0; index--) {
			System.out.println(name.charAt(index));
		}
	}
	
	void findCharFreq(String input, char ch){
		int count = 0;
		for(int index = 0; index < input.length(); index++) {
			if(input.charAt(index)== ch) {
				count++;
			}
		}
		System.out.println("occurance of character 'a' from akanksha is " + count);
	}

	public static void main(String[] args){

		A6_PrintCharOfGivenNumber printCharOfGivenNumber = new A6_PrintCharOfGivenNumber();
		printCharOfGivenNumber.printChar("techno");
		printCharOfGivenNumber.printCharInReverse("techno");
		printCharOfGivenNumber.findCharFreq("akanksha", 'a');
	}
}
