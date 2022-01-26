package tanu;

class Assignment24 {

	void wordsIngivenString(String name) {
		String[] arrname = name.split(" ");
		for (int index = 0; index < arrname.length; index++) {
			System.out.println(arrname[index] + ">" + arrname[index].length());
		}
		 System.out.println("----------------------------------------------");
	}

	void vowelsIngivenString(String name) {
		String[] arrname;
		String current;
		arrname = name.split(" ");
		int count = 0;
		for (int index = 0; index < arrname.length; index++) {
			current = arrname[index];
			for (int index1 = 0; index1 < current.length(); index1++) {
				if (current.charAt(index1) == 'a' || current.charAt(index1) == 'e' || current.charAt(index1) == 'i'
						|| current.charAt(index1) == 'o' || current.charAt(index1) == 'u') {
					count++;
				}
			}
			System.out.println(current + ">" + count);
			count = 0;
		}
		System.out.println("----------------------------------------------");
	}
	void digitsArray(String name) {//Te1c2hC94re3"
		String[] arrname = name.split(" ");
		char d;
		String temp = "";
		String result = "";
		for (int index = 0; index < arrname.length; index++) {
			for (int index1 = 0; index1 < arrname[index].length(); index1++) {
				d = arrname[index].charAt(index1);
				if (Character.isDigit(d)) {
					temp = temp + d;
				}
			}
			result = result + " " + temp;
			temp = "";
		}
		System.out.println(result);
		System.out.println("----------------------------------------------");
	}

	void reversestring(String name) {
		String[] arrname = name.split(" ");
		for (int index = 0; index < arrname.length; index++) {
			String temp = "";
			String word = arrname[index];
			for (int index1 = word.length()-1; index1 >= 0; index1--) {
				temp = temp + word.charAt(index1);

			}
			System.out.println(temp);
		}
		System.out.println("----------------------------------------------");
	}

	void firstCapitalLetter(String names) {//anvit harsh dipali"

		String[] words;
		words = names.split(" ");
		String element;
		char c;
		for (int index = 0; index < words.length; index++) {
			String str = " ";
			element = words[index];
			for (int index1 = 0; index1 < element.length(); index1++) {
				c = element.charAt(index1);
				if (index1 == 0) {
					str=str+Character.toUpperCase(c);
					}
				else
				{
					str=str + c;
				}
				}
			      System.out.println(str);
			}
		System.out.println("----------------------------------------------");
	}

	void reverseThecaseOfEachChar(String name) {//TeCHnoC
			 char alpha;
			 String str="";
			 for(int index=0; index<name.length(); index++) {

				alpha=name.charAt(index);
			 if(Character.isLetter(alpha)) {
				 if(Character.isUpperCase(alpha)) {
					 str=str+Character.toLowerCase(alpha);
				 }
				 else 
				 {
				  str=str+Character.toUpperCase(alpha);
				 }
				 
			 }
			 
		 }
			 System.out.println(str);
			 System.out.println("----------------------------------------------");
		 }
	
	void reverseAndCapital(String name) {
		String[] arrname = name.split(" ");
		for (int index = 0; index < arrname.length; index++) {
			String temp = "";
			String word = arrname[index];
			for (int index1 = word.length()-1; index1 >= 0; index1--) {
				if(index1 == word.length()-1)
				{
					temp = temp + Character.toUpperCase(word.charAt(index1));
				}
				else
				{
					temp = temp + word.charAt(index1);
				}

			}
			System.out.println(temp);
		}
		System.out.println("----------------------------------------------");
	}


	public static void main(String[] arg) {
		Assignment24 assignment = new Assignment24();
		 assignment.wordsIngivenString("Hi Hello");
		 assignment.vowelsIngivenString("aashvi technocredits");
		 assignment.digitsArray("Te1c2h C94re3");
		 assignment.reversestring("Hi techno hello");
		 assignment.firstCapitalLetter("anvit harsh dipali");
		 assignment.reverseThecaseOfEachChar("TeCHnoC");
		 assignment.reverseAndCapital("Vrushali Sagar Shital");
	}
}