// Họ Tên: Lương Nhật Trường - MSSV: 25610007
package com.example.bai02

fun main() {
    // khai báo họ tên và năm sinh
    val hoTen: String = "Lương Nhật Trường"
    val namSinh: Int = 2003
    // năm hiện tại
    val namHienTai: Int = 2026
    // tính tuổi
    val tuoi: Int = namHienTai - namSinh
    // giới thiệu bằng string template
    println("Xin chào, tôi tên là $hoTen, năm nay tôi $tuoi tuổi.")
}