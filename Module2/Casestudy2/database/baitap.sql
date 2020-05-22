-- Bài tập
-- Task 1⦁	Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” 
-- và có tối đa 15 ký tự.

use furama_resort

select Họ_Tên
from nhanvien
where (Họ_Tên like 'K%' or Họ_Tên like 'h%' or Họ_Tên like 'v%') and char_length(Họ_Tên) <= 7;
-- Task 2 ⦁	Hiển thị thông tin của tất cả khách hàng có độ tuổi 
-- từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.


select Họ_Tên,Địa_Chỉ
		Ngày_Sinh,
        (YEAR(CURDATE()) - YEAR(Ngày_Sinh)) AS years
from khachhang
where ( (YEAR(CURDATE()) - YEAR(Ngày_Sinh))<50) and  ( (YEAR(CURDATE()) - YEAR(Ngày_Sinh))>18) and( (Địa_Chỉ = 'dn') or(Địa_Chỉ = 'qt'))

-- task 3 ⦁	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. 
-- Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.

select khachhang.idKhachHang, Họ_Tên, Loại_Khách,Tổng_Tiền_Phải_Thanh_Toán,count(hopdong.idkhachhang)
from khachhang
inner join hopdong on khachhang.idKhachHang = hopdong.idKhachHang
group by hopdong.idkhachhang
having khachhang.Loại_Khách ='diamon'

-- task 4 ⦁	Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, TongTien 
-- (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, với SoLuong và Giá là từ bảng DichVuDiKem) 
-- cho tất cả các Khách hàng đã từng đặt phỏng. (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).

select khachhang.idKhachHang,khachhang.Họ_Tên,khachhang.Loại_Khách,hopdong.idHopDong,dichvu.iddichvu,
dichvu.Tên_Dịch_Vụ,hopdong.Ngày_Bắt_Đầu,
 hopdong.Ngày_Kết_Thúc,hopdong.Tổng_Tiền_Phải_Thanh_Toán,
 hopdongchitiet.idHopDongChiTiet,Số_Lượng,dichvudikem.idDichVuDiKem,
 Tên_Dịch_Vụ_Đi_Kèm,Giá_Tiền,
 sum(hopdong.Tổng_Tiền_Phải_Thanh_Toán + ((hopdongchitiet.Số_Lượng)*(dichvudikem.Giá_Tiền)))
from khachhang,hopdong,dichvu,hopdongchitiet,dichvudikem
where (khachhang.idKhachHang = hopdong.idKhachHang) and (hopdong.idDichVu= dichvu.idDichVu)
and(hopdong.idHopDongChiTiet = hopdongchitiet.idHopDongChiTiet)
and(hopdongchitiet.idDichVuDiKem= dichvudikem.idDichVuDiKem)
group by(khachhang.idKhachHang)

-- task 5 ⦁	Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu 
-- của tất cả các loại Dịch vụ chưa từng được Khách hàng thực hiện đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).
select dichvu.iddichvu, Tên_Dịch_Vụ,Diện_Tích_Sử_Dụng,
Ngày_Bắt_Đầu,Ngày_Kết_Thúc
from dichvu, hopdong
where(dichvu.iddichvu = hopdong.iddichvu) and not(( (month(hopdong.Ngày_Bắt_Đầu)=1) or(month(hopdong.Ngày_Bắt_Đầu)=2)or(month(hopdong.Ngày_Bắt_Đầu)=3)) and (year(hopdong.Ngày_Bắt_Đầu)='2019'))

-- task 6 ⦁	Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu 
-- của tất cả các loại dịch vụ đã từng được Khách hàng đặt phòng trong năm 2018 nhưng chưa từng được Khách hàng 
-- đặt phòng  trong năm 2019.(DÙNG NOT IN)
select dichvu.idDichVu,Tên_Dịch_Vụ,Diện_Tích_Sử_Dụng,Số_Lượng_Người_Tối_Đa,Ngày_Bắt_Đầu
from dichvu,hopdong
where(dichvu.idDichVu = hopdong.idDichVu) and (year(hopdong.Ngày_Bắt_Đầu)='2018')
and dichvu.idDichVu not in(
select dichvu.idDichVu
from dichvu,hopdong
where(dichvu.idDichVu = hopdong.idDichVu) and (year(hopdong.Ngày_Bắt_Đầu)='2019'))
-- task 7 Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoThenKhachHang không trùng nhau.(DÙNG DISTINCT)
select distinct Họ_Tên
from khachhang

-- task 8 Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2019 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.
select idKhachHang,Ngày_Bắt_Đầu,Ngày_Kết_Thúc,count(idKhachhang)as cuont
from hopdong
where (month(Ngày_Kết_Thúc)=1) or (month(Ngày_Bắt_Đầu)=1)

