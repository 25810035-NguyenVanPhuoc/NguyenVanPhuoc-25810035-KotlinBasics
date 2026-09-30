// 25810035 _ Nguyen Van Phuoc
// Bai 04: Custom getter va setter cho ho ten
package com.example.ltdd.buoi04

class KhachHang(var ho: String, var ten: String) {
    var hoTen: String
        get() = "$ho $ten"
        set(value) {
            val phanTach = value.split(" ", limit = 2)
            ho = phanTach[0]
            ten = if (phanTach.size > 1) phanTach[1] else ""
        }
}

fun main() {
    val khachHang = KhachHang("Nguyen", "Van A")
    println("Ho ten ban dau: ${khachHang.hoTen}")

    khachHang.ten = "Van B"
    println("Ho ten sau khi doi ten: ${khachHang.hoTen}")

    khachHang.hoTen = "Tran Thi C"
    println("Ho: ${khachHang.ho}, Ten: ${khachHang.ten}")
}
