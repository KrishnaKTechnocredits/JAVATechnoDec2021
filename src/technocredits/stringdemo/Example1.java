package technocredits.stringdemo;

public class Example1 {

	static String processData(String str) {
		str = str.substring(3);
		str = str.toUpperCase();
		if(str.startsWith("H"))
			str = str.substring(1);
		return String.valueOf(str.charAt(0));
	}
	
	public static void main(String[] args) {
		String answer = Example1.processData("technocredits");
		System.out.println(answer); // N t
		int x = 10;
		x = x+10;
		System.out.println(x+10);
		System.out.println(x);
	}
}
