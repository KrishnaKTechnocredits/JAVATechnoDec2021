package anvit;

public class A17_Max_Vowels_Array {
	
	String getMaxVowelCountName(String[] arr) {
		int vowelCount = 0;
		String maxVowelName = "";
		int maxVowelCount = 0;

		for (int index = 0; index < arr.length; index++) {
			String name = arr[index];
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
		A17_Max_Vowels_Array a17_Max_Vowels_Array = new A17_Max_Vowels_Array();
		String[] arr = { "hi", "piyanka", "sandip", "aakanksha", "pallavi", "apurva" };
		String maxVowelName = a17_Max_Vowels_Array.getMaxVowelCountName(arr);
		System.out.println(maxVowelName);

	}
}
