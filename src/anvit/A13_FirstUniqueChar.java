package anvit;
import java.util.Scanner;

public class A13_FirstUniqueChar {
	
	void findFirstUniqueChar(String str) {
		char ch = ' ';
		for (int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch))
				break;
		}
		System.out.println("The First Unique Char is : " + ch);
	}
	
	public static void main(String[] args) {
		A13_FirstUniqueChar a13_FirstUniqueChar = new A13_FirstUniqueChar();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = sc.next();
		a13_FirstUniqueChar.findFirstUniqueChar(str);
	}
}
