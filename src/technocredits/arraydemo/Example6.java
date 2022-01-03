package technocredits.arraydemo;

public class Example6 {

	static void display(int[] arr) {
		for(int index=0;index<arr.length;index++) {
			boolean flag = true;
			for(int innerIndex=index+1;innerIndex<arr.length;innerIndex++) {
				if(arr[index] < arr[innerIndex]) {
					System.out.println(arr[index] + " -> " + arr[innerIndex]);
					flag = false;
					break;
				}
			}
			if(flag)
				System.out.println(arr[index] + "--> 0");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {12,4,3,2,5,19,118,17,22};
		Example6.display(arr);
	}
}
