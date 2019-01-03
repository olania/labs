package lab7;

import lab6.Products;
import lab7.AbstractBag;

public class SmallBag extends AbstractBag {
	public SmallBag() {
		super(5, 2);
		Product belt = new Product(Products.BELT, 1.0, 1.0);
		putIn(belt);
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		String result = "";
		for (int i = 0; i < content.length; i++) {
			result += content[i];
		}
		return (result);
	}

	@Override
	public void removeProduct(Products toRemove) {
		for (int i = 0; i < content.length; i++) {
			if (content[i].type == toRemove) {
				content[i] = null;
			}
		}

	}
}
