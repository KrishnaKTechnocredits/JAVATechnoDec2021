package jagdish;

public class A24_7_Assignment {

	String findStartCapName(String name) { // TeCHnoCReditS O/P -tEchNOcrEDITs
		String rev = "";
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (Character.isLowerCase(ch))
				ch = Character.toUpperCase(ch);
			else
				ch = Character.toLowerCase(ch);
			rev = rev + ch;
		}
		
		return rev;
	}

	void getname(String name) {
		String temp = "";
		String[] arr = name.split(" ");
		for (int index = 0; index < arr.length; index++) {
			temp = temp + findStartCapName(arr[index]);
		}
		System.out.println(temp);
	}

	public static void main(String[] args) {
		A24_7_Assignment a24 = new A24_7_Assignment();
		a24.getname("TeCHnoCReditS");

	}

}
