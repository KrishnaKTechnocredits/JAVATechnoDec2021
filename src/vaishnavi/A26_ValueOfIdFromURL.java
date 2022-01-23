package vaishnavi;

public class A26_ValueOfIdFromURL {

	String findValueOfIdFromURL(String str) {
		String[] arr = str.split("id=");
		return arr[arr.length-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A26_ValueOfIdFromURL a26_ValueOfIdFromURL = new A26_ValueOfIdFromURL();
		String url = "https://automationbykrishna.com/name=techno/id=123";
		System.out.println("Value of Id from given URL is : " + a26_ValueOfIdFromURL.findValueOfIdFromURL(url));
	}

}
