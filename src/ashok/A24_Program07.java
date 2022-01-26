package ashok;

public class A24_Program07 {
	
	void swapCasesOfWords(String str) {
		String temp = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch))
					temp += Character.toLowerCase(ch);
				else
					temp += Character.toUpperCase(ch);
			}
		}
		System.out.println("The New String with Swapped Cases : " + temp);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A24_Program07 assignment = new A24_Program07();
		System.out.println("Output of Program 7: ");
		assignment.swapCasesOfWords("TeCHnoCReditS");

	}

}
