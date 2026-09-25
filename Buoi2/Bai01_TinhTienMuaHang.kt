// Họ Tên: Lương Nhật Trường - MSSV: 25610007
package com.example.bai01

fun main() {
    // khai báo số lượng bằng Int, đơn giá bằng Double
    val soLuong: Int = 3
    val donGia: Double = 15000.5
    // ép kiểu số lượng sang Double trước khi nhân với đơn giá
    val soLuongDouble: Double = soLuong.toDouble()
    // tính tiền hàng
    val tienHang: Double = soLuongDouble * donGia
    // cộng thêm thuế 8%
    val tongTien: Double = tienHang + tienHang * 0.08
    // in ra tổng tiền cuối cùng
    println("Tổng tiền phải trả: " + tongTien + " VND")
}