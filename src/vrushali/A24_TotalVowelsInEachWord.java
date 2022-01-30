/*WAP to find our total vowels in each word from the given string
Input    : aashvi technocredits
Output : aashvi --> 3
              technocredits --> 4*/


package vrushali;

public class A24_TotalVowelsInEachWord {

	void findVowelsInString(String name) {

		String[] str = name.split(" ");
		for(int index = 0; index < str.length; index++) {
			String word = str[index];
			int wordLength = str[index].length();
			int count = 0;
			for(int innerIndex = 0;  innerIndex< wordLength; innerIndex++) {
				char ch= word.charAt(innerIndex);
				if((ch=='a') || (ch=='e') || (ch== 'i') || (ch=='o') || (ch=='u')) 
					count++;
			}	
			System.out.println(word + " --> " + count);
		}		
	}

	public static void main(String[] args) {
		A24_TotalVowelsInEachWord totalVowelsInEachWord = new A24_TotalVowelsInEachWord();
		String str = "aashvi technocredits";
		totalVowelsInEachWord.findVowelsInString(str);
	}
}
