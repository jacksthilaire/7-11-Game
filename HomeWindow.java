package unogame;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;

import org.eclipse.swt.graphics.Font;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.*;
public class HomeWindow {

	
	//TWO SELECTIONS: START GAME AND RULES
	//RULES WILL DISPLAY A TEXT BOX EXPLAINING THE RULES OF THIS GAME
	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			HomeWindow window = new HomeWindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

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
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(600, 450);
		shell.setText("7-11");
		
		//changing the background color
		Device device = Display.getCurrent ();
		Color backColor = new Color (device, 49, 77, 145);
				
		shell.setBackground(backColor);
				
		Label lblOne = new Label(shell, SWT.NONE);
		lblOne.setBounds(205, 47, 160, 83);
		lblOne.setText("7-11");
		lblOne.setBackground(backColor);
		
		Font font1 = new Font(device, "SansSerif", 40, 0);
		lblOne.setFont(font1);
		
		Button btnStartGame = new Button(shell, SWT.NONE);
		btnStartGame.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				
				GameWindow window = new GameWindow();
				window.open();
			}
		});
		btnStartGame.setBounds(230, 171, 109, 35);
		btnStartGame.setText("Start Game");
		
		Button btnRules = new Button(shell, SWT.NONE);
		btnRules.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				Rules rules = new Rules();
				rules.open();
			}
		});
		btnRules.setBounds(230, 230, 109, 35);
		btnRules.setText("Rules");

	}

}
