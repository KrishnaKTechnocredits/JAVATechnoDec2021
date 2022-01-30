package technocredits.stringbufferbuilder;

public class Example2 {

	boolean isPallindrom(String input) {
		StringBuffer sb = new StringBuffer(input);
		String output = sb.reverse().toString();
		return input.equals(output) ? true : false ;
	}
	
	boolean isPallindrom1(String input) {
		StringBuilder sb = new StringBuilder(input);
		String output = sb.reverse().toString();
		return input.equals(output) ? true : false ;
	}
	
	public static void main(String[] args) {
		String str = "Maulik"; // "NamaN"; "Naman" // madam // nitin // 1221
		String output = "";
		for(int index=str.length()-1;index>=0;index--) {
			output += str.charAt(index);
		}
		
		System.out.println(output);
		if(str.equals(output))
			System.out.println("P - Yes");
		else
			System.out.println("NP");
	}
}
