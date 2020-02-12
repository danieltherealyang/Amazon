package Amazon;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Main {
	public static void main(String[]args) {
		JFrame Frame = new JFrame();
		Frame.getContentPane().setPreferredSize(new Dimension(1000,1000));
		Frame.setVisible(true);
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Home home = new Home();
		Frame.getContentPane().add(home);
		Frame.pack();
	}
}
