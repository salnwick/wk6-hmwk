
//Q1
public class Card {

	// Q1a
	private int value;
	// Q1b
	private String name;
	
	public Card() {
		this.value = 0;
		this.name = "";
	}

	// Q1c
	public Card(int value, String name) {
		this.value = value;
		this.name = name;
	}

	// Q1d Getters and Setters
	public void setValue(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	// Q1e (prints out information about a card)
	public void describe() {
		System.out.println("Card:" + getCardValueInString(value)  + " of "+ name);
	}

	public String getCardValueInString(int value) {
		String val = "";
		switch (value) {
		case 2:
			val = "Two";
		case 3:
			val = "Three";
		case 4:
			val = "Four";
		case 5:
			val = "Five";
		case 6:
			val = "Six";
		case 7:
			val = "Seven";
		case 8:
			val = "Eight";
		case 9:
			val = "Nine";
		case 10:
			val = "Ten";
		case 11:
			val = "Jack";
		case 12:
			val = "Queen";
		case 13:
			val = "King";
		case 14:
			val = "Ace";
		
		}

		return val;
	}

	
	
}
