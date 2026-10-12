// Ho va ten: Nguyen Van Phuoc - MSSV: 25810035
// Bai 08: Xu ly van ban qua ham truyen vao
package com.example.ltdd.buoi03

fun xuLyVanBan(chuoi: String, xuLy: (String) -> String): String {
    return xuLy(chuoi)
}

fun vietHoaToanBo(chuoi: String): String {
    return chuoi.uppercase()
}

fun main() {
    // Cach 1: truyen lambda viet truc tiep tai cho
    val ketQua1 = xuLyVanBan("xin chao", { it.reversed() })
    println("Lambda tai cho: $ketQua1")

    // Cach 2: truyen ham da dat ten rieng thong qua toan tu ::
    val ketQua2 = xuLyVanBan("xin chao", ::vietHoaToanBo)
    println("Function reference: $ketQua2")

    // Cach 3: dung cu phap tham so cuoi, dua lambda ra ngoai dau ngoac
    val ketQua3 = xuLyVanBan("xin chao") { it.trim().replaceFirstChar { c -> c.uppercase() } }
    println("Lambda tham so cuoi: $ketQua3")
}
