package gauravk.Programs47;
/*
 * 28.Write a program which separate numbers and letters from string
i/p : h2n9fpn2qk2
o/p : hnfpnqk2922
 */
public class SeperateNumAndLettersFrmString {
	
	String seperateNumAndLetters(String str){
		char[] ch = str.toCharArray();
		String numbers="", letters="", symbols="", space="";
		for(int i=0; i<ch.length; i++) {
			if(Character.isLetter(ch[i]))
				letters += String.valueOf(ch[i]);
			else if(Character.isDigit(ch[i]))
				numbers += String.valueOf(ch[i]);
			else if(Character.isWhitespace(ch[i]))
				space += String.valueOf(ch[i]);
			else
				symbols += String.valueOf(ch[i]);
		}
		return (letters+numbers+symbols+space).trim();
	}
	
	public static void main(String[] args) {
		String s1 = "h2n9fpn2qk2";
		String s2 = "hlkal k8w0-kag*lls^% iiw00";
		SeperateNumAndLettersFrmString seperateCh = new SeperateNumAndLettersFrmString();
		System.out.println("Seperating letters, numbers, symbols in this order from the string: '"+s1+"'\nOutput: '"+seperateCh.seperateNumAndLetters(s1)+"'");
		System.out.println("Seperating letters, numbers, symbols in this order from the string: '"+s2+"'\nOutput: '"+seperateCh.seperateNumAndLetters(s2)+"'");
	}
}
