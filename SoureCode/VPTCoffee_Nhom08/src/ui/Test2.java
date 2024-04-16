package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;

import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import org.jdesktop.swingx.JXDatePicker;

import customUI.RoundedButton;

public class Test2 extends JFrame{
	
	private RoundedButton btnAddHD, btnXoa, btnHuy, btnThanhToan, btnTimKH;

	private static DefaultTableModel dtbModelODSP;
	private static JTable dtblODSP;
	private JTextField txtTenKH;
	private JTextField txtSdtKH;
	private JTextField txtDiemTL;
	private JTextField txtChietKhau;
	private JTextField txtTongTienSP;
	private JTextField txtTienChietKhau;
	private JTextField txtTongTienThanhToan;
	private JTextField txtTienKhachDua;
	private JTextField txtTienThoi;
	private JTextArea teaGhiChu;
	private JComboBox<String> cmbPhuongThucThanhToan;
	private JLabel lblTongTienSP;
	private JXDatePicker dpNgaySinhKHnew;
	private RoundedButton btnXoaRong;
	private RoundedButton btnDangKy;
	
	
	
	public Test2() {
		
		getContentPane().setLayout(new BorderLayout());
		

		JPanel pnlTimKHTitle = new JPanel();
		pnlTimKHTitle.setBorder(new EmptyBorder(5, 0, 20, 0));
		JLabel lblTitleTKH = new JLabel("THÊM KHÁCH HÀNG MỚI");
		lblTitleTKH.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));

		pnlTimKHTitle.add(lblTitleTKH);

		JPanel pnlTimKHContent = new JPanel();
		pnlTimKHContent.setLayout(new BorderLayout());

		 getContentPane().add(pnlTimKHTitle, BorderLayout.NORTH);

		getContentPane().add(pnlTimKHContent, BorderLayout.CENTER);

		JPanel pnlTimKHLeft = new JPanel();
		pnlTimKHLeft.setLayout(new FlowLayout());

		Box vtb = Box.createVerticalBox();
		pnlTimKHLeft.add(vtb);

		Box htbLine1 = Box.createHorizontalBox();
		JLabel lblSDTnew = new JLabel("SỐ ĐIỆN THOẠI : ");
		lblSDTnew.setFont(new Font("Segoe UI Semibold", Font.BOLD, 17));
		htbLine1.add(lblSDTnew);

//		txtSDTNew.setText(txtSdtKH.getText());

		vtb.add(htbLine1);

		Component verticalStrut = Box.createVerticalStrut(10);
		vtb.add(verticalStrut);

		Box htbLine2 = Box.createHorizontalBox();
		JLabel lblTenKHnew = new JLabel("TÊN KHÁCH HÀNG : ");
		lblTenKHnew.setFont(new Font("Segoe UI Semibold", Font.BOLD, 17));
		htbLine2.add(lblTenKHnew);
		vtb.add(htbLine2);
		
		JLabel lblNewLabel_1 = new JLabel("siew                                             ");
		htbLine2.add(lblNewLabel_1);

		Component verticalStrut2 = Box.createVerticalStrut(10);
		vtb.add(verticalStrut2);

		Box htbLine3 = Box.createHorizontalBox();
		JLabel lblNgaySinhKHnew = new JLabel("NGÀY SINH : ");
		lblNgaySinhKHnew.setFont(new Font("Segoe UI Semibold", Font.BOLD, 17));
		htbLine3.add(lblNgaySinhKHnew);

		JPanel pnlDPNSnew = new JPanel();
		pnlDPNSnew.setLayout(new BorderLayout());

		dpNgaySinhKHnew = new JXDatePicker();
		dpNgaySinhKHnew.setFormats(new SimpleDateFormat("dd/MM/yyyy"));
		dpNgaySinhKHnew.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		pnlDPNSnew.add(dpNgaySinhKHnew);
		htbLine3.add(pnlDPNSnew);
		vtb.add(htbLine3);

		lblNgaySinhKHnew.setPreferredSize(lblTenKHnew.getPreferredSize());
		lblSDTnew.setPreferredSize(lblTenKHnew.getPreferredSize());
		
		JLabel lblNewLabel = new JLabel("siew                                             ");
		htbLine1.add(lblNewLabel);
		dpNgaySinhKHnew.setPreferredSize(new Dimension(dpNgaySinhKHnew.getPreferredSize().width, 30));
		lblNewLabel.setPreferredSize(new Dimension(dpNgaySinhKHnew.getPreferredSize().width, 30));

		pnlTimKHContent.add(pnlTimKHLeft, BorderLayout.CENTER);

		JPanel pnlActionTKH = new JPanel();
		pnlActionTKH.setBorder(new EmptyBorder(10, 0, 15, 0));

		btnXoaRong = new RoundedButton("Xoá Rỗng", null, 10, 0, 3f);
		btnXoaRong.setBackground(Color.decode("#ffffff"));
		btnXoaRong.setFont(new Font("Segoe UI Semibold", Font.BOLD, 17));
		pnlActionTKH.add(btnXoaRong);

		Component horizontalStrut = Box.createHorizontalStrut(30);
		pnlActionTKH.add(horizontalStrut);

		btnDangKy = new RoundedButton("ĐĂNG KÝ", null, 10, 0, 3f);
		btnDangKy.setBackground(Color.decode("#af2b2b"));
		btnDangKy.setForeground(Color.decode("#ffffff"));
		btnDangKy.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(()->new Test2());
	}
}
