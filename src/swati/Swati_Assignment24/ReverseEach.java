package swati.Swati_Assignment24;

public class ReverseEach {

	public static void main(String[] args) {
		String str="Vrushali Sagar Shital";
		String [] arr= str.split(" ");
		for(int i=0;i<arr.length;i++) {
			for(int j=arr[i].length()-1;j>=0;j--) {
				if (j == arr[i].length()-1) {
					System.out.println(Character.toUpperCase(arr[i].charAt(j)));
				} else {
					System.out.println(arr[i].charAt(j));
				}
				 
				//System.out.println(arr[i].charAt(j));
			}
		}
	}

	}


