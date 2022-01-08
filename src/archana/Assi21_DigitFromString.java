package archana;

public class Assi21_DigitFromString {
	
	String digitsFromString(String name) {

		String temp = "";
		for(int index = 0; index<name.length(); index++) {
			if(Character.isDigit(name.charAt(index))) {
				temp = temp + name.charAt(index);
			}
		}
		return temp ;
	}

	public static void main(String[] args) {

		Assi21_DigitFromString ass21 = new Assi21_DigitFromString();
		String totalDigits = ass21.digitsFromString("T1e3h45n9o");
		System.out.println("Total digits in string T1e3h45n9o : "+totalDigits);

	}

}





