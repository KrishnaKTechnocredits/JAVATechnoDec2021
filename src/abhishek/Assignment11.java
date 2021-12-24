package abhishek;
class Assignment11 {
	int getOccurrence(String input, char ch, boolean firstOcc, boolean lastOcc, boolean totalCount) {
		int chIndex = -1;
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch) {
				if (firstOcc == true)
					return index;
				chIndex = index;
				count++;
			}
		}
		if (lastOcc == true)
			return chIndex;
		if (totalCount == true)
			return count;
		return chIndex;
	}

	boolean isCharPresentInString(String input, char ch) {
		boolean flag = false;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch) {
				flag = true;
				return flag;
			}
		}
		return flag;
	}

	public static void main(String[] a) {
		Assignment11 assignment11 = new Assignment11();
		int firstOcc = assignment11.getOccurrence("Abhishek Anand", 'b', true, false, false);
		if (firstOcc > -1)
			System.out.println("Given Character's first occurrence in input string is: " + firstOcc);
		else
			System.out.println("Given Character is not present in input string");

		int lastOcc = assignment11.getOccurrence("Abhishek Anand", 'd', false, true, false);
		if (lastOcc > -1)
			System.out.println("Given Character's last occurrence in input string is: " + lastOcc);
		else
			System.out.println("Given Character is not present in input string");

		int count = assignment11.getOccurrence("Abhishek Anand", 'b', false, false, true);
		if (count > 0)
			System.out.println("Total Occrences of characted in input string is/are: " + count);
		else
			System.out.println("Given Character is not present in input string");

		System.out.println("method isCharPresentInString returning value: "
				+ assignment11.isCharPresentInString("Abhishek", 'h'));
	}

}

