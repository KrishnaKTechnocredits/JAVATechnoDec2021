package pallavi;

public class Test1_FindNonRepeatingChar {

	int getCountOfCharInString(String name, char c) {
		int count = 0;
		for (int index = 0; index < name.length(); index++)
			if (name.charAt(index) == c)
				count++;
		return count;
	}

	public static void main(String[] Arr) {
		Test1_FindNonRepeatingChar test1_FindNonRepeatingChar = new Test1_FindNonRepeatingChar();
		String str = "ppallavi";
		for (int index = 0; index < str.length(); index++) {
			int count = test1_FindNonRepeatingChar.getCountOfCharInString(str, str.charAt(index));

			if (count == 1) {
				System.out.println("First non repeating chanracter in " + str + " is: " + str.charAt(index));
				break;
			}

		}
	}
}
