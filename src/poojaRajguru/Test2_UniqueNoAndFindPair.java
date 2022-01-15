package poojaRajguru;

public class Test2_UniqueNoAndFindPair {	
	void sum(int[] arr1){
		for(int index = 0; index < arr1.length - 1; index++){
			for(int inner = 1; inner < arr1.length - 1 ; inner++){
				
				if(arr1[index] + arr1[inner] == 6 ){
				System.out.println("{" + arr1[index] + " , " + arr1[inner] + "}");
				
				}
			}
		}
	}	
	void first(int[] arr2){		
		for(int index=0; index<arr2.length; index++) {
			int count = 0;
			for(int innerindex=0; innerindex<arr2.length; innerindex++){
				if(arr2[index] == arr2[innerindex])
					count++;
			}
			if(count==1) {
				System.out.print(arr2[index] + " ");
			}
		}
	}
	public static void main(String[] args) {
		Test2_UniqueNoAndFindPair test2 = new Test2_UniqueNoAndFindPair();		
		int[] arr1 = { 5,1,2,7,6,3,4,9};
		int[] arr2 = {5,8,1,2,4,3,2,1};
		System.out.println("The pairs in an array of integers whoes sum is equal to 6 are : " );
		test2.sum(arr1);
		System.out.println("The single occurence elements from the array are : " );
		test2.first(arr2);

	}
	
	
	
}
