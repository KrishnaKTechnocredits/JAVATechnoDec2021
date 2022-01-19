package rushikesh.assign23;
//Program 4 : Find the difference between odd and even digits from given string.
//input : tec5hno3cre6di1ts
//output : 3
//Hint : (5+3+1)-(6) = 9-6
public class Assign23_4 {
	int findDiff(String str) {
		int tempeven = 0;
		int tempodd = 0;
		for(int index=0;index<str.length();index++) {
			char ch=str.charAt(index);
			if(Character.isDigit(ch)) {
				int temp=Integer.parseInt(String.valueOf(ch));		
				if(temp%2==0)
					tempeven+=temp;
				else
					tempodd+=temp;
			}
		}

		return tempodd-tempeven;
	}
	
	public static void main(String[] args) {
		Assign23_4 assign23_4=new Assign23_4();
		int diff=assign23_4.findDiff("tec5hno3cre6di1ts");
		System.out.println(diff);
		
	}	
}
