package entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class NhanVien {
	private String maNV;
	private String tenNV;
	private String matKhau;
	private boolean gioiTinh;
	private java.sql.Date ngaySinh;
	private String sDT;
	private String email;
	private String maCCCD;
	private String diaChi;
	private java.sql.Date ngayVaoLam;
	private String ghiChu;
	private boolean trangThai;
	private int chucVu;
//	public NhanVien(String maNV, String tenNV, String matKhau, boolean gioiTinh, java.sql.Date ngaySinh, String sDT,
//			String email, String maCCCD, String diaChi, java.sql.Date ngayVaoLam, String ghiChu, boolean trangThai,
//			int chucVu) {
//		super();
//		this.maNV = maNV;
//		this.tenNV = tenNV;
//		this.matKhau = matKhau;
//		this.gioiTinh = gioiTinh;
//		this.ngaySinh = ngaySinh;
//		this.sDT = sDT;
//		this.email = email;
//		this.maCCCD = maCCCD;
//		this.diaChi = diaChi;
//		this.ngayVaoLam = ngayVaoLam;
//		this.ghiChu = ghiChu;
//		this.trangThai = trangThai;
//		this.chucVu = chucVu;
//	}
	public NhanVien(String ma, String hoTen, String matKhau2, boolean gioiTinh2, Date ngayXinh, String sdt2,
			String email2, String macccd2, String diaChi2, Date ngayvaolam2, String ghichu2, boolean trangThai2,
			int chucvu2) {
		// TODO Auto-generated constructor stub
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.matKhau = matKhau;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.sDT = sDT;
		this.email = email;
		this.maCCCD = maCCCD;
		this.diaChi = diaChi;
		this.ngayVaoLam = ngayVaoLam;
		this.ghiChu = ghiChu;
		this.trangThai = trangThai;
		this.chucVu = chucVu;
	}
	
	
	
	public NhanVien(String maNV) {
	super();
	this.maNV = maNV;
}


	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getTenNV() {
		return tenNV;
	}
	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public boolean isGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public java.sql.Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(java.sql.Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getsDT() {
		return sDT;
	}
	public void setsDT(String sDT) {
		this.sDT = sDT;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMaCCCD() {
		return maCCCD;
	}
	public void setMaCCCD(String maCCCD) {
		this.maCCCD = maCCCD;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public java.sql.Date getNgayVaoLam() {
		return ngayVaoLam;
	}
	public void setNgayVaoLam(java.sql.Date ngayVaoLam) {
		this.ngayVaoLam = ngayVaoLam;
	}
	public String getGhiChu() {
		return ghiChu;
	}
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
	public boolean isTrangThai() {
		return trangThai;
	}
	public void setTrangThai(boolean trangThai) {
		this.trangThai = trangThai;
	}
	public int getChucVu() {
		return chucVu;
	}
	public void setChucVu(int chucVu) {
		this.chucVu = chucVu;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maNV);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NhanVien other = (NhanVien) obj;
		return Objects.equals(maNV, other.maNV);
	}
	
	
	
}
	
	
	

    
    

