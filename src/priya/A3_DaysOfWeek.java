package priya;

public class A3_DaysOfWeek {

	void dayDetermination(int dayIndex) {
		if (dayIndex >= 1 && dayIndex <= 5)
			System.out.println("Day" + dayIndex + " is weekday.");
		else if (dayIndex >= 6 && dayIndex <= 7)
			System.out.println("Day " + dayIndex + " is weekend.");
		else
			System.out.println(dayIndex + " is invalid index.");
	}

	public static void main(String[] args) {
		A3_DaysOfWeek dayIndex = new A3_DaysOfWeek();
		dayIndex.dayDetermination(1);
		dayIndex.dayDetermination(2);
		dayIndex.dayDetermination(3);
		dayIndex.dayDetermination(4);
		dayIndex.dayDetermination(5);
		dayIndex.dayDetermination(6);
		dayIndex.dayDetermination(7);
		dayIndex.dayDetermination(8);
	}
}