package jagdish;

public class A23_1_Assignment {

	void findSecondMaxno(int[] arr) {
		int temp = 0;
		for (int index = 0; index < arr.length; index++) {
			for (int innerindex = index + 1; innerindex < arr.length; innerindex++) {
				if (arr[index] < arr[innerindex]) {
					temp = arr[index];
					arr[index] = arr[innerindex];
					arr[innerindex] = temp;
				}

			}

		}

		System.out.println("The second Max number is: " + arr[2]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A23_1_Assignment secondmaxno = new A23_1_Assignment();
		int[] num = { 1, 11, 3, 99, 66, 54, 22, 44 };
		secondmaxno.findSecondMaxno(num);
	}

}
