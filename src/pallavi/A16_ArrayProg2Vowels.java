/*Assignment - 16 : 31st Dec'2021

print count of vowels in each input from String array and print total vowels.
input : String[] arr = {"priyanka", "swati", "acharya", "hevin" }
output : priyanka -> 3
              swati -> 2
              acharya -> 3
              hevin -> 2
total vowels -> 10*/

package pallavi;

public class A16_ArrayProg2Vowels {

	void printVowels(String[] name) {

		int totalVowels = 0;

		for (int arrayIndex = 0; arrayIndex < name.length; arrayIndex++) {
			int cntVowel = 0;
			for (int index = 0; index < name[arrayIndex].length(); index++) {
				if (name[arrayIndex].charAt(index) == 'a' || name[arrayIndex].charAt(index) == 'e'
						|| name[arrayIndex].charAt(index) == 'i' || name[arrayIndex].charAt(index) == 'o'
						|| name[arrayIndex].charAt(index) == 'u') {
					cntVowel++;
				}

			}
			totalVowels = totalVowels + cntVowel;
			System.out.println(name[arrayIndex] + " -> " + cntVowel);
		}
		System.out.println("Total vovels -> " + totalVowels);

	}

	public static void main(String[] arr) {
		String[] name = { "priyanka", "swati", "acharya", "hevin" };
		new A16_ArrayProg2Vowels().printVowels(name);
	}
}
