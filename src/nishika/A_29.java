package nishika;

public class A_29 {

	void sum(String input) {

		String[] split = input.split(" ");
		int sum = 0;

		for (int i = 0; i < split.length; i++) {
			try {
				int word = Integer.parseInt(split[i]);
				sum = sum + word;
			} catch (NumberFormatException ae) {
				// System.out.println(ae.getMessage());
				// ae.printStackTrace();
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		A_29 a = new A_29();
		a.sum("I have 15 years and 3 months of automation engineer");
	}
}
