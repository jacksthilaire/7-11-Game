package unogame;

import java.util.Random;

import javax.swing.JOptionPane;

import unogame.cards.card;

//THIS CLASS KEEPS TRACK OF GAME VARIABLES AND STATES

public class game {

	//string array holding card labels for the user, the data to be manipulated
	static String[] cardLabels = new String[7];
	
	//the top card holder, shows the top card value to the user
	static String topCard = "";
	
	//card draw method, selects a random card
	public static card cardDraw() {
			
		//choosing a random card for selection
		Random r = new Random();
		
		int rand = r.nextInt(79);
		
		//setting
		return cards.cardSet[rand];
	}
	
	
	//places card in an open spot on draw, supports drawCardUpdate
	public static void placeCard(String newCard) {
		
		for(int i = 0; i < 7; i++) {
			
			if((cardLabels[i] == null) || (cardLabels[i] == "")) {
				
				cardLabels[i] = newCard;
				return;
			}
		}
		
	}
	
	//method that creates a card and updates the user's cards, uses card draw method and place card method
	public static void drawCardUpdate() {
		
		
		//drawing a new card, displaying to user, putting in user hand
		cards.create();
		card newCard = game.cardDraw();
		
		//displaying it and then placing it in hand
		String data = "" + newCard.cardCol + newCard.cardNum;	
		//JOptionPane.showMessageDialog(null, data);
		
		placeCard(data);
		
		
	}
	
	
	//adds the card that the user selected to the top of the deck, if color or number matches
	public static void addToDeck(String inputCard, int cardNumber) {
		
		String checkString = topCard;
		
		//if the top card color or number matches the input
		if((checkString.charAt(0) == inputCard.charAt(0)) || (checkString.charAt(1) == inputCard.charAt(1))){
			
			//switch the top card to the selected card, update card labels, then switch turns (needs to be added)
			topCard = inputCard;
			cardLabels[cardNumber] = "";
		}
		else {
			
			JOptionPane.showMessageDialog(null, "Must match color or number");
			
		}
		
	}
	
	//initializer method for topcard, called from game window
	public static void topInitializer() {
		
		//make a new random card from the set
		cards.create();
		card newCard = game.cardDraw();
		topCard = "" + newCard.cardCol + newCard.cardNum;
		
		//bots initializing
		bots.fillBotCards();
		
	}
	
	
	//method checking how many cards are in the users hand
	public static int userCardCount() {
		
		int count = 0;
		for(int i = 0; i < 7; i++) {
			
			if((cardLabels[i] != "") && (cardLabels[i] != null)) {
				count++;
			}
		}
		return count;
	}
	
	

}
