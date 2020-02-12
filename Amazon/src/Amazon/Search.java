package Amazon;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Search {
	public static Component SearchBar() {
		JTextField SearchBar = new JTextField(60);
		return SearchBar;
	}
	
	public static Component Search() {
		JButton Search = new JButton();
		ImageIcon icon = new ImageIcon(Buttons.class.getResource("/Amazon/icon/Search.png"));
		Image image = icon.getImage();
		Image smallicon = image.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
		icon = new ImageIcon(smallicon);
		Search.setIcon(icon);
		return Search;
	}
	
	public static Component Label() {
		JLabel SearchLabel = new JLabel("Search");
		SearchLabel.setForeground(Color.WHITE);
		return SearchLabel;
	}
}
