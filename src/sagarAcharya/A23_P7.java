package sagarAcharya;

public class A23_P7 {

	public static void main(String[] args) {
		
		int[] arr1 = {10,44,-33};
		int[] arr2 = {10,44,-33,55};
		A23_P7 a23 = new A23_P7();
		a23.isIdentical(arr1, arr2);
	}
	
	void isIdentical(int[] a1,int[] a2) {
		boolean f = true;
		if(a1.length != a2.length) {
			f = false;
			System.out.println("Arrays are not identical");
			//return false;
		}
		else{
			//boolean f = true;
			for(int i = 0;i<a1.length;i++) {
				if(a1[i] == a2[i]) {
					//return true;
				}else {
					f = false;
					//return false;
				}
			}
			
		}
		if(f == true) {
			System.out.println("Arrays are identical");
		}
		
	}
	
}

/*Program 7 : Verify if 2 arrays are identical

int[] arr1 = {10,44,-33};
int[] arr2 = {10,44,-33};

output : both arrays are identical.

int[] arr3 = {10,44,-33};
int[] arr4 = {10,44,-33,55};

output : both arrays are not identical.*/