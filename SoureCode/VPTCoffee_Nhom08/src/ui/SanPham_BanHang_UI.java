package ui;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.border.EmptyBorder;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.AbstractCellEditor;
import javax.swing.Box;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;

import customUI.ImageScaler;
import customUI.RoundedButton;

import java.awt.Color;

import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;

import java.awt.FlowLayout;
import javax.swing.JTextArea;

public class SanPham_BanHang_UI extends JPanel implements ActionListener, MouseListener{
	private JTextField txtTimSP;
	private RoundedButton btnTimSP;
	
	private JButton btnThongTinSP;
	private JLabel lblTestInTen;
	private ArrayList<Product> productList;
	private RoundedButton btnAddHD, btnXoa,btnHuy,btnThanhToan,btnTimKH;
	
	private DefaultTableModel dtbModelODSP;
	private JTable dtblODSP;
	private JTextField txtTenKH;
	private JTextField txtSdtKH;
	private JTextField txtDiemTL;
	private JTextField txtChietKhau;
	private JTextField txtTongTienSP;
	private JTextField txtTienChietKhau;
	private JTextField txtTongTienThanhToan;
	private JTextField txtTienKhachDua;
	private JTextField txtTienThua;
	
	// class doi tuong test
	class Product {
	    private String name;
	    private String pathImage;
	    private String dongia;

	    public Product(String name, String pathImage, String dongia) {
	        this.name = name;
	        this.pathImage = pathImage;
	        this.dongia = dongia;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getPathImage() {
	        return pathImage;
	    }

	    public String getDongia() {
	        return dongia;
	    }
	}
	
	public class SpinnerCellEditor extends AbstractCellEditor implements TableCellEditor {
	    private JSpinner spinner;

	    public SpinnerCellEditor() {
	        spinner = new JSpinner();
	        spinner.setModel(new SpinnerNumberModel(0, 0, Integer.MAX_VALUE, 1)); // Thiết lập giá trị mặc định và giới hạn
	    }

	    @Override
	    public Object getCellEditorValue() {
	        return spinner.getValue();
	    }

	    @Override
	    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
	    	if (value instanceof Integer) {
	            spinner.setValue(value);
	        } else {
	            SpinnerNumberModel model = (SpinnerNumberModel) spinner.getModel();
	            spinner.setValue(model.getMinimum()); 
	        }
	        return spinner;
	    }
	}
	
	public class CustomTableModel extends DefaultTableModel {
	    public CustomTableModel(Object[] columnNames, int rowCount) {
	        super(columnNames, rowCount);
	    }

	    @Override
	    public Class<?> getColumnClass(int columnIndex) {
	        if (columnIndex == 3) {
	            return Integer.class; 
	        }
	        return super.getColumnClass(columnIndex);
	    }
	}
	
//	----------------------------------------------------------------
	
	
	
	
	
	public SanPham_BanHang_UI() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel pnlContainer = new JPanel();
		pnlContainer.setBorder(new EmptyBorder(5, 5, 5, 5));
		add(pnlContainer);
		pnlContainer.setLayout(new GridLayout(1, 2, 0, 0));
		
		
		// phan pnl ben trai
		JPanel pnlLeft = new JPanel();
		pnlLeft.setBorder(new CompoundBorder(new MatteBorder(0, 0, 0, 2, (Color) new Color(192, 192, 192)), new EmptyBorder(0, 0, 0, 5)));
		pnlContainer.add(pnlLeft);
		pnlLeft.setLayout(new BorderLayout(0, 0));
		
		//------------------------------------------------
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
		
		btnTimSP = new RoundedButton("Tìm", null, 10, 0 ,3f);
		btnTimSP.setFont(new Font("Segoe UI Semibold", Font.BOLD, 19));
		btnTimSP.setBackground(Color.decode("#ffffff"));
		pnlSearchSP.add(btnTimSP, BorderLayout.EAST);
		
		//------------------------------------
		
		JPanel pnlTableSP = new JPanel();
		pnlLeft.add(pnlTableSP);
		pnlTableSP.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlRenderSP = new JPanel();
		pnlRenderSP.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		productList = new ArrayList<>();

