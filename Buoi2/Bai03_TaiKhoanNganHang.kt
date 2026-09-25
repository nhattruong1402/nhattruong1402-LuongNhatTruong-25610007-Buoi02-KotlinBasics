// Họ Tên: Lương Nhật Trường - MSSV: 25610007
package com.example.bai03

fun main() {
    // dùng val cho số dư ban đầu vì đây là giá trị gốc, chỉ để đối chiếu, không được thay đổi
    val soDuBanDau: Int = 5000000
    // dùng var cho số dư hiện tại vì giá trị thay đổi sau mỗi giao dịch
    var soDu: Int = soDuBanDau
    // giao dịch 1: gửi thêm 2 triệu
    soDu = soDu + 2000000
    println("Sau khi gửi 2000000 VND, số dư là: $soDu VND")
    // giao dịch 2: rút 1 triệu rưỡi
    soDu = soDu - 1500000
    println("Sau khi rút 1500000 VND, số dư là: $soDu VND")
}