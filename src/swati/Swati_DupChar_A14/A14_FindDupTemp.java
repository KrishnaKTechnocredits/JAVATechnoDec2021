package swati.Swati_DupChar_A14;

public class A14_FindDupTemp {
	
	void findDupes(String name) {
		String dupes = "";
		for(int i = 0; i < name.length(); i++) {
			for(int j = i +1; j< name.length();j++) {
				if(name.charAt(i) == name.charAt(j) && 
						!dupes.contains(String.valueOf(name.charAt(i))))
				{
					dupes += String.valueOf(name.charAt(i));//name.charAt(i);					
				}
			}
		}		
		System.out.println("Duplicate Char " + dupes);
	}
	
	void findDupTemp(String name) { //test
		String temp = "";
		for (int i = 0; i < name.length(); i++) { //0-3
			char ch = name.charAt(i); // t e s t
			String comp = String.valueOf(ch); // t e s t
			for (int j = i+1; j < name.length(); j++) { //0-3

				if (name.charAt(i) == name.charAt(j)) { // 
					System.out.println(comp.contains(temp));

					//if(!temp.contains(comp)) {
					//	temp += comp;
					//}
					if (temp.contains(comp)) {
						System.out.println(ch + " is repeated char");						

					} else {
						temp += ch;
					}
				}

			}
		}
		System.out.println("temp is " + temp);
	}
	 
	/*
	 * void findDupTemp(String name) { String temp=""; for(int
	 * i=0;i<name.length();i++) { char ch=name.charAt(i); String str=ch + "";
	 * if(!temp.contains(str)) { if(name.indexOf(i)!=name.lastIndexOf(i)) {
	 * System.out.println(ch +" is last character "); temp=str; } } }
	 */ 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A14_FindDupTemp a14 = new A14_FindDupTemp();
		a14.findDupTemp("testredrg");

		/*
		 * String name = "jui"; String str = " "; for (int i = 0; i < name.length();
		 * i++) { char c = name.charAt(i); String comp = String.valueOf(c); str = str +
		 * comp; } System.out.println(str);
		 */

	}

}
