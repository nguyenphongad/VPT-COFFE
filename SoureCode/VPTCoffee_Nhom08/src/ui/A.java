package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jdesktop.swingx.JXDatePicker;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Box;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.BoxLayout;

public class A extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel;
	private JTextField txtSDTNew;
	private JTextField txtTenKHNew;
	private JXDatePicker dpNgaySinhKHnew;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			A dialog = new A();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public A() {
		setBounds(100, 100, 686, 411);
		getContentPane().setLayout(new GridLayout(0, 2, 0, 0));
		{
			JPanel pnlTimKHLeft = new JPanel();
			pnlTimKHLeft.setLayout(new FlowLayout());
			
			
			Box vtb = Box.createVerticalBox();
			pnlTimKHLeft.add(vtb);
			
			Box htbLine1 = Box.createHorizontalBox();
			JLabel lblSDTnew  =new JLabel("Nhập SỐ ĐIỆN THOẠI : ");
			htbLine1.add(lblSDTnew);
			txtSDTNew = new JTextField(15);
			htbLine1.add(txtSDTNew);
			vtb.add(htbLine1);
			
			
			Box htbLine2 =Box.createHorizontalBox();
			JLabel lblTenKHnew  =new JLabel("Nhập TÊN KHÁCH HÀNG : ");
			htbLine2.add(lblTenKHnew);
			
			Component horizontalStrut = Box.createHorizontalStrut(20);
			htbLine2.add(horizontalStrut);
			txtTenKHNew = new JTextField(15);
			htbLine2.add(txtTenKHNew);
			vtb.add(htbLine2);
			
			Box htbLine3 =Box.createHorizontalBox();
			JLabel lblNgaySinhKHnew  =new JLabel("Nhập NGÀY SINH : ");
			htbLine3.add(lblNgaySinhKHnew);
			
			JPanel pnl = new JPanel();
			pnl.setLayout(new BorderLayout());
			dpNgaySinhKHnew = new JXDatePicker();
			pnl.add(dpNgaySinhKHnew);
			htbLine3.add(pnl);
			vtb.add(htbLine3);
			
			
			lblNgaySinhKHnew.setPreferredSize(lblTenKHnew.getPreferredSize());
			lblSDTnew.setPreferredSize(lblTenKHnew.getPreferredSize());
			
			
			getContentPane().add(pnlTimKHLeft);
		}
		
		
	}

}
