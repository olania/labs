package lab6;

public class Test {
	public static void main(String[] args) {
		final long startTime = System.nanoTime();
		Item it1 = new Item(Products.TEA, 0.5, 12.3, "my personal choice");
		Item it2 = new Item(Products.BREAD, 3, 15.8, "my personal choice");
		Item it3 = new Item(Products.MILK, 4.5, 32.1, "my personal choice");
		it1.add(5);
		System.out.println("adding, should be 5 is: " + it1.getQuantity());
		System.out.println("removing, should be false, is: " + it1.remove(10));
		System.out.println(it1);
		it2.add(5);
		System.out.println("adding, should be 5 is: " + it2.getQuantity());
		System.out.println("removing, should be false, is: " + it2.remove(10));
		System.out.println(it2);
		it3.add(5);
		System.out.println("adding, should be 5 is: " + it3.getQuantity());
		System.out.println("removing, should be false, is: " + it3.remove(10));
		System.out.println(it3);
		final long duration = System.nanoTime() - startTime;
		System.out.println("The time for running the program: " + duration);
	}
}