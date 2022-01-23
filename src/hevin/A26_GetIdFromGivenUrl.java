package hevin;

public class A26_GetIdFromGivenUrl {

	String findIdFromUrl(String input){
		String[] output = input.split("id=");
		return output[1];
	}

	public static void main(String[] args) {
		A26_GetIdFromGivenUrl a26 = new A26_GetIdFromGivenUrl();
		String urlId = a26.findIdFromUrl("https://automationbykrishna.com/name=techno/id=123");
		System.out.println("ID from given URL is : " + urlId);
	}
}