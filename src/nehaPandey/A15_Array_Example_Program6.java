package nehaPandey;

public class A15_Array_Example_Program6 {
	int maxlength = 0;
	String maxstr = "";

	String getMaxLengthString(String[] arr) {

		for (int index = 0; index < arr.length; index++) {

			if (maxlength < arr[index].length()) {
				maxlength = arr[index].length();
				maxstr = arr[index];
			}
		}
		return maxstr;

	}

	public static void main(String[] args) {
		A15_Array_Example_Program6 array = new A15_Array_Example_Program6();
		String[] arr = { "Karan", "Shweta", "Pallavi", "Abhishek", "Sagar" };
		String str = array.getMaxLengthString(arr);
		System.out.println("Maximum length string from given array : " + str);

	}

}
