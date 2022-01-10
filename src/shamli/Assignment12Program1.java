package shamli;

import java.util.Scanner;


public class Assignment12Program1 {

	void getFrequencyOfAllChar(String name) {
		String charPresentCheck = "";
		for (int index = 0; index < name.length();index++) {
			char ch = name.charAt(index);
			int count = 0;
			for (int index1 = index; index1 < name.length(); index1++) {
				if (name.charAt(index1) == ch)
					count++;
			}
			if (isAlreadyPresent(charPresentCheck, ch) == false)
				System.out.println(ch + " is present : " + count + " times");
			charPresentCheck = charPresentCheck + ch;

		}
	}

	boolean isAlreadyPresent(String charPresentCheck, char ch)
	{
		for (int index = 0; index < charPresentCheck.length(); index++) 
		{
			if (charPresentCheck.charAt(index) == ch)
				return true;
		}

		return false;
	}

	public static void main(String[] args) {
		Assignment12Program1 program1 = new Assignment12Program1();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String name = sc.nextLine();
		program1.getFrequencyOfAllChar(name);
	}

}
 
	
	


