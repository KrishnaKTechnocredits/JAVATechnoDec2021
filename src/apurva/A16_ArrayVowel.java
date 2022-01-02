package apurva;

public class A16_ArrayVowel {

	int findVowelinString(String name) {
		int count = 0;
		for (int index = 0; index < name.length(); index++) {
			if (name.charAt(index) == 'a' || name.charAt(index) == 'e' || name.charAt(index) == 'i'
					|| name.charAt(index) == 'o' || name.charAt(index) == 'u') {
				count++;
			}
		}
		// System.out.println(name + " -----> " + count);
		return count;
	}

	void findVowleinArray(String[] arr) {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			int temp=findVowelinString(arr[i]);
			System.out.println(arr[i]+"   ----> "+temp);
			cnt +=temp;
		}
		System.out.println("Total count of vowel: "+cnt);
	}

	public static void main(String[] args) {
		A16_ArrayVowel a16_ArrayVowel = new A16_ArrayVowel();
		String[] name = { "priyanka", "swati", "acharya", "hevin" };
		new A16_ArrayVowel().findVowleinArray(name);

	}

}
