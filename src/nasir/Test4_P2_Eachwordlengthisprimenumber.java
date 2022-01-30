package nasir;

/*Program - 2 : WAP to return a string having each word length is prime number from the given sentence.
Prime numbres are : 2, 3, 5, 7, 11, 13, 17, 19 ...
Examples:
Input 1 : I love my India
Output 1 : my India
Input 2 : I would like to have a cup of tea
Output 2 : would to cup of tea*/

public class Test4_P2_Eachwordlengthisprimenumber {
	void findWordLengthIsPrimenumber(String input) {
		String temp = "";
		String[] ans = input.split(" ");
		for (int index = 0; index < ans.length; index++) {
			int length = ans[index].length();
			if (length == 2 || length == 3 || length == 5 || length == 7 || length == 11 || length == 17) {
				String temp1 = ans[index];
				temp = temp + " " + temp1;
			}
		}
		System.out.println(temp);
	}

	public static void main(String[] args) {
		Test4_P2_Eachwordlengthisprimenumber eachwordlengthisprimenumber = new Test4_P2_Eachwordlengthisprimenumber();
		eachwordlengthisprimenumber.findWordLengthIsPrimenumber("I love my India");
		eachwordlengthisprimenumber.findWordLengthIsPrimenumber("I would like to have a cup of tea");
	}

}
