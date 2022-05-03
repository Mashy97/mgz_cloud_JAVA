package collectionApp;

class Item {
	private int num;
	private String name;
	private int quantity; 
	private int price;

	Item(int num, String name, int quantity, int price){
		super();
		this.num = num;
		this.name = name;
		this.quantity =quantity;
		this.price = price;
	}

	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}

	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
		return "Item [num=" + num + ", name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
}
