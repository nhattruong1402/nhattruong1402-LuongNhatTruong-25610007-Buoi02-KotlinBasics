// Họ tên: Lương Nhật Trường - MSSV: 25610007
package com.example.bai7
fun main() {
    // khai báo biến: nhận String, trả về Boolean
    // gán cho biến một lambda kiểm tra độ dài chuỗi từ 8 ký tự trở lên
    val kiemTraDoDai: (String) -> Boolean = { matKhau -> matKhau.length >= 8 }

    // gọi biến với 3 mật khẩu khác nhau
    println("Mật khẩu \"abc1234\": ${kiemTraDoDai("abc1234")}")
    println("Mật khẩu \"matkhau1\": ${kiemTraDoDai("matkhau1")}")
    println("Mật khẩu \"kotlin2026abcd\": ${kiemTraDoDai("kotlin2026abcd")}")
}