package yogeshNimbalkar;

//Print characters between ASCII value 97 to 122
public class A33_P4_CharOf97to122Ascii {

	void printCharOfAscii() {
		System.out.println("Characters at ASCII value are:");
		for(int index=97; index<=122; index++)
			System.out.println(index + " -> " + (char) index);
	}
	
	public static void main(String[] args) {
		A33_P4_CharOf97to122Ascii program4 = new A33_P4_CharOf97to122Ascii();
		program4.printCharOfAscii();
	}
}
