package anvit;

public class A26_Find_Value_ID {
	
	String getValueOfID(String input){
		String[] arr = input.split("/");
		String temp = "";
		for(int i = 0; i<arr.length;i++) {
			if(arr[i].contains("id="))
				temp = arr[i].substring(3);
		}
		return temp;
	}
	
	public static void main(String[] args) {
		A26_Find_Value_ID a26_Find_Value_ID = new A26_Find_Value_ID();
		String id = a26_Find_Value_ID.getValueOfID("https://automationbykrishna.com/name=techno/id=123");
		System.out.println(id);
	}
}
