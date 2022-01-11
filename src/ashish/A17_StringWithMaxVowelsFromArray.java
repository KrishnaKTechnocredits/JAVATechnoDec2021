package ashish;

public class A17_StringWithMaxVowelsFromArray {

	static String findStringWithMaxVowels(String[] arr) {
		String stringWithMaxVowels = "";
		int count = 0, maxCount = 0;
		for(int i=0; i<arr.length; i++) {
			String currentString = arr[i];
			count = 0;
			for(int j=0; j<currentString.length(); j++) {
				if(currentString.charAt(j) == 'a' || currentString.charAt(j) == 'e' || currentString.charAt(j) == 'i' || currentString.charAt(j) == 'o' || currentString.charAt(j) == 'u')
					count++;			
			}
			if(count > maxCount) {
				maxCount = count;
				stringWithMaxVowels = currentString;
			}
		}
		return stringWithMaxVowels;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"hi","priyanka", "sandip", "aakanksha", "pallavi", "apurva"};
		System.out.println(" String with max vowels is : " + A17_StringWithMaxVowelsFromArray.findStringWithMaxVowels(arr));
	}
}
