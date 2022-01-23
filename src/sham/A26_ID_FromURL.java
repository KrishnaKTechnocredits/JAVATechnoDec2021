package sham;

public class A26_ID_FromURL {

	void findIdFromGivenURL()
	{
		String url = "https://automationbykrishna.com/name=techno/id=123";
		String[] splitted=url.split("id=");
		if(splitted[0].contains("123"))
		{
			System.out.println("ID is in First Index: "+splitted[0]);
		}
		else
		{
			System.out.println("ID is in second Index: "+splitted[1]);
		}
	}
	public static void main(String[] args) {
		A26_ID_FromURL findUrl= new A26_ID_FromURL();
		findUrl.findIdFromGivenURL();

	}

}
