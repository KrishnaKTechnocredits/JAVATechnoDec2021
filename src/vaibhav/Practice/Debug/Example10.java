package vaibhav.Practice.Debug;

public class Example10 {

	void findFreqOfEachWord(String str) {
		while(str.length()>0) {
			int olen = str.length(); // 100
			String wordToBeReplaced = str.split(" ")[0];
			str = str.replace(wordToBeReplaced, ""); //"echnocredis"
			int nlen = str.length(); // 74
			System.out.println(wordToBeReplaced + "->" + (olen-nlen)/wordToBeReplaced.length());
			str = str.trim();
		} 
	
	}
	
	public static void main(String[] args) {
		System.out.println("Hello");
		for(int index=1;index<=100;index++) {
			if(index % 5 == 0)
				System.out.println(index);
		}
		String str = "technocredits hi hello technocredits hello hello credits";
		new Example10().findFreqOfEachWord(str);
	}
}
