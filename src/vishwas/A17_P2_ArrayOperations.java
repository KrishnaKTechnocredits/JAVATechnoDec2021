package vishwas;

public class A17_P2_ArrayOperations {
	
	String getMaxVowelsString(String[] input) {
		String maxString = "";
		int maxCount = 0;
		for (int index = 0; index < input.length; index++) {
			String currentName = input[index];
			int currentNameVowelCnt = 0;
			for (int innnerindex = 0; innnerindex < currentName.length(); innnerindex++) {
				char ch = currentName.charAt(innnerindex);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					currentNameVowelCnt++;
				if (currentNameVowelCnt > maxCount) {
					maxCount = currentNameVowelCnt;
					maxString = currentName;
				}
			}
		}
		return maxString;
	}

	public static void main(String[] args) {
		String[] arr = { "hi", "priyanka", "sandip", "aakanksha", "pallavi", "apurva" };
		A17_P2_ArrayOperations a17 = new A17_P2_ArrayOperations();
		String str = a17.getMaxVowelsString(arr);
		System.out.println("String having maximum vowels from given array is : " + str);
	}
}
