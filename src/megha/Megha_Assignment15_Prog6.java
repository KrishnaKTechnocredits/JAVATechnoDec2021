package megha;

public class Megha_Assignment15_Prog6 {

	String nameHavingMaxLengthInGivenArray(String[] arr) {
		String name = "";
		int nameLength = arr[0].length();
		for (int index = 1; index < arr.length; index++) {
			if (nameLength < arr[index].length())
				name = arr[index];
		}
		return name;
	}

	public static void main(String[] args) {
		Megha_Assignment15_Prog6 megha_Assignment15 = new Megha_Assignment15_Prog6();
		String[] arr = { "Karan", "Shweta", "Pallavi", "Abhishek", "Sagar" };
		String name = megha_Assignment15.nameHavingMaxLengthInGivenArray(arr);
		System.out.println("Name with Maximum Length is : " + name);
	}

}
