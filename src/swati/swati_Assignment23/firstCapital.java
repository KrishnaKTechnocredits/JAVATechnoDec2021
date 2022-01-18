package swati.swati_Assignment23;

public class firstCapital {
	String upper="";
	String even="";
	String odd="";
	String temp="";
	void findCap(String str) {
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(Character.isUpperCase(c)) {
				upper=upper+c;
			}
			if(Character.isDigit(c)) {
				temp=temp+c;
				int conv=Integer.parseInt(temp);
				if(conv%2==0) {
				even=even+c;	
				}
				else {
					odd=odd+c;
				}
			}
		}
		System.out.println(odd +upper.charAt(0)+ even);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firstCapital fc=new firstCapital();
		fc.findCap("eTe1CH9cred4it6s");
	}

}
