package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class HoaDon_QuanLy_UI extends JPanel{
	private JTable tableHoaDon;
	private DefaultTableModel modelHoaDon;
	private JTable tableCTHoaDon;
	private DefaultTableModel modelCTHoaDon;
	private JScrollPane tableScroll;
	private JLabel maHDValue;
	private JLabel tenKHValue;
	private JLabel sdtValue;
	private JLabel ngayLapHDValue;
	private JLabel loaiThanhToanValue;
	private JTextArea ghiChuArea;
	private JTextArea diaChiArea;
	private JLabel tongTienSanPhamValue;
	private JLabel tongTienHoaDonValue;
	private JLabel chiPhiKhacValue;
	
	public HoaDon_QuanLy_UI() {
		GridLayout gridLayout_1 = new GridLayout(1, 2);
		setLayout(gridLayout_1);
		
		JPanel danhSachHoaDonPnl = new JPanel();
		danhSachHoaDonPnl.setBorder(new EmptyBorder(10, 10, 10, 10));
		JPanel chiTietHoaDonPnl = new JPanel();
		chiTietHoaDonPnl.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		BorderLayout borderLayout_1 = new BorderLayout(5, 5);
		danhSachHoaDonPnl.setLayout(borderLayout_1);
		
		JLabel danhSachHoaDonLabel = new JLabel("Danh Sách Hóa Đơn", SwingConstants.CENTER);
		danhSachHoaDonLabel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		danhSachHoaDonPnl.add(borderLayout_1.NORTH, danhSachHoaDonLabel);
		
		String[] danhSachHoaDonColHeader = { "Mã HĐ", "Tên Khách Hàng", "Tên Nhân Viên", "Ngày Lập HĐ", "Tổng tiền"};
		modelHoaDon = new DefaultTableModel(danhSachHoaDonColHeader, 0);
		tableHoaDon = new JTable(modelHoaDon);
		tableScroll = new JScrollPane(tableHoaDon);
		tableScroll.getViewport().setBackground(Color.white);
		danhSachHoaDonPnl.add(tableScroll, BorderLayout.CENTER);
		
		BorderLayout borderLayout_2 = new BorderLayout(5, 5);
		chiTietHoaDonPnl.setLayout(borderLayout_2);
		
		JLabel chiTietHoaDonLabel = new JLabel("Chi Tiết Hóa Đơn", SwingConstants.CENTER);
		chiTietHoaDonLabel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		chiTietHoaDonPnl.add(borderLayout_2.NORTH, chiTietHoaDonLabel);
		
		String[] chiTietHoaDonColHeader = { "Tên SP", "Đơn Giá", "Thành Tiền", "Ghi Chú"};
		modelCTHoaDon = new DefaultTableModel(chiTietHoaDonColHeader, 0);
		tableCTHoaDon = new JTable(modelCTHoaDon);
		tableScroll = new JScrollPane(tableCTHoaDon);
		tableScroll.getViewport().setBackground(Color.white);
		chiTietHoaDonPnl.add(tableScroll, BorderLayout.CENTER);
		
		JPanel noiDungChiTietHoaDonPnl = new JPanel();
		
		GridLayout gridLayout_2 = new GridLayout(1, 2);
		noiDungChiTietHoaDonPnl.setLayout(gridLayout_2);
		
		JPanel leftColPanel = new JPanel();
		BoxLayout boxLayout_1 = new BoxLayout(leftColPanel, BoxLayout.Y_AXIS);
		leftColPanel.setLayout(boxLayout_1);
		
		JPanel rightColPanel = new JPanel();
		BoxLayout boxLayout_2 = new BoxLayout(rightColPanel, BoxLayout.Y_AXIS);
		rightColPanel.setLayout(boxLayout_2);
		
		JPanel maHDPanel = new JPanel();
		maHDPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel maHDLabel = new JLabel("Mã Hóa Đơn:");
		maHDValue = new JLabel("HD0003");
		maHDValue.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
		maHDPanel.add(maHDLabel);
		maHDPanel.add(maHDValue);
		
		JPanel tenKHPanel = new JPanel();
		tenKHPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel tenKHLabel = new JLabel("Tên Khách Hàng:");
		tenKHValue = new JLabel("Trần Đức Vũ");
		tenKHValue.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
		tenKHPanel.add(tenKHLabel);
		tenKHPanel.add(tenKHValue);
		
		JPanel sdtPanel = new JPanel();
		sdtPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel sdtLabel = new JLabel("Số Điện Thoại:");
		sdtValue = new JLabel("0946890234");
		sdtValue.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
		sdtPanel.add(sdtLabel);
		sdtPanel.add(sdtValue);
		
		JPanel ngayLapHDPanel = new JPanel();
		ngayLapHDPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel ngayLapHDLabel = new JLabel("Ngày Lập HĐ:");
		ngayLapHDValue = new JLabel("15:29 20-04-2033");
		ngayLapHDValue.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
		ngayLapHDPanel.add(ngayLapHDLabel);
		ngayLapHDPanel.add(ngayLapHDValue);
		
		JPanel ghiChuPanel = new JPanel();
		ghiChuPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel ghiChuLabel = new JLabel("Ghi Chú:");
		ghiChuArea = new JTextArea(5, 30);
		ghiChuPanel.add(ghiChuLabel);
		ghiChuPanel.add(ghiChuArea);
		
		leftColPanel.add(maHDPanel);
		leftColPanel.add(tenKHPanel);
		leftColPanel.add(sdtPanel);
		leftColPanel.add(ngayLapHDPanel);
		leftColPanel.add(ghiChuPanel);
		
		JPanel tongTienSanPhamPanel = new JPanel();
		tongTienSanPhamPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel tongTienSanPhamLabel = new JLabel("Tổng tiền HĐ:");
		tongTienSanPhamValue = new JLabel("20.300 đ");
		tongTienSanPhamValue.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
		tongTienSanPhamPanel.add(tongTienSanPhamLabel);
		tongTienSanPhamPanel.add(tongTienSanPhamValue);

		JPanel tongTienHoaDonPanel = new JPanel();
		tongTienHoaDonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel tongTienHoaDonLabel = new JLabel("Tổng tiền SP:");
		tongTienHoaDonValue = new JLabel("20.300đ");
		tongTienHoaDonValue.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
		tongTienHoaDonPanel.add(tongTienHoaDonLabel);
		tongTienHoaDonPanel.add(tongTienHoaDonValue);
		
		JPanel chiPhiKhacPanel = new JPanel();
		chiPhiKhacPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel chiPhiKhacLabel = new JLabel("Chi phí khác:");
		chiPhiKhacValue = new JLabel("0đ");
		chiPhiKhacValue.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
		chiPhiKhacPanel.add(chiPhiKhacLabel);
		chiPhiKhacPanel.add(chiPhiKhacValue);

		JPanel loaiThanhToanPanel = new JPanel();
		loaiThanhToanPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel loaiThanhToanLabel = new JLabel("Loại Thanh Toán:");
		loaiThanhToanValue = new JLabel("Chuyển khoản");
		loaiThanhToanValue.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
		loaiThanhToanPanel.add(loaiThanhToanLabel);
		loaiThanhToanPanel.add(loaiThanhToanValue);
		
		JPanel diaChiPanel = new JPanel();
		diaChiPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel diaChiLabel = new JLabel("Địa chỉ:");
		diaChiArea = new JTextArea(5, 30);
		diaChiPanel.add(diaChiLabel);
		diaChiPanel.add(diaChiArea);
		
		rightColPanel.add(tongTienSanPhamPanel);
		rightColPanel.add(chiPhiKhacPanel);
		rightColPanel.add(tongTienHoaDonPanel);
		rightColPanel.add(loaiThanhToanPanel);
		rightColPanel.add(diaChiPanel);
		
		noiDungChiTietHoaDonPnl.add(leftColPanel);
		noiDungChiTietHoaDonPnl.add(rightColPanel);
		
		chiTietHoaDonPnl.add(BorderLayout.SOUTH, noiDungChiTietHoaDonPnl);
		
		add(danhSachHoaDonPnl);
		add(chiTietHoaDonPnl);
		
		
	}
}
