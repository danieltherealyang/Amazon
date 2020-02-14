package Amazon;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JPanel;

public class ProductPanels {
	public static Component AllProductPanel() {
		JPanel AllProductPanel = new JPanel();
		AllProductPanel.setLayout(new GridBagLayout());
		GridBagConstraints gbc =  new GridBagConstraints();
		AllProductPanel.add(Products.Tyler1Shirt(),gbc);
		AllProductPanel.setBackground(Color.white);
		return AllProductPanel;
	}
}
