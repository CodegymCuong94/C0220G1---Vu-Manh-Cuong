-- Tạo bảng
CREATE SCHEMA `furama_resort` ;
use `furama_resort`;

CREATE TABLE `trinhdo` (
  `idTrinhDo` int NOT NULL,
  `Trinh_Do` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idTrinhDo`)
);

CREATE TABLE `vitri` (
  `idViTri` int NOT NULL,
  `Tên_Vị_Trí` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idViTri`)
);


CREATE TABLE `bophan` (
  `idBoPhan` int NOT NULL,
  `Tên_Bộ_Phận` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idBoPhan`)
);
CREATE TABLE `dichvudikem` (
  `idDichVuDiKem` int NOT NULL,
  `Tên_Dịch_Vụ_Đi_Kèm` varchar(45)DEFAULT NULL,
  `Đơn_Vị` varchar(45) DEFAULT NULL,
  `Giá_Tiền` varchar(45) DEFAULT NULL,
  `Trạng_Thái_Khả_Dụng` varchar(45)  DEFAULT NULL,
  PRIMARY KEY (`idDichVuDiKem`)
);
CREATE TABLE `kieuthue` (
  `idKieuThue` int NOT NULL,
  `Tên_Kiểu_Thuê` varchar(45) DEFAULT NULL,
  `Giá` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idKieuThue`)
);

