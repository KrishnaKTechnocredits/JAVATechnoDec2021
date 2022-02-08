package rohini.Rohini_Assignment24;


/*5. WAP to convert first character of word with capital letter
Input    : "anvit harsh dipali"
Output : "Anvit Harsh Dipali"*/

public class Program5 {


void splitWords(String input) {
	String[] s1 = input.split(" ");
	for (int index = 0; index < s1.length; index++) {
		FirstcapitalLetter(s1[index]);
	}
}

void FirstcapitalLetter(String s2) {
	String temp = "";
	char ch = s2.charAt(0);
	ch = Character.toUpperCase(ch);
	s2 = ch + s2.substring(1);
	temp = temp + " " + s2;
	System.out.print(temp);

}

public static void main(String[] args) {
	Program5 prg5 = new Program5();
	prg5.splitWords("sandip techno credits");
}
}
