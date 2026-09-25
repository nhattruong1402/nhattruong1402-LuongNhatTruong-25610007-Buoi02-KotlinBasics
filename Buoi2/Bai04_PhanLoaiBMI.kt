// Họ Tên: Lương Nhật Trường - MSSV: 25610007
package com.example.bai04

fun main() {
    // cân nặng (kg) và chiều cao (m)
    val canNang: Double = 65.0
    val chieuCao: Double = 1.56
    // tính chỉ số BMI = cân nặng / (chiều cao * chiều cao)
    val bmi: Double = canNang / (chieuCao * chieuCao)
    var phanLoai: String
    if (bmi < 18.5) {
        phanLoai = "Gầy"
    } else if (bmi < 25) {
        phanLoai = "Bình thường"
    } else if (bmi < 30) {
        phanLoai = "Thừa cân"
    } else {
        phanLoai = "Béo phì"
    }
    // in ra chỉ số và phân loại
    println("Chỉ số BMI: " + String.format("%.2f", bmi))
    println("Phân loại: $phanLoai")
}