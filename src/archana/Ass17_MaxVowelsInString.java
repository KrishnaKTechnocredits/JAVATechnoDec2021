package archana;

public class Ass17_MaxVowelsInString {
	
	String getMaxVowelCount(String[] arr) {
		int vowelCount = 0;
		String stringName = "";
		int maxVowelCount = 0;

		for (int index = 0; index < arr.length; index++) {
			String name = arr[index];
			vowelCount = vowelCount(name);
			if (vowelCount > maxVowelCount) {
				maxVowelCount = vowelCount;
				stringName = name;
			}
		}
		return stringName;
	}

	int vowelCount(String name) {
		int vowelCount = 0;
		for (int index1 = 0; index1 < name.length(); index1++) {
			if (name.charAt(index1) == 'a' || name.charAt(index1) == 'e' || name.charAt(index1) == 'i'
					|| name.charAt(index1) == 'o' || name.charAt(index1) == 'u')
				vowelCount++;
		}
		return vowelCount;
	}

	public static void main(String[] args) {
		Ass17_MaxVowelsInString ass17 = new Ass17_MaxVowelsInString();
		String[] arr = {"hi","priyanka", "sandip", "aakanksha", "pallavi", "apurva"};
		String maxVowelName = ass17.getMaxVowelCount(arr);
		System.out.println(maxVowelName);

	}

	

}
