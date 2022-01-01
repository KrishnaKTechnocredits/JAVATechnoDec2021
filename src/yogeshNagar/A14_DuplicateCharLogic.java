package yogeshNagar;

import java.util.Scanner;

public class A14_DuplicateCharLogic {
	
	void getDuplicateChar(String name) {
		char ch = ' ';
		int dCount = 0;
		int uCount=0;
		for(int index=0;index<name.length();index++) {
			ch = name.charAt(index);
			if(name.indexOf(ch) == name.lastIndexOf(ch)) {
				uCount++;
			}
			if(index==name.indexOf(ch)) {
				if(name.indexOf(ch) !=name.lastIndexOf(ch)) {
					dCount++;
				}
			}
		}
		if(dCount>uCount) {
			System.out.println("Java");
		}
		else
			System.out.println("Selenium");
		}	
	
	public static void main(String[] args) {
		A14_DuplicateCharLogic dupCharLogic = new A14_DuplicateCharLogic();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an word");
		dupCharLogic.getDuplicateChar(scanner.next());
		scanner.close();
	}
}
