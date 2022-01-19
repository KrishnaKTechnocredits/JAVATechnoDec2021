package vaishnavi;

public class A24_TotalVowels_P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A24_TotalVowels_P2 a24_TotalVowels_P2 = new A24_TotalVowels_P2();
		String str = "aashvi technocredits";
		String arr[] = str.split(" ");
		System.out.println("Total words in given string array are " + arr.length);
		System.out.println("------------------------------------------");
		for (int index = 0; index < arr.length; index++) {
			int cnt = 0;
			System.out.println("Total characters count available in a word is " + arr[index].length());
			for (int j = 0; j < arr[index].length(); j++) {
				char ch = arr[index].charAt(j);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					cnt++;
				}
			}
			System.out.println("Total vowels in a word is " + cnt);
			System.out.println("-----------------------------------------");
		}
	}

}
