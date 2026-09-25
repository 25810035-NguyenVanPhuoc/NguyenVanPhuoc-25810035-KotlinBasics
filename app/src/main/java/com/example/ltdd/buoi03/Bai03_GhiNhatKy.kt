// Ho va ten: Nguyen Van Phuoc - MSSV: 25810035
// - Bai 03: Ghi nhat ky hoat dong
package com.example.ltdd.buoi03

fun ghiNhatKyCoKieu(hanhDong: String): Unit {
    println("[NHAT KY] $hanhDong")
}

fun ghiNhatKyKhongKieu(hanhDong: String) {
    println("[NHAT KY] $hanhDong")
}

// Hai cach viet tuong duong nhau vi Unit la kieu tra ve mac dinh: khi than ham
// khong tra ve gia tri nao khac, trinh bien dich tu suy luan kieu tra ve la Unit.
fun main() {
    ghiNhatKyCoKieu("Dang nhap he thong")
    ghiNhatKyKhongKieu("Dang nhap he thong")
}
