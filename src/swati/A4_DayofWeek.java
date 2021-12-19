package swati;
public class A4_DayofWeek {

	void findDay(int index) {
		if(index>1 && index<5) {
			System.out.println("its weekday");
		}
		else if(index==6 || index==7) {
			System.out.println("its weekend");
		}
		else {
			System.out.println("invalid index");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A4_DayofWeek day=new A4_DayofWeek();
		day.findDay(3);
		day.findDay(6);
		day.findDay(11);
		day.findDay(13);

	}

}
