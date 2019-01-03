package lab7;

import lab6.Products;

public abstract class AbstractBag {
	protected Product[] content;
	// define necessary fields
	protected double maxWeight;
//	protected double weight;
//	protected double size;
//	protected int items;

	public AbstractBag(int size, double maxWeight) {
		content = new Product[size];
//		this.size = size;
//		this.items = 0;
		this.maxWeight = maxWeight;
//		this.weight = 0.0;

	}

	public abstract String toString();

	public boolean putIn(Product it) {

		boolean result = false;
		for (int i = 0; i < content.length; i++) {
			if (content[i] == null) {
				if (getTotalWeight() + it.weight <= maxWeight) {
					content[i] = it;
					result = true;
					break;
				}
			}
		}
		return (result);
	}

	public int putIn(Product[] its) {
		int result = 0;
		for (int i = 0; i < its.length; i++) {
			if (putIn(its[i]))
				result++;
		}
		// put your code here
		// returns the number of (staring) items that were put in
		return (result);
	}

	public double getTotalWeight() {
		double result = -0.0;
		// put your code here
		for (Product item : content) {
			if (item != null)
				result += item.weight;
		}
		return result;
	}

	public double getTotalWeight(Products product) {
		double result = -0.0;
		// put your code here
		for (Product item : content) {
			if (item.type == product)
				result += item.weight;
		}
		return result;
	}

	public abstract void removeProduct(Products toRemove);

}
