package ashish;

public class Test1_StringOperation {

	void findFirstNonRepeatingChar(String input) {
		// TODO Auto-generated method stub
		int frequency = 0;
		boolean nonRepeatingCharFound = false;
		for(int i=0; i< input.length(); i++) {
			frequency = findOccurence(input, input.charAt(i));
			if(frequency == 1) {
				System.out.println(" First Non Repeating Character in String " + input + " is : " + input.charAt(i));
				nonRepeatingCharFound = true;
				break;
			}				
		}
		if(nonRepeatingCharFound == false)
			System.out.println(" All characters are repeating in string " + input);		
	}
	
	int findOccurence(String input, char ch){
		int count = 0;
		for(int i=0; i<input.length(); i++){
			if(input.charAt(i) == ch)
				count = count + 1;
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1_StringOperation stringOperations = new Test1_StringOperation();
		System.out.println();
		stringOperations.findFirstNonRepeatingChar("TECHNOCREDITS");
		System.out.println();
		stringOperations.findFirstNonRepeatingChar("AABBCC");
	}
}
