// Họ tên: Lương Nhật Trường - MSSV: 25610007
package com.example.bai3
class TaiKhoanNganHang(val soTaiKhoan: String, soDuBanDau: Double) {
    // thuộc tính soDu được gán từ soDuBanDau
    var soDu: Double = soDuBanDau

    // kiểm tra số dư ban đầu ngay lúc tạo object
    init {
        if (soDuBanDau < 0) {
            println("So du khong hop le")
        } else {
            println("Tạo tài khoản $soTaiKhoan thành công, số dư ban đầu: $soDuBanDau VND")
        }
    }
}

fun main() {
    // object 1: số dư ban đầu hợp lệ
    val tk1 = TaiKhoanNganHang("0123456789", 9000000.0)

    // object 2: số dư ban đầu âm
    val tk2 = TaiKhoanNganHang("9876543210", -200000.0)
}