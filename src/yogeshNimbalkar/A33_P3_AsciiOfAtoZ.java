package yogeshNimbalkar;

// Print ASCII value of A to Z
public class A33_P3_AsciiOfAtoZ {

	void printAsciiOfAtoZ() {
		System.out.println("ASCII value of A to Z are:");
		for(char ch='A' ; ch<='Z'; ch++)
			System.out.println(ch + " -> "+(int) ch);
	}
	
	public static void main(String[] args) {
		A33_P3_AsciiOfAtoZ program3 = new A33_P3_AsciiOfAtoZ();
		program3.printAsciiOfAtoZ();
	}
}
