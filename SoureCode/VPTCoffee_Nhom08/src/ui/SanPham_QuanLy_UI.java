package ui;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class SanPham_QuanLy_UI extends JPanel{
	public SanPham_QuanLy_UI() {
		setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel pnlRight = new JPanel();
		add(pnlRight);
		
		JPanel pnlLeft = new JPanel();
		add(pnlLeft);
		
	}
}
