package technocredits.stringdemo;

public class Example4 {

	String[] getOutput(String[] arr) {
		String[] output = new String[arr.length];
		for (int i = 0; i < output.length; i++) {
			output[arr.length - (i + 1)] = arr[i];
			// 3 -> 0
			/*
			 * output[arr.length-(i+1)] = arr[1];// 2 -> 1 output[arr.length-(i+1)] =
			 * arr[2];// 1 -> 2 output[arr.length-(i+1)] = arr[3];// 0 -> 3
			 */ }
		return output;
	}

	String[] getOutput1(String[] arr) {
		String[] output = new String[arr.length];
		for (int i = 0, j = arr.length - 1; i < arr.length && j >= 0; i++, j--) {
			output[j] = arr[i];
		}
		return output;
	}

	void getOutput2(String[] arr) {
		for (int i = 0, j = arr.length-1; i >= j; i++, j--) {
			String temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		for (int i = 0, j = arr.length-1; i >= j; i++, j--) {
			String temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

	public static void main(String[] args) {
		String[] input = { "Gaurav", "Saurav", "Yogiraj", "Sagar" };
		new Example4().getOutput2(input);
		System.out.println(input);
		// "Sagar", "Yogiraj", "Saurav" , "Gaurav"
		
		String name = "Maulik";
		String lname = "Kanani"; // Maulik" Kanani
		
		System.out.println("\"Maulik Kanani\"");
	}
}
