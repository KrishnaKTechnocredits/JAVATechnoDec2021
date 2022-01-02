package yogeshNagar;

public class A17_VowelCountStringArray {

	int getVowelCount(String str) {
		int vowelCount = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == 'a' || str.charAt(index) == 'e' || str.charAt(index) == 'i'
					|| str.charAt(index) == 'o' || str.charAt(index) == 'u') {
				vowelCount++;
			}
		}
		return vowelCount;
	}

	String getMaxVowelCount(String[] nameArray) {
		String maxVowelName = " ";
		int maxCount = 0;
		for (int index = 0; index < nameArray.length; index++) {
			int count = getVowelCount(nameArray[index]);
			if (count > maxCount) {
				maxCount = count;
				maxVowelName = nameArray[index];
			}
		}
		return maxVowelName;
	}

	public static void main(String[] args) {
		A17_VowelCountStringArray countVowel = new A17_VowelCountStringArray();
		String[] nameArray = { "hi", "priyanka", "sandip", "aakanksha", "pallavi", "apurva" };
		System.out.println(countVowel.getMaxVowelCount(nameArray));
	}
}
