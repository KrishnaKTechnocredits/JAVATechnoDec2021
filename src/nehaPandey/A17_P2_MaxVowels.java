package nehaPandey;

public class A17_P2_MaxVowels {
	String MaxVowelCountInString(String[] arr) {
		
		int vowelCount = 0;
		String tempName = "";
		int maxVowelCount = 0;

		for (int index = 0; index < arr.length; index++) {
			String name = arr[index];
			vowelCount = vowelCount(name);
			if (vowelCount > maxVowelCount) {
				maxVowelCount = vowelCount;
				tempName = name;
			}
		}
		return tempName;
	}

	int vowelCount(String name) {
		int vowelCount = 0;
		for (int index = 0; index < name.length(); index++) {
			if (name.charAt(index) == 'a' || name.charAt(index) == 'e' || name.charAt(index) == 'i'
					|| name.charAt(index) == 'o' || name.charAt(index) == 'u')
				vowelCount++;
		}
		return vowelCount;
	}

	public static void main(String[] args) {
		A17_P2_MaxVowels as = new A17_P2_MaxVowels();
		String[] arr = {"Anmesh", "Rahul", "Prachi", "Abhineet" };
		String maxVowelInName = as.MaxVowelCountInString(arr);
		System.out.println("The name which have max count of vowels is: "+maxVowelInName);

	}

}
