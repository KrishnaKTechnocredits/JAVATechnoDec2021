package vaishnavi;

public class A24_ReverseCaseOfEachCharInWord_P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "TeCHnoCReditS";
		String[] arr = str.split(" ");
		for (int index = 0; index < arr.length; index++) {
			System.out.println("Reverse case of each character in given word :");
			for (int j = 0;j < arr[index].length(); j++) {
				char ch = arr[index].charAt(j);
				if (Character.isUpperCase(ch)) {
					System.out.println(Character.toLowerCase(ch));
				} else {
					System.out.println(Character.toUpperCase(ch));
				}
			}
		}

	}


}
