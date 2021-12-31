package naquibalam;

public class A16_Array {

	void getVowelsCount() {
		String[] arr = {"priyanka", "swati", "acharya", "hevin" };
		char[] vowels = {'a','e','i','o','u'};
		int countVowelEach = 0;
		int countVowelAll = 0;
		for (int i=0; i<arr.length;i++) {
			countVowelEach = 0;
			for (int j = 0; j < arr[i].length(); j++) {
				char characterAtIndex = arr[i].charAt(j);
				for (int k=0; k<vowels.length;k++) {
					if ((characterAtIndex == vowels[k])) {
						countVowelEach++;	
						countVowelAll++;
					}	
				}
			}
			System.out.println("Count of vowel(s) in the name '" + arr[i] + "' is - " +  countVowelEach);
		}
		System.out.println("Total vowels in the array is - " +  countVowelAll);
	}
	
	public static void main(String[] args) {
		A16_Array a16_Array = new A16_Array();
		a16_Array.getVowelsCount();
	}
}
