package archana;

public class Ass24_P2_CountVowelsInString {
	

	void spiltString(String input) {
		String[] arr = input.split(" ");
		for (int index = 0; index < arr.length; index++) {			
			int count = 0;
			for (int ind = 0; ind < arr[index].length(); ind++) {
				char ch = arr[index].charAt(ind);
				if ( ch == 'a' ||  ch == 'e' ||  ch == 'i'  || ch == 'o'|| ch == 'u') {						 
					count++;
				}
			}
			System.out.println(arr[index] + "--> " + count);
		}
	}

	public static void main(String[] args) {
		Ass24_P2_CountVowelsInString ass24 = new Ass24_P2_CountVowelsInString();
		ass24.spiltString("aashvi technocredits");
	}
}
