package yogeshNagar;

public class A19_CharcterSum {

	void getCharctorSum(String name) {
		int sum = 0;
		for (int index = 0; index < name.length(); index++) {
			if (Character.isDigit(name.charAt(index))) {
				int count = Character.getNumericValue(name.charAt(index));
				sum = sum + count;
			}
		}
		System.out.println("Digit sum is " + sum);
	}

	public static void main(String[] args) {
		A19_CharcterSum charLog = new A19_CharcterSum();
		charLog.getCharctorSum("TE1ch2noC2red9iTs");
	}
}