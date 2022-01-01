package kalyani;

class A17_PrintTripletsArray {

	void getTripletsInArray(int [] arr) {
	for (int i = 0; i < arr.length-2; i++) {
			if ((arr[i+1] == (arr[i] + 1)) && (arr[i+2] == (arr[i] + 2))) {
				System.out.println((arr[i]) + "  " + (arr[i+1]) + "  " + (arr[i+2]));
			}
		}
	}
		
	public static void main(String args[]){
		A17_PrintTripletsArray assign17 = new A17_PrintTripletsArray();
		int [] arr={10,13,14,15,16,19,20,22,23,24};
		assign17.getTripletsInArray(arr);
	}
}