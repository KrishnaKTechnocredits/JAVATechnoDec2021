package kavleen;

public class Assignment26 {
    
	void valueFromInput(String name) {
		String [] arr = name.split("id=");
		System.out.println("The  value of id is " + arr[1]);
	}
	
	public static void main (String []args) {
		Assignment26 assignment= new Assignment26();
		String name = "https://automationbykrishna.com/name=techno/id=123";
		assignment.valueFromInput(name);
	}
}
