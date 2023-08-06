package by.academy.lesson16;

public class HeavyBox {
	int weight;
	int width;
	int height;
	int depth;

	HeavyBox(int w, int h, int d, int m) {
		width = w;
		height = h;
		depth = d;
		weight = m;
	}

	@Override
	public String toString() {
		return "HeavyBox [weight=" + weight + ", width=" + width + ", height=" + height + ", depth=" + depth + "]";
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

}
