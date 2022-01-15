package debasmita;

public class ProgramTest2 {
	void singleOccurence(int arr[]){
    	
    	for(int i=0;i<arr.length;i++) {
    		int count=0;
    		for(int j=0;j<arr.length;j++) {
    			if(arr[i]==arr[j]) 
    				count++;
    		}
    		if(count==1) {
    			System.out.println(arr[i]);
    		}
    	}
    }
    void sumOfNumbers(int arr1[],int sum) {

    	for(int i=0;i<arr1.length;i++) {
    		for(int j=i+1;j<arr1.length;j++) {
    			if(sum ==arr1[i]+arr1[j]) {
    				System.out.println(arr1[i] + " " +arr1[j]);
    			}
    		}
         }
    }

    public static void main(String[] args) {
         int arr[]={5,8,1,2,4,3,2,1};
         ProgramTest2 t5=new ProgramTest2();
         t5.singleOccurence(arr);
         System.out.println("***********************");
         int arr1[]={5,1,2,7,6,3,4,9};
         t5.sumOfNumbers(arr1, 6);
    }
}


