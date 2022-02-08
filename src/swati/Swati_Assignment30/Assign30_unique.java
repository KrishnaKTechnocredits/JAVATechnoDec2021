package swati.Swati_Assignment30;

public class Assign30_unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 1, 9, 1, 3, 16, 3, 9, 59, 4, 4, 16 };
		int[] temp = new int[input.length];
		// using replace with 0
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] == input[j]) {
					input[j] = 0;
				}
			}

		}
		for (int i = 0; i < input.length; i++) {
			if (input[i] != 0)
				System.out.println(input[i]);
		}

		// using temp array approach;
		/*
		 * int var=0; for(int i=0;i<input.length;i++) { boolean flag=false; for(int
		 * j=0;j<temp.length;j++) {
		 * 
		 * if(input[i]==temp[j]) { flag=true; break; }
		 * 
		 * } if(!flag) { temp[i]=input[i]; }
		 * 
		 * } for(int k=0;k<temp.length;k++) { if(temp[k]!=0)
		 * System.out.println(temp[k]); }
		 */

	}

}
