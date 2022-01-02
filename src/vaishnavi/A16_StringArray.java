package vaishnavi;

public class A16_StringArray {
	
	int count = 0;
	int countOfVowels(String name) {
		int cnt = 0;
		for(int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
				cnt++;
		}
			System.out.println(name + " ---> " + cnt);
			return cnt;

	}
	
	void printTotalVowelsInStringArray(String[] arr) {
		int count = 0;
		for (int index =0; index < arr.length; index++) {
			count = count + countOfVowels(arr[index]);
		}
		System.out.println();
		System.out.println("Total vowels available in string is : " + count);
	}
	
	public static void main(String[] args) {
		A16_StringArray a16_StringArray = new A16_StringArray();
		String[] arr = {"vaishnavi","Kapil","priyanka","swati","acharya","hevin"};
	
		a16_StringArray.printTotalVowelsInStringArray(arr);
		
	}

}
