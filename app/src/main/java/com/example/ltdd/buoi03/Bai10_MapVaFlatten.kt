// Ho va ten: Nguyen Van Phuoc - MSSV: 25810035
// Bai 10: Bien doi va gop danh sach long nhau
package com.example.ltdd.buoi03

fun main() {
    // Phan 1: dung map de nhan doi tung phan tu
    val soNguyen = listOf(1, 2, 3, 4, 5)
    val nhanDoi = soNguyen.map { it * 2 }
    println("Danh sach sau khi nhan doi (map): $nhanDoi")

    // Phan 2: dung flatten de gop danh sach long nhau thanh danh sach phang
    val danhSachLong = listOf(
        listOf(1, 2, 3),
        listOf(4, 5),
        listOf(6, 7, 8, 9)
    )
    val danhSachPhang = danhSachLong.flatten()
    println("Danh sach sau khi gop (flatten): $danhSachPhang")
}
