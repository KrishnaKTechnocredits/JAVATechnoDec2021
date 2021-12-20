package nehaPandey;

class FindDays {

	void dayindex(int index) {
		if (index >= 1 && index < 6) {
			System.out.println("hello, this is weekdays");
		} else if (index >= 6 && index <= 7) {
			System.out.println("hello, this is weekend");
		} else {
			System.out.println("Invalidindex");
		}
	}

	public static void main(String arg[]) {
		FindDays fd = new FindDays();
		fd.dayindex(4);
		fd.dayindex(8);
		fd.dayindex(7);
		fd.dayindex(5);
	}
}