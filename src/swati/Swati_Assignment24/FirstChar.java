package swati.Swati_Assignment24;

public class FirstChar {

	public static void main(String[] args) {
		String str="anvit harsh dipali";
		String [] arr= str.split(" ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length();j++) {
				if (j == 0) {
					System.out.println(Character.toUpperCase(arr[i].charAt(j)));
				} else {
					System.out.println(arr[i].charAt(j));
				}
				 
				//System.out.println(arr[i].charAt(j));
			}
		}
	}

}
