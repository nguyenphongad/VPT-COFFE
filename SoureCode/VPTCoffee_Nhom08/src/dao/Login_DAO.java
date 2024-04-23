package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entity.NhanVien;
import entity.TaiKhoan;

public class Login_DAO {
	// lay thong tin tai khoan
	
	public ArrayList<TaiKhoan> getTaiKhoan(){
		ArrayList<TaiKhoan> dstk = new ArrayList<TaiKhoan>();
		ConnectDB.getInstance();
		PreparedStatement st = null;
		ResultSet rs = null;
		
		
		try {
			Connection conn = ConnectDB.getConnection();
			String querry = "SELECT * FROM TaiKhoan ";
			
			st = conn.prepareStatement(querry);
			
			
			rs = st.executeQuery();
			while(rs.next()) {
				
				NhanVien nvien = new NhanVien(rs.getString("maNV"));
				
				TaiKhoan tk = new TaiKhoan(nvien, rs.getString("matKhau"));
				dstk.add(tk);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (st != null) {
					st.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
		return dstk;
		
		
	}
	
	public TaiKhoan kiemTraDangNhap(String maNV, String matKhau) {
		 ConnectDB.getInstance();
		    PreparedStatement st = null;
		    ResultSet rs = null;
		    TaiKhoan tk = null;
		    
		    try {
				Connection conn = ConnectDB.getConnection();
				String query = "  select * from NhanVien nv join TaiKhoan tk on nv.maNV = tk.maNV\r\n"
						+ "  where nv.maNV = ? and matKhau = ?";
				
				st = conn.prepareStatement(query);
				
				st.setString(1, maNV);
				st.setString(2, matKhau);
				
				rs = st.executeQuery();
				
				if(rs.next()) {
					
					NhanVien nvien = new NhanVien(rs.getString("maNV"), rs.getString("tenNV"),
							rs.getBoolean("gioiTinh"),rs.getDate("ngaySinh"), rs.getString("sDT"), 
							rs.getString("email"), rs.getString("maCCCD"), rs.getString("diaChi"),
							rs.getDate("ngayVaoLam"), rs.getString("ghiChu"), rs.getBoolean("trangThai"),
							rs.getInt("chucVu"), rs.getString("urlAnh"));
					
					
					 tk = new TaiKhoan(nvien, rs.getString("matKhau"));
					

				}
				
				
			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				try {
					if (st != null) {
						st.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		    return tk;
		    
	}
	
	
	
	
	
	
}
