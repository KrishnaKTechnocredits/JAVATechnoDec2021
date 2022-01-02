package poojaJoshi;

import java.util.Scanner;


public class Assignment14 {
	int dupechar = 0;
	int uniquechar = 0;
	char ch = ' ';

	void printDupe(String useStr) {


		//scanner.close();

		for (int index = 0; index < useStr.length(); index++) {
			ch = useStr.charAt(index);
			if (index == useStr.indexOf(ch))
				if (useStr.indexOf(ch) != useStr.lastIndexOf(ch)) {
					dupechar++;
				}

			if (useStr.indexOf(ch) == useStr.lastIndexOf(ch)) {
				uniquechar++;
			}
		}
		//System.out.println("Total no of duplicate chars are: " +dupechar);
		//System.out.println("Total no of unique Chars are: " +uniquechar);

		if(uniquechar>dupechar){
			System.out.println("Selenuim");
		}else 
			System.out.println("java");
	}

	public static void main(final String[] args) {

		final Assignment14 assignment14 = new Assignment14();
		Scanner scanner= new Scanner (System.in);
		for (int index=1;index<=2;index++) {
			System.out.println("Please enter input String");
			String useStr=scanner.next();
			assignment14.printDupe(useStr);	

		}

	}

}

