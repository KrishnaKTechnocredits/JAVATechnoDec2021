package anvit;
import java.util.Scanner;
public class A13_FirstDuplicateChar {
	
	void findFirstDuplicateChar(String str) {
		char ch = ' ';
		for (int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);
			if (str.indexOf(ch) != str.lastIndexOf(ch))
				break;
		}
		System.out.println("The First Duplicate Char is : " + ch);
	}
	public static void main(String[] args) {
		A13_FirstDuplicateChar a13_FirstDuplicateChar = new A13_FirstDuplicateChar();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.next();
		a13_FirstDuplicateChar.findFirstDuplicateChar(str);
	}
}
