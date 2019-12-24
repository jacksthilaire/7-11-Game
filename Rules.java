package unogame;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;

public class Rules {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	/*public static void main(String[] args) {
		try {
			Rules window = new Rules();
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
		shell.setSize(450, 448);
		shell.setText("Rules");
		//changing the background color
		Device device = Display.getCurrent ();
		Color backColor = new Color (device, 49, 77, 145);
				
		shell.setBackground(backColor);
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(10, 10, 408, 488);
		lblNewLabel.setText("-The max number of user cards is 7, \n more than 7 can not be drawn\r\n" + 
				"-Match color or number of the face up card by \n playing a card, first to 0 cards wins the game\r\n" + 
				"-If you can't play a card, draw new cards \n until you can, or you have a full hand\r\n" + 
				"-If you cannot play with a full hand, skip your turn\r\n" + 
				"-Each computer player starts with 11 cards, \n and they do not draw new cards, but instead \n skip their turn if they cannot play");

		lblNewLabel.setBackground(backColor);
	}
}
