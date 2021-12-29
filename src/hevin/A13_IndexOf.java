package hevin;

import java.util.Scanner;

public class A13_IndexOf {

	void getDuplicateChar(String name) {
		char ch = ' ';
		System.out.println("***Duplicate characters ");
		boolean flag = true;
		for (int index = 0; index < name.length(); index++) {
			ch = name.charAt(index);
			if (name.indexOf(ch) == name.lastIndexOf(ch)) {
					flag = false;
			}
			if (flag == true)
				System.out.println(ch);
		}
				System.out.println("================================");
	}

	void getNotRepeatingChar(String name) {
		char ch = ' ';
		System.out.println("Non repeating characters ");
		for (int index = 0; index < name.length(); index++) {
			ch = name.charAt(index);
			if (name.indexOf(ch) == name.lastIndexOf(ch)) {
				System.out.println(ch);
			}
		}
	}

	void getFirstNonRepeatingChar(String name) {
		char ch = ' ';
		for (int index = 0; index < name.length(); index++) {
			ch = name.charAt(index);
			if (name.indexOf(ch) == name.lastIndexOf(ch)) {
				System.out.println("First non repeating character is : " + ch);
				break;
			}
		}
	}

	void getFirstRepeatingChar(String name) {
		char ch = ' ';
		for (int index = 0; index < name.length(); index++) {
			ch = name.charAt(index);
			if (name.indexOf(ch) != name.lastIndexOf(ch)) {
				System.out.println("First repeating character is : " + ch);
				break;
			}
		}

	}

	public static void main(String[] args) {
		System.out.println("================================");
		A13_IndexOf strOperations = new A13_IndexOf();
		Scanner sc = new Scanner(System.in);
		System.out.println("***Enter Name : ");
		String name = sc.next();
		System.out.println("================================");
		strOperations.getDuplicateChar(name);
		strOperations.getNotRepeatingChar(name);
		System.out.println("================================");
		strOperations.getFirstNonRepeatingChar(name);
		System.out.println("================================");
		strOperations.getFirstRepeatingChar(name);
		System.out.println("================================");
		sc.close();
	}

}