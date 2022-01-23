package saurav;

public class A24_TotalWordAndLetterCount {
	

	void totalWordsAndLetterCount(String input) {
		String[] inputArray = input.split(" ");
		for (int index = 0; index < inputArray.length; index++) {
			System.out.println("chars in word  " + inputArray[index] + " : " + inputArray[index].length());
		}
		System.out.println("Total number of words : " + inputArray.length);
	}
	
	public static void main(String[] a) {
		A24_TotalWordAndLetterCount program1 = new A24_TotalWordAndLetterCount();
		program1.totalWordsAndLetterCount("Hi Hello");
	}	
}
