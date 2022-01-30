package ashwini;

public class Assignment_17_p2 {
	int getVowelCount(String name) {
		int vCount = 0;
		for (int index1 = 0; index1 < name.length(); index1++) {
			if (name.charAt(index1) == 'a' || name.charAt(index1) == 'e' || name.charAt(index1) == 'i'
					|| name.charAt(index1) == 'o' || name.charAt(index1) == 'u')
				vCount++;
		}
		return vCount;
	}

	String getMaxVowelCountNameInArray(String[] arr) {
		int vCount = 0;
		String maxVName = "";
		int maxVCount = 0;

		for (int index = 0; index < arr.length; index++) {
			String name = arr[index];
			vCount = getVowelCount(name);
			if (vCount > maxVCount) {
				maxVCount = vCount;
				maxVName = name;
			}
		}
		return maxVName;
	}

	public static void main(String[] args) {
		Assignment_17_p2 CountMaxVowels = new Assignment_17_p2();
		String[] arr = { "hi", "priyanka", "sandip", "aakanksha", "pallavi", "apurva" };
		String maxVowelName = CountMaxVowels.getMaxVowelCountNameInArray(arr);
		System.out.println(maxVowelName);

	}
}
