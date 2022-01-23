package vaishnavi;

public class A24_TotalWords_P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A24_TotalWords_P1 a24_TotalWords_P1 = new A24_TotalWords_P1();
		String str = "Hi Hello";
		String arr[] = str.split(" ");
		System.out.println("Total words in given string are " + arr.length);
		System.out.println("-----------------------------------------------");
		for (int index = 0; index < arr.length; index++) {
			System.out.println("Total characters length in a given word is " + arr[index].length());
			for (int j = 0; j < arr[index].length(); j++) {
				System.out.println(arr[index].charAt(j));

			}
			System.out.println("------------------------------------------------------");
		}
	}

}
