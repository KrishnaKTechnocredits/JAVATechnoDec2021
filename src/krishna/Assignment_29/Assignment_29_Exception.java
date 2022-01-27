package krishna.Assignment_29;

public class Assignment_29_Exception {

	void getNum() {
		String input = "I have 15 years and 3 months of automation experience";
		String data[] = input.split("\\s");
		int sum = 0;
		for (String found : data) {
			try {
				Integer n = Integer.parseInt(found);
				sum += n;

			} catch (NumberFormatException ne) {
				// System.out.println(ne);
			}
		}
		System.out.println("The Sum is  : " + sum);
	}

	public static void main(String[] args) {
		Assignment_29_Exception ass29 = new Assignment_29_Exception();
		ass29.getNum();
	}
}
