package gauravk.Programs47;
/*
 * 24.Write a program which converts words with the first letter capitalized.
i/p : i love my india
o/p : I Love My India
 */
public class StringToCapitalisedSentence {
	
	String convertToCapitalisedSentence(String str1) {
		String str = str1.trim();
		String ans = ""; //----This proves String is immutable as we need to process str and add to new string.
		for(int i=0; i<str.length(); i++) {
			if(i==0) {
				ans += Character.toUpperCase(str.charAt(i));
			} else if(str.charAt(i)==' ') {
				ans += str.charAt(i);
			}else if(str.charAt(i-1)==' ') {
				ans += Character.toUpperCase(str.charAt(i));
			} else
				ans += str.charAt(i);
		}
		return ans;
	}
	
	public static void main(String[] a) {
		StringToCapitalisedSentence cap = new StringToCapitalisedSentence();
		String input = " I love my india ";
		System.out.println("After capitalisation on given string: '"+input+"'");
		System.out.println("Output: '"+cap.convertToCapitalisedSentence(input)+"'");
	}
}
