package saurav;

public class A26_ValueOfIdFromGivenUrl {
	
	void getId(String input) {
		String temp = "";
		String[] str = input.split("/");
		for(int index =0; index<str.length; index++) {
			temp = temp+str[4];             /////////temp=temp+String.valueOf(str[4]);
			break;
		}
		System.out.println(temp );
	}
	public static void main(String[] a) {
		A26_ValueOfIdFromGivenUrl assignment26 = new A26_ValueOfIdFromGivenUrl();
		assignment26.getId("https://automationbykrishna.com/name=techno/id=123");
		System.out.println();
	}
}
