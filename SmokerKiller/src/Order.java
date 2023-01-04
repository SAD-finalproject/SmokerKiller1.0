
public class Order {
	private String name;
	private double price;
	
	public Order(String n ,double p) {
		name = n;
		price = p;
	}
	public String info() {
		String output = "";
		output += name + "  " ;
		output += "$" + (int)Math.ceil(price);
		return output;
	}
}
