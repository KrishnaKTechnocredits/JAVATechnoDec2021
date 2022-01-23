/*Create a system (Shop) which maintains each item's quantity.

a. Initial stocks of Maggie: 50 Maggie packets 
b. Initial stocks of Dosa : 43 packets 
c. Initial stocks of pouches : 39 oil packets 
d. Initial stocks of panipuri : 43 packets  
e. Initial stocks of masala’s : 73 packets.

Expectation:
1) purchaseItem() method -> Only one Customer came for shopping, he picked different items with different quantities, print a message “Insufficient stock" if a particular item quantity is less than requested quantity, or otherwise deduct requested quantity from total quantity. 
2) printOutOfStockItem() method-> Create a method which shows only those items which are "Out of stock".
3) printAvailableStockItem() method -> Create a method which shows only those items which are "Available in stock" & respective quantities.
*/

package poojaJoshi;

public class Assignment9_Shop {
	int stockMaggie=50;
	int stockDosa=43;
	int stockOil=39;
	int stockPanipuri=43;
	int stockMasala=73;
	
	void purchase(int maggie, int dosa, int oil, int panipuri, int masala) {
		
			if(maggie <= stockMaggie) {
				stockMaggie = stockMaggie - maggie;
			}
			else {
				System.out.println("Maggie is out of stock");
			}
			
			if(dosa <= stockDosa) {
				stockDosa = stockDosa - dosa;
			}
			else {
				System.out.println("Dosa is out of stock");
			}
			
			if(oil <= stockOil) {
				stockOil = stockOil - oil;
			}
			else {
				System.out.println("Oil is out of stock");
			}
			
			if(panipuri <= stockPanipuri) {
				stockPanipuri = stockPanipuri - panipuri;
			}
			else {
				System.out.println("Panipuri is out of stock");
			}
			
			if(masala <= stockMasala) {
				stockMasala = stockMasala - masala;
			}
			else {
				System.out.println("Masala is out of stock");
			}
	}
	
	void availableStock() {
		if(stockMaggie > 0)
			System.out.println("Available maggie stock is: " +stockMaggie);
		if(stockDosa>0)
			System.out.println("Available Dosa stock is: " +stockDosa);	
		if(stockOil>0)
			System.out.println("Available Oil stock is: " +stockOil);
		if(stockMasala>0)
			System.out.println("Available masala stock is: " +stockMasala);
		if(stockPanipuri>0)
			System.out.println("Available Panipuri stock is: " +stockPanipuri);
	}
	
	void outOfStock() {
		if (stockMaggie==0)
			System.out.println("Maggie is out of stock!!!");
		if (stockDosa==0)
			System.out.println("Dosa is out of stock!!!");
		if (stockOil==0)
			System.out.println("Oil is out of stock!!!");
		if (stockMasala==0)
			System.out.println("Masala is out of stock!!!");
		if (stockPanipuri==0)
			System.out.println("Panipuri is out of stock!!!");
	}
	
	public static void main(String[] args) {
		Assignment9_Shop assignment = new Assignment9_Shop();
		assignment.purchase(50, 20, 10, 11, 22);
		assignment.availableStock();
		assignment.outOfStock();
	}

}
