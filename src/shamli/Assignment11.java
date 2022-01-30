package shamli;

public class Assignment11 {

		int getFirstOccurenceOfChar(String name, char ch) {
			int charIndex = -1;
			for (int index = 0; index < name.length(); index++) {
				if (name.charAt(index) == ch)
					return index;
			}
			return charIndex;
		}

		int getLastOccurenceOfChar(String name, char ch) {
			int charIndex = -1;
			for (int index = 0; index < name.length(); index++) {
				if (name.charAt(index) == ch)
					charIndex = index;
			}
			return charIndex;
		}

		boolean isCharPresent(String name, char ch) {

			for (int index = 0; index < name.length(); index++) {
				if (name.charAt(index) == ch)
					return true;
			}
			return false;
		}

		int getOccurenceOfChar(String name, char ch) {
			int count = 0;
			for (int index = 0; index < name.length(); index++) {
				if (name.charAt(index) == ch)
					count++;
			}
			return count;
		}

		public static void main(String[] args) {
			Assignment11 assignment11 = new Assignment11();
			int firstOccIndex = assignment11.getFirstOccurenceOfChar("Shamli Gadekar", 'a');
			if (firstOccIndex == -1)
				System.out.println("Searched Character a not found");
			else
				System.out.println(
						"The First Occurence of given character in given String is at position : " + firstOccIndex);
			int lastOccIndex = assignment11.getLastOccurenceOfChar("Shamli Gadekar", 'a');
			if (lastOccIndex == -1)
				System.out.println("Seached Character a not found");
			else
				System.out.println(
						"The Last Occurence of given character in given String is at position :  : " + lastOccIndex);
			boolean presenceOFChar = assignment11.isCharPresent("Shamli Gadekar", 'a');
			System.out.println("Is Searched Character present? :  " + presenceOFChar);
			int totalCount = assignment11.getOccurenceOfChar("Shamli Gadekar", 'a');
			System.out.println("Total Occurence of character is : " + totalCount);
		}

}



