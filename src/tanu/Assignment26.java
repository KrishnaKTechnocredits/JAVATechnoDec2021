package tanu;
class Assignment26{
void valueOfIdFromInputUrl(String name) {
	String[] arr= name.split("id=");
	System.out.println("The value of id is-> "+arr[1]);
}	
public static void main(String[] arg) {
	Assignment26 assignment=new Assignment26();
	assignment.valueOfIdFromInputUrl("https://automationbykrishna.com/name=techno/id=123");
}	
}

