package tanu;

class Assignment11 {
	void getFirstOccurrence(String name, char i) {
		int index = 0;
		for (index = 0; index < name.length(); index++) {
			if (name.charAt(index) == i) {
				System.out.println(" first occurence of " + i + " is at " + index + " in " + name);
			}

		}

	}

	void getLastOccurrence(String name, char i) {
		int index = 0;
		int charposition = 0;
		for (index = 0; index < name.length(); index++) {
			if (name.charAt(index) == i) {
				charposition = index;
			}

		}
		System.out.println(" last occurence of " + i + " is at " + charposition + " in " + name);
	}

	void characterPresent(String name, char i) {
		int index = 0;
		boolean characterPresent = false;
		for (index = 0; index < name.length(); index++) {
			if (name.charAt(index) == i) {
				characterPresent = true;
				System.out.println(i+" character is present in " + name);
				break;
			}
		}
				if (characterPresent == false) {
					System.out.println(i+" character is not found in " + name);
				}
	}

	void totalOccurrence(String name,char i) {
		int index = 0;
		int count=0;
		for (index = 0; index < name.length(); index++) {
			if (name.charAt(index) == i) {
				count++;				
			}
		}
		System.out.println(i+" is present " + count + " times in " + name);
	}
	

	public static void main(String[] arg) {
		Assignment11 assignment = new Assignment11();
		assignment.getFirstOccurrence("Sharvil", 'a');
		assignment.getLastOccurrence("Tanuraj", 'a');
		assignment.characterPresent("Sharvil", 'l');
		assignment.totalOccurrence("Tanuraj", 'a');
	}
}