package entity;


import dao.NhanVien_DAO;

public class TaiKhoan {
	private NhanVien NV;
	private String matKhau;
	private NhanVien_DAO nVien_DAO = new NhanVien_DAO();
	public TaiKhoan(NhanVien maNV, String matKhau) {
		super();
		this.NV = maNV;
		this.matKhau = matKhau;
	}
	public TaiKhoan(String maNV, String mk) {
		// TODO Auto-generated constructor stub
		for(NhanVien nVien : nVien_DAO.getAllNhanVien()) {
			if(nVien.getMaNV().trim().equalsIgnoreCase(maNV))
				this.NV = nVien;
		}
		this.matKhau = mk;
	}
	public NhanVien getNV() {
		return NV;
	}
	public void setNV(NhanVien maNV) {
		this.NV = maNV;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	
	
	
	
	
}
