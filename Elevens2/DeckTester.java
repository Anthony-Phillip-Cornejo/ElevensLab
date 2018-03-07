package elevens2;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	public static void main(String[] args) {
		String[] ranks1 = {"jack", "queen", "king"};
		String[] ranks2 = {"2", "ace", "10"};
		String[] ranks3 = {"5", "7", "9"};
		
		String[] suits1 = {"clubs" , "hearts", "diamonds"}; 
		String[] suits2 = {"clubs" , "diamonds"};
		String[] suits3 = {"red", "blue", "black"};
		
		int[] values1 = {11, 12, 13};
		int[] values2 = {2, 1, 10};
		int[] values3 = {5, 7, 9};
		
		Deck deck1 = new Deck(ranks1, suits1, values1);
		Deck deck2 = new Deck(ranks2, suits2, values2);
		Deck deck3 = new Deck(ranks3, suits3, values3);
		
		deck2.deal();
		deck2.deal();
		
		System.out.println(deck1.toString());
		System.out.print("---------------------------------------------------------------------------------------");
		System.out.println(deck2.toString());
		System.out.print("---------------------------------------------------------------------------------------");
		System.out.println(deck3.toString());
		}
}
