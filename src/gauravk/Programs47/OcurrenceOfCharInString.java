package gauravk.Programs47;
/*
 * 9. How to count the occurrence of a given character in a String
i/p : technocredits ch : ‘t’
o/p : 2

 */
public class OcurrenceOfCharInString {
	
	void ocurrenceOfChar(String str, char ch) {
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==ch)
				count++;
		}
		System.out.println("Ocurrence of the character "+ch+" in the string "+str+" is "+count+" times.");
	}
	
	public static void main(String[] args) {
		OcurrenceOfCharInString obj = new OcurrenceOfCharInString();
		obj.ocurrenceOfChar("technocredits", 't');
	}
}
