package unogame;

import java.util.Random;

import javax.swing.JOptionPane;

public class bots {
	
	//each bot needs to place a card on the table, based on the same rules
	//their cards need to be kept in string arrays, and new cards added to these if they dont have one they can play
	//when searching through their array for a card match, first one that works will be played
	//then, it will be removed
	//the face up card will be updated, and a message will be sent to the user, and it will go back to the user turn
	
	//arrays
	static String[] bot1cards = new String[11];	
	static String[] bot2cards = new String[11];	
	static String[] bot3cards = new String[11];	
	
	//count of cards in each array
	static int bot1amt = 0;
	static int bot2amt = 0;
	static int bot3amt = 0;
	
	//string to hold value to change gamecard to
	static String gameCardHolder = "";
	
	//method run on game start that fills bot arrays, 11 cards each
	public static void fillBotCards() {
		
		//create cards to be randomized
		cards.create();
		
		//bot 1
		for(int i = 0; i < 11; i++) {
			
			//random number, then random card from cardset
			Random r = new Random();
			int rand = r.nextInt(79);
			
			bot1cards[i] = "" + cards.cardSet[rand].cardCol + cards.cardSet[rand].cardNum;
		}
		
		//bot 2
		for(int i = 0; i < 11; i++) {
			
			
			//random number, then random card from cardset
			Random r = new Random();
			int rand = r.nextInt(79);
			
			bot2cards[i] = "" + cards.cardSet[rand].cardCol + cards.cardSet[rand].cardNum;
		}
		
		//bot 3
		for(int i = 0; i < 11; i++) {
			
			
			//random number, then random card from cardset
			Random r = new Random();
			int rand = r.nextInt(79);
			
			bot3cards[i] = "" + cards.cardSet[rand].cardCol + cards.cardSet[rand].cardNum;
		}
		
	}
	
	//method that updates the amount of cards left 
	public static void updateBotCardCount() {
		
		//bot 1
		int count1 = 0;
		
		for(int i = 0; i < 11; i++) {
			
			if((bot1cards[i] != null) && (bot1cards[i] != "")) {
				
				count1++;
			}
		}
		
		bot1amt = count1;
		
		//bot 2
		int count2 = 0;
		
		for(int k = 0; k < 11; k++) {
			
			if((bot2cards[k] != null) && (bot2cards[k] != "")) {
				
				count2++;
			}
		}
		
		bot2amt = count2;
		
		//bot 3
		int count3 = 0;
		
		for(int j = 0; j < 11; j++) {
			
			if((bot3cards[j] != null) && (bot3cards[j] != "")) {
				
				count3++;
			}
		}
		
		bot3amt = count3;
		
	}
	
	
	//runbots method runs all bots and changes turn
	public static void runBots() {
	
		//before running bots, check if user wins
		gamestate.userWinCheck();
		
		//run bots
		String topCard = game.topCard;
		
		//placing cards if they are able to be placed
		
		//bot1
		for(int i = 0; i < 11; i++) {
			
			//if color or number of bot card matches topcard, place it and discard from bot hand
			if(bot1cards[i] != "" ) {
				
			if((bot1cards[i].charAt(0) == topCard.charAt(0)) || (bot1cards[i].charAt(1) == topCard.charAt(1))) {
				
				game.topCard = bot1cards[i];
				topCard = game.topCard;
				
				JOptionPane.showMessageDialog(null, "CPU 1: " + bot1cards[i]);
				
				bot1cards[i] = "";
				break;		
			}
			
			}
		}
	
		
	//bot 2	
		for(int i = 0; i < 11; i++) {
			
			//if color or number of bot card matches topcard, place it and discard from bot hand
			if(bot2cards[i] != "" ) {
				
			if((bot2cards[i].charAt(0) == topCard.charAt(0)) || (bot2cards[i].charAt(1) == topCard.charAt(1))) {
				
				game.topCard = bot2cards[i];
				topCard = game.topCard;
				
				JOptionPane.showMessageDialog(null, "CPU 2: " + bot2cards[i]);
				
				bot2cards[i] = "";
				break;
			}
			
			}
			
			
		}
		
	//bot 3 
		for(int i = 0; i < 11; i++) {
			
			//if color or number of bot card matches topcard, place it and discard from bot hand
			if(bot3cards[i] != "" ) {
				
			if((bot3cards[i].charAt(0) == topCard.charAt(0)) || (bot3cards[i].charAt(1) == topCard.charAt(1))) {
				
				game.topCard = bot3cards[i];
				topCard = game.topCard;
				
				JOptionPane.showMessageDialog(null, "CPU 3: " + bot3cards[i]);
				
				bot3cards[i] = "";	
				break;	
			}
			
			}
			
		}
				
		//calling a method to check if bot won
		updateBotCardCount();
		
		if((bot1amt == 0)) {
			
			//announce bot 1 won in the final panel
			gamestate.winner = 1;
			//end the game
			gamestate.gameEnd();
		}
		
		if((bot2amt == 0)) {
			
			//announce bot 2 won in the final panel
			gamestate.winner = 2;
			
			//end the game
			gamestate.gameEnd();
		}

		if((bot3amt == 0)) {
			
			//announce bot 3 won in the final panel
			gamestate.winner = 3;
			
			//end the game
			gamestate.gameEnd();
		}
	gamestate.gameTurn();

	}
	
}
