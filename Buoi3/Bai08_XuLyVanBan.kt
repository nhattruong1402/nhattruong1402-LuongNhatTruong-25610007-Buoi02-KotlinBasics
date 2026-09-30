// Họ tên: Lương Nhật Trường - MSSV: 25610007
package com.example.bai8
// higher order function: nhận vào 1 chuỗi và 1 hàm xử lý (String) -> String
fun xuLyVanBan(vanBan: String, hamXuLy: (String) -> String): String {
    return hamXuLy(vanBan)
}
// hàm đặt tên riêng, dùng cho cách gọi thứ 2
fun daoNguocChuoi(chuoi: String): String {
    return chuoi.reversed()
}
fun main() {
    val vanBan = "hoc kotlin"
    // truyền lambda viết trực tiếp tại chỗ (bên trong dấu ngoặc)
    val ketQua1 = xuLyVanBan(vanBan, { chuoi -> chuoi.uppercase() })
    println("Cách 1 - in hoa: $ketQua1")
    // truyền hàm đã đặt tên thông qua toán tử ::
    val ketQua2 = xuLyVanBan(vanBan, ::daoNguocChuoi)
    println("Cách 2 - đảo ngược: $ketQua2")
    // cú pháp tham số cuối, đưa lambda ra ngoài dấu ngoặc
    val ketQua3 = xuLyVanBan(vanBan) { chuoi -> chuoi.replace(" ", "_") }
    println("Cách 3 - thay khoảng trắng: $ketQua3")
}