package archana;
class Ass8_BankTrans1{   
	
		
	public static void main(String[] args){
			Ass8_BankTrans2 bt = new Ass8_BankTrans2();
			bt.userAccDetails("Archana",50000);
			bt.credit(2000,"Archana");
			bt.credit(8000,"Archana");
			bt.debit(1000,"Archana");
			bt.printBalance();
			
			Ass8_BankTrans2 bt1 = new Ass8_BankTrans2();
			bt1.userAccDetails("Auja",100000);
			bt1.credit(2000,"Anuja");
			bt1.credit(3000,"Anuja");
			bt1.credit(4000,"Anuja");
			bt1.credit(5000,"Anuja");
			bt1.credit(6000,"Anuja");
			bt1.debit(3000,"Anuja");
			
			bt.allTransactionSummary();
			
		}
        
       

}