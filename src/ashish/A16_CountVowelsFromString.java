package ashish;

public class A16_CountVowelsFromString {
		
	int totalVowels = 0;
	void countVowelsFromString(String str){
		int vowelCount = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				vowelCount++;
				totalVowels++;
			}			
		}
		System.out.println(" " + str + " --> " + vowelCount);
	}
	
	void countVowelsFromArray(String[] input) {
		for(int i=0; i<input.length; i++) {
			countVowelsFromString(input[i]);
		}
		System.out.println(" Total Vowels : " + totalVowels);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"priyanka", "swati", "acharya", "hevin"};
		A16_CountVowelsFromString countVowelsFromString = new A16_CountVowelsFromString();
		countVowelsFromString.countVowelsFromArray(arr);
	}
}
