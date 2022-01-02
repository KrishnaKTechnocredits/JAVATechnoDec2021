package archana;

public class Ass18_Inheritance_Class2_College extends Ass18_Inheritance_Class1_Student {

	String univercityName = "NMU";
	String currCity = "Pune-Pashan";
	String name = "Archana M Jadhav";
	int total;
	int percentage;
	String div;

	void displayname() {

		System.out.println("Student Full Name : " + name);
	}

	String avrageMarksResult(int mathsMarks, int science, int computer) {

		String Result = "";
		total = mathsMarks + science + computer;
		percentage = total / 3;
		if (percentage >= 60)
			div = "First class";
		else if (percentage < 60 && percentage >= 48)
			div = "Second Class";
		else if (percentage < 48 && percentage >= 36)
			div = "PASS";
		else
			div = "FAIL";

		Result = "Maths: " + mathsMarks + ", Science: " + science + ", Computer: " + computer + "===>Toal Percentage : "
				+ percentage + "% ," + " Division :" + div;
		return Result;

	}

	void grade() {

		System.out.print("Grade : A");
	}

}
