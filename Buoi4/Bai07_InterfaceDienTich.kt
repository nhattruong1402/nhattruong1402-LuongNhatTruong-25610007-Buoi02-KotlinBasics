// Họ tên: Lương Nhật Trường - MSSV: 25610007
package com.example.bai7
// interface chỉ khai báo hàm, không viết phần thân
interface CoTheTinhDienTich {
    fun tinhDienTich(): Double
}
// HinhVuong implement interface bằng dấu hai chấm sau tên class
class HinhVuong(val canh: Double) : CoTheTinhDienTich {
    override fun tinhDienTich(): Double {
        return canh * canh
    }
}
// HinhTron implement interface bằng dấu hai chấm sau tên class
class HinhTron(val banKinh: Double) : CoTheTinhDienTich {
    override fun tinhDienTich(): Double {
        return Math.PI * banKinh * banKinh
    }
}
fun main() {
    val hinhVuong = HinhVuong(4.0)
    val hinhTron = HinhTron(2.0)

    println("Diện tích hình vuông cạnh 4.0: ${hinhVuong.tinhDienTich()}")
    println("Diện tích hình tròn bán kính 2.0: ${hinhTron.tinhDienTich()}")
}