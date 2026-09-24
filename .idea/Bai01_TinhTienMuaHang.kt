package com.example.bai01
// Họ Tên: Lương Nhật Trường - MSSV: 25610007
fun main() {
    // khai bao so luong bang Int, don gia bang Double
    val soLuong: Int = 3
    val donGia: Double = 15000.5

    // ep kieu so luong sang Double truoc khi nhan voi don gia
    val soLuongDouble: Double = soLuong.toDouble()

    // tinh tien hang
    val tienHang: Double = soLuongDouble * donGia

    // cong them thue 8%
    val tongTien: Double = tienHang + tienHang * 0.08

    // in ra tong tien cuoi cung
    println("Tong tien phai tra: " + tongTien + " VND")
}