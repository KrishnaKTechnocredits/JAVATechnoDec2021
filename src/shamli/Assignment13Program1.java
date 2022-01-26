package shamli;

import java.util.Scanner;

public class Assignment13Program1 {

		void findNonRepeatingChars(String str) {
			System.out.println("Non Repeating Character : ");
			for (int index = 0; index < str.length(); index++) {
				char ch = str.charAt(index);
				if (str.indexOf(ch) == str.lastIndexOf(ch))
					System.out.print(ch + " ");
			}
		}

		public static void main(String[] args) {
			Assignment13Program1 assignment13prog1 = new Assignment13Program1();
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the String : ");
			String str = sc.next();
			assignment13prog1.findNonRepeatingChars(str);
			sc.close();
		}
}
