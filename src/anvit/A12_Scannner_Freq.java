package anvit;
import java.util.Scanner;

public class A12_Scannner_Freq {
	void getFreq() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string to find frequency: ");
		String str = scanner.next();
		for(int index=0;index<str.length();index++) {
			int count = 0;
			for(int i=0;i<str.length();i++) {
				if(str.charAt(index)==str.charAt(i))
					count++;
			}
			System.out.println("Frequency of "+str.charAt(index)+" is "+ count);
		}
	}
	public static void main(String[] args) {
		A12_Scannner_Freq a12_Scannner_Freq = new A12_Scannner_Freq();
		a12_Scannner_Freq.getFreq();
	}
}
