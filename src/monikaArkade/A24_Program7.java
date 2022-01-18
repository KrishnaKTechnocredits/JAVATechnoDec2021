/*
WAP to reverse the case of each char in a given word
Input    : "TeCHnoCReditS"
Output : "tEchNOcrEDITs"
 */
package monikaArkade;

public class A24_Program7 {
	String reverseStr(String input) {
		String cse =" ";
		for(int index=0 ; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isLowerCase(ch))
				ch = Character.toUpperCase(ch);
			else
				ch = Character.toLowerCase(ch);
			cse = cse+ch;
		}
		return cse;
	}
	
	void reverseCase(String input) {
		String[] Arr = input.split(" ");
		String temp = " ";
		for(int index=0; index<Arr.length; index++) {
			temp =  temp + " "+reverseStr(Arr[index]);
		}
		System.out.println(temp.trim());
	}
	public static void main(String[] args) {
		A24_Program7 p7 = new A24_Program7();
		String input ="TeCHnoCReditS";
		p7.reverseCase(input);
	}
}
