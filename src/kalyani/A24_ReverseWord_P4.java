package kalyani;

public class A24_ReverseWord_P4 {
	
	String temp=" ";
	void setWord(String input) {
		String[] output = input.split(" ");
		for(int index=0; index<output.length;index++) {
			String word = output[index];
			reverseEachWord(word);
			temp=temp+" ";
		}
		temp= temp.trim();
		System.out.println(temp);
	}

	void reverseEachWord(String rev) {
		for(int index=rev.length()-1; index>=0;index--) {
			char ch= rev.charAt(index);
			temp=temp+ch;
		}
	}

	public static void main(String[] args) {
		A24_ReverseWord_P4 reverseWord = new A24_ReverseWord_P4();
		reverseWord.setWord("Hi techno hello");
	}
}