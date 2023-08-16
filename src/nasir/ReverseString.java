package nasir;
class ReverseString{
	
	String getReverseString(String input){
		int len = input.length();
		String output="";
		for(int i=len-1; i>=0;i--){
			char ch = input.charAt(i);
			output=output+ch;
		}
		return output;
	}
	public static void main(String[]args){
		ReverseString reverseString = new ReverseString();
		String reverseOutput=reverseString.getReverseString("Nasir");
		System.out.println("Reverse order of input is "+reverseOutput);
	}
}