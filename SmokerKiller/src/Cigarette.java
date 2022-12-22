
public class Cigarette {
	private String name;
	private double price;
	
	public Cigarette(String s ,double p) {
		name = s;
		price = p;
	}
	public String info() {
		String output = "";
		output += name + "  " ;
		output += "$" + (int)Math.ceil(price);
		return output;
	}
	public void adjustPrice(double rate) {
		price = price*rate;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
}
