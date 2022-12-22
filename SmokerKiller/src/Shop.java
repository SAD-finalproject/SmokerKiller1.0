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
		Cigarette winston = new Cigarette("雲絲頓", 95);
		Cigarette seven = new Cigarette("七星", 125);
		Cigarette pm = new Cigarette("尊爵", 100);
		Cigarette vesta = new Cigarette("維斯塔", 100);
		Cigarette daviddoff = new Cigarette("大衛杜夫", 100);
		this.add(winston);
		this.add(seven);
		this.add(pm);
		this.add(vesta);
		this.add(daviddoff);
	
	}
	public String info(int index) {;
		return goods.get(index).info();
	}
	public void updatePrice() {
		
	}
}
