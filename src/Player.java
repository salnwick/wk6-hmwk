import java.util.ArrayList;
import java.util.List;

//Q3a
public class Player {

	// Q3b
	public List<Card> hand = new ArrayList<Card>();
	public String name;
	public int score;

	public Player() {
		score = 0;
	}

	// Q3c
	public void describe() {
		System.out.println("Player Info: " + name + score);
		for (Card hands : hand) {
			hands.describe();
		}

	}

	// Q3d
	public Card flip() {
		return hand.remove(0);
	}

//	//Q3e
//  public void draw()
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}

	// Q3f
	public void incrementScore() {
		score++;
	}
	

	
}
