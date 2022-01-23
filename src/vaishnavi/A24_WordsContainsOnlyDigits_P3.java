package vaishnavi;

public class A24_WordsContainsOnlyDigits_P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A24_WordsContainsOnlyDigits_P3 a24_WordsContainsOnlyDigits_P3 = new A24_WordsContainsOnlyDigits_P3();
		String str = "Te1c2h C94re3";
		String[] arr = str.split(" ");
		for (int index = 0; index < arr.length; index++) {
			String temp = "";
			for (int j = 0; j < arr[index].length(); j++) {
				char ch = arr[index].charAt(j);
				if(Character.isDigit(ch))
				{
					temp = temp + ch;
				}

			}
			System.out.println("Only digits from given word is " +temp);

		}
	}
}
