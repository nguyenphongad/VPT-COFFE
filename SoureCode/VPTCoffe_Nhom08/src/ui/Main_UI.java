package ui;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import util.ImportFont;

public class Main_UI extends JFrame {
	public Font roboto_light, roboto_bold, roboto_regular;
	private ImportFont impFont;

	public Main_UI() {
		ImageIcon appIcon = new ImageIcon("assets/icon_logo.PNG");
		setIconImage(appIcon.getImage());
		setTitle("VPTCoffe | Hệ thống bán hàng coffe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		// rong full man hinh
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		
	}
	
	
	// ham set lại font
	public void getFonts() {
		impFont = new ImportFont();
		roboto_light = impFont.importFontFromFile("/fonts/Roboto-Light.ttf");
		roboto_bold = impFont.importFontFromFile("/fonts/Roboto-Bold.ttf");
		roboto_regular = impFont.importFontFromFile("/fonts/Roboto-Regular.ttf");
	}
}
