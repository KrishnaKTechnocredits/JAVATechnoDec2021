package anvit;
import java.util.Scanner;

public class A14_UniqueDuplicate {
	
	void findDuplicateGreaterThanUnique(String str) {
		int uniCount = 0;
		int dupCount = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (index == str.indexOf(ch)) {
				if (str.indexOf(ch) != str.lastIndexOf(ch))
					dupCount++;
				else
					uniCount++;
			}
		}
		if (dupCount > uniCount)
			System.out.println("Java");
		else
			System.out.println("Selenium");
	}
	
	
	public static void main(String[] args) {
		A14_UniqueDuplicate a14_UniqueDuplicate = new A14_UniqueDuplicate();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = scanner.nextLine();
		a14_UniqueDuplicate.findDuplicateGreaterThanUnique(str);
	}
}
