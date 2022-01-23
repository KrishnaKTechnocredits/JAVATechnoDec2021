package swati.Swati_Assignment24;

public class TotalWords {

	public static void main(String[] args) {
		TotalWords t = new TotalWords();
		String str = "Hi Hello";
		String arr[] = str.split(" ");
		System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Total Length of words " +arr[i].length());
			for(int j=0;j<arr[i].length();j++) {
				System.out.println(arr[i].charAt(j));
			}
		}

	}

}
