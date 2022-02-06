package archana;

public class Ass33_ASCII {

	static char getAsciiOfChar_Prog1(int num) {
		char ch = (char) num;
		return ch;
	}

	static int getAsciiOfNum_Prog2(char ch) {
		int num = (int) ch;
		return num;
	}

	static void printASCIIValue_Prog3() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch + ":" + (int) ch + " ");
		}
	}

	static void printASCIIChar_Prog4() {
		for (int num = 97; num <= 122; num++) {
			char ch = (char) num;
			System.out.print(ch + ":" + (int) ch + " ");
		}
	}

	public static void main(String[] args) {
		char c = getAsciiOfChar_Prog1(122);
		System.out.println("122 - " + c);
		int num = getAsciiOfNum_Prog2('A');
		System.out.println("A - " + num);
		System.out.println(".....................................");
		printASCIIValue_Prog3();
		System.out.println();
		System.out.println(".....................................");
		printASCIIChar_Prog4();

	}

}
