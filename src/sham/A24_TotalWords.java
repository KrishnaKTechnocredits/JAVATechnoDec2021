package sham;

public class A24_TotalWords {

	private void findTotalWordFromString(String words) {

		String arr[] = words.split(" ");
		for (int index = 0; index < arr.length; index++) {
			System.out.println(index + ". " + arr[index] + " -Length of String-> " + arr[index].length());
		}

	}

	public static void main(String[] args) {
		A24_TotalWords totalWords = new A24_TotalWords();
		String words = "Hi Hello";
		totalWords.findTotalWordFromString(words);

	}

}
