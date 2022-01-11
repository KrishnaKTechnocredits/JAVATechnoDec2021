package nishika;

public class Test_1_Nishika {
	void finduniquechar(int[] arr) {
		for (int index = 0; index < arr.length; index++) {
			boolean flag = true;

			for (int input = 0; input < index; input++) {
				if (arr[index] == arr[input]) {
					//System.out.println(arr[index]);
					flag = false;
				}
			}
			if (flag == true) {
				System.out.println(arr[index]);
			}
		}
	}
	
	public static void main(String[] args) {
		Test_1_Nishika test = new Test_1_Nishika();
		int[] arr = {5,2,2,2,1};
		test.finduniquechar(arr);
	}
}
