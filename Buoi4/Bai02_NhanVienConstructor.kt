// Họ tên: Lương Nhật Trường - MSSV: 25610007
package com.example.bai2
// constructor chính
class NhanVien(maNhanVien: String, val ten: String, var luongThang: Double) {
    // constructor phụ
    constructor(ten: String) : this("TAM", ten, 0.0)
}

fun main() {
    // object 1: tạo bằng constructor chính
    val nv1 = NhanVien("NV001", "Nguyễn Tình Anh", 12000000.0)

    // object 2: tạo bằng constructor phụ
    val nv2 = NhanVien("Trần Ngọc Bình")

    // println(nv1.maNhanVien)
    // dòng trên sẽ báo lỗi biên dịch nếu bỏ comment vì maNhanVien không khai báo val hay var,
    // nên nó chỉ là tham số của constructor chứ không phải thuộc tính của class, không truy cập qua dấu chấm được

    // in ten và luongThang của cả 2 object
    println("Nhân viên 1: ${nv1.ten} - Lương: ${nv1.luongThang}")
    println("Nhân viên 2: ${nv2.ten} - Lương: ${nv2.luongThang}")
}