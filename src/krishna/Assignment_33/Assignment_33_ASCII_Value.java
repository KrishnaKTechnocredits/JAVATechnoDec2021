package krishna.Assignment_33;

public class Assignment_33_ASCII_Value {

	static int getCharAscii(char ch) {
		int k = (int) ch;
		System.out.println(ch + " ---> " + k);
		return k;
	}

	static char getAsciiChar(int aV) {
		char ch = (char) aV;
		System.out.println(aV + " ---> " + ch);
		return ch;
	}

	static void getAtoZAscii() {
		for (char ch = 'A'; ch <= 'Z'; ch++)
			System.out.println(ch + " ----> " + (int) ch);
	}

	static void getAllCharAsAscii() {
		for (int i = 97; i <= 122; i++)
			System.out.println(i + " ----> " + (char) i);
	}

	public static void main(String[] args) {
		System.out.println("ASCII Value As Of Character :");
		getCharAscii('K');
		getCharAscii('k');
		System.out.println();
		System.out.println("Character As Of Given ASCII Value :");
		getAsciiChar(82);
		getAsciiChar(113);
		System.out.println();
		System.out.println("ASCII Value Of Character A to Z :");
		getAtoZAscii();
		System.out.println();
		System.out.println("Character In Between ASCII Value 97 to 122 :");
		getAllCharAsAscii();
	}
}
