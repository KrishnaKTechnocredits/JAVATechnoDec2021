package ashwini;

class A9_ShopSys
{

static int stocks_Maggie=50; 
static int stocks_Dosa=43; 
static int stocks_oilpouches=39;  
static int stocks_panipuri=43;   
static int stocks_masalas=73; 


void purchaseItem(int m,int d,int o,int pa,int ma)
{
if(m>stocks_Maggie||d>stocks_Dosa||o>stocks_oilpouches||pa>stocks_panipuri||ma>stocks_masalas)
{
System.out.println("insufficient stocks");
}else
{
System.out.println("purchase required items as:" + m +" maggie packets "+ d +" dosa packets " + o +" oil packets " + pa +" panipuri packets "+ ma +" masala packets ");
}
}

void printOutOfStockItem(int m,int d,int o,int pa,int ma)
{
if(stocks_Maggie==0||stocks_Dosa==0||stocks_oilpouches==0||stocks_panipuri==0||stocks_masalas==0)
{System.out.println("items are Out of stock");
}
}

void printAvailableStockItem(int m,int d,int o,int pa,int ma)
{
if(m<=stocks_Maggie||d<=stocks_Dosa||o<=stocks_oilpouches||pa<=stocks_panipuri||ma<=stocks_masalas)
{
System.out.println("Stocks is available");
}
}

public static void main(String[] args){
A9_ShopSys s=new A9_ShopSys();
s.purchaseItem(40,20,4,7,6);
s.printOutOfStockItem(40,20,4,7,6);
s.printAvailableStockItem(40,20,4,7,6);
}
}