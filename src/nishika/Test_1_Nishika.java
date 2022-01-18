package nishika;

public class Test_1_Nishika {
	
	void finduniquechar(int[] arr) {
		for (int index = 0; index < arr.length; index++) {
			boolean flag = true;

			for (int input = 0; input < index; input++) {
				if (arr[index] == arr[input]) {
					//System.out.println(arr[index]);
					flag = false;
				}
			}
			if (flag == true) {
				System.out.println(arr[index]);
			}
		}
	}
	
	void findPairs(int[] array) {
		int sum = 6;
		
		for(int i=0 ; i < array.length ; i++) {
			
			for(int j=i+1 ; j <array.length ; j++) {
				
				if(array[i] + array[j] == sum) {
					System.out.println(array[i]+"..."+array[j]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Test_1_Nishika test = new Test_1_Nishika();
		int[] arr = {5,2,2,2,1};
		test.finduniquechar(arr);
		int[] array = {5,1,2,7,6,3,4,9};
		test.findPairs(array);
	}
}
