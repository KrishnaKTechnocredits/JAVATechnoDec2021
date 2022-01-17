package nasir;
//WAP to reverse each word on the same index
public class A24_P4_ReverseWord {
	String temp=" ";
	void setWord(String input) {
		String[] output =input.split(" ");
		for(int index=0; index<output.length;index++) {
			String word =output[index];
			reverseEachWord(word);
			temp=temp+" ";
		}
		temp= temp.trim();
		System.out.println("Reverse Word in same index - "+temp);
	}
	
	void reverseEachWord(String rev) {
		for(int index=rev.length()-1; index>=0;index--) {
			char ch= rev.charAt(index);
			temp=temp+ch;
		}
	}
	
	public static void main(String[] args) {
		A24_P4_ReverseWord reverseWord = new A24_P4_ReverseWord();
		reverseWord.setWord("Hi techno hello");
	}
}
