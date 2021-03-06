package domain;

public class Product {
	private int productId;
	private String name;
	private String description;
	private double price;
	private int stock;

	public Product() {
	}

	public Product(int productId, String name, String description, double d, int stock) {
		setProductId(productId);
		setName(name);
		setDescription(description);
		setPrice(d);
		setStock(stock);
	}

	public Product(String name, String description, double d, int stock) {
		setName(name);
		setDescription(description);
		setPrice(d);
		setStock(stock);
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.isEmpty()) {
			throw new DomainException("No name given");
		}
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		if (description.isEmpty()) {
			throw new DomainException("No description given");
		}
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price < 0) {
			throw new DomainException("Give a valid price");
		}
		this.price = price;
	}
	
	public void setPrice(String price) {
		if (price.isEmpty()) {
			throw new DomainException("No price given");
		}
		setPrice(Double.valueOf(price));
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		if (stock < 0) {
			throw new DomainException("Give a valid stock");
		}
		this.stock = stock;
	}
	
	public void setStock(String stock) {
		if (stock.isEmpty()) {
			throw new DomainException("No stock given");
		}
		setStock(Integer.valueOf(stock));
	}


	@Override
	public boolean equals(Object o) {
		Product product = (Product) o;
		if (this.getProductId() == product.getProductId() && this.getName().equals(product.getName())
				&& this.getDescription().equals(product.getDescription()) && this.getPrice() == product.getPrice()) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return getName() + ": " + getDescription() + " - " + getPrice();
	}

}
