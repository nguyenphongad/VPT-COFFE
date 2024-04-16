package ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import customUI.ImageScaler;

import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.CardLayout;
import javax.swing.JTextField;

public class Test extends JFrame{
	public Test() {
		
		
		setSize(1200,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		JPanel pnlQtitle = new JPanel();
		pnlQtitle.setBackground(new Color(255, 255, 255));
		getContentPane().add(pnlQtitle, BorderLayout.NORTH);
		
		JLabel lblTtitleQuet = new JLabel("QUÉT MÃ ĐỂ THANH TOÁN");
		lblTtitleQuet.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
		pnlQtitle.add(lblTtitleQuet);
		
		JPanel pnlQuet = new JPanel();
		pnlQuet.setBackground(new Color(255, 255, 255));
		pnlQuet.setBorder(new EmptyBorder(10, 10, 20, 50));
		getContentPane().add(pnlQuet, BorderLayout.CENTER);
		pnlQuet.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel pnlInQR = new JPanel();
		pnlInQR.setBackground(new Color(255, 255, 255));
		pnlQuet.add(pnlInQR);
		pnlInQR.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlShowQR = new JPanel();
		pnlShowQR.setBackground(new Color(255, 255, 255));
		pnlInQR.add(pnlShowQR, BorderLayout.SOUTH);
		pnlShowQR.setLayout(new BorderLayout(0, 0));
		
		JLabel lbltaikhoan = new JLabel("109999999 - VTPCoffee");
		lbltaikhoan.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lbltaikhoan.setHorizontalAlignment(SwingConstants.CENTER);
		pnlShowQR.add(lbltaikhoan, BorderLayout.NORTH);
		
		JPanel pnlImageQR = new JPanel();
		pnlImageQR.setBackground(new Color(255, 255, 255));
		pnlInQR.add(pnlImageQR, BorderLayout.NORTH);
		
		JLabel lblMaQR = new JLabel("");
		lblMaQR.setIcon(new ImageScaler("/image/QR_thanhToan.jpg", 480, 430).getScaledImageIcon());
		pnlImageQR.add(lblMaQR);
		
		JPanel pnlLeftQR = new JPanel();
		pnlLeftQR.setBackground(new Color(255, 255, 255));
		pnlQuet.add(pnlLeftQR);
		pnlLeftQR.setLayout(new BorderLayout(0, 0));
		
		JLabel lblChiTiet = new JLabel("CHI TIẾT HOÁ ĐƠN");
		lblChiTiet.setBackground(new Color(255, 255, 255));
		lblChiTiet.setHorizontalAlignment(SwingConstants.CENTER);
		lblChiTiet.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
		lblChiTiet.setBorder(new EmptyBorder(0, 0, 20, 0));
		pnlLeftQR.add(lblChiTiet, BorderLayout.NORTH);
		
		JPanel pnlChiTiet = new JPanel();
		pnlLeftQR.add(pnlChiTiet, BorderLayout.CENTER);
		pnlChiTiet.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel pnl_11 = new JPanel();
		pnl_11.setBackground(new Color(255, 255, 255));
		pnl_11.setPreferredSize(new Dimension(120, 120));
		pnlChiTiet.add(pnl_11);
		pnl_11.setLayout(new BoxLayout(pnl_11, BoxLayout.Y_AXIS));
		
		JLabel lblTenSP = new JLabel("TÊN SẢN PHẨM");
		lblTenSP.setBorder(new EmptyBorder(5, 0, 5, 0));
		lblTenSP.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		lblTenSP.setPreferredSize(new Dimension(70, 40));
		pnl_11.add(lblTenSP);
		
		JLabel lblNewLabel = new JLabel("Bạc sỉu");
		pnl_11.add(lblNewLabel);
		
		JPanel pnl_22 = new JPanel();
		pnl_22.setBackground(new Color(255, 255, 255));
		pnl_22.setPreferredSize(new Dimension(50, 50));
		pnlChiTiet.add(pnl_22);
		pnl_22.setLayout(new BoxLayout(pnl_22, BoxLayout.Y_AXIS));
		
		JLabel lblSoLuong = new JLabel("SỐ LƯỢNG");
		lblSoLuong.setBorder(new EmptyBorder(5, 0, 5, 0));
		lblSoLuong.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		pnl_22.add(lblSoLuong);
		
		JLabel lblNewLabel_2 = new JLabel("x2");
		pnl_22.add(lblNewLabel_2);
		
		JPanel pnl_33 = new JPanel();
		pnl_33.setBackground(new Color(255, 255, 255));
		pnlChiTiet.add(pnl_33);
		pnl_33.setLayout(new BoxLayout(pnl_33, BoxLayout.Y_AXIS));
		
		JLabel lblThanhTien = new JLabel("THÀNH TIỀN");
		lblThanhTien.setBorder(new EmptyBorder(5, 0, 5, 0));
		lblThanhTien.setHorizontalAlignment(SwingConstants.RIGHT);
		lblThanhTien.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		lblThanhTien.setPreferredSize(pnl_33.getPreferredSize());
		pnl_33.add(lblThanhTien);
		
		JLabel lblNewLabel_3 = new JLabel("39,000");
		pnl_33.add(lblNewLabel_3);
		
		JPanel pnlAction = new JPanel();
		FlowLayout flowLayout = (FlowLayout) pnlAction.getLayout();
		flowLayout.setVgap(10);
		flowLayout.setHgap(15);
		flowLayout.setAlignment(FlowLayout.RIGHT);
		getContentPane().add(pnlAction, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("New button");
		pnlAction.add(btnNewButton);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		pnlAction.add(horizontalStrut);
		
		JButton btnNewButton_1 = new JButton("New button");
		pnlAction.add(btnNewButton_1);
		
		List<JLabel> labels = new ArrayList<>();

		int soLuongJLabel = 10; // Ví dụ

		for (int i = 0; i < soLuongJLabel; i++) {
		    JLabel label = new JLabel(String.valueOf(i));
		    labels.add(label);
		}

		for (JLabel label : labels) {
//			System.out.println(label);
			pnl_11.add(label);
		}

		
		
		
		setVisible(true);
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(()->new Test());
	}
}
