package ui;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.BoxLayout;
import javax.swing.border.EmptyBorder;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

import customUI.ImageScaler;
import customUI.RoundedButton;
import customUI.RoundedPanel;
import entity.SanPham;

import java.awt.Color;

import javax.swing.border.CompoundBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import javax.swing.JTextArea;

public class SanPham_BanHang_UI extends JPanel implements ActionListener, MouseListener {
	private JTextField txtTimSP;
	private RoundedButton btnTimSP;

	private ArrayList<SanPham> productList;
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

//	----------------------------------------------------------------

	public SanPham_BanHang_UI() {
		setLayout(new BorderLayout(0, 0));
		DecimalFormat decimalFormat = new DecimalFormat("#,##0");

		JPanel pnlContainer = new JPanel();
		pnlContainer.setBorder(new EmptyBorder(5, 5, 5, 5));
		add(pnlContainer);
		pnlContainer.setLayout(new GridLayout(1, 2, 0, 0));

		// phan pnl ben trai
		JPanel pnlLeft = new JPanel();
		pnlLeft.setBorder(new CompoundBorder(new MatteBorder(0, 0, 0, 2, (Color) new Color(192, 192, 192)),
				new EmptyBorder(0, 0, 0, 5)));
		pnlContainer.add(pnlLeft);
		pnlLeft.setLayout(new BorderLayout(0, 0));

		// ------------------------------------------------
		JPanel pnlSearchAction = new JPanel();
		pnlSearchAction.setBorder(new EmptyBorder(0, 0, 5, 0));
		pnlLeft.add(pnlSearchAction, BorderLayout.NORTH);
		pnlSearchAction.setLayout(new BoxLayout(pnlSearchAction, BoxLayout.X_AXIS));

		JPanel pnlCmb = new JPanel();
		pnlSearchAction.add(pnlCmb);
		pnlCmb.setLayout(new BorderLayout(0, 0));

		JComboBox<String> cmbLoaiSP = new JComboBox<String>();
		cmbLoaiSP.addItem("Tất cả");
		cmbLoaiSP.addItem("Coffee");
		cmbLoaiSP.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		cmbLoaiSP.setForeground(Color.decode("#000000"));
		cmbLoaiSP.setBackground(Color.decode("#FFFFFF"));
		cmbLoaiSP.setBorder(new MatteBorder(1, 1, 1, 1, Color.decode("#B16E5C")));

		pnlCmb.add(cmbLoaiSP);

		Component horizontalStrut = Box.createHorizontalStrut(5);
		pnlSearchAction.add(horizontalStrut);

		JPanel pnlSearchSP = new JPanel();
		pnlSearchAction.add(pnlSearchSP);
		pnlSearchSP.setLayout(new BorderLayout(5, 0));

		txtTimSP = new JTextField();
		txtTimSP.setBorder(new MatteBorder(1, 1, 1, 1, Color.decode("#B16E5C")));
		txtTimSP.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		pnlSearchSP.add(txtTimSP, BorderLayout.CENTER);

		txtTimSP.setColumns(10);

		btnTimSP = new RoundedButton("Tìm", null, 10, 0, 3f);
		btnTimSP.setFont(new Font("Segoe UI Semibold", Font.BOLD, 19));
		btnTimSP.setBackground(Color.decode("#ffffff"));
		pnlSearchSP.add(btnTimSP, BorderLayout.EAST);

		// ------------------------------------

		JPanel pnlTableSP = new JPanel();
		pnlLeft.add(pnlTableSP);
		pnlTableSP.setLayout(new BorderLayout(0, 0));

		JPanel pnlRenderSP = new JPanel();
		pnlRenderSP.setBackground(Color.decode("#e0e0e0"));
		pnlRenderSP.setBorder(new EmptyBorder(5, 5, 5, 5));
		pnlRenderSP.setLayout(new GridLayout(0, 3, 5, 5));

		productList = new ArrayList<>();

		productList.add(new SanPham("SP00001", "Cafe Bạc Sỉu", "coffee", true, "coffee_bac-xiu.PNG", 39000));
		productList.add(new SanPham("SP00002", "Cafe Đen", "coffee", true, "coffee_cafe-den.PNG", 35000));
		productList.add(new SanPham("SP00003", "Cafe Espresso", "coffee", false, "coffee_espresso.PNG", 35000));
		productList.add(new SanPham("SP00004", "Cafe Cappuccino", "coffee", true, "coffee_cappuccino.PNG", 55000));
		productList.add(new SanPham("SP00005", "Cafe Cappuccinoư", "coffee", false, "coffee_cappuccino.PNG", 55000));
		productList.add(new SanPham("SP00006", "Cafe Cappuccino2", "coffee", true, "coffee_cappuccino.PNG", 55000));
		productList.add(new SanPham("SP00007", "Cafe Cappuccino2", "coffee", true, "coffee_cappuccino.PNG", 55000));
		productList.add(new SanPham("SP00008", "Cafe Cappuccino2", "coffee", true, "coffee_cappuccino.PNG", 55000));
		productList.add(new SanPham("SP00009", "Cafe Cappuccino2", "coffee", true, "coffee_cappuccino.PNG", 55000));
		productList.add(new SanPham("SP000010", "Cafe Cappuccino2", "coffee", true, "coffee_cappuccino.PNG", 55000));

		for (SanPham product : productList) {

			final SanPham finalProduct = product;
			
			RoundedPanel pnlThongTinSP = new RoundedPanel(null, 10, 0);
			pnlThongTinSP.setLayout( new BorderLayout(0,0));
			pnlThongTinSP.setBorder(new EmptyBorder(10, 10, 10, 10));
			pnlThongTinSP.setForeground(Color.decode("#000000"));
			pnlThongTinSP.setBackground(Color.decode("#ffffff"));
			pnlThongTinSP.setPreferredSize(new Dimension(100, 220));
			
			JPanel pnlImageTTSP = new JPanel();
			pnlThongTinSP.add(pnlImageTTSP); 
			pnlImageTTSP.setLayout(null);
			
			
			// lbl icon ngung ban
			JLabel lblImageSPNgungBan = new JLabel();
			lblImageSPNgungBan.setIcon(new ImageScaler("/icon/icon_ngungban.png", 110, 30).getScaledImageIcon());
			lblImageSPNgungBan.setBounds(24, 110, 110, 30);
			
			
			JPanel pnlBottomTTSP  = new JPanel();
			pnlBottomTTSP.setLayout(new BorderLayout());
			pnlBottomTTSP.setBackground(Color.decode("#ffffff"));
			
			
			// check ngung ban
			if(finalProduct.isTrangThai()){
				
			}else {
				pnlThongTinSP.setBackground(Color.decode("#ede1de"));
				pnlBottomTTSP.setBackground(Color.decode("#ede1de"));
				pnlImageTTSP.add(lblImageSPNgungBan);
			}
			
			
			// them anh san pham
			JLabel lblImageTTSP = new JLabel();
			lblImageTTSP.setIcon(new ImageScaler("/image_SanPham/" + finalProduct.getAnhSP(), 160, 160).getScaledImageIcon());
			lblImageTTSP.setBounds(0, 0, 250, 160);
			pnlImageTTSP.add(lblImageTTSP);
			
			
			
			pnlThongTinSP.add(pnlBottomTTSP, BorderLayout.SOUTH);
			
			
			JLabel lblTTTenSP = new JLabel("<html><i>" + finalProduct.getTenSP() + "</i></html>");
			lblTTTenSP.setHorizontalAlignment(SwingConstants.CENTER);
			lblTTTenSP.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
			pnlBottomTTSP.add(lblTTTenSP, BorderLayout.CENTER);
			
			
			JLabel lblTTDonGia = new JLabel(String.valueOf(decimalFormat.format(finalProduct.getDonGia())));
			lblTTDonGia.setHorizontalAlignment(SwingConstants.CENTER);
			lblTTDonGia.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
			pnlBottomTTSP.add(lblTTDonGia, BorderLayout.SOUTH);
			
			
			
			
			pnlThongTinSP.addMouseListener(new MouseListener() {
	            @Override
	            public void mouseClicked(MouseEvent e) {
	                
	            	if (!finalProduct.isTrangThai()) {
						return;
					}
					
					String maSP = finalProduct.getMaSP();
					boolean existed = false;

					for (int i = 0; i < dtbModelODSP.getRowCount(); i++) {
						String rowMaSP = (String) dtbModelODSP.getValueAt(i, 1);
						if (maSP.equals(rowMaSP)) {

							String sl = String.valueOf(dtbModelODSP.getValueAt(i, 4));
							String thanhTienF = String.valueOf(finalProduct.getDonGia());

							Integer soLuong = convertToInteger(sl);

							if (soLuong != null) {
								soLuong++;
								dtbModelODSP.setValueAt(String.valueOf(soLuong), i, 4);
							}

							Double thanhTien = convertToDouble(thanhTienF);
							if (thanhTien != null && soLuong != null) {
								double newTotal = soLuong * thanhTien;

								DecimalFormat decimalFormat = new DecimalFormat("#,##0");

								dtbModelODSP.setValueAt(String.valueOf(decimalFormat.format(newTotal)), i, 5);
							}

							existed = true;

							tinhToanGiaTri();
							break;
						}
					}
					
					if (!existed) {
						String[] row = new String[6];
						row[0] = String.valueOf(dtbModelODSP.getRowCount() + 1);
						row[1] = finalProduct.getMaSP();
						row[2] = finalProduct.getTenSP();
						DecimalFormat decimalFormat = new DecimalFormat("#,##0");
						row[3] = String.valueOf(decimalFormat.format(finalProduct.getDonGia()));
						row[4] = "1";
						row[5] = String
								.valueOf(decimalFormat.format(finalProduct.getDonGia() * Integer.parseInt(row[4])));
						dtbModelODSP.addRow(row);

						tinhToanGiaTri();
					}
	            	
	            }
	            
	            @Override
	            public void mousePressed(MouseEvent e) {
	            }

	            @Override
	            public void mouseReleased(MouseEvent e) {
	            }

	            @Override
	            public void mouseEntered(MouseEvent e) {
	            	
	            	if(finalProduct.isTrangThai()){
	            		pnlThongTinSP.setBackground(Color.decode("#f4f4f4"));
	            		pnlBottomTTSP.setBackground(Color.decode("#f4f4f4"));
	            		
	    			}else {
	    			
	    			}
	            }

	            @Override
	            public void mouseExited(MouseEvent e) {
	            	if(finalProduct.isTrangThai()){
		            	pnlThongTinSP.setBackground(Color.decode("#ffffff"));
		            	pnlBottomTTSP.setBackground(Color.decode("#ffffff"));
	            	}else {
	            		
	            	}
	            }
			});
			
			
			pnlRenderSP.add(pnlThongTinSP);

		}
		
		

		JScrollPane scrollPane = new JScrollPane(pnlRenderSP, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.getVerticalScrollBar().setUnitIncrement(50);
		scrollPane.getHorizontalScrollBar().setUnitIncrement(100);
		scrollPane.getVerticalScrollBar().setBlockIncrement(50);
		scrollPane.getHorizontalScrollBar().setBlockIncrement(100);
		pnlTableSP.add(scrollPane, BorderLayout.CENTER);

//		JPanel pnlHoaDonChoDuyet = new JPanel();
//		pnlLeft.add(pnlHoaDonChoDuyet, BorderLayout.SOUTH);
//		pnlHoaDonChoDuyet.setLayout(new BorderLayout(0, 0));
//		
//		JLabel lblTitleTable = new JLabel("Hoá Đơn Chờ Duyệt");
//		pnlHoaDonChoDuyet.add(lblTitleTable, BorderLayout.NORTH);
//		
//		JPanel pnlTable = new JPanel();
//		pnlHoaDonChoDuyet.add(pnlTable, BorderLayout.SOUTH);

		JPanel pnlRight = new JPanel();
		pnlContainer.add(pnlRight);
		pnlRight.setBorder(new EmptyBorder(0, 5, 0, 0));
		pnlRight.setLayout(new BorderLayout(0, 0));

		JPanel pnlTitleHD = new JPanel();
		pnlTitleHD.setBorder(new EmptyBorder(0, 0, 5, 0));
		pnlRight.add(pnlTitleHD, BorderLayout.NORTH);

		pnlTitleHD.setLayout(new BorderLayout());

		JButton btnMaHD = new JButton("  Mã HĐ:  HD0000008  ");
		btnMaHD.setForeground(Color.decode("#B16E5C"));
		btnMaHD.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		btnMaHD.setBorder(null);
		btnMaHD.setBackground(new Color(255, 255, 255));

		pnlTitleHD.add(btnMaHD, BorderLayout.WEST);

		// action them
		btnAddHD = new RoundedButton("+ TẠO HOÁ ĐƠN", null, 10, 0, 3f);
		btnAddHD.setBackground(Color.decode("#ffffff"));
		btnAddHD.setFont(new Font("Segoe UI Semibold", Font.BOLD, 17));
		pnlTitleHD.add(btnAddHD, BorderLayout.EAST);

		JPanel pnlListSpOrder = new JPanel();
		pnlRight.add(pnlListSpOrder, BorderLayout.CENTER);
		pnlListSpOrder.setLayout(new BorderLayout(0, 0));

		JPanel pnlMaHD = new JPanel();
		pnlListSpOrder.add(pnlMaHD, BorderLayout.NORTH);
		pnlMaHD.setLayout(new BorderLayout(0, 0));

//		pnlMaHD.add(btnMaHD, BorderLayout.WEST);

		JPanel pnlContainerSPOrder = new JPanel();
		pnlContainerSPOrder.setBorder(new MatteBorder(1, 0, 0, 0, (Color) new Color(192, 192, 192)));
		pnlContainerSPOrder.setBackground(new Color(255, 255, 255));
		pnlListSpOrder.add(pnlContainerSPOrder, BorderLayout.CENTER);
		pnlContainerSPOrder.setLayout(new BorderLayout(0, 0));

		JPanel pnlTableSPOrder = new JPanel();
		pnlContainerSPOrder.add(pnlTableSPOrder, BorderLayout.NORTH);
		pnlTableSPOrder.setLayout(new BorderLayout());
		pnlTableSPOrder.setPreferredSize(new Dimension(1000, 140));

		// table------------
		String cols[] = { "#", "Mã SP", "Tên SP", "Đơn giá", "Số lượng", "Thành tiền" };

		dtbModelODSP = new CustomTableModel(cols, 0);
		dtblODSP = new JTable(dtbModelODSP);

		dtblODSP.setRowHeight(30);
		dtblODSP.getColumnModel().getColumn(0).setPreferredWidth(20);
		dtblODSP.getColumnModel().getColumn(1).setPreferredWidth(80);
		dtblODSP.getColumnModel().getColumn(2).setPreferredWidth(120);
		dtblODSP.getColumnModel().getColumn(3).setPreferredWidth(80);
		dtblODSP.getColumnModel().getColumn(4).setPreferredWidth(50);
		dtblODSP.getColumnModel().getColumn(5).setPreferredWidth(110);

		// ham an delete xoa dong
		dtblODSP.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				if (keyCode == KeyEvent.VK_DELETE) {
					int selectedRow = dtblODSP.getSelectedRow();
					if (selectedRow != -1) {
						dtbModelODSP.removeRow(selectedRow);
						((CustomTableModel) dtbModelODSP).updateRowNumbers();
						tinhToanGiaTri();
					}
				}
			}
		});

		pnlTableSPOrder.setBackground(new Color(255, 255, 255));
		JScrollPane srcODSP = new JScrollPane(dtblODSP);
		pnlTableSPOrder.add(srcODSP, BorderLayout.CENTER);

		JPanel pnlNoteOrderSP = new JPanel();
		pnlNoteOrderSP.setBorder(new CompoundBorder(new EmptyBorder(5, 0, 5, 0),
				new MatteBorder(1, 1, 1, 1, (Color) new Color(192, 192, 192))));
		pnlContainerSPOrder.add(pnlNoteOrderSP);
		pnlNoteOrderSP.setLayout(new GridLayout(0, 2, 0, 0));

		JPanel pnlNoteLeft = new JPanel();
		pnlNoteLeft.setBorder(new CompoundBorder(new MatteBorder(0, 0, 0, 2, (Color) new Color(192, 192, 192)),
				new EmptyBorder(5, 5, 5, 5)));
		pnlNoteOrderSP.add(pnlNoteLeft);
		pnlNoteLeft.setLayout(new BoxLayout(pnlNoteLeft, BoxLayout.Y_AXIS));

		JPanel pnlLine1 = new JPanel();
		pnlNoteLeft.add(pnlLine1);
		pnlLine1.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		pnlLine1.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));

		JLabel lblSdtKH = new JLabel("Số điện thoại :");
		lblSdtKH.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		panel.add(lblSdtKH, BorderLayout.NORTH);

		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));

		txtSdtKH = new JTextField();
		txtSdtKH.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		txtSdtKH.setBorder(new MatteBorder(1, 1, 1, 1, Color.decode("#B16E5C")));
		panel_1.add(txtSdtKH);
		txtSdtKH.setColumns(10);

		Component horizontalStrut_1 = Box.createHorizontalStrut(5);
		panel_1.add(horizontalStrut_1);

		btnTimKH = new RoundedButton("Tìm", null, 10, 0, 3f);
		btnTimKH.setBackground(Color.decode("#ffffff"));
		btnTimKH.setFont(new Font("Segoe UI Semibold", Font.BOLD, 17));
		panel_1.add(btnTimKH);

		Component verticalStrut = Box.createVerticalStrut(10);
		pnlNoteLeft.add(verticalStrut);

		JPanel pnlLine2 = new JPanel();
		pnlNoteLeft.add(pnlLine2);
		pnlLine2.setLayout(new BorderLayout(0, 0));

		JLabel lblTenKH = new JLabel("Tên khách hàng :");
		lblTenKH.setFont(new Font("Segoe UI Semibold", Font.BOLD, 17));
		pnlLine2.add(lblTenKH, BorderLayout.NORTH);

		txtTenKH = new JTextField();
		txtTenKH.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		txtTenKH.setEditable(false);
		pnlLine2.add(txtTenKH, BorderLayout.CENTER);
		txtTenKH.setColumns(10);

		Component verticalStrut_1 = Box.createVerticalStrut(10);
		pnlNoteLeft.add(verticalStrut_1);

		JPanel pnlLine3 = new JPanel();
		pnlNoteLeft.add(pnlLine3);
		pnlLine3.setLayout(new GridLayout(0, 2, 5, 0));

		JPanel pnlLine3DTL = new JPanel();
		pnlLine3.add(pnlLine3DTL);
		pnlLine3DTL.setLayout(new BorderLayout(0, 0));

		JLabel lblDiemTichLuy = new JLabel("Điểm tích luỹ : ");
		lblDiemTichLuy.setFont(new Font("Segoe UI Semibold", Font.BOLD, 17));
		pnlLine3DTL.add(lblDiemTichLuy, BorderLayout.NORTH);

		txtDiemTL = new JTextField();
		txtDiemTL.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		txtDiemTL.setEditable(false);
		pnlLine3DTL.add(txtDiemTL, BorderLayout.SOUTH);
		txtDiemTL.setColumns(10);

		JPanel pnlLine3CK = new JPanel();
		pnlLine3.add(pnlLine3CK);
		pnlLine3CK.setLayout(new BorderLayout(0, 0));

		JLabel lblChietKhau = new JLabel("Chiết khẩu :");
		lblChietKhau.setFont(new Font("Segoe UI Semibold", Font.BOLD, 17));
		pnlLine3CK.add(lblChietKhau, BorderLayout.NORTH);

		txtChietKhau = new JTextField();
		txtTenKH.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		txtChietKhau.setEditable(false);
		pnlLine3CK.add(txtChietKhau);
		txtChietKhau.setColumns(10);

		Component verticalStrut_2 = Box.createVerticalStrut(10);
		pnlNoteLeft.add(verticalStrut_2);

		JPanel pnlLine4 = new JPanel();
		pnlNoteLeft.add(pnlLine4);
		pnlLine4.setLayout(new BorderLayout(0, 0));

		teaGhiChu = new JTextArea(5, 10);
		teaGhiChu.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		teaGhiChu.setBorder(new MatteBorder(1, 1, 1, 1, Color.decode("#B16E5C")));
		pnlLine4.add(teaGhiChu, BorderLayout.CENTER);

		JLabel lblNote = new JLabel("Ghi chú");
		lblNote.setFont(new Font("Segoe UI Semibold", Font.BOLD, 17));
		pnlLine4.add(lblNote, BorderLayout.NORTH);

		// phan ben phải ------------------------------------
		JPanel pnlNoteRight = new JPanel();
		pnlNoteRight.setBorder(new EmptyBorder(5, 5, 5, 5));
		pnlNoteOrderSP.add(pnlNoteRight);
		pnlNoteRight.setLayout(new GridLayout(0, 1, 0, 10));

		// dòng 1 phuong thuc thanh toan
		JPanel pnlLR1 = new JPanel();
		pnlNoteRight.add(pnlLR1);
		pnlLR1.setLayout(new BorderLayout(0, 0));

		JLabel lblPhuongThucThanhToan = new JLabel("Phương thức : ");
		lblPhuongThucThanhToan.setFont(new Font("Segoe UI Semibold", Font.BOLD, 17));
		pnlLR1.add(lblPhuongThucThanhToan, BorderLayout.NORTH);

		cmbPhuongThucThanhToan = new JComboBox<String>();
		cmbPhuongThucThanhToan.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		cmbPhuongThucThanhToan.setForeground(Color.decode("#000000"));
		cmbPhuongThucThanhToan.setBackground(Color.decode("#FFFFFF"));
		cmbPhuongThucThanhToan.setBorder(new MatteBorder(1, 1, 1, 1, Color.decode("#B16E5C")));
		cmbPhuongThucThanhToan.addItem("Chuyển khoản");
		cmbPhuongThucThanhToan.addItem("Tiền mặt");
		pnlLR1.add(cmbPhuongThucThanhToan);

		// ------dòng 2 tong tien
		JPanel pnlL4 = new JPanel();
		pnlNoteRight.add(pnlL4);
		pnlL4.setLayout(new BorderLayout(0, 0));

		lblTongTienSP = new JLabel("Tổng tiền sản phẩm (2) : ");
		lblTongTienSP.setFont(new Font("Segoe UI Semibold", Font.BOLD, 17));
		pnlL4.add(lblTongTienSP, BorderLayout.NORTH);

		txtTongTienSP = new JTextField();
		txtTongTienSP.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTongTienSP.setFont(new Font("Segoe UI Semibold", Font.BOLD, 17));
		txtTongTienSP.setEditable(false);
		pnlL4.add(txtTongTienSP);
		txtTongTienSP.setColumns(10);

		JPanel pnlL2 = new JPanel();
		pnlNoteRight.add(pnlL2);
		pnlL2.setLayout(new BorderLayout(0, 0));

		JLabel lblTienChietKhau = new JLabel("Tiền chiết khẩu (-)");
		lblTienChietKhau.setFont(new Font("Segoe UI Semibold", Font.BOLD, 17));
		pnlL2.add(lblTienChietKhau, BorderLayout.NORTH);

		txtTienChietKhau = new JTextField();
		txtTienChietKhau.setEditable(false);
		txtTienChietKhau.setColumns(10);
		pnlL2.add(txtTienChietKhau);

		JPanel pnlL3 = new JPanel();
		pnlNoteRight.add(pnlL3);
		pnlL3.setLayout(new BorderLayout(0, 0));

		JLabel lblTongTienThanhToan = new JLabel("TỔNG TIỀN THANH TOÁN :");
		lblTongTienThanhToan.setFont(new Font("Segoe UI Semibold", Font.BOLD, 17));
		pnlL3.add(lblTongTienThanhToan, BorderLayout.NORTH);

		txtTongTienThanhToan = new JTextField();
		txtTongTienThanhToan.setEditable(false);
		txtTongTienThanhToan.setColumns(10);
		pnlL3.add(txtTongTienThanhToan);

		JPanel pnlL5 = new JPanel();
		pnlNoteRight.add(pnlL5);
		pnlL5.setLayout(new GridLayout(1, 0, 5, 0));

		JPanel pnlL5L1 = new JPanel();
		pnlL5.add(pnlL5L1);
		pnlL5L1.setLayout(new BorderLayout(0, 0));

		JLabel lblTienKhachDua = new JLabel("Tiền đưa : ");
		lblTienKhachDua.setFont(new Font("Segoe UI Semibold", Font.BOLD, 17));
		pnlL5L1.add(lblTienKhachDua, BorderLayout.NORTH);

		txtTienKhachDua = new JTextField();
		txtTienKhachDua.setBorder(new MatteBorder(1, 1, 1, 1, Color.decode("#B16E5C")));
		pnlL5L1.add(txtTienKhachDua);
		txtTienKhachDua.setColumns(10);

		JPanel pnlL5L2 = new JPanel();
		pnlL5.add(pnlL5L2);
		pnlL5L2.setLayout(new BorderLayout(0, 0));

		JLabel lblTienThua = new JLabel("Tiền thối :");
		lblTienThua.setFont(new Font("Segoe UI Semibold", Font.BOLD, 17));
		pnlL5L2.add(lblTienThua, BorderLayout.NORTH);

		txtTienThoi = new JTextField();
		txtTienThoi.setEnabled(false);
		pnlL5L2.add(txtTienThoi);
		txtTienThoi.setColumns(10);

		JPanel pnlActionOrderSP = new JPanel();
		pnlContainerSPOrder.add(pnlActionOrderSP, BorderLayout.SOUTH);
		pnlActionOrderSP.setLayout(new GridLayout(0, 2, 0, 0));

		JPanel pnlActionLeft = new JPanel();
		pnlActionLeft.setBorder(new EmptyBorder(0, 0, 0, 5));
		pnlActionOrderSP.add(pnlActionLeft);
		pnlActionLeft.setLayout(new GridLayout(0, 2, 5, 0));

		// btn huỷ
		btnHuy = new RoundedButton("Huỷ", null, 10, 0, 3f);
		btnHuy.setBackground(Color.decode("#ffffff"));
		btnHuy.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		pnlActionLeft.add(btnHuy);

		// btn xoá lại
		btnXoa = new RoundedButton("Xoá Rỗng", null, 10, 0, 3f);
		btnXoa.setBackground(Color.decode("#ffffff"));
		btnXoa.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		pnlActionLeft.add(btnXoa);

		JPanel pnlActionRight = new JPanel();
		pnlActionRight.setBorder(new EmptyBorder(0, 5, 0, 0));
		pnlActionOrderSP.add(pnlActionRight);
		pnlActionRight.setLayout(new BorderLayout(0, 0));

		// btn thanh toán
		btnThanhToan = new RoundedButton("THANH TOÁN", null, 10, 0, 3f);
		btnThanhToan.setBackground(Color.decode("#af2b2b"));
		btnThanhToan.setForeground(Color.decode("#ffffff"));
		btnThanhToan.setFont(new Font("Segoe UI Semibold", Font.BOLD, 21));
		pnlActionRight.add(btnThanhToan);

