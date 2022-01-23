package vaishnavi;

public class A24_ReverseEachWord_P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hi techno hello";
		String arr[] = str.split(" ");
		for(int index = 0; index < arr.length; index ++) {
			System.out.println("Reverse word at same index :");
			for(int j = arr[index].length()-1; j >= 0; j--) {
				System.out.println(arr[index].charAt(j));
			}
		}
	}

}
