package vrushali;

public class A21_TotalDigitsFromGivenStr {
	
	String printDigitsFromString(String name) {
		
		String temp = "";
		for(int index = 0; index<name.length(); index++) {
			if(Character.isDigit(name.charAt(index))) {
				temp = temp + name.charAt(index);
			}
		}
		return temp ;
	}
	
	public static void main(String[] args) {
		
		A21_TotalDigitsFromGivenStr totalDigitsFromGivenStr = new A21_TotalDigitsFromGivenStr();
		String totalDigits = totalDigitsFromGivenStr.printDigitsFromString("T1e3h45n9o");
		System.out.println("Total digits from the given String T1e3h45n9o is "+totalDigits);
		
	}
}
