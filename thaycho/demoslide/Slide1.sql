use QLDACOM2034

select * from nhanvien

select * 
from NhanVien
where phai like N'Nam';

select PHG As MaPhong, count (MANV) as SoLuongNhanVien
from NHANVIEN
where Luong>20000
group by PHG
having count(MANV)>2;

select *
from NHANVIEN inner join  PHONGBAN on NHANVIEN.PHG = PHONGBAN.MAPHG

select *
from NHANVIEN, PHONGBAN
where NHANVIEN.PHG = PHONGBAN.MAPHG