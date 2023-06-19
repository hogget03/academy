package Lesson5;

public class Shokoladka extends Product {
	String producer;
	boolean isBlack;

	public Shokoladka() {
		super();

	}

	public Shokoladka(String name, double price, double quantity) {
		super(name, price, quantity);
	}

	public Shokoladka(String producer, boolean isBlack) {
		super();
		this.producer = producer;
		this.isBlack = isBlack;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public boolean isBlack() {
		return isBlack;
	}

	public void setBlack(boolean isBlack) {
		this.isBlack = isBlack;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (isBlack ? 1231 : 1237);
		result = prime * result + ((producer == null) ? 0 : producer.hashCode());
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
		Shokoladka other = (Shokoladka) obj;
		if (isBlack != other.isBlack)
			return false;
		if (producer == null) {
			if (other.producer != null)
				return false;
		} else if (!producer.equals(other.producer))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Shokoladka [producer=" + producer + ", isBlack=" + isBlack + "]";
	}

}
