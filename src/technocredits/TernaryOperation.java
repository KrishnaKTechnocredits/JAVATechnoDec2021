package technocredits;

public class TernaryOperation {

	public static void main(String[] args) {
		String name = "atechnocredits";
		if (name.startsWith("techno")) {
//			System.out.println("Good morning");
		} else {
//			System.out.println("Good afternoon");
		}

		String result = name.startsWith("techno") ? "Good morning" : "Good afternoon";
		String num = (5 % 2 == 1) && (true) ? "hi" : "bye";
//		condition? true: false
		System.out.println(result);
	}
}
