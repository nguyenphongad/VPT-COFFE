package dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import connectDB.ConnectDB;
import entity.NhanVien;

public class NhanVien_DAO {
	private Connection connection;
	private ArrayList<NhanVien> listNhanViens;
	
	
	public NhanVien_DAO() {
		// TODO Auto-generated constructor stub
		this.listNhanViens = new ArrayList<NhanVien>();
	}


	public List<NhanVien> getListNhanViens() {
		return listNhanViens;
	}


	public void setListNhanViens(ArrayList<NhanVien> listNhanViens) {
		this.listNhanViens = listNhanViens;
	}
	
	public boolean themNhanVien(NhanVien nv) {
		if(!listNhanViens.contains(nv)) {
			return listNhanViens.add(nv);
		}
		return false;
	}
	
	public NhanVien timKiemNhanVien(String ma) {
		for(NhanVien nv: listNhanViens) {
			if(nv.getMaNV().trim().equalsIgnoreCase(ma)) {
				return nv;
			}
		}
		return null;
	}
	
	public int timKiemNhanVienIndex(NhanVien nv) {
		return listNhanViens.indexOf(nv);
	}
	
	public boolean xoaNhanVien(String maNV) {
		if(timKiemNhanVien(maNV) != null) {
			return listNhanViens.remove(timKiemNhanVien(maNV));
		}
		return false;
	}
	
	public boolean suaNhanVien(String ma, NhanVien nvMoi) {
		for(NhanVien nv: listNhanViens) {
			if(nv.getMaNV().equalsIgnoreCase(ma)) {
				listNhanViens.set(listNhanViens.indexOf(nv), nvMoi);
				return true;
			}
		}
		return false;
	}
	
	public String getMatKhau(String ma) {
		for(NhanVien nv: listNhanViens) {
			if(nv.getMaNV().equalsIgnoreCase(ma)) {
				return nv.getMatKhau();
			}
		}
		return null;
	}
	
	//C: create
	public boolean create(NhanVien nv) {
		connection = ConnectDB.getInstance();
        PreparedStatement statement = null;
        int n = 0;
        try {
        	connection.getConnection();
			statement = connection.prepareStatement("Insert into NhanVien value (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			statement.setString(1, null);
			statement.setString(2, null);
			statement.setString(3, null);
			statement.setString(4, null);
			statement.setString(5, null);
			statement.setString(6, null);
			statement.setString(7, null);
			statement.setString(8, null);
			statement.setString(9, null);
			statement.setString(10, null);
			n = statement.executeUpdate();
		} catch (Exception e) { 
			// TODO: handle exception
			e.printStackTrace();
		}
        return n>0;
	}
	
	//R: Read
	public ArrayList<NhanVien> getListNhanVien(){
		try {
			connection = connectDB.getInstance().getConnection();
			String sql = "Select * from NhanVien";
			java.sql.Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()) {
				String ma = rs.getString(1);
				String ten = rs.getString(2);
				String matKhau = rs.getString(3);
				boolean gioiTinh = rs.getBoolean(4);
				java.util.Date ngaySinh = rs.getDate(5);
				String sdt = rs.getString(6);
				String email = rs.getString(7);
				String macccd = rs.getString(8);
				String diaChi = rs.getString(9);
				java.util.Date ngayVaoLam = rs.getDate(10);
				String ghichu = rs.getString(11);
				boolean trangthai = rs.getBoolean(12);
				int chucVu = rs.getInt(13);
				NhanVien nVien = new NhanVien(ma, ten, matKhau, gioiTinh, ngaySinh, sdt, email, macccd, diaChi, ngayVaoLam, ghichu, trangthai, chucVu);
				listNhanViens.add(nVien);
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return listNhanViens;
	}
	
	//U: Update
	public boolean update(NhanVien nv) {
		connection = connectDB.getInstance().getConnection();
		PreparedStatement statement = null;
		int n = 0;
		try {
			//caulenh
			n = statement.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return n>0;
	}
	
	
	//D: Delete
	public boolean delete(String maNV) {
		connection = connectDB.getInstance().getConnection();
		PreparedStatement statement = null;
		int n = 0;
		try {
			statement = connection.prepareStatement("delete from NhanVien where maNV = ?");
			statement.setString(1, maNV);
			n = statement.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return n>0;
	}
	
	
	
	
	
	
}
