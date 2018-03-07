package elevens1;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card1 = new Card("A", "Lion", 20);
		Card card2 = new Card("B", "Giraffe", 10);
		Card card3 = new Card("C", "Hippo", 15);
		
		System.out.println(card1.toString());
		System.out.println(card2.toString());
		System.out.println(card3.toString());
		
	}
}
