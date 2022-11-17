
declare @dtb float;
set @dtb = 6.5;
if @dtb < 5
	print 'Yeu';
else
	print 'Trung bình';
go
--------IF - ELSE -------------
IF(SELECT COUNT(*) FROM NHANVIEN WHERE LUONG > 60000)>0
BEGIN
	PRINT 'Danh sach nhan vien co luong > 30000'
	SELECT HONV, TENNV, LUONG
	FROM NHANVIEN
	WHERE LUONG >30000
END
ELSE
	PRINT 'Khong co nhan vien co luong > 60000'

---------------------------------------------------
declare @dtb float;
set @dtb = 7.5;
if @dtb < 5
	print 'Yeu';
else
	begin
		if @dtb < 6.5
			print 'Trung binh';
		else
			print 'Kha';
	end
go

--------IF EXIST ----------------
IF EXISTS(SELECT * FROM NHANVIEN WHERE LUONG > 30000)
BEGIN
	PRINT 'Danh sach nhan vien co luong > 30000'
	SELECT HONV, TENNV, LUONG
	FROM NHANVIEN
	WHERE LUONG >30000
END
ELSE
	PRINT 'Khong co nhan vien co luong > 30000'

-- IIF Function -----------------
select TENNV, LUONG, IIF(Luong > 30000, 'Truong phong', 'Nhan vien') as 'Chuc vu' 
FROM NHANVIEN

---- CASE <> WHEN --------
select TEN = case PHAI
		when 'Nam' then 'Mr. '+ TENNV
		when N'Nữ' then 'Ms. '+ TENNV
		else 'FreeSex. ' + TENNV 
	end, PHAI
from NHANVIEN
 -----
 select TENNV, LUONG, 
 THUE = case
			when luong between 0 and 25000 then luong * 0.1
			when luong between 25000 and 30000 then luong * 0.12
			when luong between 30000 and 40000 then luong * 0.15
			when luong between 40000 and 50000 then luong * 0.2
			else luong * 0.25 
		end
from NHANVIEN
----------------------
select TEN = case PHAI
				when 'Nam' then 'Mr. '+ TENNV
				when N'Nữ' then 'Ms. '+ TENNV
				else 'FreeSex. ' + TENNV 
			 end, PHAI
from NHANVIEN

--
select TEN = case
				when PHAI like 'Nam' then 'Mr. '+ TENNV
				when PHAI like N'Nữ' then 'Ms. '+ TENNV
				else 'FreeSex. ' + TENNV 
			 end, PHAI
from NHANVIEN
------------------------------------
select *
from NHANVIEN

-- Viết câu truy vấn đếm số lượng nhân viên trong từng phòng ban, nếu số lượng nhân viên nhỏ hơn 3 -> hiển thị “Thiếu nhân viên”, 
-- ngược lại <5 hiển thị “Đủ Nhan Vien”, ngược lại hiển thị”Đông nhân viên”
 select PHG, count(PHG) as 'SLuong',   
 TrangThai = case
				when count(PHG) < 3 then 'Thieu nhân viên'
				when count(PHG) < 5 then 'Du nhân viên'
				when count(PHG) >= 5 then 'Dong nhân viên'
				-- else  'Đông nhân viên'
			end
from NHANVIEN
group by PHG


-----------
 select PHG, TENPHG, count(PHG) as 'SLuong',   
 TrangThai = case
			when count(PHG) < 3 then 'Thieu nhân viên'
			when count(PHG) < 5 then 'Du nhân viên'
			when count(PHG) > 5 then 'Dong nhân viên'
			-- else  'Đông nhân viên'
		end
from NHANVIEN, PHONGBAN
where NHANVIEN.PHG = PHONGBAN.MAPHG
group by PHG, TENPHG
--
select * from NHANVIEN
----------------------------------
declare @dem int = 0
while @dem < 5
begin
	print 'Quan trong la phuong phap hoc';
	set @dem = @dem + 1;
end;
print 'Hoc lap trinh thi ra cung de'
GO

-----------break --------
DECLARE @Number int = 1;
DECLARE @Total int = 0
WHILE @Number <= 10
BEGIN
	IF @Number = 5
		--break;
		continue;
	ELSE
		SET @Total = @Total + @Number; 
	SET @Number = @Number + 1; 
END
PRINT @Total	

----- Continue -----------
-----------break --------
DECLARE @Number int = 1;
DECLARE @Total int = 0
WHILE @Number <= 10
BEGIN
	IF @Number = 5
		break;
	ELSE
		SET @Total = @Total + @Number;
	SET @Number = @Number + 1;
	continue
	SET @Number = @Number + 1;
END
PRINT @Total	
--------------------------------
-- Viết chương trình tính tổng các số chẵn từ 1 tới 10.

declare @tong int = 0;
declare @i int = 1;
declare @n int = 10;
While (@i <= @n)
begin
	if(@i % 2= 0)
		set @tong = @tong+@i
	set @i= @i +1
end
print @tong
-------- try ... catch -----------
Begin try
	select 1 + 'SQL';
End try
Begin catch
	select
	ERROR_NUMBER() as ErrorNumber,
	ERROR_MESSAGE() as ErrorMessage;
end catch	
-- .................
------- 
-- select * from phongban
-- select * from Nhanvien
BEGIN TRY
	INSERT PHONGBAN
	VALUES ('keToan',2,'003','2020-06-02')
	 -- Nếu lệnh chèn thực thi thành công in ra dòng bên dưới
	PRINT 'SUCCESS: Record was inserted.'
END TRY
-- Nếu có lỗi xảy ra khi chèn dữ liệu in ra dòng thông báo lỗi cùng với thông tin mã lỗi và thông báo lỗi
BEGIN CATCH
	PRINT 'FAILURE: Record was not inserted.'
	PRINT 'Error ' + CONVERT(varchar, ERROR_NUMBER(), 1) 
		+ ': ' + ERROR_MESSAGE()
END CATCH

---------- RAISERROR ----
-- Khong dung RAISERROR
Begin try
	declare @result int
	set @result = 55/0
end try
begin catch
	declare
		@ErMessage nvarchar(2048),
		@ErSeverty int,
		@ErState int
	select
		@ErMessage = ERROR_MESSAGE(),
		@ErSeverty = ERROR_SEVERITY(),
		@ErState = ERROR_STATE()
		 RAISERROR(@ErMessage, @ErSeverty, @ErState)
end catch
