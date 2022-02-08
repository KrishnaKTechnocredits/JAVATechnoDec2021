package hevin;

public class A30_UniqueElements {
	
	void getUnique(int arr[]) {
		
		for (int i = 0; i < arr.length; i++) {
			
			boolean isUnique = false;
			
			for (int j = 0;j < i; j++) {
				if(arr[i] == arr[j]) {
					isUnique = true;
					break;
				}
			}
			if(!isUnique) {
				System.out.print(arr[i]+" ");
			}
		}
	}
		
	
	public static void main(String[] args) {
		A30_UniqueElements obj = new A30_UniqueElements();
		int[] input = { 19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0 };
		obj.getUnique(input);
		
	}
}
