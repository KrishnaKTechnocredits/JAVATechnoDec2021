package abhishek;
class Assignment4 {
	void dayDetermination(int dayIndex) {
		if (dayIndex>=1 && dayIndex<=5)
			System.out.println ("it is weekday :" + "day " + dayIndex);
		else if (dayIndex>=6 && dayIndex<=7) 
			System.out.println ("it is weekend :" + "day " + dayIndex);
		else 
			System.out.println ("Invalid Index :" + "day " + dayIndex);
	}
	public static void main (String[] args) {
		Assignment4 assignment4 = new Assignment4();
		assignment4.dayDetermination(3);
		assignment4.dayDetermination(6);
		assignment4.dayDetermination(11);
		assignment4.dayDetermination(-3);
	}
}
		