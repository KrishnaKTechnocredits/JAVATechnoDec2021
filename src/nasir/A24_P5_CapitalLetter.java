package nasir;
//WAP to convert first character of word with capital letter

public class A24_P5_CapitalLetter {
	String temp = " ";

	void setData(String input) {
		String[] output = input.split(" ");
		for (int index = 0; index < output.length; index++) {
			String word = output[index];
			converFirstLetterInCapital(word);
			temp = temp + " ";
		}
		temp = temp.trim();
		System.out.println(temp);
	}

	void converFirstLetterInCapital(String letter) {
		for (int index = 0; index < letter.length(); index++) {
			char ch = letter.charAt(index);
			String ans = ch + "";
			if (letter.indexOf(ch) == 0) {
				ans = ans.toUpperCase();
			}
			temp = temp + ans;
		}
	}

	public static void main(String[] args) {
		A24_P5_CapitalLetter capitalLetter = new A24_P5_CapitalLetter();
		capitalLetter.setData("anvit harsh dipali");
	}
}
