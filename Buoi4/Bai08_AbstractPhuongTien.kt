// Họ tên: Lương Nhật Trường - MSSV: 25610007
package com.example.bai8
// abstract class, không cần thêm open vì abstract class mặc định đã cho kế thừa
abstract class PhuongTienDiChuyen {
    // thuộc tính abstract, không có giá trị, class con phải override
    abstract val tocDoToiDa: Int
    // hàm không abstract, có thân hàm, dùng tocDoToiDa
    fun moTa() {
        println("Phương tiện này có tốc độ tối đa là $tocDoToiDa km/h")
    }
}
// XeMay kế thừa, override tocDoToiDa
class XeMay : PhuongTienDiChuyen() {
    override val tocDoToiDa: Int = 120
}
// OTo kế thừa, override tocDoToiDa
class OTo : PhuongTienDiChuyen() {
    override val tocDoToiDa: Int = 200
}
fun main() {
    val xeMay = XeMay()
    val oTo = OTo()
    xeMay.moTa()
    oTo.moTa()
}