package pradeep.A24;

public class Program2 {
	// 2. WAP to find our total vowels in each word from the given string
	void findTotalVowelInWord(String input) {
		int count = 0;
		String[] arr = input.split(" ");

		for (int index = 0; index < arr.length; index++) {
			String str = arr[index];
			for (int innerIndex = 0; innerIndex < str.length(); innerIndex++) {
				char ch = str.charAt(innerIndex);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					count++;
				}
			}
			System.out.println(str + "-->"+count);
			count=0;
		}
	}

	public static void main(String[] args) {
		Program2 program2 = new Program2();
		String input = "aashvi technocredits";
		System.out.println("Input : " + input);
		System.out.println("Output :");
		program2.findTotalVowelInWord(input);
	}

}
