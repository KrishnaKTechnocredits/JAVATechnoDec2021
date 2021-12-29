package naquibalam;

class A4_WeekCheck {
	
	void weekIndex(int inputDay) {
		if ((inputDay >= 1) && (inputDay <= 5)) {
			System.out.println("Day Index -> " + inputDay + " : Weekday");
		} else if ((inputDay == 6) || (inputDay == 7)) {
			System.out.println("Day Index -> " + inputDay + " : Weekend");
		} else {
			System.out.println("Day Index -> " + inputDay + " : Invalid Index");
		}
	}
	
	public static void main (String[] args) {
		A4_WeekCheck weekCheck = new A4_WeekCheck();
		weekCheck.weekIndex(3);
		weekCheck.weekIndex(6);
		weekCheck.weekIndex(11);
		weekCheck.weekIndex(-3);
	}
}