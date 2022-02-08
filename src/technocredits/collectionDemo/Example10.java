package technocredits.collectionDemo;

// WAP to find Ascii of given character.
// WAP to find character of give Ascii.

public class Example10 {

	static void printAscii(char ch) {
		//int x = ch;
		System.out.println(ch +"--"+ (int)ch); // 97
	}
	
	static void printCharFromAscii(int num) {
		char ch = (char)num;// char ch = num
		System.out.println(num +"-"+ ch); // d
	}
	
	public static void main(String[] args) {
		/*for(char ch='A';ch<='Z';ch++) {
			printAscii(ch);
		}*/
		for(int num=91;num<=96;num++) {
			printCharFromAscii(num);
		}
		
	}
}
