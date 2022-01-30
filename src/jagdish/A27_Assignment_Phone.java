package jagdish;

public class A27_Assignment_Phone {

	boolean allDigit(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch))
				return true;
		}
		return false;
	}

	void findvalidnumber(String phoneno) {
		if (phoneno.length() == 14) {
			if (phoneno.startsWith("+91 ")) {
				String output = phoneno.substring(4);
				if (allDigit(output) == true) {
					if (output.startsWith("9") || output.startsWith("8") || output.startsWith("8"))
						System.out.println("The No is valid: " + phoneno);
					else
						System.out.println("The No is not valid: " + phoneno);
				}
			} else
				System.out.println("The No is not valid: " + phoneno);
		} else if (phoneno.length() > 14) {
			System.out.println("Invalid No ,No is too long--> " + phoneno);
		}

		else if (phoneno.length() == 13) {
			if (phoneno.charAt(3) == ' ' && phoneno.charAt(7) == ' ' && phoneno.charAt(10) == ' ') {
				String trimno = phoneno.replaceAll(" ", "");
				if (trimno.startsWith("9") || trimno.startsWith("8") || trimno.startsWith("8")) {
					if (allDigit(trimno) == true)
						System.out.println("The No is valid: " + phoneno);
					else
						System.out.println("The No is not valid: " + phoneno);
				}
			}
		} else if (phoneno.length() > 13) {
			System.out.println("Invalid No ,No is too long--> " + phoneno);
		}

		else if (phoneno.length() == 11) {
			String output11 = phoneno.substring(1);
			if (output11.startsWith("9") || output11.startsWith("8") || output11.startsWith("8")) {
				if (allDigit(output11) == true)
					System.out.println("The No is valid: " + phoneno);
				else
					System.out.println("The No is not valid: " + phoneno);
			}
		}

		else if (phoneno.length() == 10) {
			if (phoneno.startsWith("9") || phoneno.startsWith("8") || phoneno.startsWith("7")) {
				System.out.println("The No is valid: " + phoneno);
			}
		}
	}

	public static void main(String[] args) {
		A27_Assignment_Phone findvalidnumber = new A27_Assignment_Phone();

		findvalidnumber.findvalidnumber("+91 9765463742");
		findvalidnumber.findvalidnumber("976 546 37 42232");
		findvalidnumber.findvalidnumber("976 546 37 42");
		findvalidnumber.findvalidnumber("09765463742");
		findvalidnumber.findvalidnumber("9765463742");
		findvalidnumber.findvalidnumber("+91976543742");
		findvalidnumber.findvalidnumber("976 54 637 42");
		findvalidnumber.findvalidnumber("01765437422");
		findvalidnumber.findvalidnumber("3876543451");

	}
}