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
import javax.swing.JPasswordField;
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

	ImageIcon appIcon = new ImageIcon("res/image/icon_logo.PNG");
	ImageIcon imgBgr = new ImageIcon("res/image/image_quan.png");
	private JButton btnClosePage;
	private JTextField txtMaNv;
	private JPasswordField txtMatKhau;
	private RoundedButton btnLogin;

	public Login_UI() {
		setSize(990, 500);
		setLocationRelativeTo(null);
		setUndecorated(true);
		setIconImage(appIcon.getImage());
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.decode("#B16E5C"));

		JPanel pnlBody = new JPanel();
		pnlBody.setBounds(550, 80, 391, 364);
		getContentPane().add(pnlBody);
		pnlBody.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlTitle = new JPanel();
		pnlTitle.setBorder(new MatteBorder(0, 0, 1, 0, Color.decode("#B16E5C")));
		pnlTitle.setBackground(new Color(255, 255, 255));
		pnlBody.add(pnlTitle, BorderLayout.NORTH);
		
		JLabel lblTittle = new JLabel("HỆ THỐNG QUẢN LÝ CÀ PHÊ  VPTCoffee");
		lblTittle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTittle.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		pnlTitle.add(lblTittle);
		
		JPanel pnlInput = new JPanel();
		pnlInput.setBackground(new Color(255, 255, 255));
		pnlBody.add(pnlInput, BorderLayout.CENTER);
		pnlInput.setLayout(null);
		
		JLabel lblMaNv = new JLabel("MÃ NHÂN VIÊN ");
		lblMaNv.setFont(new Font("Segoe UI Semibold", Font.BOLD, 17));
		lblMaNv.setBounds(20, 82, 160, 22);
		pnlInput.add(lblMaNv);
		
		txtMaNv = new JTextField();
		txtMaNv.setBackground(Color.decode("#eaeaea"));
		txtMaNv.setBorder(new MatteBorder(1, 1, 2, 1, Color.decode("#e0dad9")));
		txtMaNv.setHorizontalAlignment(SwingConstants.CENTER);
		txtMaNv.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		txtMaNv.setBounds(20, 110, 355, 35);
		pnlInput.add(txtMaNv);
		txtMaNv.setColumns(10);
		
		JLabel lblMatKhau = new JLabel("MẬT KHẨU ");
		lblMatKhau.setFont(new Font("Segoe UI Semibold", Font.BOLD, 17));
		lblMatKhau.setBounds(20, 165, 110, 22);
		pnlInput.add(lblMatKhau);
		
		txtMatKhau = new JPasswordField();
		txtMatKhau.setBackground(Color.decode("#eaeaea"));
		txtMatKhau.setBorder(new MatteBorder(1, 1, 2, 1, Color.decode("#e0dad9")));
		txtMatKhau.setHorizontalAlignment(SwingConstants.CENTER);
		txtMatKhau.setBounds(20, 192, 355, 35);
		txtMatKhau.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		txtMatKhau.setEchoChar('•');
		pnlInput.add(txtMatKhau);
		txtMatKhau.setColumns(10);
		
		btnLogin = new RoundedButton("ĐĂNG NHẬP",null, 10, 0, 2f);
		btnLogin.setIcon(new ImageScaler("/icon/icon_login.PNG", 28, 25).getScaledImageIcon());
		btnLogin.setBackground(Color.decode("#B16E5C"));
		btnLogin.setForeground(Color.decode("#ffffff"));
		btnLogin.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		btnLogin.setBounds(20, 270, 355, 38);
		pnlInput.add(btnLogin);
		
		JLabel lblLogin = new JLabel("ĐĂNG NHẬP");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
		lblLogin.setBounds(79, 22, 247, 27);
		pnlInput.add(lblLogin);
		
		JPanel pnlShowdow = new JPanel();
		pnlShowdow.setBackground(Color.decode("#D2BAA6"));
		pnlShowdow.setBounds(569, 98, 391, 364);
		getContentPane().add(pnlShowdow);
		
		JPanel pnlLogo = new JPanel();
		pnlLogo.setBackground(Color.decode("#B16E5C"));
		pnlLogo.setBounds(60, 80, 400, 370);
		getContentPane().add(pnlLogo);
		pnlLogo.setLayout(new BorderLayout(0, 0));
		
		JLabel lblImageLogo = new JLabel(appIcon);
		lblImageLogo.setIcon(new ImageScaler("/image/logo_VPTCoffee_line.PNG", 405, 390).getScaledImageIcon());
		pnlLogo.add(lblImageLogo, BorderLayout.CENTER);
		

//		JLabel lblBackground = new JLabel(imgBgr);
//		lblBackground.setBounds(0, 0, 955, 500);
//		getContentPane().add(lblBackground);
		
	

		btnClosePage = new JButton("×");
		btnClosePage.setBackground(Color.decode("#B16E5C"));
		btnClosePage.setForeground(Color.decode("#ffffff"));
		btnClosePage.setFont(new Font("Tahoma", Font.BOLD, 36));
		btnClosePage.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(255, 255, 255)));
		btnClosePage.setBounds(945, 0, 45, 45);
		getContentPane().add(btnClosePage);

		btnClosePage.addActionListener(this);
		btnLogin.addActionListener(this);
		
		setVisible(true);
		
		txtMaNv.requestFocus();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if (o == btnClosePage) {
			this.dispose();
		}
		
		if(o==btnLogin) {
			new Main_UI().setVisible(true);;
			dispose();
		}

	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			new Login_UI();
		});
	}
}
