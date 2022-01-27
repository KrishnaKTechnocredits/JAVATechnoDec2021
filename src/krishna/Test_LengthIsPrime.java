package krishna;


public class Test_LengthIsPrime {
	
	void get_PrimeString(String s1) {
		int x, y, flg;
		String[] words = s1.split("\\s");
		for (String w : words) {
			for (x = 1; x <= w.length(); x++) {
				if (x == 1 || x == 0)
					continue;
				flg = 1;
				for (y = 2; y <= x / 2; ++y) {
					if (x % y == 0) {
						flg = 0;
						break;
					}
				}
				if (flg == 1)
					if (w.length() == x) {
						System.out.print(w + " ");
					}
			}
		}
		System.out.println();
	}

	public static void main(String args[]) {
		Test_LengthIsPrime len = new Test_LengthIsPrime();
		len.get_PrimeString("I Love My India");
		len.get_PrimeString("I would like to have a cup of tea");
	}
}
