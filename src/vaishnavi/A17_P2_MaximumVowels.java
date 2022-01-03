package vaishnavi;

public class A17_P2_MaximumVowels {

	int vowelCount = 0;
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
	
	String printMaxVowelsInStringArray(String[] arr) {
		int maxCount = 0;
		String maxVowelName ="";

		for (int index =0; index < arr.length; index++) {
			int Count = countOfVowels(arr[index]);
			if (Count > maxCount) {
				maxCount = Count;
				maxVowelName = (arr[index]);
			}
		}
		
		System.out.println("---------------------------------------------");
		return maxVowelName;
	}
	public static void main(String[] args) {
		A17_P2_MaximumVowels a17_P2_MaximumVowels = new A17_P2_MaximumVowels();
		String[] arr = {"hi","priyanka", "sandip", "aakanksha", "pallavi", "apurva"};
		System.out.println("String having maximum vowels is : "+ a17_P2_MaximumVowels.printMaxVowelsInStringArray(arr));
		
	}


}
