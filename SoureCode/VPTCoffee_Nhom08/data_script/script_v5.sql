-- VTPCOFFEE
use master
create database VPTCoffee
ON PRIMARY
	(
		NAME=VPTCoffee_data,
		FILENAME='T:\VPTCoffee\VPTCoffee_data.mdf'
	)
LOG ON
	(
		NAME=VPTCoffee_log,
		FILENAME='T:\VPTCoffee\VPTCoffee_Log.LDF'
	)

GO
use VPTCoffee
-- tao bang
create table NhanVien (
	maNV varchar(6) primary key not null,
    tenNV nvarchar(30) not null,
    gioiTinh bit not null,
    ngaySinh date not null,
    sDT varchar(15) not null,
    email nvarchar(50) not null,
    maCCCD varchar(12) not null,
    diaChi nvarchar(99) not null,
    ngayVaoLam date not null,
    ghiChu nvarchar(255) not null,
    trangThai bit not null,
    chucVu int not null,
	urlAnh varchar(156) not null
)

create table TaiKhoan(
	maNV varchar(6) primary key not null,
	matKhau nvarchar(99) not null,
	constraint fk_maNV1 foreign key (maNV) references NhanVien(maNV)
)

create table KhachHang(
	soDienThoai varchar(10) primary key not null,
	tenKH nvarchar(30) not null,
	ngaySinh date,
	tongDiemTichLuy int
)

create table HoaDon(
	maHD varchar(9) primary key not null,
	ngayLap Datetime not null,
	maNV varchar(6) not null,
	soDienThoai varchar(10) not null ,
	tongTien decimal not null,
	constraint fk_maNV2 foreign key (maNV) references NhanVien(maNV),
	constraint fk_maKH foreign key (soDienThoai) references KhachHang(soDienThoai)
)

create table SanPham (
	maSP varchar(9) primary key not null,
	tenSP nvarchar(50) not null,
	loaiSP nvarchar(50) not null,
	anhSP nvarchar(99),
	donGia decimal not null,
	trangThai bit not null
)

create table ChiTietHoaDon(
	maHD varchar(9) not null ,
	maSP  varchar(9) not null,
	soLuong int not null,
	soDiemTichLuy int ,
	ghiChu nvarchar(99),
	constraint fk_maHD foreign key (maHD) references HoaDon(maHD),
	constraint fk_maSP foreign key (maSP) references SanPham(maSP)
)
-- dữ liệu test, phải chạy luôn hàm dưới
insert into KhachHang values(0, 'VPTCoffee', null, 0 );

insert into [dbo].[NhanVien] values ('NV0001','Nguyễn Văn Phong',123, 'True','2009-09-09','0123123321','asdas@gmail.com',
'123123','123123','2019-08-03','asd', 'True' , 1)

insert into [dbo].[TaiKhoan] values('NV0001','123123123')