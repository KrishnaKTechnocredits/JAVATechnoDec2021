package sagarAcharya;

import java.util.Arrays;

public class A26 {

	public static void main(String[] args) {
		A26 a26 = new A26();
		a26.valueOfID1("https://automationbykrishna.com/name=techno/id=123");
	}
	
	//If we know that ID would always be stored on the last of the URL.
	
	void valueOfID(String input) {
		String[] temp = input.split("id=");
		System.out.println("Id is  : " + temp[temp.length-1]);
	}
	
	//If we are not sure where ID would be stored but are sure that url does not consist of numbers except ID
	
	void valueOfID1(String input) {
		String[] temp = input.split("id=");
		String temp1 = Arrays.toString(temp);
		String id = "";
		for(int i =0;i<temp1.length();i++) {
			char ch = temp1.charAt(i);
				if(Character.isDigit(ch)) {
					//System.out.print(ch);
					id += ch;
				}
			}
		System.out.println(id);
		}
	}


/*Assignment 26 : 20th Jan'2022

WAP to find out the value of id form the given input url.
String url = "https://automationbykrishna.com/name=techno/id=123";
Hint : use split()
*/