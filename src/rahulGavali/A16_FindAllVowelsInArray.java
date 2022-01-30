package rahulGavali;

public class A16_FindAllVowelsInArray {

	int getVowelCountInString(String str) {
		int count = 0;
		String temp = str.toLowerCase();
		for(int index=0; index<str.length(); index++) {
			if(temp.charAt(index) == 'a' || temp.charAt(index) == 'e' || temp.charAt(index) == 'i' || temp.charAt(index) == 'o' || temp.charAt(index) == 'u')
				count++;
		}
		System.out.println(str + " -> " + count);
		return count;
	}
	
	void findVowelCountInAllString(String[] arr) {
		int totalcount = 0;
		for(int index=0; index<arr.length; index++)
			totalcount += getVowelCountInString(arr[index]);
		System.out.println("Total vowels = " + totalcount);
	}
	
	public static void main(String[] args) {
		A16_FindAllVowelsInArray vowelInArray = new A16_FindAllVowelsInArray();
		String[] input = {"priyanka", "SWATI", "Acharya", "hevin", "RAHUL" };
		vowelInArray.findVowelCountInAllString(input);
	}
}