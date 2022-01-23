package vaishnavi;

public class A24_ReverseWordAndConverFirstLetterToCapital_P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Vrushali Sagar Shital";
		String[] arr = str.split(" ");
		for (int index = 0; index < arr.length; index++) {
			System.out.println("Reverse each word and Coverted first letter into capital :");
			for (int j = arr[index].length()-1;j >= 0; j--) {
				if (j == arr[index].length()-1) {
					System.out.println(Character.toUpperCase(arr[index].charAt(j)));
				} else {
					System.out.println(arr[index].charAt(j));
				}
			}
		}

	}

}
