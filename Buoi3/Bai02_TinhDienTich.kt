// Họ tên: Lương Nhật Trường - MSSV: 25610007
package com.example.bai2
fun tinhDienTich(chieuDai: Double, chieuRong: Double): Double {
    return chieuDai * chieuRong
}

val dienTich1: Double = tinhDienTich(5.0, 3.0)
val dienTich2: Double = tinhDienTich(7.5, 4.2)

fun main() {
    println("Hình 1: dài 5.0 m, rộng 3.0 m -> Diện tích = $dienTich1 m2")
    println("Hình 2: dài 7.5 m, rộng 4.2 m -> Diện tích = $dienTich2 m2")
}