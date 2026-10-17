// Ho va ten: Nguyen Van Phuoc - MSSV: 25810035
// Bai 04: Dat ban nha hang
package com.example.ltdd.buoi03

fun datBan(tenKhachHang: String, soLuongKhach: Int, loaiBan: String = "Ban thuong") {
    println("Dat ban cho $tenKhachHang, $soLuongKhach khach, loai ban: $loaiBan")
}

fun main() {
    // Cach 1: dung gia tri mac dinh cua loaiBan
    datBan("Nguyen Van Phuoc", 4)

    // Cach 2: truyen du tham so theo dung thu tu
    datBan("Tran Thi B", 2, "Ban VIP")

    // Cach 3: truyen bang ten tham so
    datBan(soLuongKhach = 6, tenKhachHang = "Le Van C", loaiBan = "Ban ngoai troi")
}
