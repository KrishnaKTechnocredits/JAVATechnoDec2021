package swati.swati_Assignment23;

public class OddEven {
	String temp = "";
	String finalTemp = "";
	int odd = 0;
	int even=0;

	void countString(String str) {
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isLetter(c)) {
				if (temp != "") {
					int conv = Integer.parseInt(temp);
					if(conv%2==0) {
						even=conv+even;
					}
					else {
						odd=conv+odd;
					}
				}
				temp = "";
			} else if (Character.isDigit(c)) {
				temp = temp + c;
			}
			if (i == str.length() - 1 && Character.isDigit(c)) {
				int conv = Integer.parseInt(temp);
				if(conv%2==0) {
					even=conv+even;
				}
				else {
					odd=conv+odd;
				}
			}
		}
		System.out.println(even-odd);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddEven oe=new OddEven();
		oe.countString("te112ch34no29");
	}

}
