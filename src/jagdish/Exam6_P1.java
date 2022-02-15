package jagdish;

public class Exam6_P1 {
	@SuppressWarnings("null")
	static char findOccurance(String name) { 
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index); // t-0 E-1 C-2 h-3 N-4 o-5 C-6 r-7 E-8 d-9 i-10 t-11 s-12
			if (Character.isUpperCase(ch) && (name.indexOf(ch) == name.lastIndexOf(ch))) {
				return ch;
			}
		}
		return (Character) null;
	}

	public static void main(String[] args) {
		String str = "tEChNoCrEdits";
		System.out.println("The 1st non occurance is char:- " + findOccurance(str));
	}
}