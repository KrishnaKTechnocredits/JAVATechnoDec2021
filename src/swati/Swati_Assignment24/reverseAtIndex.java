package swati.Swati_Assignment24;

public class reverseAtIndex {

	public static void main(String[] args) {
		String str="Hi techno hello";
		String [] arr= str.split(" ");
		for(int i=0;i<arr.length;i++) {
			for(int j=arr[i].length()-1;j>=0;j--) {
				System.out.println(arr[i].charAt(j));	
			}
		}


	}

}
