use master
go

if exists(select * from sys.databases where name = 'SOF204_Test01')
	drop database SOF204_Test01
go

Create database SOF204_Test02
go

use SOF204_Test02
go

Create table SinhVien(
	SinhVienID nvarchar(10) primary key,
	TenSinhVien nvarchar(40) not null,
	NgaySinh datetime,
	TenLop nvarchar(10)
)
go
insert into SinhVien values('PS08599',N'Huỳnh Long Minh Trí','07/12/1991','PT14201')
insert into SinhVien values('PS08655',N'Trương Quốc Dũng','04/12/1997','PT14201')
insert into SinhVien values('PS08431',N'Trịnh Trọng Thái','09/06/1993','PT14201')
insert into SinhVien values('PS08111',N'Bùi Quang Huy','04/22/1996','PT12301')
insert into SinhVien values('PS08996',N'Đào Quang Tiến','11/11/1990','PT14201')
insert into SinhVien values('PS08445',N'Phạm Duy Biên','08/12/1995','PT12309')

select * from SinhVien

