package pradeep.A24;

public class Program1 {
// 1. WAP to find out total words in a given string & print each word with its length
	void findTotalWord(String input) {
		String[] temp = input.split(" ");
		System.out.println("Total words: " + temp.length);
		for (int index = 0; index < temp.length; index++) {
			System.out.println(temp[index] + "-->" + temp[index].length());
		}
	}

	public static void main(String[] args) {
		Program1 program1 = new Program1();
		String input = "Hi Hello";
		program1.findTotalWord(input);
	}
}
