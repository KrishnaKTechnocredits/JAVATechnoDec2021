package yogeshNagar;

public class A29_IntegetCountFromStringExceptionHendeling {
	void getIntegerSumCountFromString() {
		String str = "Techno 15 credits is 7 best 9 training institute";
		String[] splittedStr = str.split(" ");
		int sum = 0;
		for (int index = 0; index < splittedStr.length; index++) {
			try {
				sum = sum + Integer.parseInt(splittedStr[index]);
			} catch (NumberFormatException ne) {

			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		A29_IntegetCountFromStringExceptionHendeling intSumCount = new A29_IntegetCountFromStringExceptionHendeling();
		intSumCount.getIntegerSumCountFromString();
	}
}