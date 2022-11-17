-- Viet ham tinh tuoi cua nguoi co nam sinh la @ns
drop function fTuoi
sp_helptext fTuoi

create function fTuoi(@ns int)
RETURNS int  with encryption
as
begin
	return year(getDate()) - @ns
end
go

print dbo.fTuoi(1981)
--------------------------------------------------------
-- Viet ham tra ve tong so luong nhan vien
-- drop function fDemNv
Create function fDemNv()
returns int
begin
	return (select count(MANV) from NHANVIEN)
end

-- select * from nhanvien
-- Goi ham cach 1
print 'Tong so luong nhan vien: ' + convert(varchar, dbo.fDemNv())

-- Goi ham cach 2
declare @tong int
set @tong = dbo.fDemNv()
select @tong
-------------------------------------------------------
-- Viet ham tra ve tong so luong nhan vien theo gioi
-- drop function fDemNv_gioitinh
-- select * from NHANVIEN
Create function fDemNv_gioitinh(@phai nvarchar(3))
returns int
begin
	return (select count(MANV) from NHANVIEN
			where PHAI like @phai)
end

print 'Tong sl nhan vien: '+ convert(varchar, dbo.fDemNv_gioitinh(N'Nữ'))
----------------------------------------
-- Viet ham tra ve bang cac nhan vien lam viec o phong so 5
-- drop function fNhanVien_PB
create function fNhanVien_PB(@Maphg int)
returns table
as
	return (
		select MANV, HONV, TENNV, PHG from NHANVIEN
		where PHG = @Maphg )
go

-- goi ham
select * from fNhanVien_PB(1)

select * from nhanvien
-------------------------------------------
-- Viet ham nhan du lieu tu bang phong ban
-- drop function fListPhong
create function fListPhong(@phong int)
returns @ProdList Table(
	ten nvarchar(15), ma int, trphg nvarchar(9), ngay date
)
as
begin
	IF @phong IS NULL
	begin
		insert into @ProdList(ten, ma, trphg, ngay)
		select TENPHG, MAPHG, TRPHG, NG_NHANCHUC
		from PhongBan
	end
	ELSE
	begin
		insert into @ProdList(ten, ma, trphg, ngay)
		select TENPHG, MAPHG, TRPHG, NG_NHANCHUC
		from PhongBan
		where MAPHG = @phong
	end
	RETURN
end

-- goi ham
select * from dbo.fListPhong(NULL)

select * from dbo.fListPhong(6)

-- View -----------------------------------
-- Tao view chua thong tin ten NV va ten PB
-- drop view NV_PB
create view NV_PB
as
select TENNV, TENPHG
from NHANVIEN inner join PHONGBAN on
	NHANVIEN.PHG = PHONGBAN.MAPHG
	
-- goi View
Select * from NV_PB

---------------------------------

--drop view ThongTinPhong
create view ThongTinPhong
as
select TENPHG, MAPHG
from PHONGBAN
where MAPHG=6

select * from ThongTinPhong

update ThongTinPhong
SET TENPHG = 'IT'

-- Tao view xem thong tin NV co tuoi <57
-- drop view ThongtinNV
create view ThongtinNV
as
select TenNV, LUONG, YEAR(GetDate()) - YEAR(NGSINH) as Tuoi
from NHANVIEN
where YEAR(GetDate()) - YEAR(NGSINH) > 57

select * from ThongtinNV

---------------------------------
----------------------------------
--Bai2
--Câu 1
--Hiển thị thông tin HoNV,TenNV,TenPHG, DiaDiemPhg.
create view sp_thongtin
as
select honv,tennv,phongban.MAPHG
from phongban
inner join nhanvien on 	nhanvien.phg=phongban.MAPHG
inner join diadiem_phg on phongban.MAPHG=diadiem_phg.maphg
go
-- Thi hành
select * from sp_thongtin
go
--Câu 2
--Hiển thị thông tin TenNv, Lương, Tuổi.
create view sp_bai2
as
select tennv,luong,(year(getdate())-year(ngsinh)) as N'Tuổi' from nhanvien
go
--Thi hành
select * from sp_bai2
go

--Câu 3
--Hiển thị  tên phòng ban và họ tên trưởng phòng của phòng ban có đông nhân viên nhất
-- drop view sp_bai2cau3
create view sp_bai2cau3
as
select tenphg,honv,tennv from nhanvien inner join phongban on phg = MAPHG
where TRPHG = manv and maphg in
(select top(1) phg from nhanvien group by phg order by count(*) desc)
go

select * from sp_bai2cau3