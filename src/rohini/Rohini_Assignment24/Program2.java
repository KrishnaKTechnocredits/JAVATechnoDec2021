package rohini.Rohini_Assignment24;

/*2. WAP to find our total vowels in each word from the given string
Input    : aashvi technocredits
Output : aashvi --> 3
              technocredits --> 4
 */

public class Program2 {

	int count=0;
	public void findVowelsFromStr(String str) {
		String[] string=str.split(" ");
		int index=0;
		for(index=0;index<string.length;index++) {
			for(int index1=0;index1<string[index].length();index1++) {
				if(string[index].charAt(index1)=='a'||string[index].charAt(index1)=='e'||string[index].charAt(index1)=='i'||string[index].charAt(index1)=='o') {
					count++;  
					

				}
			}System.out.println(string[index]+" --> "+count);
		}
	}

	public static void main(String[] args) {
		Program2 prg2 = new Program2();
		prg2.findVowelsFromStr("aashvi technocredits");


	}

}
