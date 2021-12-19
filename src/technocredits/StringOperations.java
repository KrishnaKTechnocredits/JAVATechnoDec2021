package technocredits;

public class StringOperations {
	
	void calStrLength(String input) {
		System.out.println(input + ":" + input.length());
	}
	
	public static void main(String[] args) {
		StringOperations stringOperations = new StringOperations();
		stringOperations.calStrLength("technocredits");
	}
}
