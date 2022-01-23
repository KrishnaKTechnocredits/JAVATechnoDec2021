package shital;

public class A24_findTotalVowelsInEachWord {

	void splitEachofString(String str) {
		String arr[]=str.split(" ");
		for(int index=0;index<arr.length;index++) {
			String eachWord = arr[index];
			findVowel(arr[index]);
		}
	}
	
	void findVowel(String str) {
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o'
					|| ch == 'U' || ch == 'u') {
				count++;
			}
		}
		System.out.println("word is:  "+str+ " & Vowel count is : -- " + count);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A24_findTotalVowelsInEachWord findTotalVowelsInEachWord=new A24_findTotalVowelsInEachWord();
		findTotalVowelsInEachWord.splitEachofString("aashvi technocredits");
	}

}
