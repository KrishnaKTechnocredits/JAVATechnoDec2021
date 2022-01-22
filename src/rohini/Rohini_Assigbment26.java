package rohini;

/*	Assignment 26 : 20th Jan'2022
   WAP to find out the value of id form the given input url.
	String url = "https://automationbykrishna.com/name=techno/id=123";
	Output = "123"

	Hint : use split()*/


public class Rohini_Assigbment26 {
	
	public void findValueOfid()
	{
		try
		{
		String url="https://automationbykrishna.com/name=techno/id=123";
		String[] arr=url.split("/");
		for(int i=0;i<=arr.length;i++) {
	       if(arr[i].contains("id")) {
	    	  String[] arr2= arr[i].split("=");
	    	  System.out.println(arr2[1]);
	       }
		}
		}catch(Exception e) {
			System.out.println("Exception handled");
		}
		
	}
	
	public static void main(String[] args) {
		Rohini_Assigbment26 id = new Rohini_Assigbment26();
		id.findValueOfid();
		
	}

}
