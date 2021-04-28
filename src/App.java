//Q4a
public class App {

	public static void main(String[] args) {
	//Q4b	
	Deck deck = new Deck();
	Player p1 = new Player();
	Player p2 = new Player();
	deck.shuffle();
	
	//Q4c
	for (int i = 0; i < 52; i++) {
			if ( i % 2 == 0) {
				p1.draw(deck);
		} 
			else { 
				p2.draw(deck);
		}
	}
	
	//Q4d
	
	for (int i = 0; i < 26; i++) {
		Card p1Card = p1.flip();
		Card p2Card = p2.flip();
			if (p1Card.getValue() > p2Card.getValue()) {
				p1.incrementScore();
			}
			else if (p1Card.getValue() < p2Card.getValue()) {
					p2.incrementScore();
			}
				
	}
	//Q4e
	System.out.println("Player1 Final Score: " + p1.score);
	System.out.println("Player2 Final Score: " + p2.score);
	
	if (p1.score > p2.score) {
		System.out.println("PLAYER1 IS THE CHAMPION!!!");
		}
		else if (p1.score < p2.score) {
			System.out.println("PLAYER2 IS THE CHAMPION!!!");
		}
			else { 
				System.out.println("DRAW!!!");
		}
	
	}

}
