// 25810035 _ Nguyen Van Phuoc
// Bai 10: Data class cho sinh vien
package com.example.ltdd.buoi04

data class SinhVien(val mssv: String, val hoTen: String, val diemTrungBinh: Double)

fun main() {
    val sinhVien1 = SinhVien("25810035", "Nguyen Van Phuoc", 8.5)
    val sinhVien2 = SinhVien("25810035", "Nguyen Van Phuoc", 8.5)

    println(sinhVien1)
    println("sinhVien1 == sinhVien2: ${sinhVien1 == sinhVien2}")

    val sinhVien3 = sinhVien1.copy(diemTrungBinh = 9.0)
    println(sinhVien3)
}
