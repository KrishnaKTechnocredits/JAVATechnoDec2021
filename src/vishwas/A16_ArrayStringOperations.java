package vishwas;

public class A16_ArrayStringOperations {

	int getStringCharfreq(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				count++;
		}
		System.out.println(input + " --> " + count);
		return count;
	}

	void findCharCountArray(String[] input) {
		int count = 0;
		for (int index = 0; index < input.length; index++) {
			int temp = getStringCharfreq(input[index]);
			count = count + temp;
		}
		System.out.println("Total vowels in given String array : " + count);
	}

	public static void main(String[] args) {
		String[] arr = { "priyanka", "swati", "acharya", "hevin" };
		A16_ArrayStringOperations a16 = new A16_ArrayStringOperations();
		a16.findCharCountArray(arr);
	}

}
