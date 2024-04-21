package entity;

import java.time.LocalDateTime;

public class HoaDon {
	private String maHD;
	private LocalDateTime ngayLap;
	private NhanVien nhanVien;
	private KhachHang khachHang;
	private double tongTien;
	
	
	public HoaDon(String maHD, LocalDateTime ngayLap, NhanVien nhanVien, KhachHang khachHang, double tongTien) {
		super();
		this.maHD = maHD;
		this.ngayLap = ngayLap;
		this.nhanVien = nhanVien;
		this.khachHang = khachHang;
		this.tongTien = tongTien;
	}
	
	
	
	
	public HoaDon(String maHD) {
		super();
		this.maHD = maHD;
	}




	public String getMaHD() {
		return maHD;
	}
	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}
	public LocalDateTime getNgayLap() {
		return ngayLap;
	}
	public void setNgayLap(LocalDateTime ngayLap) {
		this.ngayLap = ngayLap;
	}
	public NhanVien getNhanVien() {
		return nhanVien;
	}
	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}
	public KhachHang getKhachHang() {
		return khachHang;
	}
	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}
	public double getTongTien() {
		return tongTien;
	}
	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}
	
	
	
}
