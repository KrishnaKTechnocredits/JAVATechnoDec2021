package rushikesh;
//Assignment 26 : 20th Jan'2022
//
//WAP to find out the value of id form the given input url.
//String url = "https://automationbykrishna.com/name=techno/id=123";
//Output = "123"
//
//Hint : use split()

public class Assignment26 {
	String getValue(String str) {
		String[] arr=str.split("/");
		String temp = "";
		for(int i = 0; i<arr.length;i++) {
			if(arr[i].contains("id="))
				temp = arr[i].substring(3);
		}
		return temp;
	}
	public static void main(String[] args) {
		Assignment26 assignment26=new Assignment26();
		String output=assignment26.getValue("https://automationbykrishna.com/name=techno/id=123");
		System.out.println(output);
	}
}
