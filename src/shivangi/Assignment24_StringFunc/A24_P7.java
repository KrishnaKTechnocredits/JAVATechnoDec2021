/*
Program 7. WAP to reverse the case of each char in a given word
Input    : "TeCHnoCReditS"
Output : "tEchNOcrEDITs"
*/
package shivangi.Assignment24_StringFunc;

public class A24_P7 {
	
	String reverseCaseCharOfWord(String input) {
		String temp = "";
		for(int index=0; index<=input.length()-1; index++) {
			char ch = input.charAt(index);
			if(Character.isLetter(ch)) {
				if(Character.isLowerCase(ch)) {
					ch = Character.toUpperCase(ch);
					temp = temp + ch;
				}else {
					ch = Character.toLowerCase(ch);
					temp = temp + ch;
				}
			}
		}
		return temp;
	}
	
	public static void main(String[] args) {
		A24_P7 p7 = new A24_P7();
		String output = p7.reverseCaseCharOfWord("TeCHnoCReditS");
		System.out.println(output);
	}
}
