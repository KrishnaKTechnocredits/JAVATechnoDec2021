package pratiksha;

import java.util.Scanner;

public class A14_DuplicateUniqueComparison {

	void duplicateUniqueCharCompare(String str) {
		
		int uniqueCnt = 0;
		int duplicateCnt = 0;
		
		for(int index = 0; index< str.length(); index++) {
			char ch = str.charAt(index);
			if (index == str.indexOf(ch)) {
				if(str.indexOf(ch)!= str.lastIndexOf(ch))
					duplicateCnt++;
				else
					uniqueCnt++;
			}
			
		}
		
		if (duplicateCnt > uniqueCnt)
			System.out.println("Java");
		else
			System.out.println("Selenium");
	}
	
	
	public static void main(String[] args) {
	
		A14_DuplicateUniqueComparison duplicateUniqueChar = new A14_DuplicateUniqueComparison();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String input = sc.next();
		duplicateUniqueChar.duplicateUniqueCharCompare(input);
		sc.close();

	}

}
