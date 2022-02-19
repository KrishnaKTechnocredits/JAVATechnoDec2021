package gauravk.Programs47;

public class PatternPrintingOM {

	// void patternOM(String str, int size) {
	//// for(int i=1; i<=size+size; i++) {
	//// for(int j=i; j<=size-i; j++) {
	//// System.out.print(str);
	//// }
	//// System.out.println();
	//// }
	// }

	void patternOM(String ch, int size) {

		// System.out.println("Pattern 2");
		for (int i = 1; i <= size + size; i++) {
			for (int j = 1; j < i; j++) {
				if (j <= size) {
					System.out.print(" ");
				} else {
					System.out.print(ch);
				}
			}
			for (int k = i; k <= i; k++) {
				if (k <= size) {
					System.out.print(" ");
				} else {
					System.out.print(i);
				}
			}
			for (int l = i + 1; l <= size + size; l++) {
				if (l <= size) {
					System.out.print(" ");
				} else {
					System.out.print(ch);
				}
			}
			System.out.println();
		}

		for (int i = 1; i <= size + size; i++) {
			for (int l = i + 1; l <= size + size; l++) {
				System.out.print(ch);
			}
			for (int k = i; k <= i; k++) {
				System.out.print(i);
			}
			for (int j = 1; j < i; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
		// -------------------------------------------
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(ch);
			}
			for (int k = i; k <= i; k++) {
				System.out.print(i);
			}
			for (int l = i + 1; l <= size; l++) {
				System.out.print(ch);
			}
			System.out.println();
		}

		for (int i = 1; i <= size; i++) {
			for (int l = i + 1; l <= size; l++) {
				System.out.print(ch);
			}
			for (int k = i; k <= i; k++) {
				System.out.print(i);
			}
			for (int j = 1; j < i; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		PatternPrintingOM pp = new PatternPrintingOM();
		pp.patternOM("*", 5);
	}
}
