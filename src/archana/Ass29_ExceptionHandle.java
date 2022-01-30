package archana;

public class Ass29_ExceptionHandle {

	static void getNoFromString(String[] strArr) {
		int sum = 0;
		for (int i = 0; i < strArr.length; i++) {
			String word = strArr[i];
			try {
				int num = Integer.parseInt(word);
				sum = sum + num;

			} catch (Exception ex) {

			}

		}
		System.out.println("Sum of digits found in string : " + sum);
	}

	public static void main(String[] args) {
		String str = "I have 15 years and 3 months of automation experience";
		String[] strArr = str.split(" ");
		Ass29_ExceptionHandle.getNoFromString(strArr);
	}

}
