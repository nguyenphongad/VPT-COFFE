package entity;

import java.time.LocalDate;
import java.util.Objects;

public class NhanVien {
	private String id;
    private String name;
    private String pathImage;
    private String address;
    private LocalDate hiredDate;
    private int age;
	public NhanVien(String id,String name, String pathImage, String address, LocalDate hiredDate, int age) {
		super();
		this.id = id;
		this.name = name;
		this.pathImage = pathImage;
		this.address = address;
		this.hiredDate = hiredDate;
		this.age = age;
	}

	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPathImage() {
		return pathImage;
	}
	public void setPathImage(String pathImage) {
		this.pathImage = pathImage;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public LocalDate getHiredDate() {
		return hiredDate;
	}
	public void setHiredDate(LocalDate hiredDate) {
		this.hiredDate = hiredDate;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	@Override
	public int hashCode() {
		return Objects.hash(id);
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
		return Objects.equals(id, other.id);
	}

    
    
}
