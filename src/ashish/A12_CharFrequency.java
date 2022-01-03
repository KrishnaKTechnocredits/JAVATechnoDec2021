package ashish;
import java.util.Scanner;

public class A12_CharFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		String str = "";
		A12_CharFrequency charFrequency = new A12_CharFrequency();
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Please enter the string :");
		str = scanner.next();
		System.out.println(" Please enter the character :");
		ch = scanner.next().charAt(0);
		charFrequency.findFrequencyOfChar(str,ch);
		scanner.close();
	}

	void findFrequencyOfChar(String str, char ch) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ch)
				count++;
		}
		if(count>0)
			System.out.println(" Character " + ch + " occurred " + count + "times in string " + str);
		else
			System.out.println(" Character " + ch + " not found in string " + str);
	}
}