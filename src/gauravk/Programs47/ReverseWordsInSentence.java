package gauravk.Programs47;
/*
 * 20.How do you reverse words in a given sentence without using any predefined
method?
i/p : harsh
o/p : hsrah
 */
public class ReverseWordsInSentence {
	
	String reverseCharInString(String str) {
		char[] ch = str.toCharArray();
		String reverseString = "";
		for(int i=ch.length-1; i>=0; i--) {
			reverseString += ch[i];
		}
		return reverseString;
	}
	
	String reverseWordsInSentence(String str1) {
		String[] st = str1.split(" ");
		String reverseSentence="";
		for(int i=st.length-1; i>=0; i--) {
			reverseSentence += reverseCharInString(st[i]) + " ";
		}
		return reverseSentence.trim();
	}
	
	String straightWordsInReverseSentence(String str1) {
		String[] st = str1.split(" ");
		String reverseSentence="";
		for(int i=st.length-1; i>=0; i--) {
			reverseSentence += st[i] + " ";
		}
		return reverseSentence.trim();
	}
	
	public static void main(String[] args) {
		ReverseWordsInSentence reverse = new ReverseWordsInSentence();
		String s1 = "harsh";
		System.out.println("Reverse of String '"+s1+"'\nOutput is: "+reverse.reverseCharInString(s1));
		System.out.println("==================");
		String s2 = "Hi Hello How Are You";
		System.out.println("Reverse of String '"+s2+"'\nOutput is: "+reverse.reverseWordsInSentence(s2));
		System.out.println("==================");
		System.out.println("Reverse of String '"+s2+"'\nOutput is: "+reverse.straightWordsInReverseSentence(s2));
	}
}
