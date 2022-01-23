package nishika;

public class A_17_maxVowel {
	
	int findVowels(String str) {
		int count = 0;
		for(int index=0; index<str.length(); index++){
			char ch = str.charAt(index);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				count++;
		}
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
		A_17_maxVowel maxVowel = new A_17_maxVowel();
		String[] strArr = {"hi","priyanka", "sandip", "aakanksha", "pallavi", "apurva"};
		System.out.println("Maximum vowels of string is : " + maxVowel.maxVowels(strArr));
	}
}
