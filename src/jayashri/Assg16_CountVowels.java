package jayashri;

public class Assg16_CountVowels {

	int getCount(String name) {
		int cnt = 0;
		for (int index = 0; index < name.length(); index++) {
			if (name.charAt(index) == 'a' || name.charAt(index) == 'e' || name.charAt(index) == 'i'
					|| name.charAt(index) == 'o' || name.charAt(index) == 'u') {
				cnt++;
			}
		}
		System.out.println(name + "--->" + cnt);
		return cnt;
	}
	void findCharFromArray(String[] input) {
		int count = 0;
		for (int index = 0; index < input.length; index++) {
			int temp = getCount(input[index]);
			count += temp;
		}
		System.out.println("Total Vowels: " + count);
	}
	public static void main(String[] args) {
		String[] name = { "priyanka", "swati", "acharya", "hevin" };
		new Assg16_CountVowels().findCharFromArray(name);
	}
}
