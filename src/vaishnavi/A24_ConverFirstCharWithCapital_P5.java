package vaishnavi;

public class A24_ConverFirstCharWithCapital_P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "anvit harsh dipali";
		String[] arr = str.split(" ");
		for (int index = 0; index < arr.length; index++) {
			System.out.println("Coverted first letter into capital :");
			for (int j = 0; j < arr[index].length(); j++) {
				if (j == 0) {
					System.out.println(Character.toUpperCase(arr[index].charAt(j)));
				} else {
					System.out.println(arr[index].charAt(j));
				}
			}
		}

	}

}
