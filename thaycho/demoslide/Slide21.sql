create database QLDN
go
use QLDN
go

create table PhongBan(
	MaPhg int identity(1,1) not null primary key,
	TenPhong nvarchar(50) not null
);

create table NhanVien(
	MaNV nvarchar(25) primary key, 
	HoNV nvarchar(25),
	TenLot nvarchar(50),  
	MaPhg int,
	CONSTRAINT FK_NV_PB FOREIGN KEY (MaPhg) REFERENCES PhongBan(MaPhg)
)
 --- or 
ALTER TABLE NhanVien
ADD CONSTRAINT FK_NV_PB FOREIGN KEY (MaPhg) REFERENCES PhongBan(MaPhg)

-- add column
ALTER TABLE NhanVien
ADD Email NVARCHAR(100);

-- delete column
ALTER TABLE NhanVien
DROP COLUMN Email

---------------------------------------
DECLARE @ChieuDai int, @ChieuRong int, @DienTich int
SET @ChieuDai = 10 -- Gán giá trị 10 cho biến
SET @ChieuRong = 6 -- Gián cho bbiến ChieuRong la 6
set @DienTich = @ChieuDai * @ChieuRong -- Tính dien tích

SELECT @DienTich

--------------
DECLARE @Max_Luong float
SELECT @Max_Luong = MAX(luong)
FROM NhanVien

Print 'Nhan vien co luong lon nhat: ' + convert(char(12),@Max_Luong)
GO

-- Bien bang 

-- Khai báo biến bảng chứa 2 thuộc tính
declare @NhanVien_HCM Table (MaNV nvarchar(9), TenNV nvarchar(15))
-- Chèn dữ liệu vào biến bảng
INSERT INTO @NhanVien_HCM
SELECT MaNV, TenNV
FROM NHANVIEN
WHERE DCHI like '%HCM%'

select *
from @NhanVien_HCM


-- Insert vao bien bang
declare @NhanVien table
(MaNV int, HoTen char(50))
-- chen du lieu vao bien bang
insert into @NhanVien
values(1,'Nguyen Van Teo')
--Truy cap du lieu tu bien bang
select * from @NhanVien

-- Transact - SQL
Begin
	Declare @v_Result int;
	Declare @v_a int = 50;
	Declare @v_b int = 100;

	Print 'v_a = ' + cast(@v_a as varchar(15));
	Print 'v_b = ' + cast(@v_b as varchar(15));

	set @v_Result = @v_a + @v_b;

	Print 'v_Result = ' + cast(@v_Result as varchar(15));
End;

-- DEMO -----------------

begin
	-- Cho biêt nhân viên có lương cao nhất
	select *
	from NHANVIEN
	where Luong = (select Max(Luong)
				   from NHANVIEN )
	
	-- Cho biết họ tên nhân viên (HONV, TENLOT, TENNV) có mức lương trên
	-- mức lương trung bình của phòng "Nghiên cứu”
	
	select HONV, TENLOT, TENNV, LUONG from NHANVIEN
	where LUONG > (select AVG(LUONG) from NHANVIEN NV, PHONGBAN PB
				   where NV.PHG = PB.MAPHG and TENPHG = N'Nghiên cứu')
	
	-- Với các phòng ban có mức lương trung bình trên 30,000, liệt kê tên
    -- phòng ban và số lượng nhân viên của phòng ban đó

	select PHG, TENPHG, COUNT(*) as 'Soluong'
	from NHANVIEN, PHONGBAN
	where NHANVIEN.PHG = PHONGBAN.MAPHG
	group by PHG, TENPHG
	having avg(luong) > 30000

end;

select * from NhanVien
select * from PhongBan

-- Lab 2.	Cho biết họ tên nhân viên (HONV, TENLOT, TENNV) có mức lương trên 
-- mức lương trung bình của phòng "Nghiên cứu”
DECLARE @TenPhong nvarchar(30);
SET @TenPhong = N'Nghiên cứu';
select HONV, TENLOT, TENNV, LUONG from NHANVIEN
	where LUONG > (select AVG(LUONG) from NHANVIEN NV, PHONGBAN PB
				   where NV.PHG = PB.MAPHG and TENPHG = @TenPhong)