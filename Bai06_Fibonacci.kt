// Họ Tên: Lương Nhật Trường - MSSV: 25610007
package com.example.bai06

fun main() {
    // hai số đầu tiên của dãy
    var a: Int = 0
    var b: Int = 1
    // dùng vòng lặp for để sinh dãy số
    for (i in 0..100) {
        // dừng khi số Fibonacci không còn nhỏ hơn 100
        if (a >= 100) {
            break
        }
        // in vị trí và giá trị
        println("Vị trí $i: $a")
        // số tiếp theo bằng tổng hai số liền trước
        val tiepTheo: Int = a + b
        a = b
        b = tiepTheo
    }
}