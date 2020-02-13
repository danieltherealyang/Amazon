package Amazon;

import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ProductPanels {
	public static Component AllProductPanel() {
		JPanel AllProductPanel = new JPanel();
		AllProductPanel.setLayout(new GridLayout(0, 3, 10, 10));
		AllProductPanel.add(Products.Tyler1Shirt());
		return AllProductPanel;
	}
}
