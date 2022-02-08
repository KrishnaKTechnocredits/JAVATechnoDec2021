package rohini.Rohini_Assignment24;

/*1. WAP to find out total words in a given string & print each word with its length
Input    : Hi Hello
Output : Total 2 words
              Hi --> 2
              Hello --> 5
 */

public class Program1 {

	static int count=0;

	public void findTotalWords(String str) {
		
		String[] string=str.split(" ");
		for(int index=0;index<string.length;index++) {
			String word=string[index];
			System.out.println(word+" --> "+word.length());
            count++;
		}
		System.out.println("Total Words : "+count);
	}



	public static void main(String[] args) {
		Program1 prg1 = new Program1();
		
		prg1.findTotalWords("Hi Hello");

	}

}
