package ashok;

public class A24_Program01_Split {

	void findTotalword(String str) {
		String arr[] = str.split(" ");
		System.out.println("Total words : " + arr.length);
		for (int index = 0; index < arr.length; index++) {
			int lenght = arr[index].length();
			System.out.println("Length of word " + arr[index] + " --> " + lenght);

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A24_Program01_Split splitpr = new A24_Program01_Split();
		System.out.println("Output of Program 1: ");
		splitpr.findTotalword("Hi Hello");

	}

}
