package technocredits.stringdemo;

public class Example8 {

	void findFreqOfEachChar(String str) {
		while(str.length()>0) {
			int olen = str.length();
			char chToBeReplaced = str.charAt(0);
			str = str.replace(String.valueOf(chToBeReplaced), ""); //"echnocredis"
			int nlen = str.length(); // 
			System.out.println(chToBeReplaced + "->" + (olen-nlen));
		}
	}
	
	void findFreqOfEachWord(String str) {
		while(str.length()>0) {
			int olen = str.length(); // 100
			String wordToBeReplaced = str.split(" ")[0];
			str = str.replace(wordToBeReplaced, ""); //"echnocredis"
			int nlen = str.length(); // 74
			int diff = olen-nlen ; //26
			int wordFreq = diff/wordToBeReplaced.length(); // 2
			System.out.println(wordToBeReplaced + "->" + wordFreq);
			str = str.trim();
		} 
	}
	
	public static void main(String[] args) {
		String str = "technocredits hi hello technocredits hello hello credits";
		new Example8().findFreqOfEachWord(str);
	}
}
