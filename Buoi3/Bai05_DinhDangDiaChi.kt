// Họ tên: Lương Nhật Trường - MSSV: 25610007
package com.example.bai5
fun dinhDangDiaChi(
    tenNguoiNhan: String,
    soNhaDuong: String,
    phuong: String = "Phường Thủ Đức",
    thanhPho: String = "TP. Hồ Chí Minh",
    quocGia: String = "Việt Nam"
): String {
    return "$tenNguoiNhan - $soNhaDuong, $phuong, $thanhPho, $quocGia"
}

fun main() {
    // 1: chỉ truyền 2 tham số bắt buộc, còn lại dùng giá trị mặc định
    println(dinhDangDiaChi("Lương Nhật Trường", "1 Võ Văn Ngân"))

    // 2: dùng named argument cho các tham số có giá trị mặc định
    println(dinhDangDiaChi("Nguyễn Tình Anh", "12 Lê Lợi", phuong = "Phường Linh Chiểu", thanhPho = "TP. Hồ Chí Minh"))

    // 3: dùng named argument đổi thứ tự
    println(dinhDangDiaChi("Trần Bảo Bình", "15 Lê Hồng Phong", quocGia = "Việt Nam", thanhPho = "TP. Đà Nẵng", phuong = "Phường Hải Châu"))
}