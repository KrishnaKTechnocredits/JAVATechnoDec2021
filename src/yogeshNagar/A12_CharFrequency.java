package yogeshNagar;

import java.util.Scanner;

public class A12_CharFrequency {
	int getCharCount(String name,char ch) {
		int count = 0;
		for(int index=0;index<name.length();index++) {
			if(name.charAt(index)==ch) {
				count++;
			}
		}
		return count;
	}
	
	void countStringChr(String name) {
		for(int index=0;index<name.length();index++) {
			int count = getCharCount(name,name.charAt(index));
			System.out.println(count+"-----"+name.charAt(index));
		}
	}
	
	public static void main(String[] args) {
		A12_CharFrequency charFreq = new A12_CharFrequency();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Name---- ");
		String name = scanner.next();
		charFreq.countStringChr(name);
		scanner.close();
	}
}
