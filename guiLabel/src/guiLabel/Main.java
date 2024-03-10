package guiLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImageIcon image = new ImageIcon("C:\\Users\\dev002\\Pictures\\Screenshots\\celect-logo.png");
		Border border = BorderFactory.createLineBorder(Color.green, 3);
		
		JLabel label = new JLabel(); //Creates a label
		label.setText("Do you even code?"); //Set text of label
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER); //Set text LEFT, CENTER, RIGHT of imageIcon
		label.setVerticalTextPosition(JLabel.TOP); //Set text top, center , bottom
		label.setForeground(Color.red); //Set font color of text
		label.setFont(new Font("MV Boli", Font.PLAIN, 20)); //set font of text
		label.setIconTextGap(4); //set gap of text to image
		label.setBackground(Color.black); //set background color
		label.setOpaque(true); // display background color
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		//label.setBounds(100, 100, 250, 250); //set x,y position within frame as well as dimensions
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		//frame.setSize(500,500);
		//frame.setLayout(null);
		frame.add(label);
		frame.pack();
	}

}
