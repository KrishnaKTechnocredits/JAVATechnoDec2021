package ashish;

import java.util.Scanner;

public class A14_DuplicateUniqueCount {

	void duplicateUniqueOperations(String str) {
		int uniqueCharCount = 0, duplicateCharCount = 0;
		String duplicate = "";
		for(int i=0; i<str.length(); i++)
		{
			if(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i)))
				uniqueCharCount++;
			else if(duplicate.indexOf(str.charAt(i)) == -1){
					duplicate = duplicate + str.charAt(i);
					duplicateCharCount++;
			}
		}
		if(duplicateCharCount > uniqueCharCount)
			System.out.println(" JAVA ");
		else
			System.out.println(" SELENIUM ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A14_DuplicateUniqueCount duplicateUniqueCount = new A14_DuplicateUniqueCount();
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter input string : ");
		String str = scanner.next();
		duplicateUniqueCount.duplicateUniqueOperations(str);
		scanner.close();
	}
}
