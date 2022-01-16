package krishna;

public class Assignment_17_Max_VowelCount_InString {

	String getMaxVowelString(String[] arr) {
		int mCount = 0;
		String word = " ";
		for (int index = 0; index < arr.length; index++) {
			String currentName = arr[index];
			int currentVowelCount = 0;
			for (int innerindex = 0; innerindex < currentName.length(); innerindex++) {
				if (currentName.charAt(innerindex) == 'a' || currentName.charAt(innerindex) == 'e'
						|| currentName.charAt(innerindex) == 'i' || currentName.charAt(innerindex) == 'o'
						|| currentName.charAt(innerindex) == 'u') {
					currentVowelCount++;
				}

				if (currentVowelCount > mCount) {
					mCount = currentVowelCount;
					word = currentName;
					break;
				}
			}
		}
		System.out.println(word);
		return word;
	}

	public static void main(String[] arr) {
		String[] str = { "hi", "priyanka", "sandip", "aakanksha", "pallavi", "apurva" };
		Assignment_17_Max_VowelCount_InString ass17_1 = new Assignment_17_Max_VowelCount_InString();
		ass17_1.getMaxVowelString(str);
	}
}
