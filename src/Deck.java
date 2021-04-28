import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Q2
public class Deck {

	private  String[] suits = {" Hearts", "Diamond", "Spade", "Clubs" };
	
	//Q2a
	private List<Card> cards = new ArrayList<Card>();

	//Q2b
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	//Q2c
	public Card draw() {
		return cards.remove(0);
	}


	Deck(){
		for (int rank= 2; rank <=14; rank++) {
			for(String suit: suits) {
				cards.add(new Card(rank,suit));
				
				
			}
		}
	}
	
	
}
