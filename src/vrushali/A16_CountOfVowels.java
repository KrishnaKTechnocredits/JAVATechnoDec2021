package vrushali;

public class A16_CountOfVowels {

	int getCountOfVowels(String name) {
		int vowelcount = 0;
		for(int index = 0; index < name.length(); index++) {
			if((name.charAt(index)== 'a') || (name.charAt(index)== 'e')|| (name.charAt(index)== 'i')|| (name.charAt(index)== 'o')||(name.charAt(index)== 'u'))
				vowelcount++;
		}
		return vowelcount;
	}

	void printTotalVowels(String[] name) {
		int count = 0;
		for (int index = 0; index < name.length; index++) {
			int vowelsCount = getCountOfVowels(name[index]);
			count = count + vowelsCount;
			System.out.println(name[index] + " -> " + vowelsCount);
		}
		System.out.println("total vowels -> " + count);
	}

	public static void main(String[] args) {
		A16_CountOfVowels countOfVowels = new A16_CountOfVowels();
		String[] arr = {"priyanka", "swati", "acharya", "hevin" };
		countOfVowels.printTotalVowels(arr);
	}
}
