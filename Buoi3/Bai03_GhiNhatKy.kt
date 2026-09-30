// Họ tên: Lương Nhật Trường - MSSV: 25610007
package com.example.bai3
// khai báo tường minh kiểu trả về là Unit
fun ghiNhatKy1(hanhDong: String): Unit {
    println("[NHẬT KÝ] $hanhDong")
}
// bỏ qua khai báo kiểu trả về
fun ghiNhatKy2(hanhDong: String) {
    println("[NHẬT KÝ] $hanhDong")
}
// hai cách viết tương đương nhau vì khi không ghi kiểu trả về thì Kotlin tự hiểu hàm đó trả về Unit
fun main() {
    ghiNhatKy1("Đăng nhập hệ thống")
    ghiNhatKy2("Đăng nhập hệ thống")
}