package anvit;

public class A15_Name_Max_Length {
	
	String nameHavingMaxLength(String[] arr) {
		String name = "";
		int nameLength = arr[0].length();
		for (int index = 1; index < arr.length; index++) {
			if (nameLength < arr[index].length())
				name = arr[index];
		}
		return name;
	}
	
	public static void main(String[] args) {
		A15_Name_Max_Length a15_Name_Max_Length = new A15_Name_Max_Length();
		String[] arr = { "Karan", "Shweta", "Pallavi", "Abhishek", "Sagar" };
		String name = a15_Name_Max_Length.nameHavingMaxLength(arr);
		System.out.println("Name with Maximum Length is : " + name);
	}
}
