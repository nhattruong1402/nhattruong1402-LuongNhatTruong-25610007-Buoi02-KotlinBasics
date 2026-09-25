// Họ Tên: Lương Nhật Trường - MSSV: 25610007
package com.example.bai05

fun main() {
    // điểm trung bình môn học
    val diemTrungBinh: Double = 7.8
    // xếp loại bằng when kết hợp range
    when (diemTrungBinh) {
        in 8.5..10.0 -> println("Điểm $diemTrungBinh: Xuất sắc")
        in 7.0..<8.5 -> println("Điểm $diemTrungBinh: Giỏi")
        in 5.5..<7.0 -> println("Điểm $diemTrungBinh: Khá")
        in 4.0..<5.5 -> println("Điểm $diemTrungBinh: Trung bình")
        in 0.0..<4.0 -> println("Điểm $diemTrungBinh: Yếu")
    }
}