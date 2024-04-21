package entity;

public class ChiTietHoaDon {
	private HoaDon hoaDon;
	private SanPham sanPham;
	private int soDiemTichLuy;
	private int soLuong;
	private String ghiChu;
	
	
	public ChiTietHoaDon(HoaDon hoaDon, SanPham sanPham, int soDiemTichLuy, int soLuong, String ghiChu) {
		super();
		this.hoaDon = hoaDon;
		this.sanPham = sanPham;
		this.soDiemTichLuy = soDiemTichLuy;
		this.soLuong = soLuong;
		this.ghiChu = ghiChu;
	}
	
	
	public HoaDon getHoaDon() {
		return hoaDon;
	}
	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}
	public SanPham getSanPham() {
		return sanPham;
	}
	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}
	public int getSoDiemTichLuy() {
		return soDiemTichLuy;
	}
	public void setSoDiemTichLuy(int soDiemTichLuy) {
		this.soDiemTichLuy = soDiemTichLuy;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public String getGhiChu() {
		return ghiChu;
	}
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
	
	
}
