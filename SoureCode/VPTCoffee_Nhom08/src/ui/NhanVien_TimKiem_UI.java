package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
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

public class NhanVien_TimKiem_UI extends JPanel{
	private DefaultTableModel dataTableModel;
	private JTable tableDanhSach;
	private JTextField txtTimKiemMaNV;
	private JXDatePicker TimKiemNgaySinh;
	private JTextField txtTimKiemSDT;
	private JXDatePicker TimKiemNgayVaoLam;
	private JTextField txtTimKiemHoTen;
	private JTextField txtTimKiemDiaChi;
	private JTextField txtKetQuaMaNV;
	private JXDatePicker KetQuaNgaySinh;
	private JTextField txtKetQuaSDT;
	private JXDatePicker KetQuaNgayVaoLam;
	private JTextField txtKetQuaHoTen;
	private JTextField txtKetQuaDiaChi;
	
	public NhanVien_TimKiem_UI() {
setLayout(new BorderLayout(0, 0));
		
		JPanel centerPanel = new JPanel();
		add(centerPanel, BorderLayout.NORTH);
		centerPanel.setLayout(new BorderLayout(0, 0));
		
		Box boxEast = Box.createVerticalBox();
		centerPanel.add(boxEast, BorderLayout.WEST);
		
		JPanel timKiemInfoPanel = new JPanel();
		boxEast.add(timKiemInfoPanel);
		timKiemInfoPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel timKiem = new JPanel();
		timKiem.setBorder(new TitledBorder(null, "Th\u00F4ng tin c\u1EA7n t\u00ECm", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		timKiemInfoPanel.add(timKiem);
		timKiem.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel timKiemLeft = new JPanel();
		timKiem.add(timKiemLeft);
		timKiemLeft.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panelTimKiemMaNV = new JPanel();
		timKiemLeft.add(panelTimKiemMaNV);
		panelTimKiemMaNV.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panelTimKiemMaNV.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTimKiemMaNV = new JLabel("Mã NV");
		panel_1.add(lblTimKiemMaNV, BorderLayout.WEST);
		
		txtTimKiemMaNV = new JTextField();
		txtTimKiemMaNV.setColumns(10);
		panel_1.add(txtTimKiemMaNV);
		
		JPanel panelTimKiemNgaySinh = new JPanel();
		timKiemLeft.add(panelTimKiemNgaySinh);
		panelTimKiemNgaySinh.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panelTimKiemNgaySinh.add(panel_2, BorderLayout.NORTH);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTimKiemNgaySinh = new JLabel("Ngày sinh");
		panel_2.add(lblTimKiemNgaySinh, BorderLayout.WEST);
		
		TimKiemNgaySinh = new JXDatePicker();
		panel_2.add(TimKiemNgaySinh);
		
		JPanel panelTimKiemSDT = new JPanel();
		timKiemLeft.add(panelTimKiemSDT);
		panelTimKiemSDT.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panelTimKiemSDT.add(panel_3, BorderLayout.NORTH);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTimKiemSDT = new JLabel("Số ĐT");
		panel_3.add(lblTimKiemSDT, BorderLayout.WEST);
		
		txtTimKiemSDT = new JTextField();
		txtTimKiemSDT.setColumns(10);
		panel_3.add(txtTimKiemSDT);
		
		JPanel panelTimKiemNgayVaoLam = new JPanel();
		timKiemLeft.add(panelTimKiemNgayVaoLam);
		panelTimKiemNgayVaoLam.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_4 = new JPanel();
		panelTimKiemNgayVaoLam.add(panel_4, BorderLayout.NORTH);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTimKiemNgayVaoLam = new JLabel("Ngày vào làm   ");
		panel_4.add(lblTimKiemNgayVaoLam, BorderLayout.WEST);
		
		TimKiemNgayVaoLam = new JXDatePicker();
		panel_4.add(TimKiemNgayVaoLam);
		
		JPanel panelTimKiemTrangThai = new JPanel();
		timKiemLeft.add(panelTimKiemTrangThai);
		panelTimKiemTrangThai.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_5 = new JPanel();
		panelTimKiemTrangThai.add(panel_5, BorderLayout.NORTH);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTimKiemTrangThai = new JLabel("Trạng thái");
		panel_5.add(lblTimKiemTrangThai, BorderLayout.WEST);
		
		JComboBox listTrangThaiTimKiem = new JComboBox();
		panel_5.add(listTrangThaiTimKiem);
		
		JPanel timKiemRight = new JPanel();
		timKiem.add(timKiemRight);
		timKiemRight.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panelTimKiemHoTen = new JPanel();
		timKiemRight.add(panelTimKiemHoTen);
		panelTimKiemHoTen.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_6 = new JPanel();
		panelTimKiemHoTen.add(panel_6, BorderLayout.NORTH);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTimKiemHoTen = new JLabel("Họ tên");
		panel_6.add(lblTimKiemHoTen, BorderLayout.WEST);
		
		txtTimKiemHoTen = new JTextField();
		txtTimKiemHoTen.setColumns(10);
		panel_6.add(txtTimKiemHoTen);
		
		JPanel panelTimKiemGioiTinh = new JPanel();
		timKiemRight.add(panelTimKiemGioiTinh);
		panelTimKiemGioiTinh.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_7 = new JPanel();
		panelTimKiemGioiTinh.add(panel_7, BorderLayout.NORTH);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTimKiemGioiTnh = new JLabel("Giới tính");
		panel_7.add(lblTimKiemGioiTnh, BorderLayout.WEST);
		
		JComboBox listGioiTinh2 = new JComboBox();
		panel_7.add(listGioiTinh2);
		
		JPanel panelTimKiemDiaChi = new JPanel();
		timKiemRight.add(panelTimKiemDiaChi);
		panelTimKiemDiaChi.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_8 = new JPanel();
		panelTimKiemDiaChi.add(panel_8, BorderLayout.NORTH);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTimKiemDiaChi = new JLabel("Địa chỉ");
		panel_8.add(lblTimKiemDiaChi, BorderLayout.WEST);
		
		txtTimKiemDiaChi = new JTextField();
		txtTimKiemDiaChi.setColumns(10);
		panel_8.add(txtTimKiemDiaChi, BorderLayout.CENTER);
		
		JPanel panelTimKiemChucVU = new JPanel();
		timKiemRight.add(panelTimKiemChucVU);
		panelTimKiemChucVU.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_9 = new JPanel();
		panelTimKiemChucVU.add(panel_9, BorderLayout.NORTH);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTimKiemChucVu = new JLabel("Chức vụ");
		panel_9.add(lblTimKiemChucVu, BorderLayout.WEST);
		
		JComboBox listChucVuTimKiem = new JComboBox();
		panel_9.add(listChucVuTimKiem, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		timKiemRight.add(panel);
		
		JPanel pnlNorth = new JPanel();
		centerPanel.add(pnlNorth, BorderLayout.NORTH);
		
		JLabel lblTitle = new JLabel("TÌM KIẾM NHÂN VIÊN");
		pnlNorth.add(lblTitle);
		
		JPanel pnlWest = new JPanel();
		pnlWest.setBorder(new TitledBorder(null, "K\u1EBFt qu\u1EA3 t\u00ECm ki\u1EBFm", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		centerPanel.add(pnlWest, BorderLayout.CENTER);
		pnlWest.setLayout(new BorderLayout(0, 0));
		
		JPanel panelAVT = new JPanel();
		panelAVT.setBorder(new EmptyBorder(10, 10, 10, 10));
		pnlWest.add(panelAVT, BorderLayout.WEST);
		panelAVT.setLayout(new BorderLayout(0, 0));
		
		JLabel lblAvt = new JLabel("");
		panelAVT.add(lblAvt, BorderLayout.NORTH);
		lblAvt.setIcon(new ImageScaler("/image_NhanVien/nhanVien.png" , 150, 150).getScaledImageIcon());
		lblAvt.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panelKetQuaTimKiem = new JPanel();
		pnlWest.add(panelKetQuaTimKiem, BorderLayout.CENTER);
		panelKetQuaTimKiem.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panelKetQuaTimKiemLeft = new JPanel();
		panelKetQuaTimKiem.add(panelKetQuaTimKiemLeft);
		panelKetQuaTimKiemLeft.setLayout(new GridLayout(5, 0, 0, 0));
		
		JPanel panelKetQuaNV = new JPanel();
		panelKetQuaTimKiemLeft.add(panelKetQuaNV);
		panelKetQuaNV.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_10 = new JPanel();
		panelKetQuaNV.add(panel_10, BorderLayout.NORTH);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		JLabel lblKetQuaMaNV = new JLabel("Mã NV");
		panel_10.add(lblKetQuaMaNV, BorderLayout.WEST);
		
		txtKetQuaMaNV = new JTextField();
		txtKetQuaMaNV.setColumns(10);
		panel_10.add(txtKetQuaMaNV);
		
		JPanel panelKetQuaNgaySinh = new JPanel();
		panelKetQuaTimKiemLeft.add(panelKetQuaNgaySinh);
		panelKetQuaNgaySinh.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_11 = new JPanel();
		panelKetQuaNgaySinh.add(panel_11, BorderLayout.NORTH);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		JLabel lblKetQuaNgaySinh = new JLabel("Ngày sinh");
		panel_11.add(lblKetQuaNgaySinh, BorderLayout.WEST);
		
		KetQuaNgaySinh = new JXDatePicker();
		panel_11.add(KetQuaNgaySinh, BorderLayout.CENTER);
		
		JPanel panelKetQuaSDT = new JPanel();
		panelKetQuaTimKiemLeft.add(panelKetQuaSDT);
		panelKetQuaSDT.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_12 = new JPanel();
		panelKetQuaSDT.add(panel_12, BorderLayout.NORTH);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		JLabel lblKetQuaSoDT = new JLabel("Số ĐT");
		panel_12.add(lblKetQuaSoDT, BorderLayout.WEST);
		
		txtKetQuaSDT = new JTextField();
		txtKetQuaSDT.setColumns(10);
		panel_12.add(txtKetQuaSDT, BorderLayout.CENTER);
		
		JPanel panelKetQuaNgayVaoLam = new JPanel();
		panelKetQuaTimKiemLeft.add(panelKetQuaNgayVaoLam);
		panelKetQuaNgayVaoLam.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_13 = new JPanel();
		panelKetQuaNgayVaoLam.add(panel_13, BorderLayout.NORTH);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		JLabel lblKetQuaNgayVaoLam = new JLabel("Ngày vào làm   ");
		panel_13.add(lblKetQuaNgayVaoLam, BorderLayout.WEST);
		
		KetQuaNgayVaoLam = new JXDatePicker();
		panel_13.add(KetQuaNgayVaoLam, BorderLayout.CENTER);
		
		JPanel panelKetQuaTrangThai = new JPanel();
		panelKetQuaTimKiemLeft.add(panelKetQuaTrangThai);
		panelKetQuaTrangThai.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_14 = new JPanel();
		panelKetQuaTrangThai.add(panel_14, BorderLayout.NORTH);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		JLabel lblKetQuaTrangThai = new JLabel("Trạng thái");
		panel_14.add(lblKetQuaTrangThai, BorderLayout.WEST);
		
		JComboBox listKetQuaTrangThai = new JComboBox();
		panel_14.add(listKetQuaTrangThai, BorderLayout.CENTER);
		
		JPanel panelKetQuaTimKiemRight = new JPanel();
		panelKetQuaTimKiem.add(panelKetQuaTimKiemRight);
		panelKetQuaTimKiemRight.setLayout(new GridLayout(5, 3, 0, 0));
		
		JPanel panelKetQuaHoTen = new JPanel();
		panelKetQuaTimKiemRight.add(panelKetQuaHoTen);
		panelKetQuaHoTen.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_15 = new JPanel();
		panelKetQuaHoTen.add(panel_15, BorderLayout.NORTH);
		panel_15.setLayout(new BorderLayout(0, 0));
		
		JLabel lblKetQuaHoTen = new JLabel("Họ tên");
		panel_15.add(lblKetQuaHoTen, BorderLayout.WEST);
		
		txtKetQuaHoTen = new JTextField();
		txtKetQuaHoTen.setColumns(10);
		panel_15.add(txtKetQuaHoTen, BorderLayout.CENTER);
		
		JPanel panelKetQuaGioiTinh = new JPanel();
		panelKetQuaTimKiemRight.add(panelKetQuaGioiTinh);
		panelKetQuaGioiTinh.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_16 = new JPanel();
		panelKetQuaGioiTinh.add(panel_16, BorderLayout.NORTH);
		panel_16.setLayout(new BorderLayout(0, 0));
		
		JLabel lblKetQuaGioiTinh = new JLabel("Giới tính");
		panel_16.add(lblKetQuaGioiTinh, BorderLayout.WEST);
		
		JComboBox listKetQuaGioiTinh = new JComboBox();
		panel_16.add(listKetQuaGioiTinh, BorderLayout.CENTER);
		
		JPanel panelKetQuaDiaChi = new JPanel();
		panelKetQuaTimKiemRight.add(panelKetQuaDiaChi);
		panelKetQuaDiaChi.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_17 = new JPanel();
		panelKetQuaDiaChi.add(panel_17, BorderLayout.NORTH);
		panel_17.setLayout(new BorderLayout(0, 0));
		
		JLabel lblKetQuaDiaChi = new JLabel("Địa chỉ");
		panel_17.add(lblKetQuaDiaChi, BorderLayout.WEST);
		
		txtKetQuaDiaChi = new JTextField();
		txtKetQuaDiaChi.setColumns(10);
		panel_17.add(txtKetQuaDiaChi, BorderLayout.CENTER);
		
		JPanel panelKetQuaChucVu = new JPanel();
		panelKetQuaTimKiemRight.add(panelKetQuaChucVu);
		panelKetQuaChucVu.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_18 = new JPanel();
		panelKetQuaChucVu.add(panel_18, BorderLayout.NORTH);
		panel_18.setLayout(new BorderLayout(0, 0));
		
		JLabel lblKetQuaChucVu = new JLabel("Chức vụ");
		panel_18.add(lblKetQuaChucVu, BorderLayout.WEST);
		
		JComboBox listKetQuaChucVu = new JComboBox();
		panel_18.add(listKetQuaChucVu, BorderLayout.CENTER);
		
		JPanel pnlBang = new JPanel();
		add(pnlBang, BorderLayout.CENTER);
		pnlBang.setLayout(new BorderLayout(0, 0));
		
		Box horizontalBox_11 = Box.createHorizontalBox();
		pnlBang.add(horizontalBox_11);
		
		
		
		String[] headerStrings = {"STT", "Mã nhân viên", "Họ tên", "Giới tính", "Ngày sinh", "SDT", "Email", "Địa chỉ", "CCCD", "Ngày vào làm", "Ghi chú"};
		dataTableModel = new DefaultTableModel(headerStrings, 0);
		tableDanhSach = new JTable(dataTableModel);
		JScrollPane scrollTable = new JScrollPane();
		scrollTable.setViewportView(tableDanhSach);
		horizontalBox_11.add(scrollTable);
		
		lblTimKiemChucVu.setPreferredSize(lblTimKiemNgayVaoLam.getPreferredSize());
		lblTimKiemDiaChi.setPreferredSize(lblTimKiemNgayVaoLam.getPreferredSize());
		lblTimKiemHoTen.setPreferredSize(lblTimKiemNgayVaoLam.getPreferredSize());
		lblTimKiemMaNV.setPreferredSize(lblTimKiemNgayVaoLam.getPreferredSize());
		lblTimKiemNgaySinh.setPreferredSize(lblTimKiemNgayVaoLam.getPreferredSize());
		lblTimKiemSDT.setPreferredSize(lblTimKiemNgayVaoLam.getPreferredSize());
		lblTimKiemTrangThai.setPreferredSize(lblTimKiemNgayVaoLam.getPreferredSize());
		lblTimKiemGioiTnh.setPreferredSize(lblTimKiemNgayVaoLam.getPreferredSize());
		
		
		lblKetQuaChucVu.setPreferredSize(lblKetQuaNgayVaoLam.getPreferredSize());
		lblKetQuaDiaChi.setPreferredSize(lblKetQuaNgayVaoLam.getPreferredSize());
		lblKetQuaGioiTinh.setPreferredSize(lblKetQuaNgayVaoLam.getPreferredSize());
		lblKetQuaHoTen.setPreferredSize(lblKetQuaNgayVaoLam.getPreferredSize());
		lblKetQuaMaNV.setPreferredSize(lblKetQuaNgayVaoLam.getPreferredSize());
		lblKetQuaNgaySinh.setPreferredSize(lblKetQuaNgayVaoLam.getPreferredSize());
		lblKetQuaSoDT.setPreferredSize(lblKetQuaNgayVaoLam.getPreferredSize());
		lblKetQuaTrangThai.setPreferredSize(lblKetQuaNgayVaoLam.getPreferredSize());

		
	}
}
