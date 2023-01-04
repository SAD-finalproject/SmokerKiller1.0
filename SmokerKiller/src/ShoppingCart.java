import java.util.ArrayList;

public class ShoppingCart {
	private ArrayList<Order> orders;
	private int quantity;
	private int total;
	
	public ShoppingCart(int t) {
		quantity = 0;
		total = t;
		orders  = new ArrayList<Order>();
	}
	public void add(Cigarette a) {
		Order n = new Order(a.getName(), a.getPrice());
		orders.add(n);
		quantity++;
		total++;
	}
	public void printResult() {
		for (int i = 0; i < orders.size(); i++) {
			System.out.println(orders.get(i).info());
		}
	}
	public int getQuantity() {
		return quantity;
	}
}
