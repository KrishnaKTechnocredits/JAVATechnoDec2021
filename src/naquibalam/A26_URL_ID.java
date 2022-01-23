package naquibalam;

public class A26_URL_ID {
	
	int getIDFromURL(String url) {
		String arr[] = url.split("id=");
		return Integer.parseInt(arr[1]);
	}
	
	public static void main(String[] args) {
		A26_URL_ID a26_URL_ID = new A26_URL_ID();
		System.out.println("ID from URL is : " + a26_URL_ID.getIDFromURL("https://automationbykrishna.com/name=techno/id=123"));
	}
}
