package ashok;

public class A15_array_assignment {
	
	int maxArrayNumber(int [] num) {
		int maxnumber = 0;
		for(int index = 0 ; index<num.length; index++) {
			if(maxnumber < num[index]) {
				maxnumber = num[index];
			}
		}
			return maxnumber;
	}
	
	int minArrayNumber(int [] num) {
		int minnumber = num[0];
		for(int index = 0 ; index<num.length; index++) {
			if(num[index] < minnumber) {
				minnumber = num[index];
			}
		}
			return minnumber;
	}
	
	int countArrayPositiveNumber(int [] num) {
		int count = 0;
		for(int index = 0 ; index<num.length; index++) {
			if(count <= num[index]) {
				count++;
			}
		}
			return count;
	}
	
	int sumArrayPositiveNumber(int [] num) {
		int count = 1;
		int sum = 0 ;
		for(int index = 0 ; index<num.length; index++) {
			if(count <= num[index]) {
				sum = sum + num[index];
			}
		}
			return sum;
	}
	
	int sumEvenArrayPositiveNumber(int [] num) {
		int count = 1;
		int evensum = 0 ;
		for(int index = 0 ; index<num.length; index++) {
			if(count <= num[index] && num[index] % 2 == 0 ) {
				evensum = evensum + num[index];
			}
		}
			return evensum;
	}
	
	String nameMaxLenght(String [] arr2) {
		
		 int j = 0;
		    for (j = 0; j <= arr2.length; j++) {
		        if (arr2[j].length() > arr2[j + 1].length()) {
		                return (arr2[j]);
		            }
		        }
		        return null;
		    }

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A15_array_assignment a15_array_assignment = new A15_array_assignment();
		int arr[] = {12,-11,99,11,23,-44};
		int arr1[] = {10,20,-33,-55,2};
		String[] arr2 = {"Karan", "Shweta", "Pallavi", "Abhishek", "Sagar"};
		
		int maxnumber = a15_array_assignment.maxArrayNumber(arr);
		System.out.println("Program 1 : return maximum number from give array \n" + maxnumber);
		
		int minnumber = a15_array_assignment.minArrayNumber(arr);
		 a15_array_assignment.minArrayNumber(arr);
		System.out.println("Program 2 : return minimum number from give array \n" + minnumber);
		
		int count = a15_array_assignment.countArrayPositiveNumber(arr);
		a15_array_assignment.countArrayPositiveNumber(arr);
		System.out.println("Program 3: return count of positive numbers from given array. \n" + count);
		
		int sum = a15_array_assignment.sumArrayPositiveNumber(arr1);
		a15_array_assignment.sumArrayPositiveNumber(arr1);
		System.out.println("Program 4: return sum of positive numbers from given array. \n" + sum);
		
		int evensum =  a15_array_assignment.sumEvenArrayPositiveNumber(arr1);
		System.out.println("Program 5: return sum of even positive numbers from given array. \n" + evensum);
	
		String a= a15_array_assignment.nameMaxLenght(arr2);
		System.out.println("Program 6 : return name having maximum length from given array. \n" + a);

	}

}
