package monikaBhurey;

public class StringOperation {
	void calStrLength(String input) {
		System.out.println(input + ":" +input.length());
	}
	
	public static void main(String[] args) {
		StringOperation stringOperation = new StringOperation();
		stringOperation.calStrLength("Technocredits");
}
}