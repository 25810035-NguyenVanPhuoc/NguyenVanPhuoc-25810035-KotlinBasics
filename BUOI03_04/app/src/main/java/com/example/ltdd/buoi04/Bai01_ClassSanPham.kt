// 25810035 _ Nguyen Van Phuoc
// Bai 01: Class san pham va tham so mac dinh
package com.example.ltdd.buoi04

class SanPham(
    val tenSanPham: String,
    val gia: Double,
    val soLuongTonKho: Int = 0
)

fun main() {
    val sp1 = SanPham("Ban phim co", 550000.0, 20)
    val sp2 = SanPham(tenSanPham = "Chuot khong day", gia = 250000.0)

    println("San pham 1: ${sp1.tenSanPham}, gia: ${sp1.gia}, ton kho: ${sp1.soLuongTonKho}")
    println("San pham 2: ${sp2.tenSanPham}, gia: ${sp2.gia}, ton kho: ${sp2.soLuongTonKho}")
}
