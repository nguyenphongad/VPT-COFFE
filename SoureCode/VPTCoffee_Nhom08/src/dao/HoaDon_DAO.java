package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connectDB.ConnectDB;
import entity.ChiTietHoaDon;
import entity.HoaDon;
import java.sql.Timestamp;

public class HoaDon_DAO {
	// lay ma HD tụ dong
	public String getMaHDTuDong() {
		ConnectDB.getInstance();
		PreparedStatement st = null;
		ResultSet rs = null;
		String maHDLonNhat = null;
		try {
			Connection conn = ConnectDB.getConnection();
			String querry = "SELECT MAX(maHD) AS maHDMax FROM HoaDon";
			st = conn.prepareStatement(querry);
			rs = st.executeQuery();

			if (rs.next()) {
				maHDLonNhat = rs.getString("maHDMax");
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
		return maHDLonNhat;
	}
	
	// them hoa don
	public boolean themHoaDon(HoaDon hd) {
		ConnectDB.getInstance();
		PreparedStatement st = null;
		int n = 0;
		try {
			Connection conn = ConnectDB.getConnection();
			String query = "insert into [dbo].[HoaDon] values(?,?,?,?,?)";
			st = conn.prepareStatement(query);
			st.setString(1, hd.getMaHD());
			st.setTimestamp(2, Timestamp.valueOf(hd.getNgayLap()));
			st.setString(3, hd.getNhanVien().getMaNV());
			st.setString(4, hd.getKhachHang().getSoDienThoai());
			st.setDouble(5, hd.getTongTien());
			n = st.executeUpdate();
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				st.close();
			} catch (SQLException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
		
		return n>0;
	}
	
	
	// them chi tiet hoa don
	
	public boolean themChiTietHoaDon(ChiTietHoaDon cthd) {
		ConnectDB.getInstance();
		PreparedStatement st = null;
		int n = 0;
		try {
			Connection conn = ConnectDB.getConnection();
			String query = "insert into [dbo].[ChiTietHoaDon] values(?,?,?,?,?)";
			st = conn.prepareStatement(query);
			st.setString(1, cthd.getHoaDon().getMaHD());
			st.setString(2, cthd.getSanPham().getMaSP());
			st.setInt(3, cthd.getSoLuong());
			st.setInt(4, cthd.getSoDiemTichLuy());
			st.setString(5, cthd.getGhiChu());
			n = st.executeUpdate();
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				st.close();
			} catch (SQLException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
		
		return n>0;
	}
	
	// cong diem tich luy vao tong diem tich luy khach hang
	public boolean congDiemVaoKH(int diem, String sdt) {
		ConnectDB.getInstance();
		PreparedStatement st = null;
		int n = 0;
		try {
			Connection conn = ConnectDB.getConnection();
			String query = "update [dbo].[KhachHang] set tongDiemTichLuy = ? where [soDienThoai] = ?";
			st = conn.prepareStatement(query);
			
			st.setInt(1, diem);
			st.setString(2, sdt);
			
			n = st.executeUpdate();
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				st.close();
			} catch (SQLException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
		
		return n>0;
	}
	
	
	
	
	
	
}
