package ashok;

public class A17_vowelsMaxCountString {

	void maxVowelString(String str[]) {
		int count = 0;
		String nameOfMaximumVowel = " ";
		for (int index = 0; index < str.length; index++) {
			String temp = str[index];
			int cnt = 0;
			for (int innerIndex = 0; innerIndex < temp.length(); innerIndex++) {
				char ch = temp.charAt(innerIndex);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					cnt++;
			}
			System.out.println(temp + " has total count of Vowles " + cnt);
			if (cnt > count) {
				count = cnt;
				nameOfMaximumVowel = temp;
			}
		}
		System.out.println("--------------------------------------");
		System.out.println("Name of Maximum count of vowel is "+nameOfMaximumVowel);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A17_vowelsMaxCountString a17_vowelsMaxCountString = new A17_vowelsMaxCountString();
		String str[] = { "hi", "ashok" };
		a17_vowelsMaxCountString.maxVowelString(str);

	}

}
