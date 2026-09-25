// Ho va ten: Nguyen Van Phuoc - MSSV: 25810035
// Bai 06: Rut gon cac ham tinh toan
package com.example.ltdd.buoi03

fun binhPhuongDayDu(x: Int): Int {
    return x * x
}
fun binhPhuongRutGon(x: Int) = x * x

fun chuViHinhVuongDayDu(canh: Double): Double {
    return canh * 4
}
fun chuViHinhVuongRutGon(canh: Double) = canh * 4

fun kiemTraSoChanDayDu(so: Int): Boolean {
    return so % 2 == 0
}
fun kiemTraSoChanRutGon(so: Int) = so % 2 == 0

fun main() {
    println("Binh phuong: ${binhPhuongDayDu(5)} == ${binhPhuongRutGon(5)}")
    println("Chu vi hinh vuong: ${chuViHinhVuongDayDu(4.0)} == ${chuViHinhVuongRutGon(4.0)}")
    println("So chan: ${kiemTraSoChanDayDu(8)} == ${kiemTraSoChanRutGon(8)}")
}
