package sandip.Assignment_24;

public class Spliting_String {

	void splitString(String s1) {
		String[] arg = s1.split(" ");
		for (int index = 0; index < arg.length; index++) {
			System.out.println(arg[index] + "--" + arg[index].length());
		}
	}

	public static void main(String[] args) {
		Spliting_String sp = new Spliting_String();
		sp.splitString("Hi Hellow How Are You");
	}
}
