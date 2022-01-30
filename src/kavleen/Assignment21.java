package kavleen;

public class Assignment21 {

	void printDigitAsString(String name) {
		
		String sum = "";
		for (int index = 0 ; index <name.length();index++) {
			char ch = name.charAt(index);
			if(Character.isDigit(ch)) {
				sum = sum + ch;
			}	
		}
		System.out.println("Digits in String are " + sum);
	}
	
	public static void main (String [] args) {
		Assignment21 assignment21 = new Assignment21();
		assignment21.printDigitAsString("tech1noc59red3its");
	}
}
