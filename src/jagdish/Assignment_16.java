package jagdish;

public class Assignment_16 {
	int count = 0;

	void findCountfromString(String name) {
		int cnt = 0;
		for (int index = 0; index < name.length(); index++) {
			if (name.charAt(index) == 'a' || name.charAt(index) == 'e' || name.charAt(index) == 'i'
					|| name.charAt(index) == 'o' || name.charAt(index) == 'u' || name.charAt(index) == 'A'
					|| name.charAt(index) == 'E' || name.charAt(index) == 'I' || name.charAt(index) == 'O'
					|| name.charAt(index) == 'U') {
				count++;
				cnt++;
			}
		}

		System.out.println(name + "---> " + cnt);
	}

	void findcharCountforArray(String[] input) {
		for (int index = 0; index < input.length; index++) {
			findCountfromString(input[index]);
		}

		System.out.println("The sum of the vowel is: " + count);
	}

	public static void main(String[] args) {
		Assignment_16 somevalue = new Assignment_16();
		String[] name = { "priyanka", "Swati", "Acharya", "Hevin" };
		somevalue.findcharCountforArray(name);
	}
}
