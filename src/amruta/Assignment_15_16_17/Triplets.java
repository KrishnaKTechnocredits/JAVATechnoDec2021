/*  Assignment - 17 : 1st Jan'2022

Program 1: Print all triplets in which all 3 numbers are consecutive.

Sample input : int[] arr = {10,13,14,15,16,19,20,22,23,24};
output : 13 -> 14 -> 15
              14 -> 15 -> 16
              22 -> 23 -> 24  
*/

package amruta.Assignment_15_16_17;
class Triplets{

	void findTriplets(int[] arr){
		
		for(int index = 0; index < arr.length-2; index++){
			
			if(arr[index+1]==arr[index]+1 && arr[index+2]==arr[index]+2){
				System .out.println("Consecutive numbers are : "+arr[index]+"-->"+arr[index+1]+"-->"+arr[index+2]);
			}	
		}
	}
	
	public static void main(String[] args){
		int[] arr = {10,13,14,15,16,19,20,22,23,24};
		
		Triplets triplets = new Triplets();
		triplets.findTriplets(arr);
	}

}