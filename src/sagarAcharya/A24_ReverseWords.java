package sagarAcharya;

public class A24_ReverseWords {

	public static void main(String[] args) {
		A24_ReverseWords a24 = new A24_ReverseWords();
		a24.reverseConclude("Hi techno hello");
	}
	
	String reverseWord(String input) {
		String temp = "";
		for(int i = input.length()-1;i>=0;i--) {
			temp += input.charAt(i);
		}
		//System.out.println(temp);
		
		return temp+" ";
	}
	
	void reverseConclude(String input) {
		String[] str = input.split(" ");
		String output = "";
		for(int i = 0;i<str.length;i++) {
			output += reverseWord(str[i]);
		}
		output.trim();
		System.out.println(output);
	}
}

/*4. WAP to reverse each word on the same index
Input    : "Hi techno hello"
Output : "iH onhcet olleh"

5. WAP to convert first character of word with capital letter
Input    : "anvit harsh dipali"
Output : "Anvit Harsh Dipali"

6. WAP to reverse each word and convert first letter of each word into capital
Input    : "Vrushali Sagar Shital"
Output : "IlahsurV Ragas LatihS"

7. WAP to reverse the case of each char in a given word
Input    : "TeCHnoC*
*/