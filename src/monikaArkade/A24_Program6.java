/*
 WAP to reverse each word and convert first letter of each word into capital
Input    : "Vrushali Sagar Shital"
Output : "IlahsurV Ragas LatihS"
 */
package monikaArkade;

public class A24_Program6 {
	
	String stringReverse(String input) {
		String temp = " ";
		for(int index=input.length()-1;index>=0;index--) {
			char ch = input.charAt(index);
			if(index==input.length()-1)
				ch = Character.toUpperCase(ch);
			temp =temp + ch;
		}
		return temp;
	}
	
	void output(String word) {
		String tempString=" ";
		String[] input = word.split(" ");
		for(int i=0;i<input.length;i++) {
			tempString= tempString+" "+stringReverse(input[i]);
		}
		System.out.println("Reverse string with first letter capital : " + tempString.trim());
	}

	public static void main(String[] args) {
		A24_Program6 p6 = new A24_Program6();
		String inputString = "Vrushali Sagar Shital";
		p6.output(inputString);
	}
}
