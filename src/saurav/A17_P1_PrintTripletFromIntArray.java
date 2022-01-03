package saurav;

public class A17_P1_PrintTripletFromIntArray {
	
	void getTriplet(int[] input) {
		for(int index=0; index<input.length-2; index++) {
			if(input[index]+1 == input[index+1] && input[index]+2 == input[index+2]) {/////13+1 == 14 && 13+2 == 15
				System.out.print(input[index]+"-->");
				System.out.print(input[index+1]+"-->");
				System.out.print(input[index+2]);
				System.out.println();
			}
		}	
	}
	
	public static void main(String[] a) {
		A17_P1_PrintTripletFromIntArray triplet = new A17_P1_PrintTripletFromIntArray();
		int[] input = {10,13,14,15,16,19,20,22,23,24};
		System.out.println("triplet from the given array are : ");
		System.out.println();
		triplet.getTriplet(input);
	}

}