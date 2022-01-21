package shamli;
import java.util.Arrays;

public class Assignment23Program7 {
	
	void isArrayIdentical(int[] arr1, int[] arr2)
	{
		String s1=Arrays.toString(arr1);
		String s2=Arrays.toString(arr2);
		if(s1.equals(s2))
			System.out.println("Given arrays are identical");
		else
			System.out.println("Given arrays are not identical");
		/*boolean flag=true;
		if(arr1.length==arr2.length)
		{
			for(int index=0;index<arr1.length;index++)
			{
				if(arr1[index]!=arr2[index])
					flag=false;
			}
			if(flag==false)
				System.out.println("Given arrays are identical");
		}
		else
		{
			System.out.println("Given arrays are not identical");
		}*/
	}

	public static void main(String[] args) {
		Assignment23Program7 assignment23program7= new Assignment23Program7();
		int[] arr1= {10,25,36};
		int[] arr2= {10,25,36};
		int[] arr3= {20,64,70,88};
		assignment23program7.isArrayIdentical(arr1,arr2);
		assignment23program7.isArrayIdentical(arr1,arr3);
	}
}
