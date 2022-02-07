package hevin;

public class A33_AsciiValue {

	static int getAsciiOfChar(char ch) {
		
		int c = (int) ch;
		System.out.println(ch +"--"+ c);
		return c;
						
	}
	
	static char getCharOfAscii(int asciiValue) {
		
		char ch = (char) asciiValue;
		System.out.println(asciiValue +"--"+ ch);
		return ch;
	}
	
	static void getAsciiOfAtoZ() {
		for (char ch = 'A'; ch<='Z';ch++) {
			System.out.println(ch+"--"+(int)ch);
		}
	}
	
	static void getAllCharOfGivenAscii() {
		
		for (int i = 97; i<=122;i++) {
			System.out.println(i+"--"+(char)i);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("ASCII Value Of Character :");
		getAsciiOfChar('M');
		System.out.println();
		System.out.println("Character OF Given ASCII Value :");
		getCharOfAscii(72);
		System.out.println();
		System.out.println("ASCII Value Of A to Z :");
		getAsciiOfAtoZ();
		System.out.println();
		System.out.println("Character Between ASCII Value 97 to 122 :");
		getAllCharOfGivenAscii();
	}
}