//		btnThongTinSP.addActionListener(this);

		btnXoa.addActionListener(this);

		tinhToanGiaTri();

	}

	private Integer convertToInteger(String value) {
		try {
			return Integer.parseInt(value);
		} catch (NumberFormatException e) {
			alertNotification("Giá trị nhập vào không hợp lệ");
			return null;
		}
	}

	private Double convertToDouble(String value) {
		try {
			return Double.parseDouble(value);

		} catch (NumberFormatException e) {
			alertNotification("Giá trị nhập vào không hợp lệ");
			return null;
		}
	}

	public class CustomTableModel extends DefaultTableModel {
		private boolean[] editableColumns;

		// hàm cho phép chỉ mỗi cột 4 dc sửa
		public CustomTableModel(Object[] columns, int rowCount) {
			super(columns, rowCount);
			editableColumns = new boolean[columns.length];
			editableColumns[4] = true;
		}

		@Override
		public boolean isCellEditable(int row, int column) {
			return editableColumns[column];
		}

		// hàm nhập số tự tính và nhập 0 xoá hàng
		@Override
		public void setValueAt(Object value, int row, int column) {
			if (column == 4) {
				double soLuong = convertToInteger(value.toString());
				if (soLuong == 0) {
					removeRow(row);
					updateRowNumbers();
					tinhToanGiaTri();
					return;
				} else {
					DecimalFormat decimalFormat = new DecimalFormat("#,##0");
					double donGia = 0;
					try {
						donGia = decimalFormat.parse(getValueAt(row, 3).toString()).doubleValue();
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					double thanhTien = soLuong * donGia;
					super.setValueAt(decimalFormat.format(thanhTien), row, 5);
					tinhToanGiaTri();
				}

			}
			super.setValueAt(value, row, column);
		}

		// hàm tụ dộng update stt
		public void updateRowNumbers() {
			for (int i = 0; i < getRowCount(); i++) {
				setValueAt(i + 1, i, 0);
			}
		}

	}

	// hàm tính các giá trị thanh toán
	public void tinhToanGiaTri() {
		DecimalFormat decimalFormat = new DecimalFormat("#,##0");
		double TongThanhTien = 0;

		// tinh tong thanh tien san pham
		for (int i = 0; i < dtbModelODSP.getRowCount(); i++) {
			Object getThanhTien = dtbModelODSP.getValueAt(i, 5);

			try {
				double thanhTien = decimalFormat.parse(getThanhTien.toString()).doubleValue();
				TongThanhTien = TongThanhTien + thanhTien;
			} catch (ParseException e) {
				e.printStackTrace();
			}

		}
		txtTongTienSP.setText(decimalFormat.format(TongThanhTien));

		// tinh so sp
		lblTongTienSP.setText("Tổng tiền sản phẩm (" + dtbModelODSP.getRowCount() + ") : ");

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if (o == btnXoa) {
			xoaRong();
		}
	}

	public void xoaRong() {

		dtbModelODSP.setRowCount(0);
		txtSdtKH.setText("");
		txtTenKH.setText("");
		txtDiemTL.setText("");
		txtChietKhau.setText("");
		teaGhiChu.setText("");
		cmbPhuongThucThanhToan.setSelectedIndex(0);
		txtTongTienSP.setText("0");
		txtTienChietKhau.setText("");
		txtTongTienThanhToan.setText("");
		txtTienKhachDua.setText("");
		txtTienThoi.setText("");

		tinhToanGiaTri();

	}

	// ALERT

	public void alertNotification(String textError) {
		JOptionPane.showMessageDialog(null, textError);
	}
}
