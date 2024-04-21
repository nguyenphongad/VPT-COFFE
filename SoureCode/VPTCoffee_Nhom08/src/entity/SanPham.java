package entity;

import java.util.Objects;

public class SanPham {
	private String maSP;
	private String tenSP;
	private String loaiSP;
	private String anhSP;
	private double donGia;
	private boolean trangThai;
	
	public SanPham() {
		super();
	}
	
	
	
	

	public SanPham(String maSP) {
		super();
		this.maSP = maSP;
	}





	public SanPham(String maSP, String tenSP, String loaiSP, String anhSP, double donGia, boolean trangThai) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.loaiSP = loaiSP;
		this.anhSP = anhSP;
		this.donGia = donGia;
		this.trangThai = trangThai;
	}





	public String getMaSP() {
		return maSP;
	}

	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}

	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public String getLoaiSP() {
		return loaiSP;
	}

	public void setLoaiSP(String loaiSP) {
		this.loaiSP = loaiSP;
	}

	public String getAnhSP() {
		return anhSP;
	}

	public void setAnhSP(String anhSP) {
		this.anhSP = anhSP;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public boolean isTrangThai() {
		return trangThai;
	}

	public void setTrangThai(boolean trangThai) {
		this.trangThai = trangThai;
	}





	@Override
	public int hashCode() {
		return Objects.hash(loaiSP, maSP, trangThai);
	}





	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SanPham other = (SanPham) obj;
		return Objects.equals(loaiSP, other.loaiSP) && Objects.equals(maSP, other.maSP) && trangThai == other.trangThai;
	}
	
	
	
	
}
