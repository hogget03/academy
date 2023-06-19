package Lesson5;

public class Vinishko extends Product {
	String color;
	double fortress;

	public Vinishko() {
		super();
	}

	public Vinishko(String name, double price, double quantity) {
		super(name, price, quantity);
	}

	public Vinishko(String color, double fortress) {
		super();
		this.color = color;
		this.fortress = fortress;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getFortress() {
		return fortress;
	}

	public void setFortress(double fortress) {
		this.fortress = fortress;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		long temp;
		temp = Double.doubleToLongBits(fortress);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vinishko other = (Vinishko) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (Double.doubleToLongBits(fortress) != Double.doubleToLongBits(other.fortress))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vinishko [color=" + color + ", fortress=" + fortress + "]";
	}

}
