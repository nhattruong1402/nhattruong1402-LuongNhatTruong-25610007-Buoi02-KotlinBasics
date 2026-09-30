// Họ tên: Lương Nhật Trường - MSSV: 25610007
package com.example.bai6
// class cha phải có open thì mới cho class khác kế thừa
open class DongVat(val ten: String) {
    // hàm keu phải có open thì class con mới override được
    open fun keu(): String {
        return "..."
    }
}
// class Cho kế thừa DongVat, override lại keu()
class Cho(ten: String) : DongVat(ten) {
    override fun keu(): String {
        return "Gâu gâu"
    }
}
// class Meo kế thừa DongVat, override lại keu()
class Meo(ten: String) : DongVat(ten) {
    override fun keu(): String {
        return "Meo meo"
    }
}
fun main() {
    // danh sách chứa cả Cho và Meo
    val danhSach = listOf(Cho("Mực"), Meo("Mướp"), Cho("Vàng"), Meo("Tom"))

    // dùng vòng lặp for in ten và tiếng kêu của từng con
    for (dongVat in danhSach) {
        println("${dongVat.ten} kêu: ${dongVat.keu()}")
    }
}