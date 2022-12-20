import java.util.ArrayList;

public class Shop {
	private ArrayList<Cigarette> goods;
	
	public Shop() {
		this.goods = new ArrayList<Cigarette>();
	}
	
	public void add(Cigarette k) {
		goods.add(k);
	}
}
