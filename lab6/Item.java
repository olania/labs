package lab6;

import java.text.DecimalFormat;

public class Item {
  protected Products type;
  protected double weight = 1.00, price = 100.00;
  protected int quantity = 0;
  protected String comment = "";
  protected DecimalFormat f = new DecimalFormat("#.##");
  public Item(Products product, double weight, double price, String comment) {
    this.type = product;
    if (weight < 100.00 && weight > 0.01) {
      this.weight = weight;
    }
    if (price < 10000.00 && price > 1.00) {
      this.price = price;
    }
    if (comment != null) {
      this.comment = comment;
    }
  }

  public void add(int quantity) {
    if (quantity >= 0) {
      this.quantity += quantity;
    }
  }

  public boolean remove(int number) {
    // returns false if the required number exceeds the quantity, true otherwise
    if (number > quantity && number >= 0) {
      return false;
    } else {
      quantity -= number;
      return true;
    }
  }

  public int getQuantity() {
    // the getter for the quantity field
    return (quantity);
  }

  public String toString() {
    String result = quantity + " x " + type + ", weight: " + weight;
    if (quantity >= 0) {
      result += ", cost: " + f.format(price*quantity);
    }
    if (comment != "") {
      result += " (" + comment + ")";
    }
    return result;
  }
}