select idKhachHang,Ngày_Bắt_Đầu,Ngày_Kết_Thúc,count(idKhachhang)as cuont
from hopdong
where (month(Ngày_Kết_Thúc)=2) or (month(Ngày_Bắt_Đầu)=2)

select idKhachHang,Ngày_Bắt_Đầu,Ngày_Kết_Thúc,count(idKhachhang)as cuont
from hopdong
where (month(Ngày_Kết_Thúc)=3) or (month(Ngày_Bắt_Đầu)=3)

-- task 9 Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm.
-- Kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem 
-- (được tính dựa trên việc count các IDHopDongChiTiet)
select idHopDong,Ngày_Bắt_Đầu,Ngày_Kết_Thúc,Số_Tiền_Cọc_Trước,Số_Lượng,idDichVuDiKem,count(idDichVuDiKem)
from hopdong,hopdongchitiet
where(hopdong.idHopDongChiTiet=hopdongchitiet.idHopDongChiTiet) and(idDichVuDiKem=1)
select idHopDong,Ngày_Bắt_Đầu,Ngày_Kết_Thúc,Số_Tiền_Cọc_Trước,Số_Lượng,idDichVuDiKem,count(idDichVuDiKem)
from hopdong,hopdongchitiet
where(hopdong.idHopDongChiTiet=hopdongchitiet.idHopDongChiTiet) and(idDichVuDiKem=2)
select idHopDong,Ngày_Bắt_Đầu,Ngày_Kết_Thúc,Số_Tiền_Cọc_Trước,Số_Lượng,idDichVuDiKem,count(idDichVuDiKem)
from hopdong,hopdongchitiet
where(hopdong.idHopDongChiTiet=hopdongchitiet.idHopDongChiTiet) and(idDichVuDiKem=3)
select idHopDong,Ngày_Bắt_Đầu,Ngày_Kết_Thúc,Số_Tiền_Cọc_Trước,Số_Lượng,idDichVuDiKem,count(idDichVuDiKem)
from hopdong,hopdongchitiet
where(hopdong.idHopDongChiTiet=hopdongchitiet.idHopDongChiTiet) and(idDichVuDiKem=4)

-- task 10 Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hàng có TenLoaiKhachHang là “Diamond” 
-- và có địa chỉ là “Vinh” hoặc “Quảng Ngãi”.
select khachhang.Họ_Tên,khachhang.Loại_Khách,khachhang.Địa_Chỉ,dichvudikem.Tên_Dịch_Vụ_Đi_Kèm
from khachhang
inner join hopdong on hopdong.idKhachHang = khachhang.idKhachHang
inner join hopdongchitiet on hopdongchitiet.idHopDongChiTiet=hopdong.idHopDongChiTiet
inner join dichvudikem on dichvudikem.idDichVuDiKem= hopdongchitiet.idDichVuDiKem
where (khachhang.Địa_Chỉ='qn') and (khachhang.Loại_Khách='diamon')

-- task 11	Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, TenDichVu, SoLuongDichVuDikem 
-- (được tính dựa trên tổng Hợp đồng chi tiết), TienDatCoc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng 
-- cuối năm 2019 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019.
-- (CHƯA GIẢI DC)
select hopdong.idHopDong,nhanvien.Họ_Tên,khachhang.Họ_Tên,hopdong.Ngày_Bắt_Đầu,
khachhang.Số_ĐT,dichvu.Tên_Dịch_Vụ,hopdongchitiet.Số_Lượng,hopdong.Số_Tiền_Cọc_Trước, sum(hopdong.Số_Tiền_Cọc_Trước)
from hopdong
inner join nhanvien on hopdong.idNhanVien=nhanvien.idNhanVien
inner join khachhang on hopdong.idKhachHang=khachhang.idKhachHang
inner join hopdongchitiet on hopdong.idHopDongChiTiet=hopdongchitiet.idHopDongChiTiet
inner join dichvudikem on hopdongchitiet.idDichVuDiKem=dichvudikem.idDichVuDiKem
inner join dichvu on hopdong.idDichVu=dichvu.idDichVu
where(month(hopdong.Ngày_Bắt_Đầu) between 10 and 12)and hopdong.Ngày_Bắt_Đầu not in(
select hopdong.Ngày_Bắt_Đầu
from hopdong
inner join nhanvien on hopdong.idNhanVien=nhanvien.idNhanVien
inner join khachhang on hopdong.idKhachHang=khachhang.idKhachHang
inner join hopdongchitiet on hopdong.idHopDongChiTiet=hopdongchitiet.idHopDongChiTiet
inner join dichvudikem on hopdongchitiet.idDichVuDiKem=dichvudikem.idDichVuDiKem
inner join dichvu on hopdong.idDichVu=dichvu.idDichVu
where(month(hopdong.Ngày_Bắt_Đầu) between 1 and 6) 
and(dichvu.Tên_Dịch_Vụ = 'room'))
group by hopdong.idDichVu

