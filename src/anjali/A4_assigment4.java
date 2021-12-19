package anjali;

public class A4_assigment4 {

	public static void main(String[] args) {
		checkDay(1);
		checkDay(5);
		checkDay(7);
		checkDay(-6);
		checkDay(8);
		
	}
	static void checkDay(int dayindex){
		if(dayindex>=1 && dayindex<=5)
			System.out.println("The Day is weekday");
		else if (dayindex>=6 && dayindex<8)
			System.out.println("The Day is weekend");
		else
			System.out.println("The day is invalid");
	}

}
