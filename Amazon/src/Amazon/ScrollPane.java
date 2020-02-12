package Amazon;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ScrollPane {
	public static Component AllProducts() {
		JScrollPane AllProductsPane = new JScrollPane(ProductPanels.AllProductPanel(),JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		AllProductsPane.setPreferredSize(new Dimension(1000,880));
		return AllProductsPane;
	}
}
