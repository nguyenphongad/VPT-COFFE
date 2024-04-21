package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entity.SanPham;

public class SanPham_DAO {
	// lay ma SP tụ dong
	public String getMaSPTuDong() {
		ConnectDB.getInstance();
		PreparedStatement st = null;
		ResultSet rs = null;
		String maSPLonNhat = null;
		try {
			Connection conn = ConnectDB.getConnection();
			String querry = "SELECT MAX(maSP) AS maSPMax FROM SanPham";
			st = conn.prepareStatement(querry);
			rs = st.executeQuery();

			if (rs.next()) {
				maSPLonNhat = rs.getString("maSPMax");
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
		return maSPLonNhat;
	}

	// them san pham
	public boolean themSanPham(SanPham sp) {
		ConnectDB.getInstance();
		PreparedStatement st = null;
		int n = 0;
		try {
			Connection conn = ConnectDB.getConnection();
			String query = "insert into SanPham values(?,?,?,?,?,?)";
			st = conn.prepareStatement(query);

			st.setString(1, sp.getMaSP());
			st.setString(2, sp.getTenSP());
			st.setString(3, sp.getLoaiSP());
			st.setString(4, sp.getAnhSP());
			st.setDouble(5, sp.getDonGia());
			st.setBoolean(6, sp.isTrangThai());

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

		return n > 0;
	}
	
	// sua san pham
	
	

	// kiem tra ton tai ma SP
	public boolean kiemTraMaSP(String maSP) {
		boolean check = false;
		ConnectDB.getInstance();
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			Connection conn = ConnectDB.getConnection();
			String query = "select * from SanPham where maSP LIKE ?";
			st = conn.prepareStatement(query);

			st.setString(1, maSP);
			rs = st.executeQuery();

			if (rs.next()) {
				check = true;
			}

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

		return check;

	}

	// lay all san pham
	public ArrayList<SanPham> getAllSanPham() {
		ConnectDB.getInstance();
		PreparedStatement st = null;
		ResultSet rs = null;
		ArrayList<SanPham> spds = new ArrayList<SanPham>();

		try {
			Connection conn = ConnectDB.getConnection();
			String querry = "SELECT * FROM SanPham";
			st = conn.prepareStatement(querry);
			rs = st.executeQuery();

			while (rs.next()) {
				SanPham sp = new SanPham(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getDouble(5), rs.getBoolean(6));
				spds.add(sp);
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

		return spds;
	}

}
