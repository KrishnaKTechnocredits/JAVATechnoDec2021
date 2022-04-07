package gauravk.Programs47;
/*
 * 29.Write a program which do sum of given string
i/p : h2n9fpn2qk2
o/p : 15
 */
public class MultiplicationOfNumInString {

	void multiplicationOfNums(String str) {
		char[] ch = str.toCharArray();
		String num = "";
		int multiplicationAns = 1;
		for (int i = 0; i < ch.length; i++) {
			if (Character.isDigit(ch[i])) {
				num += String.valueOf(ch[i]);
			} else if(num.length()>0){
				//num += String.valueOf(ch[i]);
				multiplicationAns *= Integer.parseInt(num);
				num = "";
			}
		}
		 if(num!="")
		 multiplicationAns *= Integer.parseInt(num);
		// return total;
		System.out.println(multiplicationAns);
	}

	public static void main(String[] args) {
		String s1 = "h2n9fpn2qk2";
		String s2 = "h2n92fpn200qk12";
		MultiplicationOfNumInString multiplObj = new MultiplicationOfNumInString();
		// System.out.println("sum of given string: '"+s1+"'\n Output: "+
		multiplObj.multiplicationOfNums(s1);
		// System.out.println("sum of given string: '"+s2+"'\n Output: "+
		multiplObj.multiplicationOfNums(s2);
	}
}
