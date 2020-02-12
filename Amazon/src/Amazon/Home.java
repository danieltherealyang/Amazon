package Amazon;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

public class Home extends JPanel {
	public Home() {
		setHome(this);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(new Color(35, 47, 63));
		g.fillRect(0, 0, 1000, 120);
	}
	
	public void setHome(JPanel panel) {
		panel.setSize(1000,1000);
		Buttons Buttons = new Buttons(this);
		panel.add(Buttons.AmazonLogo(), BorderLayout.NORTH);
		panel.add(Search.Label());
		panel.add(Search.SearchBar(), BorderLayout.NORTH);
		panel.add(Search.Search());
		panel.add(Amazon.Buttons.TodaysDeals());
		panel.add(Amazon.Buttons.BestSellers());
		panel.add(Amazon.Buttons.FindaGift());
		panel.add(Amazon.Buttons.CustomerService());
		panel.add(Amazon.Buttons.Registry());
		panel.add(Amazon.Buttons.NewReleases());
		panel.add(Amazon.Buttons.Books());
		panel.add(ScrollPane.AllProducts(), BorderLayout.SOUTH);
	}
}
