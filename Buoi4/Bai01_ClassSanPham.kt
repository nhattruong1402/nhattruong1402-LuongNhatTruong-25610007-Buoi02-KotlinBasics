// Họ tên: Lương Nhật Trường - MSSV: 25610007
package com.example.bai1
class SanPham(val tenSanPham: String, val gia: Double, val soLuongTonKho: Int = 0)

fun main() {
    // object 1: truyền đủ 3 giá trị theo đúng thứ tự
    val sanPham1 = SanPham("Chuột không dây", 250000.0, 15)
    // object 2: chỉ truyền 2 tham số bắt buộc bằng named argument, soLuongTonKho lấy mặc định
    val sanPham2 = SanPham(tenSanPham = "Bàn phím cơ", gia = 890000.0)
    // in thông tin bằng cách truy cập từng thuộc tính qua dấu chấm
    println("Sản phẩm 1: ${sanPham1.tenSanPham} - Giá: ${sanPham1.gia} VND - Tồn kho: ${sanPham1.soLuongTonKho}")
    println("Sản phẩm 2: ${sanPham2.tenSanPham} - Giá: ${sanPham2.gia} VND - Tồn kho: ${sanPham2.soLuongTonKho}")
}