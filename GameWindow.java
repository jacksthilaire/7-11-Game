package unogame;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import unogame.cards.card;

import org.eclipse.swt.widgets.Button;

import javax.swing.JOptionPane;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.TouchListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.events.TouchEvent;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Group;



public class GameWindow {

	protected Shell shlUno;
	private static Text c1text;
	private static Text c2text;
	private static Text c3text;
	private static Text gametext;
	private Button c1button;
	private Button c2button;
	private Button c3button;
	private Label bot1lbl;
	private Label bot2lbl;
	private Label bot3lbl;
	private Text bot1count;
	private Text bot2count;
	private Text bot3count;
	private Button skipButton;
	private Button cardCount;
	private static Text c4text;
	private Button c4button;
	private Button c5button;
	private static Text c5text;
	private static Text c6text;
	private Button c6button;
	private static Text c7text;
	private Button c7button;
	private Label lblUserControls;

	
	/**
	 * Launch the application.
	 * @param args
	 */
/*	public static void main(String[] args) {
		try {
			GameWindow window = new GameWindow();
			window.open();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	/**
	 * Open the window.
	 */
	public void open() {
		
		//filling the array of cards//
		cards.create();

		Display display = Display.getDefault();
		createContents();
		shlUno.open();
		shlUno.layout();
		while (!shlUno.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	
	//does the same thing as user draw card button, but fills for initialization
	public static void drawCardsInitial() {
		
		//does it one time
		
		game.drawCardUpdate();
		
		//setting labels
		c1text.setText("" + game.cardLabels[0]);
		c2text.setText("" + game.cardLabels[1]);
		c3text.setText("" + game.cardLabels[2]);
		c4text.setText("" + game.cardLabels[3]);
		c5text.setText("" + game.cardLabels[4]);
		c6text.setText("" + game.cardLabels[5]);
		c7text.setText("" + game.cardLabels[6]);
		
		
		//setting colors of labels
		Device device = Display.getCurrent ();
		Color red = new Color (device, 184, 0, 0);
		Color blue = new Color (device, 0, 0, 145);
		Color green = new Color (device, 0, 124, 0);
		Color yellow = new Color (device, 220, 207, 0);
		
		//for each card, determine what color it should be and then set it
		
		//card 1
		if((game.cardLabels[0] != null) && (game.cardLabels[0] != "")){
			
		char c1char = game.cardLabels[0].charAt(0);
		
		if(c1char == 'R') {
			c1text.setBackground(red);
		}
		else if(c1char == 'B') {
			c1text.setBackground(blue);
		}
		else if(c1char == 'G') {
			c1text.setBackground(green);
		}
		else {
			c1text.setBackground(yellow);
		}
		
		}
		
		
		//card 2
		if((game.cardLabels[1] != null) && (game.cardLabels[1] != "")){
			
			char c2char = game.cardLabels[1].charAt(0);
			
			if(c2char == 'R') {
				c2text.setBackground(red);
			}
			else if(c2char == 'B') {
				c2text.setBackground(blue);
			}
			else if(c2char == 'G') {
				c2text.setBackground(green);
			}
			else {
				c2text.setBackground(yellow);
			}
			
			}
		
		
		//card 3
		if((game.cardLabels[2] != null) && (game.cardLabels[2] != "")){
			
			char c3char = game.cardLabels[2].charAt(0);
			
			if(c3char == 'R') {
				c3text.setBackground(red);
			}
			else if(c3char == 'B') {
				c3text.setBackground(blue);
			}
			else if(c3char == 'G') {
				c3text.setBackground(green);
			}
			else {
				c3text.setBackground(yellow);
			}
			
			}
		
		//card 4
		if((game.cardLabels[3] != null) && (game.cardLabels[3] != "")){
					
					char c4char = game.cardLabels[3].charAt(0);
					
					if(c4char == 'R') {
						c4text.setBackground(red);
					}
					else if(c4char == 'B') {
						c4text.setBackground(blue);
					}
					else if(c4char == 'G') {
						c4text.setBackground(green);
					}
					else {
						c4text.setBackground(yellow);
					}
					
					}
		
	
	//card 5
			if((game.cardLabels[4] != null) && (game.cardLabels[4] != "")){
				
				char c5char = game.cardLabels[4].charAt(0);
				
				if(c5char == 'R') {
					c5text.setBackground(red);
				}
				else if(c5char == 'B') {
					c5text.setBackground(blue);
				}
				else if(c5char == 'G') {
					c5text.setBackground(green);
				}
				else {
					c5text.setBackground(yellow);
				}
				
			}
			
			//card 6
			if((game.cardLabels[5] != null) && (game.cardLabels[5] != "")){
				
				char c6char = game.cardLabels[5].charAt(0);
				
				if(c6char == 'R') {
					c6text.setBackground(red);
				}
				else if(c6char == 'B') {
					c6text.setBackground(blue);
				}
				else if(c6char == 'G') {
					c6text.setBackground(green);
				}
				else {
					c6text.setBackground(yellow);
				}
				
				}
			
			//card 7
			if((game.cardLabels[6] != null) && (game.cardLabels[6] != "")){
				
				char c7char = game.cardLabels[6].charAt(0);
				
				if(c7char == 'R') {
					c7text.setBackground(red);
				}
				else if(c7char == 'B') {
					c7text.setBackground(blue);
				}
				else if(c7char == 'G') {
					c7text.setBackground(green);
				}
				else {
					c7text.setBackground(yellow);
				}
				
				}
		}

	
	//changes top card color to what it should be based on topcard
	public static void topCardCol(String topCard) {
		
		Device device = Display.getCurrent ();
		Color red = new Color (device, 184, 0, 0);
		Color blue = new Color (device, 0, 0, 145);
		Color green = new Color (device, 0, 124, 0);
		Color yellow = new Color (device, 220, 207, 0);
		
		
		if((topCard != null) && (topCard != "")){
			
			char topCol = topCard.charAt(0);
			
			if(topCol == 'R') {
				gametext.setBackground(red);
			}			
			else if(topCol == 'B') {
				gametext.setBackground(blue);
			}
			else if(topCol == 'G') {
				gametext.setBackground(green);
			}
			else {
				gametext.setBackground(yellow);
			}
			
			}
	}
	/**
	 * Create contents of the window.
	 * @wbp.parser.entryPoint
	 */
	protected void createContents() {
		shlUno = new Shell();
		shlUno.setSize(876, 770);
		shlUno.setText("7-11");
		shlUno.setLayout(null);
		
		//changing the background color
		Device device = Display.getCurrent ();
		Color backColor = new Color (device, 199, 202, 206);
				
		shlUno.setBackground(backColor);
				
		//draw card deck button
		Button btnDisplayCards = new Button(shlUno, SWT.NONE);
		btnDisplayCards.setBounds(326, 215, 106, 142);
		btnDisplayCards.setText("Draw Card");
		
		//cards text boxes, and game deck box
		c1text = new Text(shlUno, SWT.BORDER);
		c1text.setBounds(21, 548, 94, 120);
		
		c2text = new Text(shlUno, SWT.BORDER);
		c2text.setBounds(143, 548, 94, 120);
		
		c3text = new Text(shlUno, SWT.BORDER);
		c3text.setBounds(264, 548, 94, 120);
		
		c4text = new Text(shlUno, SWT.BORDER);
		c4text.setBounds(382, 548, 94, 120);
		
		c5text = new Text(shlUno, SWT.BORDER);
		c5text.setBounds(501, 548, 94, 120);
		
		c6text = new Text(shlUno, SWT.BORDER);
		c6text.setBounds(620, 548, 94, 120);
		
		c7text = new Text(shlUno, SWT.BORDER);
		c7text.setBounds(739, 548, 94, 120);
		
		gametext = new Text(shlUno, SWT.BORDER);
		gametext.setBounds(177, 215, 106, 142);
		
	 
		
		//intitializing the top card
		
		game.topInitializer();
		gametext.setText(game.topCard);
		
		//top card color
		//topcardcol method
		topCardCol(game.topCard);
		
		
		//initialize player hand, draw all needed cards by calling the draw cards seven times
		drawCardsInitial();
		drawCardsInitial();
		drawCardsInitial();
		drawCardsInitial();
		drawCardsInitial();
		drawCardsInitial();
		drawCardsInitial();
		
		
		//play card 1
		c1button = new Button(shlUno, SWT.NONE);
		c1button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				
				//check if user turn
				boolean turncheck = gamestate.userTurnCheck();
				
				
				if(turncheck == true) {
					
				//placing the card
				game.addToDeck(game.cardLabels[0], 0);
				
				gametext.setText(game.topCard);
				c1text.setText("");
				gamestate.gameTurn();
				
				//running bots
				bots.runBots();
				
				//setting the game card
				gametext.setText(game.topCard);
				topCardCol(game.topCard);
				
				//resetting the card just played
				Device device = Display.getCurrent();
				Color white = new Color (device, 252, 252, 252);
				
				c1text.setBackground(white);
				
				}
			}
		});
		c1button.setBounds(21, 507, 94, 35);
		c1button.setText("Play Card");
		
