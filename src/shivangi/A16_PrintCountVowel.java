package shivangi;

public class A16_PrintCountVowel {
	
	int TotalVowelCnt = 0;
	
	void findVowelFromString(String name){
		int count = 0;
		for(int index=0; index<name.length(); index++){
			char vowel = name.charAt(index);
			if(vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u'){
				count++;
				TotalVowelCnt++;
			}
		}
		System.out.println(name + " --> " + count);
	}
	
	void findVowelFromArray(String[] input){
		for(int index=0; index<input.length; index++){
			findVowelFromString(input[index]);
		}
		System.out.println("Total vowels of all input is : " + TotalVowelCnt);
	}
	
	public static void main(String[] args){
		String[] arr = {"priyanka", "swati", "acharya", "hevin"};
		new A16_PrintCountVowel().findVowelFromArray(arr);
	}
}
