/*Assignment - 17 : 1st Jan'2022
Program 2: return String having maximum vowels from given array.
Sample input : String[] arr = {"hi","priyanka", "sandip", "aakanksha", "pallavi", "apurva"};
output : aakanksha     */

package pallavi;

public class A17_ArrayProg4MaxVowel {

	int getVowelcount(String name) {
		int cnt = 0;
		for (int index = 0; index < name.length(); index++) {
			if (name.charAt(index) == 'a' || name.charAt(index) == 'e' || name.charAt(index) == 'i'
					|| name.charAt(index) == 'o' || name.charAt(index) == 'u')
				cnt++;
		}
		return cnt;
	}

	String getMaxVowelString(String[] arr) {
		int maxCount = 0;
		String maxString = "";
		for (int index = 0; index < arr.length; index++) {
			int tmpCnt = getVowelcount(arr[index]);
			if (tmpCnt > maxCount) {
				maxCount = tmpCnt;
				maxString = arr[index];
			}
		}
		return maxString;
	}

	public static void main(String[] args) {
		String[] arr = { "hi", "priyanka", "sandip", "aakanksha", "pallavi", "apurva" };
		String temp = new A17_ArrayProg4MaxVowel().getMaxVowelString(arr);
		System.out.println("String having maximum vawels is: " + temp);
	}
}
