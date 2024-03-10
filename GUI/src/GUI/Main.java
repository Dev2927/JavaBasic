package GUI;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame(); //Creates a JFrame
		frame.setTitle("Raja Beta Dev"); //Sets title of Frame
		frame.setSize(420, 420); //Sets the x-dimension and y-dimension of frame
		frame.setVisible(true); //Make frame visible
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exit out of application
		frame.setResizable(false); //Prevent frame from being resized
		
		ImageIcon image = new ImageIcon("C:\\Users\\dev002\\Pictures\\Screenshots\\celect-logo.png"); //Creates a ImageIcon
		frame.setIconImage(image.getImage());
		frame.getContentPane().setBackground(new Color(123,50,250)); //Change color of background
	}

}
