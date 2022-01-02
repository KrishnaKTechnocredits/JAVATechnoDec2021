package anvit;
import java.util.Scanner;

public class A13_DuplicateChar {
	
	void findDuplicateChar(String str) {
		boolean flag = true;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch))
				flag = false;
			if(flag==true)
				System.out.print(ch+"");
		}
	}
	
	public static void main(String[] args) {
		A13_DuplicateChar a13_duplicatechar = new A13_DuplicateChar();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.next();
		System.out.println("Duplicate char are: ");
		a13_duplicatechar.findDuplicateChar(str);
	}
}
