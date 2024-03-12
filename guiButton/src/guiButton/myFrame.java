package guiButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class myFrame extends JFrame{
	
	JButton button;
	
	myFrame(){
		
		ImageIcon icon = new ImageIcon("C:\\Users\\dev002\\Pictures\\Screenshots\\celect-logo.png");
		
		button = new JButton();
		button.setBounds(100,100,250,100);
		button.addActionListener(e -> System.out.println("Working"));
		button.setText("I am a button");
		button.setFocusable(false);
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic sans", Font.BOLD, 25));
		button.setForeground(Color.cyan);
		button.setBackground(Color.LIGHT_GRAY);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(button);
	}

}
