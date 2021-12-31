package debasmita;

public class A15_Array {
	
	int MaxNum(int a[]) {
		int max=a[0];
		for(int index=1;index<a.length;index++) {
			 if(max<a[index]) {
				 max=a[index];
			 }
		}
		return max;
	}
	int MinNum(int a[]) {
		int min=a[0];
		for(int index=1;index<a.length;index++) {
			 if(min>a[index]) {
				 min=a[index];
			 }
		}
		return min;
	}
	int FindPositiveNum(int arr[]) {
		int count=0;
		for(int index=0;index<arr.length;index++) {
			 if(arr[index]>0) {
				 count++;
			 }
		}
		return count;
	}
	int SumOfPositiveNum(int arr1[]) {
		int sum=0;
		int num=0;
		for(int index=0;index<arr1.length;index++) {
			 if(arr1[index]>0) {
				 num=arr1[index];
				 sum=sum+num;
			 }
		}
		return sum;
	}
	int SumOfEvenPositiveNum(int arr2[]) {
		int sum=0;
		int num=0;
		for(int index=0;index<arr2.length;index++) {
			 if(arr2[index]>0 && arr2[index]%2==0) {
				 num=arr2[index];
				 sum=sum+num;
			 }
		}
		return sum;
	}
	String MaximumLength(String[] str) {
		String maxString=str[0];
		int maxLength=str[0].length();
		for(int index=1;index<str.length; index++) {
			if(maxLength<str[index].length()) {
				maxString=str[index];
				maxLength=str[index].length();
			}
		}
		return maxString;
	}

	public static void main(String[] args) {
		A15_Array array=new A15_Array();
		int a[] = {45,16,-56,5,3,96,82};
		int num=array.MaxNum(a);
		System.out.println("The maximum number in the given array is: "+num);
		int num1=array.MinNum(a);
		System.out.println("The minimum number in the given array is: "+num1);
		int arr[]= {12,-11,99,11,23,-44};
		int num2=array.FindPositiveNum(arr);
		System.out.println("Positive numbers in the given array are: "+num2);
		int arr1[]= {10,20,-33,-55,2};
		int num3=array.SumOfPositiveNum(arr1);
		System.out.println("Sum of Positive numbers in the given array are: "+num3);
		int arr2[]={10,13,-14,-20,22,3};
		int num4=array.SumOfEvenPositiveNum(arr2);
		System.out.println("Sum of Even Positive numbers in the given array are: "+num4);
		String arr3[]= {"Karan", "Shweta", "Pallavi", "Abhishek", "Sagar"};
		String s=array.MaximumLength(arr3);
		System.out.println("The maximum length of name in the given array is: "+s);
		
	}

}
