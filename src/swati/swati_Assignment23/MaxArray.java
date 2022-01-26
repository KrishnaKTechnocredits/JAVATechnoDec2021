package swati.swati_Assignment23;

public class MaxArray {
	int max = 0;
	int min = 0;

	void maxArr(int num[]) {

		for (int i = 0; i < num.length - 1; i++) {
			if (num[i] < num[i + 1]) {
				if (max < num[i + 1]) {
					max = num[i + 1];
					if (min < num[i]) {
						min = num[i];
					}
				}
				else {
					if (min < num[i+1]) {
						min = num[i+1];
					}
				}
			} 
			
			else {
				if(max==num[i]) {
					if(min<num[i+1]) {
						min=num[i+1];
					}
				}
			}
		}
		System.out.println("First max is "+max);
		System.out.println("Second max is "+min);
	}

	public static void main(String[] args) {
		MaxArray arr = new MaxArray();
		int num[] = {10,7,11,99,56,46,3};
			//{1,11,3,99,66,54,22,44};
		//{ 2, 8, 12, 1, 10, 66,15, 58,21, 17 };
		arr.maxArr(num);

	}
}
