public class DeckOfCards {
	public static void main(String[] args) {
		String[] SUITS = { "Clubs","Diamonds","Spades","Hearts"};
		String[] RANK = { "2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		//int i = (int) (Math.random()*RANK.length);
		//int j = (int) (Math.random()*SUITS.length);
		//System.out.println(RANK[i]+ " of " + SUITS[j]);
		String[] deck = new String[RANK.length*SUITS.length];
		for (int i=0; i<SUITS.length;i++) {
			for (int j=0;j<RANK.length;j++){
				deck[RANK.length*i+j]=(RANK[j]+" of "+SUITS[i]);
			}
		}
		int n = deck.length;
		for (int i = 0; i< n; i++) {
			int r = i + (int) (Math.random()*(n-i));
			String temp = deck[r];
			deck[r]=deck[i];
			deck[i] = temp;
		}
		for (int i=0; i<deck.length;i++) {
			System.out.println(deck[i]);
		}
	}
}

		