		//play card 2
		c2button = new Button(shlUno, SWT.NONE);
		c2button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				
				//check if user turn
				boolean turncheck = gamestate.userTurnCheck();
				
				if(turncheck == true) {
				game.addToDeck(game.cardLabels[1], 1);
				
				gametext.setText(game.topCard);
				c2text.setText("");
				gamestate.gameTurn();
				
				//running bots
				bots.runBots();
				
				//setting the game card
				gametext.setText(game.topCard);
				topCardCol(game.topCard);
				
				//resetting the card just played
				Device device = Display.getCurrent();
				Color white = new Color (device, 252, 252, 252);
				
				c2text.setBackground(white);
				
				}
			}
		});
		c2button.setBounds(143, 507, 94, 35);
		c2button.setText("Play Card");
		
		
		//play card 3
		c3button = new Button(shlUno, SWT.NONE);
		c3button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				
				//check if user turn
				boolean turncheck = gamestate.userTurnCheck();
				
				if(turncheck == true) {
				game.addToDeck(game.cardLabels[2], 2);
				
				gametext.setText(game.topCard);
				c3text.setText("");
				gamestate.gameTurn();
				
				
				//running bots
				bots.runBots();
				
				//setting the game card
				gametext.setText(game.topCard);
				topCardCol(game.topCard);
				
				//resetting the card just played
				Device device = Display.getCurrent();
				Color white = new Color (device, 252, 252, 252);
				
				c3text.setBackground(white);
				
				}
			}
		});
		c3button.setBounds(264, 507, 94, 35);
		c3button.setText("Play Card");
		
		bot1lbl = new Label(shlUno, SWT.NONE);
		bot1lbl.setBounds(58, 45, 81, 25);
		bot1lbl.setText("Bot 1");
		
		bot2lbl = new Label(shlUno, SWT.NONE);
		bot2lbl.setBounds(264, 45, 81, 25);
		bot2lbl.setText("Bot 2");
		
		bot3lbl = new Label(shlUno, SWT.NONE);
		bot3lbl.setBounds(485, 45, 81, 25);
		bot3lbl.setText("Bot 3");
		
		bot1lbl.setBackground(backColor);
		bot2lbl.setBackground(backColor);
		bot3lbl.setBackground(backColor);
		
		bot1count = new Text(shlUno, SWT.BORDER);
		bot1count.setBounds(58, 76, 40, 31);
		
		bot2count = new Text(shlUno, SWT.BORDER);
		bot2count.setBounds(264, 76, 40, 31);
		
		bot3count = new Text(shlUno, SWT.BORDER);
		bot3count.setBounds(485, 76, 40, 31);
	
		skipButton = new Button(shlUno, SWT.NONE);
		skipButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				
				//if the users hand is full, 
				if(game.userCardCount() == 7) {
					
					gamestate.gameTurn();
					
					//running bots
					bots.runBots();
					
					//setting the game card
					gametext.setText(game.topCard);
				}
			}
		});
		skipButton.setBounds(642, 173, 191, 35);
		skipButton.setText("Skip Turn");
		
		cardCount = new Button(shlUno, SWT.NONE);
		cardCount.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				
				//update card count, set text
				bots.updateBotCardCount();
				bot1count.setText("" + bots.bot1amt);
				bot2count.setText("" + bots.bot2amt);
				bot3count.setText("" + bots.bot2amt);
				
			}
		});
		cardCount.setBounds(642, 122, 191, 35);
		cardCount.setText("Update Bot Card Count");
		
		//place card 4
		
		c4button = new Button(shlUno, SWT.NONE);
		c4button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				
				//check if user turn
				boolean turncheck = gamestate.userTurnCheck();
				
				if(turncheck == true) {
				game.addToDeck(game.cardLabels[3], 3);
				
				gametext.setText(game.topCard);
				c4text.setText("");
				gamestate.gameTurn();
				
				
				//running bots
				bots.runBots();
				
				//setting the game card
				gametext.setText(game.topCard);
				topCardCol(game.topCard);
				
				//resetting the card just played
				Device device = Display.getCurrent();
				Color white = new Color (device, 252, 252, 252);
				
				c4text.setBackground(white);
				
				}
			}
		});
		c4button.setText("Play Card");
		c4button.setBounds(382, 507, 94, 35);
		
		//play card 5
		c5button = new Button(shlUno, SWT.NONE);
		c5button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				
				//check if user turn
				boolean turncheck = gamestate.userTurnCheck();
				
				if(turncheck == true) {
				game.addToDeck(game.cardLabels[4], 4);
				
				gametext.setText(game.topCard);
				c5text.setText("");
				gamestate.gameTurn();
				
				
				//running bots
				bots.runBots();
				
				//setting the game card
				gametext.setText(game.topCard);
				topCardCol(game.topCard);
				
				//resetting the card just played
				Device device = Display.getCurrent();
				Color white = new Color (device, 252, 252, 252);
				
				c5text.setBackground(white);
				}
				
			}
		});
		c5button.setText("Play Card");
		c5button.setBounds(501, 507, 94, 35);
		
		
		//place card 6
		c6button = new Button(shlUno, SWT.NONE);
		c6button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				
				//check if user turn
				boolean turncheck = gamestate.userTurnCheck();
				
				if(turncheck == true) {
				game.addToDeck(game.cardLabels[5], 5);
				
				gametext.setText(game.topCard);
				c6text.setText("");
				gamestate.gameTurn();
				
				
				//running bots
				bots.runBots();
				
				//setting the game card
				gametext.setText(game.topCard);
				topCardCol(game.topCard);
				
				//resetting the card just played
				Device device = Display.getCurrent();
				Color white = new Color (device, 252, 252, 252);
				
				c6text.setBackground(white);
				}
			}
		});
		c6button.setText("Play Card");
		c6button.setBounds(620, 507, 94, 35);
		
		
		//place card 7
		c7button = new Button(shlUno, SWT.NONE);
		c7button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				
				//check if user turn
				boolean turncheck = gamestate.userTurnCheck();
				
				if(turncheck == true) {
				game.addToDeck(game.cardLabels[6], 6);
				
				gametext.setText(game.topCard);
				c7text.setText("");
				gamestate.gameTurn();
				
				
				//running bots
				bots.runBots();
				
				//setting the game card
				gametext.setText(game.topCard);
				topCardCol(game.topCard);
				
				//resetting the card just played
				Device device = Display.getCurrent();
				Color white = new Color (device, 252, 252, 252);
				
				c7text.setBackground(white);
				}
			}
		});
		c7button.setText("Play Card");
		c7button.setBounds(739, 507, 94, 35);
		
		lblUserControls = new Label(shlUno, SWT.NONE);
		lblUserControls.setBounds(677, 45, 132, 25);
		lblUserControls.setText("User Controls");
		lblUserControls.setBackground(backColor);
		
		Label label = new Label(shlUno, SWT.SEPARATOR | SWT.HORIZONTAL);
		label.setBounds(21, 455, 812, 2);
		
		Label label_1 = new Label(shlUno, SWT.SEPARATOR | SWT.VERTICAL);
		label_1.setBounds(634, 144, -39, 266);
		
		Label label_2 = new Label(shlUno, SWT.SEPARATOR | SWT.VERTICAL);
		label_2.setBounds(626, 23, 2, 434);
		
		///////////////////////////////////////////////
		//DRAW CARDS//
		///////////////////////////////////////////////
		
		
		//draw card listener (display cards)
		btnDisplayCards.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				
				//check if user turn
				boolean turncheck = gamestate.userTurnCheck();
				
				if(turncheck == true && (game.userCardCount() < 7)) {
				//calling update function, getting color
				game.drawCardUpdate();
				
				//setting labels
				c1text.setText("" + game.cardLabels[0]);
				c2text.setText("" + game.cardLabels[1]);
				c3text.setText("" + game.cardLabels[2]);
				c4text.setText("" + game.cardLabels[3]);
				c5text.setText("" + game.cardLabels[4]);
				c6text.setText("" + game.cardLabels[5]);
				c7text.setText("" + game.cardLabels[6]);
				
				
				//setting colors of labels
				Device device = Display.getCurrent ();
				Color red = new Color (device, 184, 0, 0);
				Color blue = new Color (device, 0, 0, 145);
				Color green = new Color (device, 0, 124, 0);
				Color yellow = new Color (device, 220, 207, 0);
				
				//for each card, determine what color it should be and then set it
				
				//card 1
				if((game.cardLabels[0] != null) && (game.cardLabels[0] != "")){
					
				char c1char = game.cardLabels[0].charAt(0);
				
				if(c1char == 'R') {
					c1text.setBackground(red);
				}
				else if(c1char == 'B') {
					c1text.setBackground(blue);
				}
				else if(c1char == 'G') {
					c1text.setBackground(green);
				}
				else {
					c1text.setBackground(yellow);
				}
				
				}
				
				
				//card 2
				if((game.cardLabels[1] != null) && (game.cardLabels[1] != "")){
					
					char c2char = game.cardLabels[1].charAt(0);
					
					if(c2char == 'R') {
						c2text.setBackground(red);
					}
					else if(c2char == 'B') {
						c2text.setBackground(blue);
					}
					else if(c2char == 'G') {
						c2text.setBackground(green);
					}
					else {
						c2text.setBackground(yellow);
					}
					
					}
				
				
				//card 3
				if((game.cardLabels[2] != null) && (game.cardLabels[2] != "")){
					
					char c3char = game.cardLabels[2].charAt(0);
					
					if(c3char == 'R') {
						c3text.setBackground(red);
					}
					else if(c3char == 'B') {
						c3text.setBackground(blue);
					}
					else if(c3char == 'G') {
						c3text.setBackground(green);
					}
					else {
						c3text.setBackground(yellow);
					}
					
					}
				
				//card 4
				if((game.cardLabels[3] != null) && (game.cardLabels[3] != "")){
							
							char c4char = game.cardLabels[3].charAt(0);
							
							if(c4char == 'R') {
								c4text.setBackground(red);
							}
							else if(c4char == 'B') {
								c4text.setBackground(blue);
							}
							else if(c4char == 'G') {
								c4text.setBackground(green);
							}
							else {
								c4text.setBackground(yellow);
							}
							
							}
				
			
			//card 5
					if((game.cardLabels[4] != null) && (game.cardLabels[4] != "")){
						
						char c5char = game.cardLabels[4].charAt(0);
						
						if(c5char == 'R') {
							c5text.setBackground(red);
						}
						else if(c5char == 'B') {
							c5text.setBackground(blue);
						}
						else if(c5char == 'G') {
							c5text.setBackground(green);
						}
						else {
							c5text.setBackground(yellow);
						}
						
					}
					
					//card 6
					if((game.cardLabels[5] != null) && (game.cardLabels[5] != "")){
						
						char c6char = game.cardLabels[5].charAt(0);
						
						if(c6char == 'R') {
							c6text.setBackground(red);
						}
						else if(c6char == 'B') {
							c6text.setBackground(blue);
						}
						else if(c6char == 'G') {
							c6text.setBackground(green);
						}
						else {
							c6text.setBackground(yellow);
						}
						
						}
					
					//card 7
					if((game.cardLabels[6] != null) && (game.cardLabels[6] != "")){
						
						char c7char = game.cardLabels[6].charAt(0);
						
						if(c7char == 'R') {
							c7text.setBackground(red);
						}
						else if(c7char == 'B') {
							c7text.setBackground(blue);
						}
						else if(c7char == 'G') {
							c7text.setBackground(green);
						}
						else {
							c7text.setBackground(yellow);
						}
						
						}
				
				
				}
				
			}
			
		});
		

	}
}