        productList.add(new Product("Bạc Sỉu", "coffee_bac-xiu.PNG", "39.000 đ"));
        productList.add(new Product("Cafe Đen", "coffee_cafe-den.PNG", "35.000 đ"));
        productList.add(new Product("Cafe Espresso", "coffee_espresso.PNG", "35.000 đ"));
        productList.add(new Product("Cafe Cappuccino", "coffee_cappuccino.PNG", "55.000 đ"));
        productList.add(new Product("Tphẩm 1", "coffee_bac-xiu.PNG", "59.000 đ"));
        productList.add(new Product("Tphẩm 21", "coffee_bac-xiu.PNG", "12.000 đ"));
        productList.add(new Product("Tphẩm 21", "coffee_bac-xiu.PNG", "12.000 đ"));
		
		
        for (Product product : productList) {
            btnThongTinSP = new JButton(
            		"<html>"
            			+ "<center>"
            				+ "<div style='background-color: #ffffff;width:120px'>"
            					+ "<img src='file:res\\image_SanPham\\" +  product.getPathImage() + "'"+ "width='155' height='155'>"
            				+ "</div>"
            				+ product.getName()
            				+ "<br>"
            				+ product.getDongia()
        				+"</center>"
    				+ "</html>");
    		btnThongTinSP.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 19));
    		btnThongTinSP.setForeground(Color.decode("#ffffff"));
    		btnThongTinSP.setBackground(Color.decode("#B16E5C"));
    		btnThongTinSP.setMargin(new Insets(5, 5, 5, 5));
    		
    		btnThongTinSP.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                	String[] row = new String[99];
            		row[0] = String.valueOf(dtbModelODSP.getRowCount() + 1);
            		row[1] = product.getName();
            		row[2] = product.getDongia();
            		row[3] = "1";
            		dtbModelODSP.addRow(row);
                }
            });
    		
    		
    		pnlRenderSP.add(btnThongTinSP);
    		
    		
            
        }
		pnlRenderSP.setLayout(new GridLayout(0, 3, 5, 5));
		
		
		JScrollPane scrollPane = new JScrollPane(pnlRenderSP,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED); 
		scrollPane.getVerticalScrollBar().setUnitIncrement(30);
		scrollPane.getHorizontalScrollBar().setUnitIncrement(100);
		scrollPane.getVerticalScrollBar().setBlockIncrement(30);
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
		pnlRight.setBorder(new EmptyBorder(0,5, 0,0));
		pnlRight.setLayout(new BorderLayout(0,0));
		
		JPanel pnlTitleHD = new JPanel();
		pnlTitleHD.setBorder(new EmptyBorder(0, 0, 5, 0));
		pnlRight.add(pnlTitleHD, BorderLayout.NORTH);
		
		pnlTitleHD.setLayout(new BorderLayout());
		
		
		// title lable
