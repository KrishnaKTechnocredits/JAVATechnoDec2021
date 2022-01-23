package jagdish;

public class A24_6_Assignment {

	String findStartCapName(String name) { // Vrushali Sagar Shital
		String rev = "";
		for (int index = name.length() - 1; index >= 0; index--) {
			char ch = name.charAt(index);
			if (index == name.length() - 1)
				ch = Character.toLowerCase(ch);
			rev = rev + ch;
		}

		return rev;
	}

	void getRevname(String input) {
		String[] arr = input.split(" ");
		String temp = "";
		for (int index = 0; index < arr.length; index++) {
			temp = temp + " " + findStartCapName(arr[index]);
		}
		System.out.println(temp);
	}

	public static void main(String[] args) {
		A24_6_Assignment a24 = new A24_6_Assignment();
		a24.getRevname("Vrushali Sagar Shital");

	}

}
