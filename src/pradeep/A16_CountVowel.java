package pradeep;

public class A16_CountVowel {
	
	void countVowelInString(String[] arr) {		
		int totalVowel=0;
		
		for(int index=0; index<arr.length; index++) {
			int countVowel=0;
			String str = arr[index];
			for(int index1=0;index1<str.length();index1++) {
				if(str.charAt(index1)=='a' || str.charAt(index1)=='e' || str.charAt(index1)=='i' || str.charAt(index1)=='o' || str.charAt(index1)=='u' ) {
					countVowel++;
					totalVowel++;
				}
			}
			System.out.println(str + "-->" + countVowel);
		}
		System.out.println("Total vowel is: " + totalVowel);
	}
	
	public static void main(String[] args) {
		// print count of vowels in each input from String array and print total vowels.
		String[] arr = {"priyanka", "swati", "acharya", "hevin" };
		A16_CountVowel a16_CountVowel =new A16_CountVowel();
		a16_CountVowel.countVowelInString(arr);
	}
}