-- TASK 12 Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. 
-- (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).
select hopdongchitiet.idHopDongChiTiet,hopdongchitiet.Số_Lượng ,dichvudikem.Tên_Dịch_Vụ_Đi_Kèm
from (select max(hopdongchitiet.Số_Lượng)  maxsl
from hopdongchitiet
) as table_Max_Dich_Vu_Di_Kem
join hopdongchitiet
left join dichvudikem 
on hopdongchitiet.idDichVuDiKem = dichvudikem.idDichVuDiKem
where hopdongchitiet.Số_Lượng = table_Max_Dich_Vu_Di_Kem.maxsl
group by hopdongchitiet.idDichVuDiKem;

-- task 14  Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. 
-- Thông tin hiển thị bao gồm IDHopDong, TenLoaiDichVu, TenDichVuDiKem, SoLanSuDung.
select dichvudikem.Tên_Dịch_Vụ_Đi_Kèm,hopdongchitiet.Số_Lượng
from hopdongchitiet
inner join dichvudikem on hopdongchitiet.idDichVuDiKem = dichvudikem.idDichVuDiKem
where hopdongchitiet.Số_Lượng = 1

-- task 15  Hiển thi thông tin của tất cả nhân viên bao gồm IDNhanVien, HoTen, TrinhDo, TenBoPhan, SoDienThoai, DiaChi 
-- mới chỉ lập được tối đa 3 hợp đồng từ năm 2018 đến 2019.
select nhanvien.idNhanVien,nhanvien.Họ_Tên,nhanvien.Số_ĐT,hopdong.idHopDong,hopdong.Ngày_Bắt_Đầu,count(hopdong.idNhanVien)
from hopdong
join nhanvien
on hopdong.idNhanVien = nhanvien.idNhanVien
where ( year(hopdong.Ngày_Bắt_Đầu)='2018' or year(hopdong.Ngày_Bắt_Đầu)='2019' ) 
group by hopdong.idNhanVien 
having count(hopdong.idNhanVien) <= 3;

-- task 16 Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2017 đến năm 2019.
delete from nhanvien
where nhanvien.idNhanVien not in (
select idNhanVien
from hopdong
where( (year(Ngày_Bắt_Đầu)='2018') or (year(Ngày_Bắt_Đầu) ='2019'))
);

-- task 16 Cập nhật thông tin những khách hàng có TenLoaiKhachHang từ  Platinium lên Diamond, 
-- chỉ cập nhật những khách hàng đã từng đặt phòng với tổng Tiền thanh toán trong năm 2019 là lớn hơn 10.000.000 VNĐ.

update khachhang set Loại_Khách = 'diamon' where
khachhang.idKhachHang in
(
select hopdong.idKhachHang
from hopdong
 where year(Ngày_Bắt_Đầu)='2019'
group by hopdong.idKhachHang
);
-- task 17 Cập nhật giá cho các Dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2019 lên gấp đôi.

update dichvudikem
join
(
select dichvudikem.idDichVuDiKem ID
from hopdong
inner join hopdongchitiet on hopdong.idHopDongChiTiet= hopdongchitiet.idHopDongChiTiet
inner join dichvudikem on dichvudikem.idDichVuDiKem = hopdongchitiet.idDichVuDiKem
where year(hopdong.Ngày_Bắt_Đầu) = '2019'
group by dichvudikem.Tên_Dịch_Vụ_Đi_Kèm
having sum(hopdongchitiet.Số_Lượng)>=10
) TB
on dichvudikem.idDichVuDiKem = TB.ID
set dichvudikem.Giá_Tiền = dichvudikem.Giá_Tiền * 2
where dichvudikem.idDichVuDiKem = TB.ID;
-- task 18 Hiển thị thông tin của tất cả các Nhân viên và Khách hàng có trong hệ thống,
-- thông tin hiển thị bao gồm ID (IDNhanVien, IDKhachHang), HoTen, Email, SoDienThoai, NgaySinh, DiaChi.
select nhanvien.idNhanVien 'ID',nhanvien.Họ_Tên,nhanvien.Ngày_Sinh,nhanvien.Email,nhanvien.Số_ĐT
from nhanvien
union 
select khachhang.idKhachHang,khachhang.Họ_Tên,khachhang.Ngày_Sinh,khachhang.Email,khachhang.Số_ĐT
from khachhang



























