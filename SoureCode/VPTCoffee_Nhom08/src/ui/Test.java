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
import customUI.RoundedButton;

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
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

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
		pnlQuet.setBorder(new EmptyBorder(10, 10, 20, 40));
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
		lblMaQR.setIcon(new ImageScaler("/image/QR_thanhToan.png", 430, 420).getScaledImageIcon());
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
		
		
		JPanel pnBodyCTHD = new JPanel();
		pnlLeftQR.add(pnBodyCTHD, BorderLayout.CENTER);
		pnBodyCTHD.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlThongTinCTHD = new JPanel();
		pnlThongTinCTHD.setBackground(new Color(255, 255, 255));
		pnlThongTinCTHD.setBorder(new EmptyBorder(0, 0, 0, 0));
		pnBodyCTHD.add(pnlThongTinCTHD, BorderLayout.NORTH);
		pnlThongTinCTHD.setLayout(new BoxLayout(pnlThongTinCTHD, BoxLayout.Y_AXIS));
		
		JPanel pnlLine1CTHD = new JPanel();
		pnlLine1CTHD.setBackground(new Color(255, 255, 255));
		pnlThongTinCTHD.add(pnlLine1CTHD);
		pnlLine1CTHD.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel pnlNL = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) pnlNL.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		pnlNL.setBackground(new Color(255, 255, 255));
		pnlLine1CTHD.add(pnlNL);
		
		JLabel lblNgayLapHD = new JLabel("NGÀY LẬP : ");
		lblNgayLapHD.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		pnlNL.add(lblNgayLapHD);
		
		JLabel lblNgayLapHDOutput = new JLabel("dateHD");
		pnlNL.add(lblNgayLapHDOutput);
		
		JPanel pnlNVLap = new JPanel();
		pnlNVLap.setBorder(new EmptyBorder(0, 50, 0, 0));
		FlowLayout flowLayout_2 = (FlowLayout) pnlNVLap.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		pnlNVLap.setBackground(new Color(255, 255, 255));
		pnlLine1CTHD.add(pnlNVLap);
		
		JLabel lblNhanVienLap = new JLabel("NHÂN VIÊN : ");
		lblNhanVienLap.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		pnlNVLap.add(lblNhanVienLap);
		
		JLabel lblNhanVienLapOutput = new JLabel("maNV");
		pnlNVLap.add(lblNhanVienLapOutput);
		
		JPanel pnlLine2CTHD = new JPanel();
		pnlLine2CTHD.setBackground(new Color(255, 255, 255));
		pnlThongTinCTHD.add(pnlLine2CTHD);
		pnlLine2CTHD.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel pnlKH = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) pnlKH.getLayout();
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		pnlKH.setBackground(new Color(255, 255, 255));
		pnlLine2CTHD.add(pnlKH);
		
		JLabel lblKHLap = new JLabel("KHÁCH HÀNG : ");
		lblKHLap.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		pnlKH.add(lblKHLap);
		
		JLabel lblKHLapOutPut = new JLabel("sdt - ten");
		pnlKH.add(lblKHLapOutPut);
		
		JPanel pnlGChu = new JPanel();
		pnlGChu.setBorder(new EmptyBorder(0, 50, 0, 0));
		FlowLayout flowLayout_4 = (FlowLayout) pnlGChu.getLayout();
		flowLayout_4.setAlignment(FlowLayout.LEFT);
		pnlGChu.setBackground(new Color(255, 255, 255));
		pnlLine2CTHD.add(pnlGChu);
		
		JLabel lblGChu = new JLabel("GHI CHÚ : ");
		lblGChu.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		pnlGChu.add(lblGChu);
		
		JLabel lblGChuOutPut = new JLabel("ghichu");
		pnlGChu.add(lblGChuOutPut);
		
		
		JPanel pnlChiTiet = new JPanel();
		pnBodyCTHD.add(pnlChiTiet, BorderLayout.CENTER);
		pnlChiTiet.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel pnl_11 = new JPanel();
		pnl_11.setBackground(new Color(255, 255, 255));
		pnl_11.setPreferredSize(new Dimension(120, 120));
		pnlChiTiet.add(pnl_11);
		pnl_11.setLayout(new BoxLayout(pnl_11, BoxLayout.Y_AXIS));
		
		JLabel lblTenSP = new JLabel("TÊN SẢN PHẨM");
		lblTenSP.setBorder(new EmptyBorder(5, 0, 15, 0));
		lblTenSP.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		lblTenSP.setPreferredSize(new Dimension(70, 40));
		pnl_11.add(lblTenSP);
		
		
		JPanel pnl_22 = new JPanel();
		pnl_22.setBackground(new Color(255, 255, 255));
		pnl_22.setPreferredSize(new Dimension(50, 50));
		pnlChiTiet.add(pnl_22);
		pnl_22.setLayout(new BoxLayout(pnl_22, BoxLayout.Y_AXIS));
		
		JLabel lblSoLuong = new JLabel("<html><div style='text-align: right'>" + "SỐ LƯỢNG"+ "</div></html>");
		lblSoLuong.setToolTipText("á\r\nádá\r\nád");
		lblSoLuong.setBorder(new EmptyBorder(5, 0, 15, 0));
		lblSoLuong.setHorizontalAlignment(SwingConstants.CENTER);
		lblSoLuong.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		pnl_22.add(lblSoLuong);
		
		
		JPanel pnl_33 = new JPanel();
		pnl_33.setBackground(new Color(255, 255, 255));
		pnlChiTiet.add(pnl_33);
		pnl_33.setLayout(new BoxLayout(pnl_33, BoxLayout.Y_AXIS));
		
		JLabel lblThanhTien = new JLabel("<html><div style='text-align: right'>" + "THÀNH TIỀN"+ "</div></html>");
		lblThanhTien.setBorder(new EmptyBorder(5, 0, 15, 0));
		lblThanhTien.setHorizontalAlignment(SwingConstants.CENTER);
		lblThanhTien.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		lblThanhTien.setPreferredSize(pnl_33.getPreferredSize());
		pnl_33.add(lblThanhTien);
		
		
		setVisible(true);
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(()->new Test());
	}
}