//		JLabel lblTitle = new JLabel("");
//		lblTitle.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		
		JButton btnMaHD = new JButton("  Mã HĐ:  HD0000008  ");
		btnMaHD.setForeground(Color.decode("#B16E5C"));
		btnMaHD.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		btnMaHD.setBorder(null);
		btnMaHD.setBackground(new Color(255, 255, 255));
		
		pnlTitleHD.add(btnMaHD, BorderLayout.WEST);
		
		// action them
		btnAddHD = new RoundedButton("+ TẠO HOÁ ĐƠN",null, 10, 0, 3f);
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
		
		// table--
		
		String cols[] = { "#","Tên SP", "Đơn giá","Số lượng","Thành tiền", "ACTION" };
		dtbModelODSP = new CustomTableModel(cols, 0);
		dtblODSP = new JTable(dtbModelODSP);

		dtblODSP.setRowHeight(30);
		dtblODSP.getColumnModel().getColumn(0).setPreferredWidth(20);
		dtblODSP.getColumnModel().getColumn(1).setPreferredWidth(120);
		dtblODSP.getColumnModel().getColumn(2).setPreferredWidth(90);
		dtblODSP.getColumnModel().getColumn(3).setPreferredWidth(80);
		dtblODSP.getColumnModel().getColumn(4).setPreferredWidth(110);
		dtblODSP.getColumnModel().getColumn(5).setPreferredWidth(110);
		
		
		
		TableColumn column = dtblODSP.getColumnModel().getColumn(3);
		column.setCellEditor(new SpinnerCellEditor());

		pnlTableSPOrder.setBackground(new Color(255, 255, 255));
		JScrollPane srcODSP = new JScrollPane(dtblODSP);
		pnlTableSPOrder.add(srcODSP, BorderLayout.CENTER );
		
		
		
		JPanel pnlNoteOrderSP = new JPanel();
		pnlNoteOrderSP.setBorder(new CompoundBorder(new EmptyBorder(5, 0, 5, 0), new MatteBorder(1, 1, 1, 1, (Color) new Color(192, 192, 192))));
		pnlContainerSPOrder.add(pnlNoteOrderSP);
		pnlNoteOrderSP.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel pnlNoteLeft = new JPanel();
		pnlNoteLeft.setBorder(new CompoundBorder(new MatteBorder(0, 0, 0, 2, (Color) new Color(192, 192, 192)), new EmptyBorder(5, 5, 5, 5)));
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
		
		btnTimKH = new RoundedButton("Tìm", null, 10, 0 ,3f);
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
		txtTenKH.setEnabled(false);
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
		txtDiemTL.setEnabled(false);
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
		txtChietKhau.setEnabled(false);
		pnlLine3CK.add(txtChietKhau);
		txtChietKhau.setColumns(10);
		
		Component verticalStrut_2 = Box.createVerticalStrut(10);
		pnlNoteLeft.add(verticalStrut_2);
		
		JPanel pnlLine4 = new JPanel();
		pnlNoteLeft.add(pnlLine4);
		pnlLine4.setLayout(new BorderLayout(0, 0));
		
		JTextArea teaGhiChu = new JTextArea(5,10);
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
		
		JComboBox<String> cmbPhuongThucThanhToan = new JComboBox<String>();
		cmbPhuongThucThanhToan.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		cmbPhuongThucThanhToan.setForeground(Color.decode("#000000"));
		cmbPhuongThucThanhToan.setBackground(Color.decode("#FFFFFF"));
		cmbPhuongThucThanhToan.setBorder(new MatteBorder(1, 1, 1, 1, Color.decode("#B16E5C")));
		cmbPhuongThucThanhToan.addItem("Chuyển khoản");
		cmbPhuongThucThanhToan.addItem("Tiền mặt");
		pnlLR1.add(cmbPhuongThucThanhToan);
		
		
		
		
		
		//------dòng 2 tong tien
		JPanel pnlL4 = new JPanel();
		pnlNoteRight.add(pnlL4);
		pnlL4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTongTienSP = new JLabel("Tổng tiền sản phẩm (2) : ");
		lblTongTienSP.setFont(new Font("Segoe UI Semibold", Font.BOLD, 17));
		pnlL4.add(lblTongTienSP, BorderLayout.NORTH);
		
		txtTongTienSP = new JTextField();
		txtTongTienSP.setEnabled(false);
		pnlL4.add(txtTongTienSP);
		txtTongTienSP.setColumns(10);
		
		
		
		
		JPanel pnlL2 = new JPanel();
		pnlNoteRight.add(pnlL2);
		pnlL2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTienChietKhau = new JLabel("Tiền chiết khẩu (-)");
		lblTienChietKhau.setFont(new Font("Segoe UI Semibold", Font.BOLD, 17));
		pnlL2.add(lblTienChietKhau, BorderLayout.NORTH);
		
		txtTienChietKhau = new JTextField();
		txtTienChietKhau.setEnabled(false);
		txtTienChietKhau.setColumns(10);
		pnlL2.add(txtTienChietKhau);

		
		
		
		JPanel pnlL3 = new JPanel();
		pnlNoteRight.add(pnlL3);
		pnlL3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTongTienThanhToan = new JLabel("TỔNG TIỀN THANH TOÁN :");
		lblTongTienThanhToan.setFont(new Font("Segoe UI Semibold", Font.BOLD, 17));
		pnlL3.add(lblTongTienThanhToan, BorderLayout.NORTH);
		
		txtTongTienThanhToan = new JTextField();
		txtTongTienThanhToan.setEnabled(false);
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
		
		txtTienThua = new JTextField();
		txtTienThua.setEnabled(false);
		pnlL5L2.add(txtTienThua);
		txtTienThua.setColumns(10);
		
		
		
		
		
		
		JPanel pnlActionOrderSP = new JPanel();
		pnlContainerSPOrder.add(pnlActionOrderSP, BorderLayout.SOUTH);
		pnlActionOrderSP.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel pnlActionLeft = new JPanel();
		pnlActionLeft.setBorder(new EmptyBorder(0, 0, 0, 5));
		pnlActionOrderSP.add(pnlActionLeft);
		pnlActionLeft.setLayout(new GridLayout(0, 2, 5, 0));
		
		
		
		
		// btn huỷ
		btnHuy = new RoundedButton("Huỷ",null, 10, 0, 3f);
		btnHuy.setBackground(Color.decode("#ffffff"));
		btnHuy.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		pnlActionLeft.add(btnHuy);
		
		//btn xoá lại
		btnXoa = new RoundedButton("Xoá Rỗng",null, 10, 0, 3f);
		btnXoa.setBackground(Color.decode("#ffffff"));
		btnXoa.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		pnlActionLeft.add(btnXoa);
		
		
		
		
	
		JPanel pnlActionRight = new JPanel();
		pnlActionRight.setBorder(new EmptyBorder(0, 5, 0, 0));
		pnlActionOrderSP.add(pnlActionRight);
		pnlActionRight.setLayout(new BorderLayout(0, 0));
		
		// 	btn thanh toán
		btnThanhToan = new RoundedButton("THANH TOÁN",null, 10, 0, 3f);
		btnThanhToan.setBackground(Color.decode("#af2b2b"));
		btnThanhToan.setForeground(Color.decode("#ffffff"));
		btnThanhToan.setFont(new Font("Segoe UI Semibold", Font.BOLD, 21));
		pnlActionRight.add(btnThanhToan);
		
		
		
//		lblTestInTen = new JLabel("?");
//		pnlRight.add(lblTestInTen);
		
		
		btnThongTinSP.addActionListener(this);
		
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
		Object o =e.getSource();
		
		
		
	}
}
