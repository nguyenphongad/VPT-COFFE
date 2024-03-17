package ui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.border.MatteBorder;

import customUI.ImageScaler;
import customUI.RoundedButton;
import customUI.RoundedPanel;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.Box;

public class Login_UI extends JFrame implements ActionListener {

	ImageIcon appIcon = new ImageIcon("assets/icon_logo.PNG");
	ImageIcon imgBgr = new ImageIcon("assets/image_quan.png");
	private JButton btnClosePage;
	private JTextField txtMaNv;
	private JTextField txtMatKhau;
	private RoundedButton btnLogin;

	public Login_UI() {
		setSize(900, 500);
		setLocationRelativeTo(null);
		setUndecorated(true);
		setIconImage(appIcon.getImage());
		getContentPane().setLayout(null);

		JPanel pnlBody = new JPanel();
		pnlBody.setBounds(210, 82, 471, 361);
		getContentPane().add(pnlBody);
		pnlBody.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlTitle = new JPanel();
		pnlTitle.setBackground(new Color(255, 255, 255));
		pnlBody.add(pnlTitle, BorderLayout.NORTH);
		
		JLabel lblTittle = new JLabel("ĐĂNG NHẬP");
		lblTittle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTittle.setFont(new Font("Segoe UI Semibold", Font.BOLD, 24));
		pnlTitle.add(lblTittle);
		
		JPanel pnlInput = new JPanel();
		pnlInput.setBackground(new Color(255, 255, 255));
		pnlBody.add(pnlInput, BorderLayout.CENTER);
		pnlInput.setLayout(null);
		
		JLabel lblMaNv = new JLabel("MÃ NHÂN VIÊN:  ");
		lblMaNv.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		lblMaNv.setBounds(10, 46, 160, 22);
		pnlInput.add(lblMaNv);
		
		txtMaNv = new JTextField();
		txtMaNv.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		txtMaNv.setBounds(10, 75, 451, 35);
		pnlInput.add(txtMaNv);
		txtMaNv.setColumns(10);
		
		JLabel lblMatKhau = new JLabel("MẬT KHẨU: ");
		lblMatKhau.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		lblMatKhau.setBounds(10, 141, 110, 22);
		pnlInput.add(lblMatKhau);
		
		txtMatKhau = new JTextField();
		txtMatKhau.setBounds(10, 174, 451, 35);
		txtMatKhau.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		pnlInput.add(txtMatKhau);
		txtMatKhau.setColumns(10);
		
		btnLogin = new RoundedButton("ĐĂNG NHẬP",null, 15, 0, 2f);
		btnLogin.setBackground(Color.decode("#B16E5C"));
		btnLogin.setForeground(Color.decode("#ffffff"));
		btnLogin.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		btnLogin.setBounds(10, 243, 451, 38);
		pnlInput.add(btnLogin);
		
		

		JLabel lblBackground = new JLabel(imgBgr);
		lblBackground.setBounds(0, 0, 900, 500);
		getContentPane().add(lblBackground);
		
	

		btnClosePage = new JButton("×");
		btnClosePage.setBackground(Color.decode("#00000000"));
		btnClosePage.setForeground(Color.decode("#ffffff"));
		btnClosePage.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnClosePage.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(255, 255, 255)));
		btnClosePage.setBounds(855, 0, 45, 45);
		getContentPane().add(btnClosePage);

		btnClosePage.addActionListener(this);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if (o == btnClosePage) {
			this.dispose();
		}

	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			new Login_UI();
		});
	}
}
