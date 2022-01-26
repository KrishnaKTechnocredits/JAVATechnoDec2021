package swati.Swati_Assignment24;

public class ReverseEveryCase {

	public static void main(String[] args) {
		String str="TeCHnoCReditS";
		String [] arr= str.split(" ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length();j++) {
				char c=arr[i].charAt(j);
				if(Character.isUpperCase(c)) {
					System.out.println(Character.toLowerCase(c));
				}
				else {
					System.out.println(Character.toUpperCase(c));
				}
				//System.out.println(arr[i].charAt(j));
			}
		}
	}

	}

