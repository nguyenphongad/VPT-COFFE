package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import customUI.ImageScaler;
import customUI.RoundedButton;
import entity.NhanVien;

public class NhanVien_QuanLy_UI extends JPanel implements ActionListener,  MouseListener{
	
	private JButton btnThongTinNhanVienButton;
	private JLabel showInfoEMployee;
	private ArrayList<NhanVien> listNhanVien;
	private JTextField txtMaNV;
	private JTextField txtTen;
	private JPanel panelMaNV;
	private JTextField txtSDT;
	private JTextField txtEmail;
	private JTextField txtCCCD;
	private JTextField txtDiaChi;
	private JTextField txtGhiChu;
	private JTable tableDanhSach;
	private DefaultTableModel dataTableModel;
	private JTextField txtHoTen;
	private JTextField txtMatKhau;
	private JComboBox<String> comboboxGioiTinh;
	private JComboBox<String> ngaySinh;
	private JTextField txtNgayVaoLam;
	private Color componentColor = Color.decode("#424242");
	private RoundedButton btnThem;
	private RoundedButton btnSua;
	private RoundedButton btnXoa;
	private RoundedButton btnLuu;
	private RoundedButton btnHuy;
	private RoundedButton btnEditAvatar;
	private JLabel lblAvt;
	private String pathNameAvatar = "nhanvien.jpg";
	
	public NhanVien_QuanLy_UI() {
		
	
		
		Box verticalBox = Box.createVerticalBox();
		
		JPanel panelContainer = new JPanel();
		verticalBox.add(panelContainer);
		panelContainer.setLayout(new BorderLayout(0, 0));
		
		JPanel panelTitle = new JPanel();
		panelContainer.add(panelTitle, BorderLayout.NORTH);
		
		JLabel lblTitle = new JLabel("Quản lý nhân viên");
		panelTitle.add(lblTitle);
		
		JPanel panelInfoDetails = new JPanel();
		panelContainer.add(panelInfoDetails, BorderLayout.CENTER);
		panelInfoDetails.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panelInfo = new JPanel();
		panelInfo.setBorder(new TitledBorder(null, "Th\u00F4ng Tin Chi Ti\u1EBFt Nh\u00E2n Vi\u00EAn", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelInfoDetails.add(panelInfo);
		panelInfo.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panelAvt = new JPanel();
		panelAvt.setLayout(new BorderLayout());
		btnEditAvatar = new RoundedButton("nhanvien.jpg", null, 10, 0, 1.0f);
		btnEditAvatar.setFont(new Font("Roboto", Font.BOLD, 20));
		btnEditAvatar.setForeground(Color.WHITE);
		btnEditAvatar.setBackground(Color.decode("#B16E5C"));
		btnEditAvatar.setBorder(new EmptyBorder(5, 10, 5, 10));
		panelAvt.add(btnEditAvatar, BorderLayout.SOUTH);
		lblAvt = new JLabel("");
		lblAvt.setIcon(new ImageScaler("/image_NhanVien/nhanVien.png" , 150, 150).getScaledImageIcon());
		lblAvt.setHorizontalAlignment(SwingConstants.CENTER);
		panelAvt.add(lblAvt, BorderLayout.CENTER);
		panelInfo.add(panelAvt);
		
		JPanel panelTXT = new JPanel();
		panelTXT.setBounds(new Rectangle(3, 4, 0, 0));
		panelInfo.add(panelTXT);
		panelTXT.setLayout(new GridLayout(4, 3, 0, 0));
		
		panelMaNV = new JPanel();
		panelTXT.add(panelMaNV);
		
		JLabel lblMa = new JLabel("Mã nhân viên:");
		panelMaNV.add(lblMa);
		
		txtMaNV = new JTextField();
		panelMaNV.add(txtMaNV);
		txtMaNV.setColumns(10);
		

				
				JPanel panelHoTen = new JPanel();
				panelTXT.add(panelHoTen);
				
				JLabel lblHoTen = new JLabel("Họ tên:");
				panelHoTen.add(lblHoTen);
				
				txtHoTen = new JTextField();
				panelHoTen.add(txtHoTen);
				txtHoTen.setColumns(10);
				txtHoTen.setBorder(
						BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, componentColor),

								BorderFactory.createEmptyBorder(5, 20, 5, 20)));

				
				JPanel panelMatKhau = new JPanel();
				panelTXT.add(panelMatKhau);
				
				JLabel lblMatKhau = new JLabel("Mật khẩu:");
				panelMatKhau.add(lblMatKhau);
				
				txtMatKhau = new JTextField();
				panelMatKhau.add(txtMatKhau);
				txtMatKhau.setColumns(10);
				txtMatKhau.setBorder(
						BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, componentColor),

								BorderFactory.createEmptyBorder(5, 20, 5, 20)));

				
				JPanel panelGioiTinh = new JPanel();
				panelTXT.add(panelGioiTinh);
				
				JLabel lblGioiTInh = new JLabel("Giới tính:");
				panelGioiTinh.add(lblGioiTInh);
				
				comboboxGioiTinh = new JComboBox<String>();
				comboboxGioiTinh.addItem("Nam");
				comboboxGioiTinh.addItem("Nữ");
				comboboxGioiTinh.addItem("Khác");
				panelGioiTinh.add(comboboxGioiTinh);
				
				JPanel panelNgaySinh = new JPanel();
				panelTXT.add(panelNgaySinh);
				
				JLabel lblNgaySinh = new JLabel("Ngày sinh:");
				panelNgaySinh.add(lblNgaySinh);
				
				//ngay sinh
