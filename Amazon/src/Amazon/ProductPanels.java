package Amazon;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JPanel;

public class ProductPanels {
	public static Component AllProductPanel() {
		JPanel AllProductPanel = new JPanel();
		int i = 3;
		int j = 4;
		JPanel[][] panelHolder = new JPanel[i][j];
		
		for(int m = 0; m < i; m++) {
			for(int n = 0; n < j; n++) {
				panelHolder[m][n] = new JPanel();
				AllProductPanel.add(panelHolder[m][n]);
			}
		}
		
		panelHolder[1][1].add(Products.Tyler1Shirt());
		panelHolder[1][2].add(Products.Tyler1Mug());
		AllProductPanel.setBackground(Color.white);
		return AllProductPanel;
	}
}
