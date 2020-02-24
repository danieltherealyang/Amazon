package Amazon;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Products {
	public static Component Tyler1Shirt() {
		JPanel Tyler1Shirt = new JPanel();
		Tyler1Shirt.setSize(300, 300);
		JButton Shirt = new JButton();
		ImageIcon shirtPic = new ImageIcon(Buttons.class.getResource("/Amazon/products/Tyler1_Shirt.jpg"));
		Image image = shirtPic.getImage();
		Image scaled = image.getScaledInstance(200, 210, java.awt.Image.SCALE_SMOOTH);
		shirtPic = new ImageIcon(scaled);
		Shirt.setIcon(shirtPic);
		
		JLabel Description = new JLabel("TYLER1 Trademark Alpha Shirt");		
		JLabel Price = new JLabel("$20.00");
		Tyler1Shirt.setLayout(new BoxLayout(Tyler1Shirt,BoxLayout.Y_AXIS));
		Tyler1Shirt.add(Shirt);
		Tyler1Shirt.add(Description);
		Tyler1Shirt.add(Price);
		return Tyler1Shirt;
	}
	
	public static Component Tyler1Mug() {
		JPanel Tyler1Mug = new JPanel();
		Tyler1Mug.setSize(300, 300);
		JButton Mug = new JButton();
		ImageIcon mugPic = new ImageIcon(Buttons.class.getResource("/Amazon/products/Tyler1Mug.jpg"));
		Image image = mugPic.getImage();
		Image scaled = image.getScaledInstance(200, 210, java.awt.Image.SCALE_SMOOTH);
		mugPic = new ImageIcon(scaled);
		Mug.setIcon(mugPic);
		
		JLabel Description = new JLabel("TYLER1 Trademark Mug");
		JLabel Price = new JLabel("$10.00");
		Tyler1Mug.setLayout(new BoxLayout(Tyler1Mug,BoxLayout.Y_AXIS));
		Tyler1Mug.add(Mug);
		Tyler1Mug.add(Description);
		Tyler1Mug.add(Price);
		return Tyler1Mug;
	}
}
