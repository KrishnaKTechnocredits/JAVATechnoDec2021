package garima;

class Weekdays {
	void SearchingDay(int index) {
		if (index >= 1 && index <= 5)
			System.out.println("weekday");
		else if (index >= 6 && index <= 7)
			System.out.println("weekend");
		else
			System.out.println("invaild index");
	}

	public static void main(String[] args) {
		Weekdays weekdays = new Weekdays();
		;
		weekdays.SearchingDay(3);
		weekdays.SearchingDay(6);
		weekdays.SearchingDay(11);
		weekdays.SearchingDay(-3);
	}

}