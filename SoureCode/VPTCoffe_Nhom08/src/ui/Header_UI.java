package ui;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;


import customUI.ImageScaler;
import customUI.RoundedButton;
import java.awt.Component;
import javax.swing.Box;

public class Header_UI extends JPanel implements ActionListener{
	
	private Main_UI main;
	private RoundedButton btnLogout;
	private Thread clock;
	private JLabel lblTime, lblDate;
	
	public Header_UI(Main_UI main) {
		this.main = main;
		setLayout(new BorderLayout(0, 0));
		
		JPanel pnlHeader = new JPanel();
		pnlHeader.setBorder(new EmptyBorder(5, 15, 5, 5));
		pnlHeader.setBackground(Color.decode("#B16E5C"));
		add(pnlHeader, BorderLayout.NORTH);
		pnlHeader.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlTime = new JPanel();
		pnlTime.setBackground(Color.decode("#B16E5C"));
		pnlHeader.add(pnlTime, BorderLayout.WEST);
		
		lblTime = new JLabel("?");
		lblTime.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblTime.setForeground(Color.decode("#ffffff"));
		pnlTime.add(lblTime);
		
		lblDate = new JLabel("?");
		lblDate.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblDate.setForeground(Color.decode("#ffffff"));
		pnlTime.add(lblDate);
		clock();
		
		JPanel pnlControl = new JPanel();
		pnlControl.setBackground(Color.decode("#B16E5C"));
		pnlHeader.add(pnlControl, BorderLayout.EAST);
		
		JLabel lblName = new JLabel("NGUYỄN VĂN PHONG");
		lblName.setForeground(Color.decode("#ffffff"));
		lblName.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		pnlControl.add(lblName);
		
		JLabel lblChucVu = new JLabel("- QUẢN LÝ (v1.57)");
		lblChucVu.setForeground(Color.decode("#ffffff"));
		lblChucVu.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		pnlControl.add(lblChucVu);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		pnlControl.add(horizontalStrut);
		
		btnLogout = new RoundedButton("", null, 35, 0, 0.5f);
		btnLogout.setForeground(Color.decode("#ffffff"));
		btnLogout.setBackground(Color.decode("#bf1414"));
		btnLogout.setFont(new Font("Segoe UI Semibold", Font.BOLD, 21));
		btnLogout.setIcon(new ImageScaler("/icon/icon_logout.png", 37, 35).getScaledImageIcon());
		btnLogout.setBorder(null);
		
		btnLogout.addActionListener(this);
		
		pnlControl.add(btnLogout);
		
	}
	// ham dong ho
	public void clock() {
		clock = new Thread() {
			@Override
			public void run() {
				for (;;) {
					try {
						LocalDateTime currentTime = LocalDateTime.now();
						int day = currentTime.getDayOfMonth();
						int month = currentTime.getMonthValue();
						int year = currentTime.getYear();
						int hour = currentTime.getHour();
						int minute = currentTime.getMinute();
						int second = currentTime.getSecond();
						lblTime.setText(util.ConvertTime.convertLocalTimeToString(LocalTime.of(hour, minute, second)));
						lblDate.setText(String.format("%s-%s-%d", day < 10 ? "0" + day : day,
								month < 10 ? "0" + month : month, year));
						sleep(1000);
					} catch (InterruptedException e) {
						System.err.println(e);
					}
				}
			}
		};

		clock.start();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if(o==btnLogout) {
			int result = JOptionPane.showConfirmDialog(main, "Bạn có muốn đăng xuất khỏi hệ thống?",
					"ĐĂNG XUẤT HỆ THỐNG", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (result == JOptionPane.YES_OPTION) {
				main.dispose();
				Login_UI loginUi = new Login_UI();
				loginUi.setVisible(true);
			}
		}
		
	}

}









