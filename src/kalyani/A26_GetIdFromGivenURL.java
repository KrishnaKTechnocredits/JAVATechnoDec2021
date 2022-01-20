package kalyani;

public class A26_GetIdFromGivenURL {
	
	String getIdFromURL(String url) {
		String[] str = url.split("id=");
		return str[1];
	}
	
	public static void main(String[] args) {
		A26_GetIdFromGivenURL assign26 = new A26_GetIdFromGivenURL();
		System.out.println("URL : " + "https://automationbykrishna.com/name=techno/id=123");
		System.out.println("ID Present in URL is : " +  assign26.getIdFromURL("https://automationbykrishna.com/name=techno/id=123"));
	}
}