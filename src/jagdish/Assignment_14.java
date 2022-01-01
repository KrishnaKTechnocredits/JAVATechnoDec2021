package jagdish;

import java.util.Scanner;

public class Assignment_14 {

	void findDuplicatevalue(String input) { // str= t=0 e-1 c-2 h-3 n-4 o-5 c-6 r-7 e-8 d-9 i-10 t-11 s-12
		int duplicate = 0;
		int unique = 0;

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (index == input.indexOf(ch)) {

				if (input.indexOf(ch) != input.lastIndexOf(ch))
					duplicate++;
				else
					unique++;
			}

		}

		if (duplicate > unique)
			System.out.println("Java");
		else
			System.out.println("Selenium");
	}

	public static void main(String[] args) {
		Assignment_14 findvalue = new Assignment_14();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input:- ");
		String temp = sc.nextLine();
		findvalue.findDuplicatevalue(temp);
		sc.close();
	}

}
