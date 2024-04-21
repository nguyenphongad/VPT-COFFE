package entity;

import java.util.Date;

public class KhachHang {
	private String soDienThoai;
	private String tenKH;
	private Date ngaySinh;
	private int tongDiemTichLuy;
	
	
	public KhachHang(String soDienThoai, String tenKH, Date ngaySinh, int tongDiemTichLuy) {
		super();
		this.soDienThoai = soDienThoai;
		this.tenKH = tenKH;
		this.ngaySinh = ngaySinh;
		this.tongDiemTichLuy = tongDiemTichLuy;
	}
	
	
	
	public KhachHang(String soDienThoai) {
		super();
		this.soDienThoai = soDienThoai;
	}



	public KhachHang() {
		super();
	}


	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public int getTongDiemTichLuy() {
		return tongDiemTichLuy;
	}
	public void setTongDiemTichLuy(int tongDiemTichLuy) {
		this.tongDiemTichLuy = tongDiemTichLuy;
	}
	
	
}
