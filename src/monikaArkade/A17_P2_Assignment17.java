package monikaArkade;

public class A17_P2_Assignment17 {

	String getMaxVowelCountNameInArray(String[] arr) {
		int vowelCount = 0;
		String maxVowelName = "";
		int maxVowelCount = 0;

		for (int index = 0; index < arr.length; index++) {
			String name = arr[index].toLowerCase();
			vowelCount = getVowelCount(name);
			if (vowelCount > maxVowelCount) {
				maxVowelCount = vowelCount;
				maxVowelName = name;
			}
		}
		return maxVowelName;
	}

	int getVowelCount(String name) {
		int vowelCount = 0;
		for (int index1 = 0; index1 < name.length(); index1++) {
			if (name.charAt(index1) == 'a' || name.charAt(index1) == 'e' || name.charAt(index1) == 'i'
					|| name.charAt(index1) == 'o' || name.charAt(index1) == 'u')
				vowelCount++;
		}
		return vowelCount;
	}

	public static void main(String[] args) {
		A17_P2_Assignment17 vowelsCount = new A17_P2_Assignment17();
		String[] arr = { "Hi", "Priyanka", "Sandip", "Aakanksha", "Pallavi", "Apurva" };
		String maxVowelName = vowelsCount.getMaxVowelCountNameInArray(arr);
		System.out.println(maxVowelName);

	}

}
