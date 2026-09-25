// Ho va ten: Nguyen Van Phuoc - MSSV: 25810035
//  Bai 02: Tinh dien tich hinh chu nhat
package com.example.ltdd.buoi03

fun tinhDienTich(chieuDai: Double, chieuRong: Double): Double {
    return chieuDai * chieuRong
}

val ketQuaDienTich1 = tinhDienTich(5.0, 3.0).also { println("Dien tich hinh 1 (5.0 x 3.0) = $it") }
val ketQuaDienTich2 = tinhDienTich(7.5, 2.4).also { println("Dien tich hinh 2 (7.5 x 2.4) = $it") }

fun main() {
}
