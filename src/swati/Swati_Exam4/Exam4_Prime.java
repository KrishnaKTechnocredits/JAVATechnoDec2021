package swati.Swati_Exam4;

public class Exam4_Prime {

	boolean findPrime(int n) {
		boolean flag = false;
		if (n == 1) {
			flag = true;
		}
		if (n == 2) {
			flag = false;
		}
		if (n > 2) {
			if (n % 2 == 0) {
				flag = true;
			} else {
				flag = false;
			}
		}

		return flag;
	}

	public static void main(String[] args) {
		Exam4_Prime eg = new Exam4_Prime();
		String str = "I would like to have a cup of tea";
		String[] arr = str.split(" ");
		String temp = "";
		for (int i = 0; i < arr.length; i++) {
			int n = arr[i].length();
			boolean flag = eg.findPrime(n);
			if (!flag) {
				temp = temp + " " + arr[i];
			}
		}
		System.out.println(temp);

	}

}