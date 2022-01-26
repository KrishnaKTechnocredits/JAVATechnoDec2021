package sagarAcharya;

public class A24_ConvertAndReverse {

	public static void main(String[] args) {
		A24_ConvertAndReverse a24 = new A24_ConvertAndReverse();
		a24.concludeCap("anvit harsh dipali");
		//a24.convertCapMethod("sagar");
		a24.concludeCap1("anvit harsh dipali");
		a24.concludeCap2_P6("Vrushali Sagar Shital");
		a24.convertCase("TeCHnoC");
	}
	
	//P5
	void concludeCap(String input) {
		String[] str = input.split(" ");
		String temp = "";
		for(int i = 0;i<str.length;i++) {
			char ch = str[i].charAt(0);
			ch = Character.toUpperCase(ch);
			temp += ch + str[i].substring(1) + " ";
		}
		temp = temp.trim();
		System.out.println(temp);
	}
	
	//OR
	
	String convertCapMethod(String input) {
		String temp = "";
		temp += Character.toUpperCase(input.charAt(0)) + input.substring(1);
		//System.out.println(temp);
		return temp;
	}
	
	void concludeCap1(String input) {
		String[] str = input.split(" ");
		String temp = "";
		for(int i = 0;i<str.length;i++) {
			temp += convertCapMethod(str[i]) + " ";
		}
		temp = temp.trim();
		System.out.println(temp);
	}
	
	//P6
	String reverseMethod(String input) {
		String temp = "";
		for(int i = input.length()-1;i>=0;i--) {
			temp += input.charAt(i);
		}
		temp = convertCapMethod(temp);
		return temp;
	}
	
	void concludeCap2_P6(String input) {
		String[] str = input.split(" ");
		String temp = "";
		for(int i = 0;i<str.length;i++) {
			//String word = str[i];
			temp += reverseMethod(str[i]) + " ";
		}
		temp = temp.trim();
		System.out.println(temp);
	
	}
	
	void convertCase(String input) {
		String output = "";
		for(int i = 0;i<input.length();i++) {
			char ch = input.charAt(i);
			if(Character.isLetter(ch)) {
				if(Character.isUpperCase(ch)) {
					output += Character.toLowerCase(ch);
				}else {
					output += Character.toUpperCase(ch);
				}
			}
		}
		System.out.println(output);
	}
}

	/*5. WAP to convert first character of word with capital letter
	Input    : "anvit harsh dipali"
	Output : "Anvit Harsh Dipali"

	6. WAP to reverse each word and convert first letter of each word into capital
	Input    : "Vrushali Sagar Shital"
	Output : "IlahsurV Ragas LatihS"

	7. WAP to reverse the case of each char in a given word
	Input    : "TeCHnoC**/