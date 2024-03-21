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
		setSize(900, 500);
		setLocationRelativeTo(null);
		setUndecorated(true);
		setIconImage(appIcon.getImage());
		getContentPane().setLayout(null);

		JPanel pnlBody = new JPanel();
		pnlBody.setBounds(210, 82, 471, 364);
		getContentPane().add(pnlBody);
		pnlBody.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlTitle = new JPanel();
		pnlTitle.setBorder(new MatteBorder(0, 0, 1, 0, Color.decode("#B16E5C")));
		pnlTitle.setBackground(new Color(255, 255, 255));
		pnlBody.add(pnlTitle, BorderLayout.NORTH);
		
		JLabel lblTittle = new JLabel("HỆ THỐNG QUẢN LÝ CÀ PHÊ  VPTCOFFEE");
		lblTittle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTittle.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		pnlTitle.add(lblTittle);
		
		JPanel pnlInput = new JPanel();
		pnlInput.setBackground(new Color(255, 255, 255));
		pnlBody.add(pnlInput, BorderLayout.CENTER);
		pnlInput.setLayout(null);
		
		JLabel lblMaNv = new JLabel("MÃ NHÂN VIÊN ");
		lblMaNv.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		lblMaNv.setBounds(20, 77, 160, 22);
		pnlInput.add(lblMaNv);
		
		txtMaNv = new JTextField();
		txtMaNv.setHorizontalAlignment(SwingConstants.CENTER);
		txtMaNv.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		txtMaNv.setBounds(20, 110, 430, 35);
		pnlInput.add(txtMaNv);
		txtMaNv.setColumns(10);
		
		JLabel lblMatKhau = new JLabel("MẬT KHẨU ");
		lblMatKhau.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		lblMatKhau.setBounds(20, 156, 110, 22);
		pnlInput.add(lblMatKhau);
		
		txtMatKhau = new JPasswordField();
		txtMatKhau.setHorizontalAlignment(SwingConstants.CENTER);
		txtMatKhau.setBounds(20, 189, 430, 35);
		txtMatKhau.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		txtMatKhau.setEchoChar('•');
		pnlInput.add(txtMatKhau);
		txtMatKhau.setColumns(10);
		
		btnLogin = new RoundedButton("ĐĂNG NHẬP",null, 5, 0, 2f);
		btnLogin.setBackground(Color.decode("#B16E5C"));
		btnLogin.setForeground(Color.decode("#ffffff"));
		btnLogin.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		btnLogin.setBounds(20, 270, 427, 38);
		pnlInput.add(btnLogin);
		
		JLabel lblLogin = new JLabel("ĐĂNG NHẬP");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
		lblLogin.setBounds(113, 22, 247, 27);
		pnlInput.add(lblLogin);
		
		

		JLabel lblBackground = new JLabel(imgBgr);
		lblBackground.setBounds(0, 0, 900, 500);
		getContentPane().add(lblBackground);
		
	

		btnClosePage = new JButton("×");
		btnClosePage.setBackground(Color.decode("#000000"));
		btnClosePage.setForeground(Color.decode("#ffffff"));
		btnClosePage.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnClosePage.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(255, 255, 255)));
		btnClosePage.setBounds(855, 0, 45, 45);
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
