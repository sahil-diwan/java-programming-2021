
public class Demo {

	public static void main(String[] args) throws CloneNotSupportedException {
		BookShop bs = new BookShop();
		bs.setShopName("Novelty");
		bs.loadData();
		System.out.println(bs);
		
		
		
		BookShop bs1 = bs.clone();
		bs1.setShopName("A1");
		//bs1.loadData(); // if we do this again it is going to fetch some data which is going to fetch data from the database. Instead we can simply ask bs to give his data
		System.out.println(bs1);
	}
}
