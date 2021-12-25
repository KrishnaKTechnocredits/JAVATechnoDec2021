package megha;

public class Megha_Test1_Program1 {

	void getOccurenceOfChar(String name) {
		char charIndex = ' ';
		int nameLength = name.length();
		for (int index = 0; index < nameLength; index++) {
			char ch = name.charAt(index);
			int count = 0;
			for (int index1 = index; index1 < nameLength; index1++) {
				if (name.charAt(index1) == ch)
					count++;
			}
			if (count == 1) {
				charIndex = name.charAt(index);
				break;
			}
		}
		System.out.println("The first Non Repeating Character in " + name + " is : " + charIndex);
	}

	public static void main(String[] args) {
		Megha_Test1_Program1 megha_Test1 = new Megha_Test1_Program1();
		megha_Test1.getOccurenceOfChar("technocredits");

	}

}
