// Họ tên: Lương Nhật Trường - MSSV: 25610007
package com.example.bai1
fun main() {
    // tuổi của khách hàng
    val tuoi: Int = 25
    // gán thẳng kết quả của biểu thức if else cho val loaiVe
    val loaiVe: String = if (tuoi < 12) {
        "Vé trẻ em"
    } else if (tuoi < 60) {
        "Vé người lớn"
    } else {
        "Vé cao tuổi"
    }
    // in ra loại vé
    println("Tuổi $tuoi: $loaiVe")
}