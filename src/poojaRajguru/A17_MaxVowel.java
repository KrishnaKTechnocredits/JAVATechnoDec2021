package poojaRajguru;

public class A17_MaxVowel {
	int findVowels(String str) {
		int count = 0;
		for(int index=0; index<str.length(); index++)
			if(str.charAt(index) == 'a' || str.charAt(index) == 'e' || str.charAt(index) == 'i' || str.charAt(index) == 'o' || str.charAt(index) == 'u')
				count++;
		return count;
	}

	String maxVowels(String[] str) {
		int count = 0;
		String name = "";
		for(int index=0; index<str.length; index++) {
			if(count < findVowels(str[index])) {
				count = findVowels(str[index]);
				name = str[index];
			}
		}
		return name;
	}

	public static void main(String[] args) {
		A17_MaxVowel maxVowel = new A17_MaxVowel();
		String[] strArr = {"hi","priyanka", "sandip", "aakanksha", "pallavi", "apurva"};
		System.out.println("Maximum vowels of string is : " + maxVowel.maxVowels(strArr));
	}
}
