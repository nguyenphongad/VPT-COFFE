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
import java.awt.Font;

import javax.swing.Box;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

import customUI.ImageScaler;
import customUI.RoundedButton;

import java.awt.Color;

import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class SanPham_BanHang_UI extends JPanel implements ActionListener, MouseListener{
	private JTextField txtTimSP;
	private RoundedButton btnTimSP;
	
	private JButton btnThongTinSP;
	private JLabel lblTestInTen;
	private ArrayList<Product> productList;
	
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
	
	public SanPham_BanHang_UI() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel pnlContainer = new JPanel();
		pnlContainer.setBorder(new EmptyBorder(5, 5, 5, 5));
		add(pnlContainer);
		pnlContainer.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel pnlLeft = new JPanel();
		pnlLeft.setBorder(new CompoundBorder(new MatteBorder(0, 0, 0, 1, (Color) new Color(192, 192, 192)), new EmptyBorder(0, 0, 0, 5)));
		pnlContainer.add(pnlLeft);
		pnlLeft.setLayout(new BorderLayout(0, 0));
		
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
		cmbLoaiSP.setBorder(new MatteBorder(1, 1, 1, 1, Color.decode("#e0dad9")));
		
		pnlCmb.add(cmbLoaiSP);
		
		Component horizontalStrut = Box.createHorizontalStrut(5);
		pnlSearchAction.add(horizontalStrut);
		
		JPanel pnlSearchSP = new JPanel();
		pnlSearchAction.add(pnlSearchSP);
		pnlSearchSP.setLayout(new BorderLayout(5, 0));
		
		txtTimSP = new JTextField();
		txtTimSP.setBorder(new MatteBorder(1, 1, 2, 1, Color.decode("#e0dad9")));
		txtTimSP.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		pnlSearchSP.add(txtTimSP, BorderLayout.CENTER);
		
		txtTimSP.setColumns(10);
		btnTimSP = new RoundedButton("Tìm", null, 10, 0 ,3f);
		btnTimSP.setBackground(Color.decode("#ffffff"));
		pnlSearchSP.add(btnTimSP, BorderLayout.EAST);
		
		JPanel pnlTableSP = new JPanel();
		pnlLeft.add(pnlTableSP);
		pnlTableSP.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlRenderSP = new JPanel();
		pnlRenderSP.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		productList = new ArrayList<>();

        productList.add(new Product("Bạc Sỉu", "coffee_bac-xiu.PNG", "39.000 đ"));
        productList.add(new Product("Cafe Đen", "coffee_cafe-den.PNG", "35.000 đ"));
        productList.add(new Product("Cafe Espresso", "coffee_espresso.PNG", "35.000 đ"));
        productList.add(new Product("Tphẩm 4", "coffee_bac-xiu.PNG", "19.000 đ"));
        productList.add(new Product("Tphẩm 1", "coffee_bac-xiu.PNG", "59.000 đ"));
        productList.add(new Product("Tphẩm 21", "coffee_bac-xiu.PNG", "12.000 đ"));
        productList.add(new Product("Tphẩm 21", "coffee_bac-xiu.PNG", "12.000 đ"));
		
		
        for (Product product : productList) {
            btnThongTinSP = new JButton(
            		"<html>"
            			+ "<center>"
            				+ "<div style='background-color: #ffffff;width:120px'>"
            					+ "<img src='file:res\\image_SanPham\\" +  product.getPathImage() + "'"+ "width='155' height='170'>"
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
                    lblTestInTen.setText("sp :" + product.getName());
                }
            });
    		
    		
    		pnlRenderSP.add(btnThongTinSP);
    		
    		
            
        }
		pnlRenderSP.setLayout(new GridLayout(0, 3, 5, 5));
		
		
		JScrollPane scrollPane = new JScrollPane(pnlRenderSP,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED); 
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
		
		lblTestInTen = new JLabel("?");
		pnlRight.add(lblTestInTen);
		
		
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
