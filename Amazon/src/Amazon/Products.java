package Amazon;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Products {
	public static Component Tyler1Shirt() {
		JPanel Tyler1Shirt = new JPanel();
		Tyler1Shirt.setSize(300, 500);
		JButton Shirt = new JButton();
		ImageIcon shirtPic = new ImageIcon(Buttons.class.getResource("/Amazon/products/Tyler1_Shirt.jpg"));
		Image image = shirtPic.getImage();
		Image scaled = image.getScaledInstance(200, 210, java.awt.Image.SCALE_SMOOTH);
		shirtPic = new ImageIcon(scaled);
		Shirt.setIcon(shirtPic);
		Shirt.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		JTextArea Description = new JTextArea("TYLER1 Trademark Alpha Shirt");
		Description.setAlignmentX(Component.CENTER_ALIGNMENT);
		Description.setEditable(false);
		
		JLabel Price = new JLabel("$20.00");
		Tyler1Shirt.add(Shirt);
		Tyler1Shirt.add(Description);
		Tyler1Shirt.add(Price);
		return Tyler1Shirt;
	}
}
