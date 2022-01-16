package shital;

class A17_PrintAllTriplets{

	void findTripletsInGivenArray(int[] arr) {
		for(int index=0;index<arr.length-2;index++){
			int nextvalue=arr[index+1];
			int nextToNextValue=arr[index+2];
			
			if(nextvalue==arr[index]+1 && nextToNextValue==nextvalue+1){
				System.out.println(arr[index]+"--"+nextvalue+"--"+nextToNextValue);
			}
		}
	}

	public static void main(String[] args) {
		A17_PrintAllTriplets printAllTriplets=new A17_PrintAllTriplets();
		int[] arr = { 10, 13, 14, 15, 16, 19, 20, 22, 23, 24 };
		printAllTriplets.findTripletsInGivenArray(arr);

	}
}