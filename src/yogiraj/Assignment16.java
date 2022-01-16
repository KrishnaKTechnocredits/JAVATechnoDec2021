package yogiraj;

public class Assignment16 {

	public void printNameAndVowel() {
		String[] arr = { "priyanka", "swati", "acharya", "hevin" };
		String str;

		int totalCount = 0;

		for (int i = 0; i < arr.length; i++) {
			int count = 0;

			str = arr[i];

			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == 'a' || str.charAt(i) == 'e' || str.charAt(j) == 'i' || str.charAt(j) == 'o'
						|| str.charAt(j) == 'u') {
					count++;
				}
			}
			totalCount = totalCount + count;

			System.out.println(str + " -> " + count);

		}
		System.out.println("Total Vowels " + totalCount);

	}

	public static void main(String[] args) {
		Assignment16 a = new Assignment16();

		a.printNameAndVowel();
	}

}
