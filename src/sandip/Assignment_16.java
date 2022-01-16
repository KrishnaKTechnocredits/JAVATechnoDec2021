package sandip;

public class Assignment_16 {
	int totalCount;

	void countOfVowels(String name) {
		int count = 0;
		for (int index = 0; index < name.length(); index++) {
			if ((name.charAt(index) == 'a') || (name.charAt(index) == 'e') || (name.charAt(index) == 'i')
					|| (name.charAt(index) == 'o') || (name.charAt(index) == 'u')) {
				count++;
				totalCount++;
			}
		}
		System.out.println(name + "--" + count);
	}

	void stringLength(String[] name) {
		for (int index = 0; index < name.length; index++) {
			countOfVowels(name[index]);
		}
		System.out.println("Total vowels count :" + totalCount);
	}

	public static void main(String[] args) {
		Assignment_16 vowels = new Assignment_16();
		String[] s1 = { "techno", "credits", "technocredits", "sandip" };
		vowels.stringLength(s1);
	}
}
