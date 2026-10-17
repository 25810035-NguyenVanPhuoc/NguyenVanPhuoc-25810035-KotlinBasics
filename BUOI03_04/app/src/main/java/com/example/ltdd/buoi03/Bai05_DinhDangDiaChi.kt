// Ho va ten: Nguyen Van Phuoc - MSSV: 25810035
// Bai 05: Dinh dang dia chi giao hang
package com.example.ltdd.buoi03

fun dinhDangDiaChi(
    soNha: String,
    tenDuong: String,
    phuongXa: String = "Chua cap nhat",
    quanHuyen: String = "Chua cap nhat",
    thanhPho: String = "TP.HCM"
): String {
    return "$soNha $tenDuong, $phuongXa, $quanHuyen, $thanhPho"
}

fun main() {
    val diaChi = dinhDangDiaChi(
        "123",
        "Vo Van Ngan",
        phuongXa = "Linh Chieu",
        quanHuyen = "TP Thu Duc",
        thanhPho = "TP.HCM"
    )
    println(diaChi)
}
