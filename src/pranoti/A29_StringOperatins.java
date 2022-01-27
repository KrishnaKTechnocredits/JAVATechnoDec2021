package pranoti;

public class A29_StringOperatins {

	void findStringNumberSum(String str) {
		String[] arr = str.split(" ");
		int sum = 0;
		for (String str1 : arr) {
			try {
				int num = Integer.parseInt(str1);
				sum = sum + num;
			} catch (NumberFormatException ne) {
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		A29_StringOperatins a29_StringOperatins = new A29_StringOperatins();
		a29_StringOperatins.findStringNumberSum("I have 15 years and 3 months of automation experience");
	}
}
