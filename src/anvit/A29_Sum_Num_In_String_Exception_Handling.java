package anvit;

public class A29_Sum_Num_In_String_Exception_Handling {

	void sumNumInString(String input) {
		String[] arr = input.split(" ");
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			try {
				int digit = Integer.parseInt(arr[i]);
				num = num + digit;

			} catch (NumberFormatException ne) {

			}
		}
		System.out.println(num);
	}

	public static void main(String[] args) {
		A29_Sum_Num_In_String_Exception_Handling a29 = new A29_Sum_Num_In_String_Exception_Handling();
		a29.sumNumInString("I have 15 years and 3 months of automation experience");
	}
}
