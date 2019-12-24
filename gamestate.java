package unogame;

public class gamestate {
	//THIS WILL TRACK THE ROUND, MOVE FROM PLAYER TO CPU, CHECK IF ANYONE WINS, ETC//
	
		//keeping track of user turn
		static boolean turn = true;
	
		//winner holder
		static int winner = 0; //0 for user, 1-3 for bots 1-3
		
		//method iterating through turns 1-4, for player and 3 bots. on each bot turn, methods from bots class
		//will be called to determine what they will do on thier turn
		
		public static boolean gameTurn() {
			
			//update bot card counts
			bots.updateBotCardCount();
			
			//switching turn
			if(turn == true) {
				//user turn
				turn = false;
				return true;
			}
			
			if(turn == false) {
				//bots
				turn = true;
				return false;
			}
			
			return true;
		}
	

	//method that can be called to check if it is the users turn, so that they are allowed to press buttons
	
	public static boolean userTurnCheck() {
		
		if(turn == true) {
			
		    //gameTurn();
			return true;
		}
		
		return false;
	}
	
	
	//function checking if THE USER WINS
	public static void userWinCheck() {
		
		if(game.userCardCount() == 0) {
			winner = 0;
			gameEnd();
		}
		
		
	}
	
	//function ending the game
	public static void gameEnd() {
		
		//opens game over window
		GameOver finWindow = new GameOver();
		finWindow.open();
	}
	
}