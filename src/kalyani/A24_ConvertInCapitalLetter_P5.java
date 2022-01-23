package kalyani;

public class A24_ConvertInCapitalLetter_P5 {

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
		A24_ConvertInCapitalLetter_P5 assigna24 = new A24_ConvertInCapitalLetter_P5();
		assigna24.setData("kalyani ragini abhijeet");
	}
}