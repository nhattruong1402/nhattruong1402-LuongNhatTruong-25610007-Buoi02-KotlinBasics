// Họ tên: Lương Nhật Trường - MSSV: 25610007
package com.example.bai6
// Hàm 1: tính bình phương một số
// bản đầy đủ
fun binhPhuong(so: Int): Int {
    return so * so
}
// bản rút gọn
fun binhPhuongRutGon(so: Int): Int = so * so

// Hàm 2: tính chu vi hình vuông
// bản đầy đủ
fun chuViHinhVuong(canh: Double): Double {
    return canh * 4
}
// bản rút gọn
fun chuViHinhVuongRutGon(canh: Double): Double = canh * 4

// Hàm 3: kiểm tra số chẵn
// bản đầy đủ
fun laSoChan(so: Int): Boolean {
    return so % 2 == 0
}
// bản rút gọn
fun laSoChanRutGon(so: Int): Boolean = so % 2 == 0

fun main() {
    // gọi 2 phiên bản của từng hàm để so sánh kết quả
    println("Bình phương của 5: ${binhPhuong(5)} - rút gọn: ${binhPhuongRutGon(5)}")
    println("Chu vi hình vuông cạnh 3.5: ${chuViHinhVuong(3.5)} - rút gọn: ${chuViHinhVuongRutGon(3.5)}")
    println("Số 8 là số chẵn: ${laSoChan(8)} - rút gọn: ${laSoChanRutGon(8)}")
}