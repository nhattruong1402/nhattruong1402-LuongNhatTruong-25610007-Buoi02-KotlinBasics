// Họ tên: Lương Nhật Trường - MSSV: 25610007
package com.example.bai5
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

    // hàm thành viên: nạp tiền, cộng thêm soTien vào soDu
    fun napTien(soTien: Double) {
        soDu = soDu + soTien
    }

    // hàm thành viên: rút tiền, kiểm tra đủ số dư trước khi trừ
    fun rutTien(soTien: Double): Boolean {
        if (soDu >= soTien) {
            soDu = soDu - soTien
            return true
        } else {
            return false
        }
    }
}

fun main() {
    val tk = TaiKhoanNganHang("0123456789", 1000000.0)

    // lần 1: nạp 500 nghìn
    tk.napTien(500000.0)
    println("Nạp 500000.0 -> số dư: ${tk.soDu}")

    // lần 2: rút 300 nghìn (đủ tiền)
    val ketQua1 = tk.rutTien(300000.0)
    println("Rút 300000.0 -> thành công: $ketQua1, số dư: ${tk.soDu}")

    // lần 3: rút 5 triệu (không đủ tiền)
    val ketQua2 = tk.rutTien(5000000.0)
    println("Rút 5000000.0 -> thành công: $ketQua2, số dư: ${tk.soDu}")

    // lần 4: nạp thêm 200 nghìn
    tk.napTien(200000.0)
    println("Nạp 200000.0 -> số dư: ${tk.soDu}")
}