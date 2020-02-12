package Amazon;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Buttons {
	/**
	 * @wbp.parser.entryPoint
	 */
	static Home panel;
	Buttons(Home panel) {
		this.panel = panel;
	}
	
	public static Component AmazonLogo() {
		JButton Logo = new JButton();
		ImageIcon icon = new ImageIcon(Buttons.class.getResource("/Amazon/icon/logo.png"));
		Image image = icon.getImage();
		Image smallicon = image.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
		icon = new ImageIcon(smallicon);
		Logo.setIcon(icon);
		Logo.addActionListener(new ActionListener()
		{
			  public void actionPerformed(ActionEvent e)
			  {
				  panel.removeAll();
				  panel.setHome(panel);
				  panel.validate();
				  panel.repaint();
			  }
		});
		return Logo;
	}
	
	public static Component TodaysDeals() {
		JButton TodaysDeals = new JButton("Today's Deals");
		TodaysDeals.setOpaque(true);
		TodaysDeals.setBorderPainted(false);
		TodaysDeals.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				TodaysDeals.setBorderPainted(true);
			}
			
			public void mouseExited(java.awt.event.MouseEvent evt) {
				TodaysDeals.setBorderPainted(false);
			}
		});
		TodaysDeals.setBackground(new Color(35, 47, 63));
		TodaysDeals.setForeground(Color.white);
		return TodaysDeals;
	}
	
	public static Component FindaGift() {
		JButton FindaGift = new JButton("Find a Gift");
		FindaGift.setOpaque(true);
		FindaGift.setBorderPainted(false);
		FindaGift.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				FindaGift.setBorderPainted(true);
			}
			
			public void mouseExited(java.awt.event.MouseEvent evt) {
				FindaGift.setBorderPainted(false);
			}
		});
		FindaGift.setBackground(new Color(35, 47, 63));
		FindaGift.setForeground(Color.white);
		return FindaGift;
	}
	
	public static Component CustomerService() {
		JButton CustomerService = new JButton("Customer Service");
		CustomerService.setOpaque(true);
		CustomerService.setBorderPainted(false);
		CustomerService.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				CustomerService.setBorderPainted(true);
			}
			
			public void mouseExited(java.awt.event.MouseEvent evt) {
				CustomerService.setBorderPainted(false);
			}
		});
		CustomerService.setBackground(new Color(35, 47, 63));
		CustomerService.setForeground(Color.white);
		return CustomerService;
	}
	
	public static Component Registry() {
		JButton Registry = new JButton("Registry");
		Registry.setOpaque(true);
		Registry.setBorderPainted(false);
		Registry.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				Registry.setBorderPainted(true);
			}
			
			public void mouseExited(java.awt.event.MouseEvent evt) {
				Registry.setBorderPainted(false);
			}
		});
		Registry.setBackground(new Color(35, 47, 63));
		Registry.setForeground(Color.white);
		return Registry;
	}
	
	public static Component NewReleases() {
		JButton NewReleases = new JButton("New Releases");
		NewReleases.setOpaque(true);
		NewReleases.setBorderPainted(false);
		NewReleases.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				NewReleases.setBorderPainted(true);
			}
			
			public void mouseExited(java.awt.event.MouseEvent evt) {
				NewReleases.setBorderPainted(false);
			}
		});
		NewReleases.setBackground(new Color(35, 47, 63));
		NewReleases.setForeground(Color.white);
		return NewReleases;
	}
	
	public static Component Books() {
		JButton Books = new JButton("Books");
		Books.setOpaque(true);
		Books.setBorderPainted(false);
		Books.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				Books.setBorderPainted(true);
			}
			
			public void mouseExited(java.awt.event.MouseEvent evt) {
				Books.setBorderPainted(false);
			}
		});
		Books.setBackground(new Color(35, 47, 63));
		Books.setForeground(Color.white);
		return Books;
	}

	public static Component BestSellers() {
		JButton BestSellers = new JButton("Best Seller");
		BestSellers.setOpaque(true);
		BestSellers.setBorderPainted(false);
		BestSellers.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				BestSellers.setBorderPainted(true);
			}
			
			public void mouseExited(java.awt.event.MouseEvent evt) {
				BestSellers.setBorderPainted(false);
			}
		});
		BestSellers.setBackground(new Color(35, 47, 63));
		BestSellers.setForeground(Color.white);
		return BestSellers;
	}
}
