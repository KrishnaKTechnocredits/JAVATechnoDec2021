package naquibalam;

public class Test1_NonRepeat {
	
	char getFirstNonRepetingChar(String input) {
		char returnChar = 0;
		for (int i = 0; i <= input.length() - 1; i++) {
			boolean repeatingFound = false;
			for (int j = 0; j <= input.length() - 1; j++) {
				if ((input.charAt(i) == input.charAt(j)) && (i != j)) {
					repeatingFound = true;
					break;					
				} 
			}
			if (repeatingFound == false) {
				returnChar = input.charAt(i);
				break;
			}
		}
		return returnChar;
	}

	public static void main(String[] args) {
		Test1_NonRepeat test1_NonRepeat = new Test1_NonRepeat();
		String strToCheck = "technocredits";
		char firstNonRepetingChar= test1_NonRepeat.getFirstNonRepetingChar(strToCheck);
		System.out.println("First non-repeating character in string '" + strToCheck + "' is '" + firstNonRepetingChar + "'");
	}
}
