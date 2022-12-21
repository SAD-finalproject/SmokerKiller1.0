import java.util.ArrayList;

public class Shop {
	private ArrayList<Cigarette> goods;
	
	public Shop() { 
		this.goods = new ArrayList<Cigarette>();
	}
	
	public void add(Cigarette k) {
		goods.add(k);
	}
	public int getSize() {
		return goods.size();
	}
	public void init() {
		Cigarette seven = new Cigarette("七星", 125, 500);
		Cigarette longage = new Cigarette("0", 0, 0);
		Cigarette winston = new Cigarette("雲絲頓", 0, 0);
		this.add(seven);
		this.add(longage);
		this.add(winston);
	}
}
