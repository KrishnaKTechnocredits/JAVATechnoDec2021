package monikaArkade;

public class A15_P6_Assignment15 {
	static String[] arr = {"Karan", "Shweta", "Pallavi", "Abhishek", "Sagar"};
	
	String maxlengthString(String[] arr) {
		int maxlength = 0;
		String maxlengthString = null;
		
		for(int index=0;index<arr.length;index++) {
			if(arr[index].length()>maxlength) {
				maxlength = arr[index].length();
				maxlengthString = arr[index];
			}
		}
		System.out.println("Maximum Length String : "+maxlengthString);
		return maxlengthString;
	}
	
	public static void main(String[] args) {
		A15_P6_Assignment15 maxLenString = new A15_P6_Assignment15();
		maxLenString.maxlengthString(arr);
	}
}
