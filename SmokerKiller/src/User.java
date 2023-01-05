
public class User {
	private int limit;
	private String id;
	private int haveBought;
	private int buyThistime;
	
	public User(String i ,int l, int h) {
		limit = l;
		id = i;
		haveBought = h;
		buyThistime = 0;
	}
	public int getLimit() {
		return limit;
	}
	public int getHaveBought() {
		return haveBought;
	}
	public double calcPenalty() {
		double penalty = 1;
		
		if(buyThistime + haveBought >= limit) {
		if (limit < 3 && buyThistime + haveBought > limit) {
			penalty = Math.pow(1.2, buyThistime + haveBought - limit);
		}else if(limit>=3){
			penalty = Math.pow(1.3, buyThistime + haveBought - limit + 1);
		}
		}
		return penalty;
	}
	public void buy() {
		buyThistime++;
	}
	public void rebuy() {
		buyThistime--;
	}
	public void setHaveBought(int haveBought) {
		this.haveBought = haveBought;
	}
	public String getId() {
		return id;
	}

}
