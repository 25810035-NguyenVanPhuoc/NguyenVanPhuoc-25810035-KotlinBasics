// 25810035 _ Nguyen Van Phuoc
// Bai 08: Abstract class cho phuong tien di chuyen
package com.example.ltdd.buoi04

abstract class PhuongTienDiChuyen {
    abstract val tocDoToiDa: Int

    fun moTa() {
        println("Phuong tien nay co toc do toi da la $tocDoToiDa km/h")
    }
}

class XeMay : PhuongTienDiChuyen() {
    override val tocDoToiDa: Int = 120
}

class OTo : PhuongTienDiChuyen() {
    override val tocDoToiDa: Int = 200
}

fun main() {
    val xeMay = XeMay()
    val oTo = OTo()

    xeMay.moTa()
    oTo.moTa()
}
