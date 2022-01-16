package sham;

public class A17_Triplets {
	
	void findTrippletsFromArray(int[] arr)
	{
		System.out.println("Consecutive Triplets from Given Array are :  ");
		for(int i=0;i<arr.length-2;i++)
		{
			if(arr[i +1] == arr[i]+1 && arr[i +2] == arr[i]+2)
			{
				System.out.println(arr[i]+"->"+arr[i+1]+"->"+arr[i+2]);
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {10,13,14,15,16,19,20,22,23,24};
		A17_Triplets triplets= new A17_Triplets();
		triplets.findTrippletsFromArray(arr);
		
	}

}
