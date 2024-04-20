package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import org.jdesktop.swingx.JXDatePicker;

import customUI.ImageScaler;
import customUI.RoundedButton;
import dao.NhanVien_DAO;
import entity.NhanVien;

public class NhanVien_QuanLy_UI extends JPanel implements ActionListener,  MouseListener{
	
	private NhanVien_DAO listNhanVien;
	private JTextField txtMaNV;
	private JTextField txtEmail;
	private JTextField txtCCCD;
	private JTextField txtDiaChi;
	private JTextField txtGhiChu;
	private JTable tableDanhSach;
	private DefaultTableModel dataTableModel;
	private JTextField txtHoTen;
	private JComboBox<String> comboboxGioiTinh;
	private Color componentColor = Color.decode("#424242");
	private RoundedButton btnThem;
	private RoundedButton btnSua;
	private RoundedButton btnXoa;
	private RoundedButton btnLuu;
	private RoundedButton btnHuy;
	private JPasswordField pwdMatKhau;
	private JTextField txtSdt;
	private JXDatePicker ngaySinh;
	private JXDatePicker ngayVaoLam;
	private JComboBox<String> comboBoxChucVu;
	private JComboBox<String> comboBoxTrangThai;
	private JLabel lblAvt;
	private JButton btnSetAvt;
	
	
	public NhanVien_QuanLy_UI() {
		listNhanVien = new NhanVien_DAO();
		
		setLayout(new BorderLayout(0, 0));
		
		JPanel panelQuanLy = new JPanel();
		add(panelQuanLy, BorderLayout.NORTH);
		panelQuanLy.setLayout(new BorderLayout(0, 0));
		
		JPanel panelTitle = new JPanel();
		panelQuanLy.add(panelTitle, BorderLayout.NORTH);
		
		JLabel lblTitle = new JLabel("Quản lý nhân viên");
		panelTitle.add(lblTitle);
		
		JPanel panelDetail = new JPanel();
		panelDetail.setBorder(new TitledBorder(null, "Th\u00F4ng tin chi ti\u1EBFt nh\u00E2n vi\u00EAn", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelQuanLy.add(panelDetail, BorderLayout.CENTER);
		panelDetail.setLayout(new BorderLayout(0, 0));
		
		JPanel panelAvt = new JPanel();
		panelAvt.setBorder(new EmptyBorder(10, 10, 10, 10));
		panelDetail.add(panelAvt, BorderLayout.WEST);
		panelAvt.setLayout(new BorderLayout(0, 0));
		
		lblAvt = new JLabel("");
		panelAvt.add(lblAvt, BorderLayout.CENTER);
		lblAvt.setIcon(new ImageScaler("/image_NhanVien/nhanVien.png" , 150, 150).getScaledImageIcon());
		lblAvt.setHorizontalAlignment(SwingConstants.CENTER);
		
		btnSetAvt = new JButton("Chọn ảnh đại diện");
		panelAvt.add(btnSetAvt, BorderLayout.SOUTH);
		
		JPanel panelInfo = new JPanel();
		panelDetail.add(panelInfo, BorderLayout.CENTER);
		panelInfo.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panelInfo.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 3, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_13 = new JPanel();
		panel_2.add(panel_13, BorderLayout.NORTH);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		JLabel lblMaNV = new JLabel("Mã NV");
		panel_13.add(lblMaNV, BorderLayout.WEST);
		
		txtMaNV = new JTextField();
		panel_13.add(txtMaNV, BorderLayout.CENTER);
		txtMaNV.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_14 = new JPanel();
		panel_3.add(panel_14, BorderLayout.NORTH);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		JLabel lblHoTen = new JLabel("Họ tên");
		panel_14.add(lblHoTen, BorderLayout.WEST);
		
		txtHoTen = new JTextField();
		panel_14.add(txtHoTen, BorderLayout.CENTER);
		txtHoTen.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_15 = new JPanel();
		panel_4.add(panel_15, BorderLayout.NORTH);
		panel_15.setLayout(new BorderLayout(0, 0));
		
		JLabel lblMatKhau = new JLabel("Mật khẩu");
		panel_15.add(lblMatKhau, BorderLayout.WEST);
		
		pwdMatKhau = new JPasswordField();
		panel_15.add(pwdMatKhau, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_16 = new JPanel();
		panel_5.add(panel_16, BorderLayout.NORTH);
		panel_16.setLayout(new BorderLayout(0, 0));
		
		JLabel lblGioiTinh = new JLabel("Giới tính");
		panel_16.add(lblGioiTinh, BorderLayout.WEST);
		
		comboboxGioiTinh = new JComboBox<String>();
		panel_16.add(comboboxGioiTinh, BorderLayout.CENTER);
		comboboxGioiTinh.addItem("Nam");
		comboboxGioiTinh.addItem("Nữ");
		
		JPanel panel_6 = new JPanel();
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_17 = new JPanel();
		panel_6.add(panel_17, BorderLayout.NORTH);
		panel_17.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNgaySinh = new JLabel("Ngày sinh");
		panel_17.add(lblNgaySinh, BorderLayout.WEST);
		
		
		ngaySinh = new JXDatePicker();
		panel_17.add(ngaySinh, BorderLayout.CENTER);
		
		
		JPanel panel_7 = new JPanel();
		panel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_18 = new JPanel();
		panel_7.add(panel_18, BorderLayout.NORTH);
		panel_18.setLayout(new BorderLayout(0, 0));
		
		JLabel lblSDT = new JLabel("Số ĐT");
		panel_18.add(lblSDT, BorderLayout.WEST);
		
		txtSdt = new JTextField();
		txtSdt.setText("");
		panel_18.add(txtSdt, BorderLayout.CENTER);
		txtSdt.setColumns(10);
		
		JPanel panel_8 = new JPanel();
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_19 = new JPanel();
		panel_8.add(panel_19, BorderLayout.NORTH);
		panel_19.setLayout(new BorderLayout(0, 0));
		
		JLabel lblEmail = new JLabel("Email");
		panel_19.add(lblEmail, BorderLayout.WEST);
		
		txtEmail = new JTextField();
		panel_19.add(txtEmail, BorderLayout.CENTER);
		txtEmail.setColumns(10);
		
		JPanel panel_9 = new JPanel();
		panel.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_20 = new JPanel();
		panel_9.add(panel_20, BorderLayout.NORTH);
		panel_20.setLayout(new BorderLayout(0, 0));
		
		JLabel lblCCCD = new JLabel("Mã CCCD");
		panel_20.add(lblCCCD, BorderLayout.WEST);
		
		txtCCCD = new JTextField();
		panel_20.add(txtCCCD, BorderLayout.CENTER);
		txtCCCD.setColumns(10);
		
		JPanel panel_10 = new JPanel();
		panel.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_21 = new JPanel();
		panel_10.add(panel_21, BorderLayout.NORTH);
		panel_21.setLayout(new BorderLayout(0, 0));
		
		JLabel lblDiaChi = new JLabel("Địa chỉ");
		panel_21.add(lblDiaChi, BorderLayout.WEST);
		
		txtDiaChi = new JTextField();
		panel_21.add(txtDiaChi, BorderLayout.CENTER);
		txtDiaChi.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(0, 0, 15, 0));
		panelInfo.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new GridLayout(2, 3, 0, 0));
		
		JPanel panel_11 = new JPanel();
		panel_1.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_22 = new JPanel();
		panel_11.add(panel_22, BorderLayout.NORTH);
		panel_22.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNgayVaoLam = new JLabel("Ngày vào làm");
		panel_22.add(lblNgayVaoLam, BorderLayout.WEST);
		
		ngayVaoLam = new JXDatePicker();
		panel_22.add(ngayVaoLam, BorderLayout.CENTER);
		//txtNgayVaoLam.setColumns(8);
		
		JPanel panel_12 = new JPanel();
		panel_1.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_23 = new JPanel();
		panel_12.add(panel_23, BorderLayout.NORTH);
		panel_23.setLayout(new BorderLayout(0, 0));
		
		JLabel lblGhiChu = new JLabel("Ghi chú");
		panel_23.add(lblGhiChu, BorderLayout.WEST);
		
		txtGhiChu = new JTextField();
		txtGhiChu.setColumns(10);
		panel_23.add(txtGhiChu, BorderLayout.CENTER);
		
		JPanel panelOption = new JPanel();
		panelQuanLy.add(panelOption, BorderLayout.SOUTH);
		panelOption.setLayout(new GridLayout(1, 2, 0, 0));
		
		lblCCCD.setPreferredSize(lblNgayVaoLam.getPreferredSize());
		lblDiaChi.setPreferredSize(lblNgayVaoLam.getPreferredSize());
		lblEmail.setPreferredSize(lblNgayVaoLam.getPreferredSize());
		
		JPanel panel_26 = new JPanel();
		panel_1.add(panel_26);
		panel_26.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_28 = new JPanel();
		panel_26.add(panel_28, BorderLayout.NORTH);
		panel_28.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTrangThai = new JLabel("Trạng thái");
		lblTrangThai.setPreferredSize(new Dimension(62, 13));
		panel_28.add(lblTrangThai, BorderLayout.WEST);
		
		comboBoxTrangThai = new JComboBox<String>();
		panel_28.add(comboBoxTrangThai, BorderLayout.CENTER);
		comboBoxTrangThai.addItem("Đang làm");
		comboBoxTrangThai.addItem("Đã nghỉ");
		
		
		
		JPanel panel_27 = new JPanel();
		panel_1.add(panel_27);
		panel_27.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_29 = new JPanel();
		panel_27.add(panel_29, BorderLayout.NORTH);
		panel_29.setLayout(new BorderLayout(0, 0));
		
		JLabel lblChucVu = new JLabel("Chức vụ");
		panel_29.add(lblChucVu, BorderLayout.WEST);
		
		comboBoxChucVu = new JComboBox();
		panel_29.add(comboBoxChucVu, BorderLayout.CENTER);
		comboBoxChucVu.addItem("Thu ngân");
		comboBoxChucVu.addItem("Pha chế");
		comboBoxChucVu.addItem("Phục vụ");
		lblGioiTinh.setPreferredSize(lblNgayVaoLam.getPreferredSize());
		lblHoTen.setPreferredSize(lblNgayVaoLam.getPreferredSize());
		lblMaNV.setPreferredSize(lblNgayVaoLam.getPreferredSize());
		lblMatKhau.setPreferredSize(lblNgayVaoLam.getPreferredSize());
		lblNgaySinh.setPreferredSize(lblNgayVaoLam.getPreferredSize());
		lblSDT.setPreferredSize(lblNgayVaoLam.getPreferredSize());
		
		JPanel panel_24 = new JPanel();
		panelOption.add(panel_24);
		panel_24.add(btnThem = new RoundedButton("Thêm", Color.BLUE, 20, 0, 1.0f));
		btnThem.setBackground(new Color(0, 128, 255));
		btnThem.setFont(new Font("Roboto", Font.BOLD, 20));
		btnThem.setForeground(Color.WHITE);
		panel_24.add(btnSua = new RoundedButton("Sửa", Color.YELLOW, 20, 0, 1.0f));
		btnSua.setBackground(new Color(255, 128, 0));
		btnSua.setFont(new Font("Roboto", Font.BOLD, 20));
		btnSua.setForeground(Color.WHITE);
		panel_24.add(btnXoa = new RoundedButton("Xóa", Color.red, 20, 0, 1.0f));
		btnXoa.setBackground(new Color(255, 0, 0));
		btnXoa.setFont(new Font("Roboto", Font.BOLD, 20));
		btnXoa.setForeground(Color.WHITE);
		
		
		JPanel panel_25 = new JPanel();
		panelOption.add(panel_25);
		panel_25.add(btnLuu = new RoundedButton("Lưu", Color.GREEN, 20, 0, 1.0f));
		btnLuu.setBackground(new Color(0, 255, 0));
		btnLuu.setFont(new Font("Roboto", Font.BOLD, 20));
		btnLuu.setForeground(Color.WHITE);
		panel_25.add(btnHuy = new RoundedButton("Hủy", Color.GRAY, 20, 0, 1.0f));
		btnHuy.setBackground(new Color(128, 128, 192));
		btnHuy.setFont(new Font("Roboto", Font.BOLD, 20));
		btnHuy.setForeground(Color.WHITE);
		
		JPanel panelDanhSach = new JPanel();
		add(panelDanhSach, BorderLayout.CENTER);
		panelDanhSach.setLayout(new BorderLayout(0, 0));
		
		Box boxTable = Box.createHorizontalBox();
		panelDanhSach.add(boxTable);
		
		String[] headerStrings = {"STT", "Mã nhân viên", "Họ tên", "Giới tính", "Ngày sinh", "SDT", "Email", "Địa chỉ", "CCCD", "Ngày vào làm", "Ghi chú"};
		dataTableModel = new DefaultTableModel(headerStrings, 0);
		tableDanhSach = new JTable(dataTableModel);
		tableDanhSach.setRowHeight(24);

		JScrollPane scrollTable = new JScrollPane();
		scrollTable.setViewportView(tableDanhSach);
		boxTable.add(scrollTable);

		

		btnSetAvt.addActionListener(this);
		btnHuy.addActionListener(this);
		btnLuu.addActionListener(this);
		btnSua.addActionListener(this);
		btnThem.addActionListener(this);
		btnXoa.addActionListener(this);
		btnSetAvt.addActionListener(this);
		
		tableDanhSach.addMouseListener(this);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		int selectedRow = tableDanhSach.getSelectedRow();
		txtMaNV.setText(tableDanhSach.getValueAt(selectedRow, 1).toString());						txtMaNV.setEditable(false);
		txtHoTen.setText(tableDanhSach.getValueAt(selectedRow, 2).toString());						txtHoTen.setEditable(false);
		pwdMatKhau.setText(tableDanhSach.getValueAt(selectedRow, 1).toString());					pwdMatKhau.setEditable(false);
		if(tableDanhSach.getValueAt(selectedRow, 3).toString().equalsIgnoreCase("Nam")) {
			comboboxGioiTinh.setSelectedIndex(0);
		}
		else if(tableDanhSach.getValueAt(selectedRow, 3).toString().equalsIgnoreCase("Nữ")) {
			comboboxGioiTinh.setSelectedIndex(1);
		}
//		ngaySinh.setDate((java.util.Date) tableDanhSach.getValueAt(selectedRow, 4));		
		ngaySinh.setDate(castToDateFromString(tableDanhSach.getValueAt(selectedRow, 4).toString()));
																									ngaySinh.setEditable(false);
	
		txtSdt.setText(tableDanhSach.getValueAt(selectedRow, 5).toString());						txtSdt.setEditable(false);
		txtEmail.setText(tableDanhSach.getValueAt(selectedRow, 6).toString());						txtEmail.setEditable(false);
		txtDiaChi.setText(tableDanhSach.getValueAt(selectedRow, 7).toString());						txtDiaChi.setEditable(false);
		txtCCCD.setText(tableDanhSach.getValueAt(selectedRow, 8).toString());						txtCCCD.setEditable(false);
		ngayVaoLam.setDate(castToDateFromString(tableDanhSach.getValueAt(selectedRow, 4).toString()));
																									ngayVaoLam.setEditable(false);	
		txtGhiChu.setText(tableDanhSach.getValueAt(selectedRow, 10).toString());					txtGhiChu.setEditable(false);
																									comboBoxChucVu.setEditable(false);
																									comboboxGioiTinh.setEditable(false);
																									comboBoxTrangThai.setEditable(false);
																									ngaySinh.setEditable(false);
																									ngayVaoLam.setEditable(false);
	
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object ev = e.getSource();
		if(ev.equals(btnThem)) {
			themAction();
			xoaTrangAction();
		}
		if(ev.equals(btnXoa)) {
			xoaAction();
			xoaTrangAction();
		}
		if(ev.equals(btnSua)) {
			suaAction();
			xoaTrangAction();
		}
		if(ev.equals(btnHuy)) {
			xoaTrangAction();
		}
		if(ev.equals(btnLuu)) {
			luuAction();
			xoaTrangAction();
		}
	}
	
	public void themAction() {
		try {
			String ma = txtMaNV.getText();
			String hoTen = txtHoTen.getText();
			String matKhau = pwdMatKhau.getText();
			boolean gioiTinh = false;
			if(comboboxGioiTinh.getSelectedItem().toString().equalsIgnoreCase("Nam")) {
				gioiTinh = true;
			}
			boolean trangthai = false;
			if(comboBoxTrangThai.getSelectedItem().toString().equalsIgnoreCase("Đang làm")) {
				trangthai = true;
			}
			java.util.Date ngayXinh = ngaySinh.getDate();
			String sdt = txtSdt.getText();
			String email = txtEmail.getText();
			String macccd = txtCCCD.getText();
			String diaChi = txtDiaChi.getText();
			java.util.Date ngayvaolam = ngayVaoLam.getDate();
			String ghichu = txtGhiChu.getText();
			boolean trangThai = true;
			if(comboBoxTrangThai.getSelectedItem().toString().equalsIgnoreCase("Đã nghỉ")) {
				trangthai = false;
			}
			int chucvu = comboBoxChucVu.getSelectedIndex();
			NhanVien nVien = new NhanVien(ma, hoTen, matKhau, gioiTinh, ngayXinh, sdt, email, macccd, diaChi, ngayvaolam, ghichu, trangThai, chucvu);
			if(isValidInput() && listNhanVien.themNhanVien(nVien)) {
				String row[] = {Integer.toString(listNhanVien.timKiemNhanVienIndex(nVien) + 1), ma, hoTen, gioiTinh == true? "Nam" : "Nữ", ngayXinh.toString(), sdt, email, diaChi, macccd, ngayvaolam.toString(), ghichu };
				dataTableModel.addRow(row);
				xoaTrangAction();
				JOptionPane.showMessageDialog(null, "Thêm nhân viên thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
			}
		}catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "Lỗi thêm nhân viên.", "Lỗi", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
	}
	
	public void xoaAction() {
		
	}
	
	public void suaAction() {
		
	}
	
	public void xoaTrangAction() {
		txtCCCD.setText("");		txtCCCD.setEditable(true);
		txtDiaChi.setText("");		txtDiaChi.setEditable(true);
		txtEmail.setText(""); 		txtEmail.setEditable(true);
		txtGhiChu.setText(""); 		txtGhiChu.setEditable(true);
		txtHoTen.setText("");		txtHoTen.setEditable(true);
		txtMaNV.setText("");		txtMaNV.setEditable(true);
		pwdMatKhau.setText("");		pwdMatKhau.setEditable(true);
		txtSdt.setText(""); 		txtSdt.setEditable(true);
		lblAvt.setIcon(null);		comboboxGioiTinh.setEditable(true);
		ngaySinh.setDate(null);		ngaySinh.setEditable(true);
		ngayVaoLam.setDate(null);	ngayVaoLam.setEditable(true);
	}
	
	public void luuAction() {
		
	}
	
	public boolean isValidInput() {
		String regexMa = "^NV+[0-9]{3}$";
		String regexHoTen = "^[A-Za-z]+( [A-Za-z]+)*$";
		String regexmatKhau = "^[a-zA-Z0-9]{9,15}$";
		java.util.Date ngayHnay = new java.util.Date();
		String regexSdt = "^0[0-9]{9}$";
		String regexEmail = "^[a-zA-Z0-9._%+-]+@[\\w]*+\\.[\\w]*$";
		String regexCCCD = "^[0-9]{12}";
		
		
		
		if(!txtMaNV.getText().matches(regexMa)) {
			JOptionPane.showMessageDialog(null, "Lỗi mã nhân viên.", "Lỗi", JOptionPane.ERROR_MESSAGE);
			return false;
		}
		if(!txtHoTen.getText().matches(regexHoTen)) {
			JOptionPane.showMessageDialog(null, "Lỗi họ tên", "Lỗi", JOptionPane.ERROR_MESSAGE);
			return false;
		}
		if(!pwdMatKhau.getText().matches(regexmatKhau)) {
			JOptionPane.showMessageDialog(null, "Lỗi mật khẩu", "Lỗi", JOptionPane.ERROR_MESSAGE);
			return false;
		}
		if(ngaySinh.getDate().after(ngayHnay)) {
			JOptionPane.showMessageDialog(null, "Lỗi ngày sinh", "Lỗi", JOptionPane.ERROR_MESSAGE);
			return false;
		}
		if(!txtSdt.getText().matches(regexSdt)) {
			JOptionPane.showMessageDialog(null, "Lỗi số điện thoại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
			return false;
		}
		if(!txtEmail.getText().matches(regexEmail)) {
			JOptionPane.showMessageDialog(null, "Lỗi email", "Lỗi", JOptionPane.ERROR_MESSAGE);
			return false;
		}
		if(!txtCCCD.getText().matches(regexCCCD)) {
			JOptionPane.showMessageDialog(null, "Lỗi căn cước công dân", "Lỗi", JOptionPane.ERROR_MESSAGE);
			return false;
		}
		if(ngayVaoLam.getDate().after(ngayHnay)) {
			JOptionPane.showMessageDialog(null, "Lỗi ngày vào làm", "Lỗi", JOptionPane.ERROR_MESSAGE);
			return false;
		}
		
		return true;
	}
	
	public java.util.Date castToDateFromString(String dateString) {
		try {
			String dateFormatPattern = "EEE MMM dd HH:mm:ss zzz yyyy";
			SimpleDateFormat dateFormat = new SimpleDateFormat(dateFormatPattern, Locale.US);
			java.util.Date casedDate;
			casedDate =  dateFormat.parse(dateString);
			return casedDate;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  return null;
	}
	
}
