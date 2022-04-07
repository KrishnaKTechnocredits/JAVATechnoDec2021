package gauravk.Programs47;
/*
 * 8. Find the first non repeated character of a given String
i/p : harsh
o/p : a
 */
public class FirstNonRepeatedCharFrmString {
	
	void firstNonRepeatChar(String str) {
		char c = ' ';
		for(int i=0; i<str.length(); i++) {
			if(str.indexOf(str.charAt(i))== str.lastIndexOf(str.charAt(i))) {
				System.out.println("First non-repeating character from string "+str+" is "+str.charAt(i));
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		String s = "harsh";
		FirstNonRepeatedCharFrmString ch = new FirstNonRepeatedCharFrmString();
		ch.firstNonRepeatChar(s);
	}
}
