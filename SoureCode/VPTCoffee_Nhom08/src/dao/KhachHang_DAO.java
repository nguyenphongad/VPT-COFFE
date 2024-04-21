package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entity.KhachHang;

public class KhachHang_DAO {
	
	// tìm sdt tích điểm
	public ArrayList<KhachHang> timSoDienThoaiKhachHang(int sdt ){
		ArrayList<KhachHang> listKH = new ArrayList<KhachHang>();
		ConnectDB.getInstance();
		PreparedStatement st =null;
		ResultSet rs = null;
		
		try {
			Connection conn  = ConnectDB.getConnection();
			
			String query = "select * from [dbo].[KhachHang] where [soDienThoai] = ?";
			st = conn.prepareStatement(query);
			
			st.setInt(1, sdt);
			rs = st.executeQuery();
			while(rs.next()) {
				KhachHang kh = new KhachHang(
						rs.getString("soDienThoai"),
						rs.getString("tenKH"),
						rs.getDate("ngaySinh"),
						rs.getInt("tongDiemTichLuy")
						);
				listKH.add(kh);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return listKH;
	}
	// đăng ký số điện thoại tích điểm
	public boolean dangKySdtTichDiem(KhachHang khnew) {
		ConnectDB.getInstance();
		PreparedStatement st = null;
		int n=0;
		try {
			Connection conn = ConnectDB.getConnection();
			String query = "insert into [dbo].[KhachHang] values(?,?,?,?)";
			st = conn.prepareStatement(query);
			
			
			st.setString(1, khnew.getSoDienThoai());
			st.setString(2, khnew.getTenKH());
			st.setDate(3, new java.sql.Date (khnew.getNgaySinh().getTime()));
			st.setInt(4, khnew.getTongDiemTichLuy());
			
			n = st.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n >0;
	}
	
	
	
}




















