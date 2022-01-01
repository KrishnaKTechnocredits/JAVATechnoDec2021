package naquibalam;

public class A17_MaxVowelsCheck {

	void getMaxVowelsString(String[] arr) {
		int countVowelEach = 0;
		int maxVowels = arr[0].length();
		int maxVowelsAt = 0;
		for (int i=0; i<arr.length;i++) {
			countVowelEach = 0;
			for (int j = 0; j < arr[i].length(); j++) {
				char charAtIndex = arr[i].charAt(j);
				if ((charAtIndex == 'a') || (charAtIndex == 'e') || (charAtIndex == 'i') || (charAtIndex == 'o') || (charAtIndex == 'u')) {		
						countVowelEach++;	
				}
			}
			if (countVowelEach > maxVowels) {
				maxVowels = countVowelEach;
				maxVowelsAt = i;
			}
		}
		System.out.println("In the given string, '" + arr[maxVowelsAt] + "' has the maximum vowels (" + maxVowels + ") in it.");
	}
	
	public static void main(String[] args) {
		A17_MaxVowelsCheck a17_MaxVowelsCheck = new A17_MaxVowelsCheck();
		String[] arr = {"hi","priyanka", "sandip", "aakanksha", "pallavi", "apurva"};
		a17_MaxVowelsCheck.getMaxVowelsString(arr);
	}
}
