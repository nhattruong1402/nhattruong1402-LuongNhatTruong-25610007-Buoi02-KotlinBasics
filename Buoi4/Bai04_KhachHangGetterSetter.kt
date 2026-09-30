// Họ tên: Lương Nhật Trường - MSSV: 25610007
package com.example.bai4
class KhachHang(var ho: String, var ten: String) {

    var hoTen: String
        get() {
            return "$ho $ten"
        }
        set(value) {
            val phan = value.split(" ", limit = 2)
            ho = phan[0]
            ten = phan[1]
        }
}

fun main() {
    val kh = KhachHang("Nguyễn", "An")
    println("Họ tên ban đầu: ${kh.hoTen}")

    // đổi ten rồi in lại hoTen
    kh.ten = "Bình"
    println("Sau khi đổi tên: ${kh.hoTen}")

    // gán hoTen bằng chuỗi mới rồi in lại ho và ten
    kh.hoTen = "Lương Nhật Trường"
    println("Họ: ${kh.ho}")
    println("Tên: ${kh.ten}")
}