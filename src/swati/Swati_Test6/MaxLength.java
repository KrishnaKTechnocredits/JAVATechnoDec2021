package swati.Swati_Test6;

public class MaxLength {

	public static void main(String[] args) {

		String name = "good morning technocredits hi hello";
		String[] arr = name.split(" ");
		String max = "";
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i].length() < arr[i + 1].length() && max.length() < arr[i + 1].length()) {
				max = arr[i + 1];
			}
		}
		System.out.println(max);

	}

}