//				dpNgayVaoLam = new JXDatePicker(new Date());
//
//				dpNgayVaoLam.setFormats(new SimpleDateFormat("dd/MM/yyyy"));
//				dpNgayVaoLam.setFont(main.roboto_regular.deriveFont(Font.PLAIN, 16F));
//				dpNgayVaoLam.setLocale(new Locale("vi", "VN"));
//				
//				dpNgayVaoLam.setEnabled(false);
//				dpNgayVaoLam.setEnabled(false);
				ngaySinh = new JComboBox<String>();
				
				panelNgaySinh.add(ngaySinh);
				
				JPanel panelSDT = new JPanel();
				panelTXT.add(panelSDT);
				
				JLabel lblSDT = new JLabel("SĐT:");
				panelSDT.add(lblSDT);
				
				txtSDT = new JTextField();
				txtSDT.setColumns(10);
				panelSDT.add(txtSDT);
				txtSDT.setBorder(
						BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, componentColor),

								BorderFactory.createEmptyBorder(5, 20, 5, 20)));

				
				JPanel panelEmail = new JPanel();
				panelTXT.add(panelEmail);
				
				JLabel lblEmail = new JLabel("Email:");
				panelEmail.add(lblEmail);
				
				txtEmail = new JTextField(15);
				panelEmail.add(txtEmail);
				txtEmail.setBorder(
						BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, componentColor),

								BorderFactory.createEmptyBorder(5, 20, 5, 20)));
				
				JPanel panelCCCD = new JPanel();
				panelTXT.add(panelCCCD);
				
				JLabel lblCCCD = new JLabel("Mã CCCD:");
				panelCCCD.add(lblCCCD);
				
				txtCCCD = new JTextField(12);
				panelCCCD.add(txtCCCD);
				txtCCCD.setBorder(
						BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, componentColor),

								BorderFactory.createEmptyBorder(5, 20, 5, 20)));
				
				JPanel panelDiaChi = new JPanel();
				panelTXT.add(panelDiaChi);
				
				JLabel lblDiaChi = new JLabel("Địa chỉ:");
				panelDiaChi.add(lblDiaChi);
				
				txtDiaChi = new JTextField(20);
				panelDiaChi.add(lblDiaChi);
				txtDiaChi.setBorder(
						BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, componentColor),

								BorderFactory.createEmptyBorder(5, 20, 5, 20)));
				
				JPanel panelNgayVaoLam = new JPanel();
				panelTXT.add(panelNgayVaoLam);
				
				JLabel lblNgayVaoLam = new JLabel("Ngày vào làm:");
				panelNgayVaoLam.add(lblNgayVaoLam);
				
				txtNgayVaoLam = new JTextField(10);
				panelNgayVaoLam.add(txtNgayVaoLam);
				txtNgayVaoLam.setBorder(
						BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, componentColor),

								BorderFactory.createEmptyBorder(5, 20, 5, 20)));
				
				JPanel panelGhiChu = new JPanel();
				panelTXT.add(panelGhiChu);
				
				JLabel lblGhiChu = new JLabel("Ghi chú:");
				panelGhiChu.add(lblGhiChu);
				
				txtGhiChu = new JTextField(10);
				panelGhiChu.add(txtGhiChu);
				txtGhiChu.setBorder(
						BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, componentColor),

								BorderFactory.createEmptyBorder(5, 20, 5, 20)));
				
