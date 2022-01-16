package anvit;

public class Anvit_Test2 {
	
	void pairsInArray(int[] arr){
		for(int i=0;i<arr.length;i++) {
			int value = arr[i];
			for(int j=i+1;j<arr.length;j++) {
				int num=arr[j];
				int sum = value + num;
				if(sum==6) {
					System.out.print("{"+value+","+num+"}"+" ");
				}
			}
		}
	}
	
	void singleOccurance(int[] array) {
		for(int i=0;i<array.length;i++) {
			int value = array[i];
			int cnt = 0;
			for(int j=0;j<array.length;j++) {
				int num = array[j];
				if(value==num)
					cnt++;
			}
			if(cnt<=1)
				System.out.print(value+",");
		}
	}
	
	public static void main(String[] args) {
		Anvit_Test2 anvit_Test2 = new Anvit_Test2();
		int[] arr = {5,1,2,7,6,3,4,9};
		anvit_Test2.pairsInArray(arr);
		System.out.println();
		int[] array = {5,8,1,2,4,3,2,1};
		anvit_Test2.singleOccurance(array);
	}
}
