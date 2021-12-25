package naquibalam;

public class A11_ReturnTypeCheck {

	int getFirstOccurrence(String input, char charCheck) {
		int returnValue = -1 ;
		for (int i=0; i <= input.length()-1; i++) {
			if (input.charAt(i) == charCheck) {
				returnValue = i;
				break;
			}
		}
		return returnValue;
	}
	
	int getLastOccurrence(String input, char charCheck) {
		int returnValue = -1 ;
		for (int i=input.length()-1; i >= 0; i--) {
			if (input.charAt(i) == charCheck) {
				returnValue = i;
				break;
			}
		}
		return returnValue;
	}
	
	boolean getOccurrence(String input, char charCheck) {
		boolean returnValue = false ;
		for (int i=0; i <= input.length()-1; i++) {
			if (input.charAt(i) == charCheck) {
				returnValue = true;
				break;
			}
		}
		return returnValue;
	}
	
	int getTotalOccurrence(String input, char charCheck) {
		int returnValue = 0 ;
		for (int i=0; i <= input.length()-1; i++) {
			if (input.charAt(i) == charCheck) {
				returnValue++;
			}
		}
		return returnValue;
	}
	
	String setPrintOccurrence(String stringToCheckIn, char charToCheck, String occurrenceCheck) {
		String returnString = "";
		boolean charPresent = getOccurrence(stringToCheckIn, charToCheck);
		if (charPresent == true) {
			if (occurrenceCheck == "first") {
				int firstoccurrence = getFirstOccurrence(stringToCheckIn, charToCheck);
				returnString = "The first occurrence index of character '" + charToCheck + "' in string '" + stringToCheckIn + "' is " + firstoccurrence;	
			} 
			else if (occurrenceCheck == "last") {
				int lastoccurrence = getLastOccurrence(stringToCheckIn, charToCheck);
				returnString = "The last occurrence index of character '" + charToCheck + "' in string '" + stringToCheckIn + "' is " + lastoccurrence;	
			} 
			else if (occurrenceCheck == "total") {
				int totaloccurrence = getTotalOccurrence(stringToCheckIn, charToCheck);
				returnString = "The total occurrence of character '" + charToCheck + "' in string '" + stringToCheckIn + "' is " + totaloccurrence;	
			}
			else if ((occurrenceCheck == "presentCheck")) {
				returnString = "'" + charToCheck + "' is present in '" + stringToCheckIn + "'";
			}
		} else {
			returnString = "'" + charToCheck + "' is not present in '" + stringToCheckIn + "'";
		}
		return returnString;
	}
	
	public static void main(String[] args) {
		A11_ReturnTypeCheck a11_ReturnTypeCheck = new A11_ReturnTypeCheck();
		System.out.println(a11_ReturnTypeCheck.setPrintOccurrence("Naquibalam", 'a', "first"));
		System.out.println(a11_ReturnTypeCheck.setPrintOccurrence("Naquibalam", 'a', "last"));
		System.out.println(a11_ReturnTypeCheck.setPrintOccurrence("Naquibalam", 'a', "total"));
		System.out.println(a11_ReturnTypeCheck.setPrintOccurrence("Naquibalam", 'a', "presentCheck"));
		System.out.println(a11_ReturnTypeCheck.setPrintOccurrence("Naquibalam", 'z', "presentCheck"));
	}
}
