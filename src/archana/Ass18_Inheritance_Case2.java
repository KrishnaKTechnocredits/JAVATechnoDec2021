package archana;

public class Ass18_Inheritance_Case2 {
	public static void main(String[] args) {
		Ass18_Inheritance_Class2_College college = new Ass18_Inheritance_Class2_College();
		college.displayname();
		String score = college.avrageMarksResult(70, 88, 90);
		System.out.print(score);
	}
}
