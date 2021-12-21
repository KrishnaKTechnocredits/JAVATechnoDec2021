package krishna;

class Calculator{
    int Number1 = 100;
	int Number2 = 20;
	  
	void add(){
		int ans = Number1 + Number2;
		System.out.println(" The Addition is " + ans);
	}
		  
	void subs(){
	  	int ans= Number1 - Number2;
		System.out.println(" The Substraction is " + ans);
	}
		  
	void Multiply(){
	  	int ans = Number1 * Number2;
		System.out.println(" The Multiplication is " + ans);
	}
		  
	void Divide(){
	  	int ans = Number1 / Number2;
		System.out.println(" The Division is " + ans);
	}

	public static void main (String[] args){
		Calculator calculator = new Calculator();
		calculator.add();
		calculator.subs();
		calculator.Multiply();
		calculator.Divide();
		}

}