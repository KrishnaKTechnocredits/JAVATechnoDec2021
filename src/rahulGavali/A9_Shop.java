/*Assignment - 9 : 22nd Aug'2021
Create a system (Shop) which maintains each item's quantity.
a. Initial stocks of Maggie: 50 Maggie packets 
b. Initial stocks of Dosa : 43 packets 
c. Initial stocks of pouches : 39 oil packets 
d. Initial stocks of panipuri : 43 packets  
e. Initial stocks of masala’s : 73 packets.
Expectation:
1) Only one Customer came for shopping, he picked different items with different quantities, printed  "running out of stock" message if a particular item was sold out, or otherwise deduct requested quantity from total quantity. 
2) Create a method which shows only those items which are "Out of stock".
3) Create a method which shows only those items which are "Available in stock" & respective quantities.*/

package rahulGavali;

public class A9_Shop {
	int maggieStock = 50;
	int dosaStock = 43;
	int oilPouchesStock = 39;
	int panipuriPktsStock = 43;
	int masalaPktsStock = 73;
	
	void purchaseItems(int maggie, int dosa, int oilPouches, int panipuriPkts, int masalaPkts){
		if(maggieStock >= maggie)
			maggieStock = maggieStock - maggie;
		else
			System.out.println("Maggie stock is "+maggieStock+" which is less than requested stock of "+maggie+" quantities");
		
		if(dosaStock >= dosa)
			dosaStock = dosaStock - dosa;
		else
			System.out.println("Dosa stock is "+dosaStock+" which is less than requested stock of "+dosa+" quantities");
		
		if(oilPouchesStock >= oilPouches)
		oilPouchesStock = oilPouchesStock - oilPouches;
		else
			System.out.println("Oil packets stock is "+oilPouchesStock+" which is less than requested stock of "+oilPouches+" quantities");
		
		if(panipuriPktsStock >= panipuriPkts)
		panipuriPktsStock = panipuriPktsStock - panipuriPkts;
		else
			System.out.println("Panipuri Packets stock is "+panipuriPktsStock+" which is less than requested stock of "+panipuriPkts+" quantities");
		
		if(masalaPktsStock >= masalaPkts)
		masalaPktsStock = masalaPktsStock - masalaPkts;
		else
			System.out.println("Masala Packets stock is "+masalaPktsStock+" which is less than requested stock of "+masalaPkts+" quantities");
	}
	
	void soldOutItems(){
		System.out.println();
		boolean flag = true;
		if(maggieStock == 0){
			System.out.println("Maggie out of stock");
			flag = false;
		}
		if(dosaStock == 0){
			System.out.println("Dosa out of stock ");
			flag = false;
		}
		if(oilPouchesStock == 0){
			System.out.println("Oil Packets out of stock ");
			flag = false;
		}
		if(panipuriPktsStock == 0){
			System.out.println("Panipuri Packets out of stock ");
			flag = false;
		}
		if(masalaPktsStock == 0){
			System.out.println("Masala Packets out of stock ");
			flag = false;
		}
		if(flag == true)
			System.out.println("All items available");
	}
	
	void availableItems(){
		boolean available = false;
		if(maggieStock > 0){
			System.out.println(maggieStock+" Maggie packets available in stock");
			available = true;
		}
		if(dosaStock > 0){
			System.out.println(dosaStock+" Dosa packets available in stock");
			available = true;
		}
		if(oilPouchesStock > 0){
			System.out.println(oilPouchesStock+" Oil packets available in stock");
			available = true;
		}
		if(panipuriPktsStock > 0){
			System.out.println(panipuriPktsStock+" Panipuri packets available in stock");
			available = true;
		}
		if(masalaPktsStock > 0){
			System.out.println(masalaPktsStock+" Masala packets available in stock");
			available = true;
		}
		if(available == false)
			System.out.println("No Items available");
	}
	
	public static void main(String[] args){
		A9_Shop shop = new A9_Shop();
		shop.purchaseItems(50, 42, 39, 33, 75);
		System.out.print("\nAFTER PURCHASE");
		shop.soldOutItems();
		shop.availableItems();
	}	
}