CREATE TABLE `loaidichvu` (
  `idLoaiDichVu` int NOT NULL,
  `Ten_Loại_Dịch_Vụ` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idLoaiDichVu`)
);

CREATE TABLE `loaikhach` (
  `idLoaiKhach` int NOT NULL,
  `Tên_Loại_Khách` varchar(45)  DEFAULT NULL,
  PRIMARY KEY (`idLoaiKhach`)
);

CREATE TABLE `dichvu` (
  `idDichVu` int NOT NULL,
  `Tên_Dịch_Vụ` varchar(45) DEFAULT NULL,
  `Diện_Tích_Sử_Dụng` varchar(45)DEFAULT NULL,
  `Số_Tầng` varchar(45)  DEFAULT NULL,
  `Chi_Phí _Thuê` varchar(45) DEFAULT NULL,
  `Số_Lượng_Người_Tối_Đa` varchar(45) DEFAULT NULL,
  `Kiểu_Thuê` varchar(45)DEFAULT NULL,
  `idLoaiDichVu` int DEFAULT NULL,
  `idKieuThue` int DEFAULT NULL,
  PRIMARY KEY (`idDichVu`),
  KEY `idLoaiDichVu` (`idLoaiDichVu`),
  KEY `idKieuThue` (`idKieuThue`),
  CONSTRAINT `dichvu_ibfk_1` FOREIGN KEY (`idLoaiDichVu`) REFERENCES `loaidichvu` (`idLoaiDichVu`),
  CONSTRAINT `dichvu_ibfk_2` FOREIGN KEY (`idKieuThue`) REFERENCES `kieuthue` (`idKieuThue`)
);
CREATE TABLE `nhanvien` (
  `idNhanVien` int NOT NULL,
  `Họ_Tên` varchar(45)  DEFAULT NULL,
  `Ngày_Sinh` varchar(45)  DEFAULT NULL,
  `Số_CMND` varchar(45)  DEFAULT NULL,
  `Số_ĐT` varchar(45)  DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `Trình_Độ` varchar(45)  DEFAULT NULL,
  `Vị_trí` varchar(45) DEFAULT NULL,
  `Lương` varchar(45) DEFAULT NULL,
  `bo_phan_id` int DEFAULT NULL,
  `trinh_do` int DEFAULT NULL,
  `IdViTri` int DEFAULT NULL,
  PRIMARY KEY (`idNhanVien`),
  KEY `bo_phan_id` (`bo_phan_id`),
  KEY `trinh_do` (`trinh_do`),
  KEY `IdViTri` (`IdViTri`),
  CONSTRAINT `nhanvien_ibfk_1` FOREIGN KEY (`bo_phan_id`) REFERENCES `bophan` (`idBoPhan`),
  CONSTRAINT `nhanvien_ibfk_2` FOREIGN KEY (`trinh_do`) REFERENCES `trinhdo` (`idTrinhDo`),
  CONSTRAINT `nhanvien_ibfk_3` FOREIGN KEY (`IdViTri`) REFERENCES `vitri` (`idViTri`)
) ;
CREATE TABLE `khachhang` (
  `idKhachHang` int NOT NULL,
  `Họ_Tên` varchar(45)  DEFAULT NULL,
  `Ngày_Sinh` varchar(45) DEFAULT NULL,
  `Giới_Tính` varchar(45)  DEFAULT NULL,
  `Số_CMND` varchar(45)  DEFAULT NULL,
  `Số_ĐT` varchar(45)  DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `Loại_Khách` varchar(45)  DEFAULT NULL,
  `Địa_Chỉ` varchar(45)  DEFAULT NULL,
  `idLoaiKhach` int DEFAULT NULL,
  PRIMARY KEY (`idKhachHang`),
  KEY `idLoaiKhach` (`idLoaiKhach`),
  CONSTRAINT `khachhang_ibfk_1` FOREIGN KEY (`idLoaiKhach`) REFERENCES `loaikhach` (`idLoaiKhach`)
);



CREATE TABLE `hopdong` (
  `idHopDong` int NOT NULL,
  `Ngày_Bắt_Đầu` varchar(45)  DEFAULT NULL,
  `Ngày_Kết_Thúc` varchar(45)  DEFAULT NULL,
  `Số_Tiền_Cọc_Trước` varchar(45)  DEFAULT NULL,
  `Tổng_Tiền_Phải_Thanh_Toán` varchar(45) DEFAULT NULL,
  `idHopDongChiTiet` int DEFAULT NULL,
  `idNhanVien` int DEFAULT NULL,
  `idKhachHang` int DEFAULT NULL,
  `idDichVu` int DEFAULT NULL,
  PRIMARY KEY (`idHopDong`),
  KEY `idHopDongChiTiet` (`idHopDongChiTiet`),
  KEY `idNhanVien` (`idNhanVien`),
  KEY `idKhachHang` (`idKhachHang`),
  KEY `idDichVu` (`idDichVu`),
  CONSTRAINT `hopdong_ibfk_2` FOREIGN KEY (`idNhanVien`) REFERENCES `nhanvien` (`idNhanVien`),
  CONSTRAINT `hopdong_ibfk_3` FOREIGN KEY (`idKhachHang`) REFERENCES `khachhang` (`idKhachHang`),
  CONSTRAINT `hopdong_ibfk_4` FOREIGN KEY (`idDichVu`) REFERENCES `dichvu` (`idDichVu`)
);
alter table hopdong add foreign key(idHopDongChiTiet) references hopdongchitiet(idHopDongChiTiet);

CREATE TABLE `hopdongchitiet` (
  `idHopDongChiTiet` int NOT NULL,
  `Số_Lượng` varchar(45) DEFAULT NULL,
  `idDichVuDiKem` int DEFAULT NULL,
  PRIMARY KEY (`idHopDongChiTiet`),
  KEY `idDichVuDiKem` (`idDichVuDiKem`),
  CONSTRAINT `hopdongchitiet_ibfk_1` FOREIGN KEY (`idDichVuDiKem`) REFERENCES `dichvudikem` (`idDichVuDiKem`)
);

-- Thêm dữ liệu từng bảng
-- Vị trí
INSERT INTO `furama_resort`.`vitri` (`idViTri`, `Tên_Vị_Trí`) VALUES ('1', 'Giám Đốc');
INSERT INTO `furama_resort`.`vitri` (`idViTri`, `Tên_Vị_Trí`) VALUES ('2', 'Phó Giám Đốc');
INSERT INTO `furama_resort`.`vitri` (`idViTri`, `Tên_Vị_Trí`) VALUES ('3', 'Nhân Viên');
INSERT INTO `furama_resort`.`vitri` (`idViTri`, `Tên_Vị_Trí`) VALUES ('4', 'Trưởng Phòng');
-- Bộ Phận
INSERT INTO `furama_resort`.`bophan` (`idBoPhan`, `Tên_Bộ_Phận`) VALUES ('1', 'Kinh Doanh');
INSERT INTO `furama_resort`.`bophan` (`idBoPhan`, `Tên_Bộ_Phận`) VALUES ('2', 'Bảo vệ');
INSERT INTO `furama_resort`.`bophan` (`idBoPhan`, `Tên_Bộ_Phận`) VALUES ('3', 'Giám Đốc');
INSERT INTO `furama_resort`.`bophan` (`idBoPhan`, `Tên_Bộ_Phận`) VALUES ('4', 'Thư ký');
INSERT INTO `furama_resort`.`bophan` (`idBoPhan`, `Tên_Bộ_Phận`) VALUES ('5', 'Lễ Tân');
-- Trình độ	
INSERT INTO `furama_resort`.`trinhdo` (`idTrinhDo`, `Trinh_Do`) VALUES ('1', 'Đại học');
INSERT INTO `furama_resort`.`trinhdo` (`idTrinhDo`, `Trinh_Do`) VALUES ('2', 'Cao đẳng');
INSERT INTO `furama_resort`.`trinhdo` (`idTrinhDo`, `Trinh_Do`) VALUES ('3', 'Trung cấp');
INSERT INTO `furama_resort`.`trinhdo` (`idTrinhDo`, `Trinh_Do`) VALUES ('4', 'Thạc sĩ');
-- Loại Khách
INSERT INTO `furama_resort`.`loaikhach` (`idLoaiKhach`, `Tên_Loại_Khách`) VALUES ('1', 'Diamon');
INSERT INTO `furama_resort`.`loaikhach` (`idLoaiKhach`, `Tên_Loại_Khách`) VALUES ('2', 'Platinium');
INSERT INTO `furama_resort`.`loaikhach` (`idLoaiKhach`, `Tên_Loại_Khách`) VALUES ('3', 'Gold');
INSERT INTO `furama_resort`.`loaikhach` (`idLoaiKhach`, `Tên_Loại_Khách`) VALUES ('4', 'Sliver');
INSERT INTO `furama_resort`.`loaikhach` (`idLoaiKhach`, `Tên_Loại_Khách`) VALUES ('5', 'Member');
-- Loại DỊch vụ
INSERT INTO `furama_resort`.`loaidichvu` (`idLoaiDichVu`, `Ten_Loại_Dịch_Vụ`) VALUES ('1', 'Villa');
INSERT INTO `furama_resort`.`loaidichvu` (`idLoaiDichVu`, `Ten_Loại_Dịch_Vụ`) VALUES ('2', 'House');
INSERT INTO `furama_resort`.`loaidichvu` (`idLoaiDichVu`, `Ten_Loại_Dịch_Vụ`) VALUES ('3', 'Room');
-- Kiểu thuê
INSERT INTO `furama_resort`.`kieuthue` (`idKieuThue`, `Tên_Kiểu_Thuê`, `Giá`) VALUES ('1', 'Thuê giờ', '1000');
INSERT INTO `furama_resort`.`kieuthue` (`idKieuThue`, `Tên_Kiểu_Thuê`, `Giá`) VALUES ('2', 'Thuê ngày', '2000');
INSERT INTO `furama_resort`.`kieuthue` (`idKieuThue`, `Tên_Kiểu_Thuê`, `Giá`) VALUES ('3', 'Thuê tháng', '3000');
INSERT INTO `furama_resort`.`kieuthue` (`idKieuThue`, `Tên_Kiểu_Thuê`, `Giá`) VALUES ('4', 'Thuê năm', '4000');
-- Dịch vụ đi kèm
INSERT INTO `furama_resort`.`dichvudikem` (`idDichVuDiKem`, `Tên_Dịch_Vụ_Đi_Kèm`, `Đơn_Vị`, `Giá_Tiền`) VALUES ('1', 'Massa', '1', '1000');
INSERT INTO `furama_resort`.`dichvudikem` (`idDichVuDiKem`, `Tên_Dịch_Vụ_Đi_Kèm`, `Đơn_Vị`, `Giá_Tiền`) VALUES ('2', 'Kara', '1', '2000');
INSERT INTO `furama_resort`.`dichvudikem` (`idDichVuDiKem`, `Tên_Dịch_Vụ_Đi_Kèm`, `Đơn_Vị`, `Giá_Tiền`) VALUES ('3', 'Thức ăn', '1', '3000');
INSERT INTO `furama_resort`.`dichvudikem` (`idDichVuDiKem`, `Tên_Dịch_Vụ_Đi_Kèm`, `Đơn_Vị`, `Giá_Tiền`) VALUES ('4', 'Cho thuê xe', '1', '4000');
INSERT INTO `furama_resort`.`dichvudikem` (`idDichVuDiKem`, `Tên_Dịch_Vụ_Đi_Kèm`, `Đơn_Vị`, `Giá_Tiền`) VALUES ('5', 'Nước uống', '1', '5000');
-- Nhân viên
INSERT INTO `furama_resort`.`nhanvien` (`idNhanVien`, `Họ_Tên`, `Ngày_Sinh`, `Số_CMND`, `Số_ĐT`, `Email`, `Trình_Độ`, `Vị_trí`, `Lương`, `bo_phan_id`, `trinh_do`, `IdViTri`) VALUES ('1', 'Vũ Hùng', '01/01/2020', '012', '098', 'hung@gmail.com', 'Đại học', '3', '1000', '1', '1', '3');
INSERT INTO `furama_resort`.`nhanvien` (`idNhanVien`, `Họ_Tên`, `Ngày_Sinh`, `Số_CMND`, `Số_ĐT`, `Email`, `Trình_Độ`, `Vị_trí`, `Lương`, `bo_phan_id`, `trinh_do`, `IdViTri`) VALUES ('2', 'Vũ Cường', '04/01/2019', '033', '096', 'cuong@gmail.com', 'Thạc sĩ', '1', '10000', '3', '4', '1');
INSERT INTO `furama_resort`.`nhanvien` (`idNhanVien`, `Họ_Tên`, `Ngày_Sinh`, `Số_CMND`, `Số_ĐT`, `Email`, `Trình_Độ`, `Vị_trí`, `Lương`, `bo_phan_id`, `trinh_do`, `IdViTri`) VALUES ('3', 'Lê Ngọc', '01/02/2018', '023', '093', 'ngoc@gmail.com', 'Cao đẳng', '4', '3000', '4', '2', '3');
INSERT INTO `furama_resort`.`nhanvien` (`idNhanVien`, `Họ_Tên`, `Ngày_Sinh`, `Số_CMND`, `Số_ĐT`, `Email`, `Trình_Độ`, `Vị_trí`, `Lương`, `bo_phan_id`, `trinh_do`, `IdViTri`) VALUES ('4', 'Kim ngân', '01/02/2020', '024', '094', 'ngan@gmail.com', 'Trung cấp', '3', '2000', '5', '3', '3');
-- Khách hàng
INSERT INTO `furama_resort`.`khachhang` (`idKhachHang`, `Họ_Tên`, `Ngày_Sinh`, `Giới_Tính`, `Số_CMND`, `Số_ĐT`, `Email`, `Loại_Khách`, `Địa_Chỉ`, `idLoaiKhach`) VALUES ('1', 'Lê Liêm', '01/02/2020', 'nam', '023', '091', 'liem@gmail.com', 'gold', 'dn', '3');
INSERT INTO `furama_resort`.`khachhang` (`idKhachHang`, `Họ_Tên`, `Ngày_Sinh`, `Giới_Tính`, `Số_CMND`, `Số_ĐT`, `Email`, `Loại_Khách`, `Địa_Chỉ`, `idLoaiKhach`) VALUES ('2', 'Trần Tiến', '01/10/2020', 'nam', '021', '095', 'tien@gmail.com', 'sliver', 'hue', '4');
INSERT INTO `furama_resort`.`khachhang` (`idKhachHang`, `Họ_Tên`, `Ngày_Sinh`, `Giới_Tính`, `Số_CMND`, `Số_ĐT`, `Email`, `Loại_Khách`, `Địa_Chỉ`, `idLoaiKhach`) VALUES ('3', 'Khánh phương', '01/02/2012', 'nam', '011', '098', 'phuong@gmail.com', 'diamon', 'dn', '1');
INSERT INTO `furama_resort`.`khachhang` (`idKhachHang`, `Họ_Tên`, `Ngày_Sinh`, `Giới_Tính`, `Số_CMND`, `Số_ĐT`, `Email`, `Loại_Khách`, `Địa_Chỉ`, `idLoaiKhach`) VALUES ('4', 'Trần Chân', '01/02/2020', 'nam', '012', '099', 'chan@gmail.com', 'platinium', 'hue', '2');
INSERT INTO `furama_resort`.`khachhang` (`idKhachHang`, `Họ_Tên`, `Ngày_Sinh`, `Giới_Tính`, `Số_CMND`, `Số_ĐT`, `Email`, `Loại_Khách`, `Địa_Chỉ`, `idLoaiKhach`) VALUES ('5', 'Dương Quân', '01/10/2019', 'nữ', '013', '092', 'quan@gmail.com', 'member', 'dn', '5');
-- Dịch vụ
INSERT INTO `furama_resort`.`dichvu` (`idDichVu`, `Tên_Dịch_Vụ`, `Diện_Tích_Sử_Dụng`, `Số_Tầng`, `Chi_Phí _Thuê`, `Số_Lượng_Người_Tối_Đa`, `Kiểu_Thuê`, `idLoaiDichVu`, `idKieuThue`) VALUES ('1', 'villa', '1000', '10', '10000', '10', 'thuê năm', '1', '4');
INSERT INTO `furama_resort`.`dichvu` (`idDichVu`, `Tên_Dịch_Vụ`, `Diện_Tích_Sử_Dụng`, `Số_Tầng`, `Chi_Phí _Thuê`, `Số_Lượng_Người_Tối_Đa`, `Kiểu_Thuê`, `idLoaiDichVu`, `idKieuThue`) VALUES ('2', 'house', '500', '5', '5000', '5', 'thuê tháng', '2', '3');
INSERT INTO `furama_resort`.`dichvu` (`idDichVu`, `Tên_Dịch_Vụ`, `Diện_Tích_Sử_Dụng`, `Số_Tầng`, `Chi_Phí _Thuê`, `Số_Lượng_Người_Tối_Đa`, `Kiểu_Thuê`, `idLoaiDichVu`, `idKieuThue`) VALUES ('3', 'room', '300', '3', '3000', '3', 'thuê ngày', '3', '2');

-- Hợp đồng chi tiết
INSERT INTO `furama_resort`.`hopdongchitiet` (`idHopDongChiTiet`, `Số_Lượng`, `idDichVuDiKem`) VALUES ('111', '2', '1');
INSERT INTO `furama_resort`.`hopdongchitiet` (`idHopDongChiTiet`, `Số_Lượng`, `idDichVuDiKem`) VALUES ('112', '3', '2');
INSERT INTO `furama_resort`.`hopdongchitiet` (`idHopDongChiTiet`, `Số_Lượng`, `idDichVuDiKem`) VALUES ('113', '3', '3');
INSERT INTO `furama_resort`.`hopdongchitiet` (`idHopDongChiTiet`, `Số_Lượng`, `idDichVuDiKem`) VALUES ('114', '2', '4');
-- hợp đồng
INSERT INTO `furama_resort`.`hopdong` (`idHopDong`, `Ngày_Bắt_Đầu`, `Ngày_Kết_Thúc`, `Số_Tiền_Cọc_Trước`, `Tổng_Tiền_Phải_Thanh_Toán`, `idHopDongChiTiet`, `idNhanVien`, `idKhachHang`, `idDichVu`) VALUES ('11', '01/01/2020', '01/02/2020', '1000', '10000', '111', '1', '1', '1');
INSERT INTO `furama_resort`.`hopdong` (`idHopDong`, `Ngày_Bắt_Đầu`, `Ngày_Kết_Thúc`, `Số_Tiền_Cọc_Trước`, `Tổng_Tiền_Phải_Thanh_Toán`, `idHopDongChiTiet`, `idNhanVien`, `idKhachHang`, `idDichVu`) VALUES ('12', '01/01/2020', '01/01/2021', '9000', '90000', '112', '1', '2', '2');
INSERT INTO `furama_resort`.`hopdong` (`idHopDong`, `Ngày_Bắt_Đầu`, `Ngày_Kết_Thúc`, `Số_Tiền_Cọc_Trước`, `Tổng_Tiền_Phải_Thanh_Toán`, `idHopDongChiTiet`, `idNhanVien`, `idKhachHang`, `idDichVu`) VALUES ('13', '01/01/2020', '02/02/2020', '8000', '80000', '113', '1', '3', '3');








