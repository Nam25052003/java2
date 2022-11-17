-- Tao stored procedure sp_tong co 2 tham so dau vào
-- drop proc sp_Tong1
CREATE PROCEDURE sp_Tong1 @So1 int, @So2 int
AS
BEGIN
	Declare @tong int;
	set @tong = @So1 + @So2;
	print @tong;
END

exec sp_Tong1 4,5;

sp_helptext sp_Tong1
------------------------------------------------------------------
-- Tao stored procedure sp_tong2 co 2 tham so dau vào 1 ra
-- drop proc sp_Tong2
create procedure sp_Tong2 @So1 int, @So2 int, @Tong int out
as
Begin	
	set @Tong = @So1 + @So2;	
End	

declare @sum int
exec  sp_Tong2 3,4, @sum out

select @sum

-- pro có return ----------------
-- drop proc DemNv2
CREATE PROCEDURE DemNv2 @cityvar nvarchar(30)
AS
BEGIN
	DECLARE @num int;
	SELECT @num = count(*) FROM NHANVIEN
	WHERE DCHI like + '%'+@cityvar;

	RETURN @num;
END

-- goi thu tuc ----
DECLARE @tongso int
EXEC @tongso = DemNv2 N'Vũng tàu'
SELECT @tongso

-- select * from NhanVien
------------------------------------------------------------
--Truy xuất thông tin nhân viên theo Mã nhân viên
-- drop proc sp_ThongtinNV
CREATE PROCEDURE sp_ThongtinNV @MaNV nvarchar(9)
 AS
 Begin
 SELECT * from NHANVIEN WHERE MaNV = @MaNV
 End
 GO

EXEC sp_ThongtinNV '009'

-------------------------------------------------------------
-- select * from NHANVIEN
-- DEMO------------------------
-- Viết store procedure nhận vào tham số là năm sinh, xuất ra tên các nhân viên
-- drop proc NAMSINH
CREATE PROC NAMSINH @nam int
AS
BEGIN
	SELECT * FROM NHANVIEN
	WHERE YEAR(NGSINH) = @nam
END

EXEC NAMSINH 1960

-- Viết store procedure đếm số lượng thân nhân của nhân viên 
-- có mã nhân viên được nhập từ người dùng
create proc DemSoThanNhan @MaNV nvarchar(9)
as
begin
	select MA_NVIEN, count(*) as 'So luong than nhan'
	from THANNHAN
	where MA_NVIEN = @MaNV
	group by MA_NVIEN
end

-- select * from THANNHAN
-- drop proc DemSoThanNhan
exec DemSoThanNhan '009'

exec DemSoThanNhan '005'
-------------------------------

ALTER PROCEDURE sp_Tong1 @So1 int = 3, @So2 int = 2
as
Begin
	Declare @tong int;
	set @tong = @So1 + @So2;
	print @tong;
End	

exec sp_Tong1

exec sp_Tong1 4,5;

--------- IF ELSE PRO --------------
-- select * from Phongban
-- drop proc sp_ThemPhongBan
CREATE PROCEDURE sp_ThemPhongBan @TenPHG nvarchar(15),
	@MaPHG int, @TRPHG nvarchar(9), @NG_NHANCHUC date
AS
BEGIN
	IF EXISTS(SELECT * FROM PHONGBAN WHERE MAPHG = @MaPHG)
		UPDATE PHONGBAN
		SET TENPHG = @TenPHG, TRPHG = @TRPHG, NG_NHANCHUC=@NG_NHANCHUC
		WHERE MAPHG = @MaPHG
	ELSE
		INSERT INTO PHONGBAN
		VALUES(@TenPHG, @MaPHG,@TRPHG,@NG_NHANCHUC)
END

EXEC sp_ThemPhongBan 'Kinh Te',3,'004','2020-10-05'

-----------------
-- drop proc NumberWeek_Year
create proc NumberWeek_Year
as
begin
	-- Setup Variables 
	declare @myTable TABLE(WeekNumber int, DateStarting smalldatetime);
	declare @n int = 0;
	declare @firstWeek smalldatetime = '12/31/2017';
	-- Loop thriup weeks
	WHILE @n <= 52
	BEGIN
	   INSERT INTO @myTable VALUES (@n, DATEADD(wk,@n,@firstWeek));
	   SELECT @n = @n + 1
	END
	SELECT WeekNumber, DateStarting
	FROM   @myTable
end
--Show Results
Exec NumberWeek_Year 







sp_helptext DemNv

exec sp_databases

exec sp_server_info

exec sp_stored_procedures

exec sp_tables

-- Viết stored-procedure Nhập vào số nguyên @n. 
-- In ra tổng, và số lượng các số chẵn từ 1 đến @n 
create proc sp_TongChan @n int
as
begin
	declare @tong int = 0, @i int = 1, @count int = 0
	While (@i <= @n)
	begin
		if(@i % 2= 0)
		begin
			set @tong = @tong + @i
			set @count = @count + 1;
		end
		set @i= @i +1
	end
	select @tong as 'Tong chan'
	select @count as 'so luong so chan'
end

exec sp_TongChan 6
-- drop proc sp_TongChan

-- Viết stored-procedure thêm phòng ban, các giá trị được thêm vào dưới dạng tham số đầu vào, 
-- kiếm tra nếu trùng Maphg thì thông báo thêm thất bại.
-- select * from PHONGBAN 
CREATE PROCEDURE sp_InsertPhongBan @TenPHG nvarchar(15),
	@MaPHG int, @TRPHG nvarchar(9), @NG_NHANCHUC date
AS
BEGIN
	IF EXISTS(SELECT * FROM PHONGBAN WHERE MAPHG = @MaPHG)
		print 'Da ton tai, khong them vao duoc';
	ELSE
		INSERT INTO PHONGBAN
		VALUES(@TenPHG, @MaPHG,@TRPHG,@NG_NHANCHUC)
END


EXEC sp_InsertPhongBan 'Hanh Chinh',2,'007','2020-06-04'