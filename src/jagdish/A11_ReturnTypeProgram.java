package jagdish;

public class A11_ReturnTypeProgram {

	int getFirstOccurance(String name, char ch) {
		int charIndex = -1;
		for (int index = 0; index < name.length(); index++) {
			if (name.charAt(index) == ch) { // index =0; 0< 11
				charIndex = index;
				break;
			}
		}
		return charIndex;
	}

	int getLastOccurance(String name, char ch) {
		int charIndex = -1;
		for (int index = 0; index < name.length(); index++) {
			if (name.charAt(index) == ch) {
				charIndex = index;
			}
		}
		return charIndex;
	}

	boolean isCharthere(String name, char ch) {
		boolean flag = false;
		for (int index = 0; index <= name.length(); index++) {
			if (name.charAt(index) == ch)
				return true;
		}
		return false;
	}

	int getCountOccurance(String name, char ch) {
		int count = 0;
		for (int index = 0; index < name.length(); index++) {
			if (name.charAt(index) == ch)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		A11_ReturnTypeProgram a11_returntypeprogram = new A11_ReturnTypeProgram();
		int firstoccindex = a11_returntypeprogram.getFirstOccurance("jagdishbunge", 'i');
		if (firstoccindex == -1) {
			System.out.println("Charactor  doent have the given value for First Occurance ");
		} else {
			System.out.println("The First Occurence of given character is at position : " + firstoccindex);
		}

		int lastoccindex = a11_returntypeprogram.getFirstOccurance("jagdishbunge", 'b');
		if (lastoccindex == -1) {
			System.out.println("Charactor doent have the given value for Last Occurance ");
		} else {
			System.out.println("The Last Occurence of given character is at position : " + lastoccindex);
		}

		boolean temp = a11_returntypeprogram.isCharthere("jagdishbunge", 'g');
		System.out.println("The Boolean occurance of given character is at position : " + temp);

		int allcount = a11_returntypeprogram.getCountOccurance("jagdishbungeggg", 'g');
		if (allcount == -1) {
			System.out.println("Total count doesnt match ");
		} else {
			System.out.println("The total count is  : " + allcount);
		}

	}

}