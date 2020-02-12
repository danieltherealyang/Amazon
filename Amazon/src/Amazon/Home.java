package Amazon;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

public class Home extends JPanel {
	public Home() {
		setSize(1000,1000);
		Buttons Buttons = new Buttons(this);
		add(Buttons.AmazonLogo(), BorderLayout.NORTH);
		add(Search.Label());
		add(Search.SearchBar(), BorderLayout.NORTH);
		add(Search.Search());
		add(Amazon.Buttons.TodaysDeals());
		add(Buttons.BestSellers());
		add(Buttons.FindaGift());
		add(Buttons.CustomerService());
		add(Buttons.Registry());
		add(Buttons.NewReleases());
		add(Buttons.Books());
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(new Color(51, 51, 153));
		g.fillRect(0, 0, 1000, 120);
	}
}
