package unogame;

public class cards {

	//set of cards
	static card[] cardSet = new card[80];
	
	public static class card {
		
		//card object that will hold values of in use, color, and number
		
		int cardNum;
		String cardCol; // R, B, G, Y
		
		
		//number and color setters
		
		public void setColor(String col) {
			cardCol = col;
		}
		
		public void setNumber(int num) {
			cardNum = num;
		}
	
		
	}
	
	public static void create () {
		
		//for loop creating the objects
		for(int i = 0; i < cardSet.length; i++) {
			
			cardSet[i] = new card();
			
		}
		
		//for loops for setting card values
		
		//red cards
		for(int i = 0; i < 10; i++) {
			cardSet[i].setColor("R");
			cardSet[i].setNumber(i);
		}
		
		for(int i = 10; i < 20; i++) {
			cardSet[i].setColor("R");
			cardSet[i].setNumber(i - 10);
		}
		
		//green cards
		
		for(int i = 20; i < 30; i++) {
			cardSet[i].setColor("G");
			cardSet[i].setNumber(i - 20);
		}
		
		for(int i = 30; i < 40; i++) {
			cardSet[i].setColor("G");
			cardSet[i].setNumber(i - 30);
		}
		
		//blue cards
		
		for(int i = 40; i < 50; i++) {
			cardSet[i].setColor("B");
			cardSet[i].setNumber(i - 40);
		}
		
		for(int i = 50; i < 60; i++) {
			cardSet[i].setColor("B");
			cardSet[i].setNumber(i - 50);
		}
		
		//yellow cards
		
		for(int i = 60; i < 70; i++) {
			cardSet[i].setColor("Y");
			cardSet[i].setNumber(i - 60);
		}
		
		for(int i = 70; i < 80; i++) {
			cardSet[i].setColor("Y");
			cardSet[i].setNumber(i - 70);
		}
	}
	
}
