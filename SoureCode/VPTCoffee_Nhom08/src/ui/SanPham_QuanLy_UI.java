package ui;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class SanPham_QuanLy_UI extends JPanel{
	public SanPham_QuanLy_UI() {
		setLayout(null);
		JLabel lblNewLabel = new JLabel("quan ly");
		lblNewLabel.setBounds(200, 5, 35, 14);
		add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(68, 69, 182, 126);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(113, 23, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("qư");
		lblNewLabel_2.setBounds(31, 23, 128, 71);
		panel.add(lblNewLabel_2);
	}
}
