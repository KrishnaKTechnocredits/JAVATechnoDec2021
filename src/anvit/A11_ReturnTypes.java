package anvit;

public class A11_ReturnTypes {
	
	int getFirstOccurrence(String input, char ch) {
		int temp = -1 ;
		for (int index=0; index <= input.length()-1; index++) {
			if (input.charAt(index) == ch) {
				temp = index;
				break;
			}
		}
		return temp;
	}

	int getLastOccurrence(String input, char ch) {
		int temp = -1 ;
		for (int index=input.length()-1; index >= 0; index--) {
			if (input.charAt(index) == ch) {
				temp = index;
				break;
			}
		}
		return temp;
	}

	boolean getTrueOrFalse(String input, char ch) {
		boolean flag = false ;
		for (int index=0; index <= input.length()-1; index++) {
			if (input.charAt(index) == ch) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	int getTotalOccurrence(String input, char ch) {
		int temp = 0 ;
		for (int index=0; index <= input.length()-1; index++) {
			if (input.charAt(index) == ch) {
				temp++;
			}
		}
		return temp;
	}

	String setPrintOccurrence(String str, char ch, String occ) {
		String returnStr = "";
		boolean charPresent = getTrueOrFalse(str, ch);
		if (charPresent == true) {
			if (occ == "first") {
				int firstoccurrence = getFirstOccurrence(str, ch);
				returnStr = "first occurrence index of '" + ch + "' in string '" + str + "' is " + firstoccurrence;	
			} 
			else if (occ == "last") {
				int lastoccurrence = getLastOccurrence(str, ch);
				returnStr = "last occurrence index of '" + ch + "' in string '" + str + "' is " + lastoccurrence;	
			} 
			else if (occ == "total") {
				int totaloccurrence = getTotalOccurrence(str, ch);
				returnStr = "Total occurrence of '" + ch + "' in string '" + str + "' is " + totaloccurrence;	
			}
			else if (occ == "check") {
				returnStr = "'" + ch + "' is absent in '" + str + "'";
			}
		} else {
			returnStr = "'" + ch + "' is absent in '" + str + "'";
		}
		return returnStr;
	}

	public static void main(String[] args) {
		A11_ReturnTypes a11_ReturnType = new A11_ReturnTypes();
		System.out.println(a11_ReturnType.setPrintOccurrence("technocredits", 'c', "first"));
		System.out.println(a11_ReturnType.setPrintOccurrence("technocredits", 'e', "last"));
		System.out.println(a11_ReturnType.setPrintOccurrence("technocredits", 'c', "total"));
		System.out.println(a11_ReturnType.setPrintOccurrence("technocredits", 'r', "check"));
		System.out.println(a11_ReturnType.setPrintOccurrence("technocredits", 'q', "check"));
	}
}

