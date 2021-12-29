package vivek;

public class FirstNonRepeatedCharFirst {

	void findFirstOccuranceCharacter(String inputStr) {
		for(char i :inputStr.toCharArray()){
			if ( inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
				System.out.println("First non-repeating character is: "+i);
				break;
			}
		}
	}

	public static void main(String args[]) {
		FirstNonRepeatedCharFirst firstOcuurence = new FirstNonRepeatedCharFirst();
		firstOcuurence.findFirstOccuranceCharacter("technocredits");
	}
}
