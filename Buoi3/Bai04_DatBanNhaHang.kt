// Họ tên: Lương Nhật Trường - MSSV: 25610007
package com.example.bai4
// tenKhach và soLuongKhach là tham số bắt buộc, loaiBan có giá trị mặc định là "Bàn thường"
fun datBan(tenKhach: String, soLuongKhach: Int, loaiBan: String = "Bàn thường") {
    println("Khách $tenKhach đặt $loaiBan cho $soLuongKhach người")
}

fun main() {
    // cách 1: dùng giá trị mặc định (không truyền loaiBan)
    datBan("Nguyễn Tình Anh", 2)

    // cách 2: truyền đủ tham số theo đúng thứ tự
    datBan("Trần Ngọc Bình", 4, "Bàn VIP")

    // cách 3: truyền bằng tên tham số
    datBan(tenKhach = "Lê Cường Tráng", soLuongKhach = 6, loaiBan = "Bàn ngoài trời")
}