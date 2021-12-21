package yogeshNagar;

public class A7_StringAssignment {
	String initialString  = " ";
	
	void evenPosition(String inputString) {
		for(int index =0; index<inputString.length();index++){
			if((index+1)%2 == 0) {
				initialString =initialString + inputString.charAt(index);
			}			
		}	
		System.out.println(initialString);
	}
	
	void volwelChecker(String inputString) {
		String initialString  = " ";
		for(int index =0; index<inputString.length();index++){
			if(inputString.charAt(index)=='a' || inputString.charAt(index)=='e' || inputString.charAt(index)=='i' || inputString.charAt(index)=='o' || inputString.charAt(index)=='u')
				initialString =initialString + inputString.charAt(index);
		}	
		System.out.println(initialString);
	}
	
	public static void main(String[] args) {
		A7_StringAssignment assignment7 = new A7_StringAssignment();
		System.out.println("--------------Even Character Print---------------");
		assignment7.evenPosition("technocredits");
		System.out.println("--------------Vowel Checker---------------");
		assignment7.volwelChecker("technocredits");
	}
}
