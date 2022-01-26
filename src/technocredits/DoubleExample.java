package technocredits;

public class DoubleExample {

	public static void main(String[] args) {
		String str = "Hi 10.2 Hello";
		String[] arr = str.split(" ");
		double ans = 0;
		
		for(String word : arr) {
			try {
				double num = Double.parseDouble(word);
				ans = ans + num;
			}catch(NumberFormatException ne) {
				
			}
		}
		System.out.println(ans);
	}
}
