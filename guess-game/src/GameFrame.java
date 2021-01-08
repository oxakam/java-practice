import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GameFrame extends JFrame implements ActionListener {

	private Game game;
	private Player player;
	private JTextField inputField;
	private JLabel gameAnswer, tries;
	private JButton submitGuess;
	private int numberEntered;
	
	public GameFrame(String title) {
		super(title);
		
		getContentPane().setLayout(new FlowLayout()); 	//FlowLayout -> elements placed in row	
		
		//Start game & add player
		game = new Game();
		player = new Player(); 
			
		addComponents();	
		
		setLocationRelativeTo(null); 	//center JFrame on screen
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
	 }
	
	private void addComponents() {
		
		tries = new JLabel("Tries: " + player.getTries());
		getContentPane().add(tries);		
		
		inputField = new JTextField(6); 	//6 columns
		getContentPane().add(inputField);	//get content from frame
		
		setSize(400, 100);					//frame size: method inherited from JFrame
		
		submitGuess = new JButton("Guess number");
		submitGuess.addActionListener(this);
		getContentPane().add(submitGuess);		
		
		gameAnswer = new JLabel("Guess the number between 1 and 10");
		getContentPane().add(gameAnswer); 
		
	}	
	
	private void resetGame() {
		//create new random number & new player
		game = new Game();
		player = new Player();
		
		gameAnswer.setText("Guess the number between 1 and 10");
		tries.setText("Tries: " + player.getTries());
		inputField.setText(null);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {	//from implemented ActionListener
		//increment tries
		player.addTry();
		tries.setText("Tries: " + player.getTries());
		
		//get guessed number
		String textEntered = inputField.getText();
		
//		if (textEntered != "")
//		{
//			gameAnswer.setText("OBS! Type a nember.");
//			resetGame();
//		}
			numberEntered = Integer.parseInt(textEntered); 	//parse string to int		
		
			//calculate result and display
			if (numberEntered == game.getRandomNumber()) { 		
				JOptionPane.showMessageDialog(null, "Correct!");	//display option pane (popup)				
				resetGame();
			}
			else if (numberEntered < game.getRandomNumber()) 
				gameAnswer.setText("...smaller");
			else
				gameAnswer.setText("...bigger");
		
	}

}
