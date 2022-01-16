package hevin;

public class Exam_Two{
	
    static void findThePairs(int inputArray[], int inputNumber)
    {
        System.out.println("Pairs of elements whose sum is "+inputNumber+" are : ");
 
        for (int i = 0; i < inputArray.length; i++)
        {
            for (int j = i+1; j < inputArray.length; j++)
            {
                if(inputArray[i]+inputArray[j] == inputNumber)
                {
					System.out.println(inputArray[i]+ " " +inputArray[j]);
                }
            }
        }
    }
 
	static void getSingleOccurrenceNum(int[] arr) {
		System.out.println("Single Occurrence Element From the Array is below :");
		for(int i=0; i<arr.length; i++) {
			int count =0;
			for(int inneri=0; inneri<arr.length; inneri++) {
				if(arr[i] == arr[inneri])
					count++;
			}
			if(count==1) {
				System.out.print(arr[i]);
			}
		}
	}
 
    public static void main(String[] args) {
    	
        findThePairs(new int[] {5,1,2,7,6,3,4,9}, 6);
		getSingleOccurrenceNum(new int[] {5,8,1,2,4,3,2,1});
    }
}
