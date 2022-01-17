package archana;

public class Ass24_P1_FindLengthOfEachWord {
	
	void findWordAndLength(String str) {
		String[] arr = str.split(" ");
		for (int index = 0; index < arr.length; index++) {
			String str1 = arr[index];
			System.out.println(str1 + "--> " + str1.length());
		}
	}

	public static void main(String[] args) {
		Ass24_P1_FindLengthOfEachWord ass24 = new Ass24_P1_FindLengthOfEachWord();
		ass24.findWordAndLength("Hi Hello");
	}
}
