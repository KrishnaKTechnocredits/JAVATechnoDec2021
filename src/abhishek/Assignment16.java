package abhishek;
class Assignment16 {
	int totalVowelCount = 0;
	
	void getVowelCountInString(String name) {
		int vowelCount = 0 ;
		for(int index = 0; index <name.length(); index++) {
			if(name.charAt(index) == 'a' || name.charAt(index) == 'e' || name.charAt(index) == 'i' || name.charAt(index) == 'o' || name.charAt(index) == 'u') {
				vowelCount++;
				totalVowelCount++;
			}
		}
		System.out.println(name + "  -->  " + vowelCount); 
	}
	
	void findVowelsInArray(String[] arr) {
		for(int index = 0; index < arr.length; index++) {
			getVowelCountInString(arr[index].toLowerCase());
		}
		System.out.println("Total Vowels in the given array: " + totalVowelCount);
	}
	public static void main(String[] args) {
		Assignment16 assignment16 = new Assignment16();
		String str[] = { "Priyanka", "Swati", "Acharya", "Hevin" };
		assignment16.findVowelsInArray(str);
	}
}
		