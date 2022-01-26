package debasmita;

public class A27_NumberValidation {
	
    boolean findNum(String num) {
		boolean flag=false;
		for(int index=0;index<num.length();index++) {
			char ch=num.charAt(index);
			if(Character.isDigit(ch)) {
				flag=true;
			}else {
				flag=false;
				break;
			}
		}
		     return flag;
	}
    void checkValid1(String num) {
      if(num.startsWith("+91")&& num.length()==14 && ((num.charAt(4)=='9')||(num.charAt(4)=='8')||(num.charAt(4)=='7'))){
    	  boolean flag=false;
    	  for(int index=4;index<num.length();index++) {
    		 char ch=num.charAt(index);
    		  if(Character.isDigit(ch)) {
    			  flag=true;
    		  }else {
    			  flag=false;
    			  break;
    		  }
    	  }
    	  if(flag) {
    		  System.out.println("the number is valid");
    	  }else {
    		  System.out.println("the number is invalid");
    	  }
      }
    }
    void checkValid2(String num) {
    	if(num.length() == 13 && (num.startsWith("9") || num.startsWith("8") || num.startsWith("7"))) {
    	String number = num.replace(" ", "");
		boolean flag = findNum(num);
		if (flag) {
			System.out.println("Valid number");
		} else {
			System.out.println("Invalid number");
		}
        }
    }
    void checkValid3(String num) {
    	if((num.length() == 11 && num.startsWith("0"))&&((num.startsWith("9") || num.startsWith("8") || num.startsWith("7")))) {
    	boolean flag = findNum(num);
		if (flag) {
			System.out.println("Valid number");
		} else {
			System.out.println("Invalid number");
		}
        }
    }
    void checkValid4(String num) {
    	if(num.length() == 10 && (num.startsWith("9") || num.startsWith("8") || num.startsWith("7"))) {
			boolean flag = findNum(num);
			if (flag) {
				System.out.println("Valid number");
			} else {
				System.out.println("inavlid number");
			}
    	}
    }
    	
	public static void main(String[] args) {
		A27_NumberValidation numbervalidation=new A27_NumberValidation();
		
		numbervalidation.checkValid1("+91 9765463742");
		numbervalidation.checkValid2("976 546 37 42");
		numbervalidation.checkValid3("09764563742");
		numbervalidation.checkValid4("9764563742");

	}

}
