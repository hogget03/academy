package by.academy.HW3.Deal;

import java.util.Arrays;
import java.util.Objects;

public class Deal {

	String addres;
	User buyer;
	User seller;
	Product[] products;
	int index = 0;

	public Deal() {
		super();
		products = new Product[10];
	}

	public Deal(String addres, User buyer, User seller, Product[] products) {
		this.addres = addres;
		this.buyer = buyer;
		this.seller = seller;
		this.products = products;
	}

	public int calcPrice() {
		int price = 0;
		for (Product p : products) {
			if (p == null) {
				continue;
			}

			price += p.calcFullPrice();
		}
		return price;
	}

	/**
	 * @return the addres
	 */
	public String getAddres() {
		return addres;
	}

	/**
	 * @param addres the addres to set
	 */
	public void setAddres(String addres) {
		this.addres = addres;
	}

	/**
	 * @return the buyer
	 */
	public User getBuyer() {
		return buyer;
	}

	/**
	 * @param buyer the buyer to set
	 */
	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}

	/**
	 * @return the seller
	 */
	public User getSeller() {
		return seller;
	}

	/**
	 * @param seller the seller to set
	 */
	public void setSeller(User seller) {
		this.seller = seller;
	}

	/**
	 * @return the products
	 */
	public Product[] getProducts() {
		return products;
	}

	/**
	 * @param products the products to set
	 */
	public void setProducts(Product[] products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Deal [addres=" + addres + ", buyer=" + buyer + ", seller=" + seller + ", products="
				+ Arrays.toString(products) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(products);
		result = prime * result + Objects.hash(addres, buyer, seller);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deal other = (Deal) obj;
		return Objects.equals(addres, other.addres) && Objects.equals(buyer, other.buyer)
				&& Arrays.equals(products, other.products) && Objects.equals(seller, other.seller);
	}

	private void grows() {
		Product[] temp = new Product[products.length + 1];
		System.arraycopy(products, 0, temp, 0, products.length);
		products = temp;
	}

	public void addProduct(Product p) {
		if (index >= products.length) {
			grows();
		}
		products[index++] = p;
	}
	public void remove() {
		if(index == 0) {
			return;
		}
		products[--index] = null;
	}
//	public static void remove (int ) {
//		if(items == null || items.length == 0) {
//			return;
//		}
//		if (index >= 0 && index < currentIndex) {
//			items [index]=null;
//		}else {
//			return;
//		}
//	}
}