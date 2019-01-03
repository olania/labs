package lab7;

import lab6.Products;
import lab7.AbstractBag;

public class BigBag extends AbstractBag {
	protected boolean onRolls = false;

	public BigBag() {
		super(15, 20);
		// TODO Auto-generated constructor stub
	}

	public boolean onRolls() {
		return (this.onRolls);
	}

	public void toggleRolls() {
		this.onRolls = !this.onRolls;
	}

	@Override
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
