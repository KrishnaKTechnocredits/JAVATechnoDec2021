package megha;

public class Megha_Assignment17_Prog2 {

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
		Megha_Assignment17_Prog2 megha_Assignment17 = new Megha_Assignment17_Prog2();
		String[] arr = { "Hi", "Priyanka", "Sandip", "Aakanksha", "Pallavi", "Apurva" };
		String maxVowelName = megha_Assignment17.getMaxVowelCountNameInArray(arr);
		System.out.println(maxVowelName);

	}

}
