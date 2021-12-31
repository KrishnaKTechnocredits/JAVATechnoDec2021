package vishakha;

import java.util.Scanner;

public class A12_FirstRepeatChar {

	static void repeatChar(String name) {
		int place = -1, firstIndex, secondIndex;
		for (firstIndex = 0; firstIndex < name.length(); firstIndex++) {
			for (secondIndex = firstIndex + 1; secondIndex < name.length(); secondIndex++) {
				if (name.charAt(firstIndex) == name.charAt(secondIndex)) {
					place = firstIndex;
					break;
				}
			}

			if (place != -1)
				break;
		}
		if (place == -1)
			System.out.println("Repeat Character in String is :" + name.charAt(place));
		else
			System.out.println("Repeat Character in String is:" +name.charAt(place));
	}

	static public void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = scan.next();
		repeatChar(name);
		scan.close();
	}

}
