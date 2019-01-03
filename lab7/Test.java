package lab7;

// import lab6.Item;
import lab6.Products;

public class Test {
	public static int emptyPlaces(AbstractBag bag) {
		int emptyPlaces = 0;
		for(Product item: bag.content) {
			if(item == null) emptyPlaces++; 
		}
		return(emptyPlaces);
	}
	public static boolean isBeltIn(AbstractBag bag) {
		for(Product item: bag.content) {
			if(item.type == Products.BELT) return(true); 
		}
		return(false);
	}
	public static void main(String[] args) {
//		final long startTime = System.nanoTime();
		SmallBag sb = new SmallBag();
		BigBag bb = new BigBag();
		Product milk = new Product (Products.MILK, 2.0, 0.5);
		//Product belt = new Product(Products.BELT, 1.0, 1.0);
		
		
		System.out.println("Should be 4 empty places in small bag, is: " + emptyPlaces(sb));
		System.out.println("Should be 15 empty places in big bag, is: " + emptyPlaces(bb));
		
		System.out.println("Small bag should have a BELT, is: " + isBeltIn(sb));
		
		System.out.println("Big bag shouldn't be on rolls, is: " + bb.onRolls);
		System.out.println("Let's put it on roolls!");
		bb.toggleRolls();
		System.out.println("now big bag should be on rolls, is: " + bb.onRolls);
		
		sb.putIn(milk);
		sb.putIn(milk);
		System.out.println("we put milk twice, Should be 2 empty places in small bag, is: " + emptyPlaces(sb));
		System.out.println("Now we cannot put anything, because weight is max, let's put another 2 portions of milk\n, was it put in? : " + sb.putIn(milk) + sb.putIn(milk));
		
		System.out.println("we still should have 2 empty places in small bag (milk wasn't put in), is: " + emptyPlaces(sb));
		
		
		System.out.println(sb);
		System.out.println(bb);

		
//		final long duration = System.nanoTime() - startTime;
//		System.out.println("The time for running the program: " + duration);
	}
}