//				JPanel panel_2 = new JPanel();
//				panelTXT.add(panel_2);
				
				JPanel panelOption = new JPanel();
				panelContainer.add(panelOption, BorderLayout.SOUTH);
				
				btnThem = new RoundedButton("Thêm", null, 20, 0, 1.0f);
				btnThem.setFont(new Font("Roboto", Font.BOLD, 20));
				btnThem.setForeground(Color.WHITE);
				btnThem.setBackground(Color.decode("#3B71CA"));
				//btnThem.setIcon(new ImageScaler("/image/icon_add_row.png", 24, 24).getScaledImageIcon());
				btnThem.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
				panelOption.add(btnThem);
				
				btnSua = new RoundedButton("Sửa", null, 20, 0, 1.0f);
				btnSua.setFont(new Font("Roboto", Font.BOLD, 20));
				btnSua.setForeground(Color.WHITE);
				btnSua.setBackground(Color.decode("#ffc107"));
				btnSua.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
				panelOption.add(btnSua);
				
				btnXoa = new RoundedButton("Xóa", null, 20, 0, 1.0f);
				btnXoa.setFont(new Font("Roboto", Font.BOLD, 20));
				btnXoa.setForeground(Color.WHITE);
				btnXoa.setBackground(Color.decode("#dc3545"));
				btnXoa.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
				panelOption.add(btnXoa);
				
				Component horizontalStrut = Box.createHorizontalStrut(64);
				panelOption.add(horizontalStrut);
				
				btnLuu = new RoundedButton("Lưu", null, 20, 0, 1.0f);
				btnLuu.setFont(new Font("Roboto", Font.BOLD, 20));
				btnLuu.setForeground(Color.white);
				btnLuu.setBackground(Color.decode("#ffc107"));
				panelOption.add(btnLuu);
				
				btnHuy = new RoundedButton("Hủy", null, 20, 0, 1.0f);
				btnHuy.setFont(new Font("Roboto", Font.BOLD, 20));
				btnHuy.setForeground(Color.WHITE);
				btnHuy.setBackground(Color.decode("#ffc107"));
				panelOption.add(btnHuy);
				
				
				String[] headerStrings = {"STT", "Mã nhân viên", "Họ tên", "Giới tính", "Ngày sinh", "SDT", "Email", "Địa chỉ", "CCCD", "Ngày vào làm", "Ghi chú"};
				dataTableModel = new DefaultTableModel(headerStrings, 0);
				tableDanhSach = new JTable(dataTableModel);
				tableDanhSach.setRowHeight(24);

				JScrollPane scrollTable = new JScrollPane();
				scrollTable.setViewportView(tableDanhSach);
				verticalBox.add(scrollTable);
				
				setLayout(new BorderLayout(0, 0));
				JPanel pnlContainer = new JPanel();
				pnlContainer.setBorder(new EmptyBorder(5, 5, 5, 5));
				add(pnlContainer);
				pnlContainer.setLayout(new GridLayout(1, 2, 0, 0));
				pnlContainer.add(verticalBox);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'mouseClicked'");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'mousePressed'");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'mouseEntered'");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'mouseExited'");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object object = e.getSource();
	}
}
