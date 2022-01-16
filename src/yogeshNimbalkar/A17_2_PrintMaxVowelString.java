package yogeshNimbalkar;
// return String having maximum vowels from given array.
public class A17_2_PrintMaxVowelString {

	int getVowelsInString(String str) {
		int count = 0;
		String temp = str.toLowerCase();
		for(int index=0; index<str.length(); index++)
			if(temp.charAt(index) == 'a' || temp.charAt(index) == 'e' || temp.charAt(index) == 'i' || temp.charAt(index) == 'o' || temp.charAt(index) == 'u')
				count++;
		return count;
	}
	
	String getStrWithMaxVowels(String[] str) {
		int maxVowelCount = 0;
	//	int count =0;
		String name = "";
		for(int index=0; index<str.length; index++) {
			//count = getVowelsInString(str[index]);
			if(maxVowelCount < getVowelsInString(str[index])) {
				maxVowelCount = getVowelsInString(str[index]);
				name = str[index];
			}
		}
		return name;
	}
	
	public static void main(String[] args) {
		A17_2_PrintMaxVowelString maxVowelString = new A17_2_PrintMaxVowelString();
		String[] input = {"hi","priyanka", "sandip", "aakanksha", "pallavi", "apurva"};
		System.out.println("Max vowels string is : " + maxVowelString.getStrWithMaxVowels(input));
	}
}
