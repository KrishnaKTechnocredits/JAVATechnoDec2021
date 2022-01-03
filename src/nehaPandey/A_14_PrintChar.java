package nehaPandey;

import java.util.Scanner;

public class A_14_PrintChar {
	void CountOfChars(String strName) {
		
		int uniqueCharCount = 0;
		int duplcateCharCount=0;
		
		for(int index = 0; index < strName.length(); index++) {
			char ch = strName.charAt(index);
			if (index == strName.indexOf(ch)) {
				if(strName.indexOf(ch) != strName.lastIndexOf(ch))
					duplcateCharCount++;
				else
					uniqueCharCount++;
			}
		}
		if(duplcateCharCount > uniqueCharCount)
			
			System.out.println("Java");
		else
			System.out.println("Selenium");
	}
	public static void main(String[] args) {
		A_14_PrintChar as = new A_14_PrintChar();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enetr string: ");
		String str = sc.nextLine();
		
		as.CountOfChars(str);
		sc.close();
	}

}
