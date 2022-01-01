package abhishek;
import java.util.Scanner;
class Assignment14 {
	void getDuplicateChar(String str) {
		int uniqueCount = 0;
		int duplcateCount=0;
		for(int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (index == str.indexOf(ch)) {
				if(str.indexOf(ch) != str.lastIndexOf(ch))
					duplcateCount++;
				else
					uniqueCount++;
			}
		}
		if(duplcateCount > uniqueCount)
			System.out.println("Java");
		else
			System.out.println("Selenium");
	}
	public static void main(String[] args) {
		Assignment14 assignment14 = new Assignment14();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr a String: ");
		String str = sc.nextLine();
		assignment14.getDuplicateChar(str);
		sc.close();
	}
}
	