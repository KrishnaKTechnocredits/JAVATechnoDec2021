package pratiksha;

public class A15_ReturnMaxLength {

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
		A15_ReturnMaxLength returnMaxLength = new A15_ReturnMaxLength();
		String[] arr = { "Karan", "Shweta", "Pallavi", "Abhishek", "Sagar" };
		String name = returnMaxLength.nameHavingMaxLengthInGivenArray(arr);
		System.out.println("Name with Maximum Length is : " + name);
	}
}
