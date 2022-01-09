package rushikesh;

public class Assignment21 {
	
		String temp = " ";
		void print(String str) {
			for(int index=0;index<str.length();index++) {
				char ch=str.charAt(index);
				if(Character.isDigit(ch)) {
					temp+=ch;
				}
			}
			System.out.println("Digits in String"+str+" is "+temp);
		}
		
		public static void main(String[] args) {
			Assignment21 assignment21 = new Assignment21();
			assignment21.print("t1e3chnoc45red9its");
		}
	}

