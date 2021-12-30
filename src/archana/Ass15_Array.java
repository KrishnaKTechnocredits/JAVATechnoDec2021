package archana;

public class Ass15_Array {
	int max;

	int maxNumber(int[] num) {

		max = num[0];
		for (int index = 1; index < num.length; index++) {

			if (max < num[index]) {
				max = num[index];
			}
		}
		return max;
	}

	int minNumber(int[] num) {

		int min = num[0];

		for (int index = 1; index < num.length; index++) {

			if (min > num[index]) {
				min = num[index];
			}

		}
		return min;
	}

	String positivenum() {
		int cnt = 0;
		int sum = 0;
		int[] arr = { 12, -11, 99, 11, 23, -44 };
		for (int index = 0; index < arr.length; index++) {

			if (arr[index] > 0) {
				cnt++;
				sum = sum + arr[index];
			}
		}

		return "Positive numbers count : " + cnt + " and Sum :" + sum;

	}

	int evenpositivenum() {
		int sum = 0;
		int[] arr = { 10, 20, -33,-55, 2 };
		for (int index = 0; index < arr.length; index++) {

			if ((arr[index] > 0)&&(arr[index] % 2 == 0)) {

				sum = sum + arr[index];
			}
		}

		return sum;

	}
	String maxlenstring() {
		
	String[] arr = {"Karan", "Shweta", "Pallavi", "ArchanaJ", "Sagar"};
	  String name =arr[0] ;
	for (int index = 0; index < arr.length; index++) {
		if(name.length()< arr[index].length()) {
			name = arr[index];
		}
		
	}
	return name;
	}
	static public void main(String[] args) {
		int[] num = { 10, 45, 22, 99, 33, 5, 55, 250 };
		Ass15_Array ass15 = new Ass15_Array();
		int maxnum = ass15.maxNumber(num);
		System.out.println("Maximum number in array : " + maxnum);
		System.out.println("-------------------------------------------------");
		int minnum = ass15.minNumber(num);
		System.out.println("Minimum number in array : " + minnum);
		System.out.println("-------------------------------------------------");
		String positivenum = ass15.positivenum();
		System.out.println("in array : " + positivenum);
		System.out.println("-------------------------------------------------");
		int sum = ass15.evenpositivenum();
		System.out.println("Sum of Even positive numbers in array : " + sum);
		System.out.println("-------------------------------------------------");
		String maxname = ass15.maxlenstring();
		System.out.println("Max length string  in array : " + maxname);
		System.out.println("-------------------------------------------------");
		
	}

}
