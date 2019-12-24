package unogame;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;

import swing2swt.layout.FlowLayout;

public class GameOver {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	/*public static void main(String[] args) {
		try {
			GameOver window = new GameOver();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 * @wbp.parser.entryPoint
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		shell.setLayout(null);
		
		//changing the background color
		Device device = Display.getCurrent ();
		Color backColor = new Color (device, 49, 77, 145);
		
		shell.setBackground(backColor);
		
		Label lblGameOver = new Label(shell, SWT.NONE);
		lblGameOver.setBounds(158, 39, 86, 25);
		lblGameOver.setText("Game over");
		lblGameOver.setBackground(backColor);
		
		Label lblXWins = new Label(shell, SWT.NONE);
		lblXWins.setBounds(158, 112, 165, 25);
		lblXWins.setText("x wins");
		lblXWins.setBackground(backColor);
		
		if(gamestate.winner == 0) {
			lblXWins.setText("The User Wins");
		}
		if(gamestate.winner == 1) {
			lblXWins.setText("Bot 1 Wins");
		}
		if(gamestate.winner == 2) {
			lblXWins.setText("Bot 2 Wins");
		}
		if(gamestate.winner == 3) {
			lblXWins.setText("Bot 3 Wins");
		}

	}

}
