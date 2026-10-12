// 25810035 _ Nguyen Van Phuoc
// Bai 02: Phan biet tham so co va khong co val, constructor phu
package com.example.ltdd.buoi04

class NhanVien(maNhanVien: String, val ten: String, var luongThang: Double) {
    constructor(ten: String) : this("TAM", ten, 0.0)
}

fun main() {
    val nv1 = NhanVien("NV001", "Nguyen Van A", 8000000.0)
    // nv1.maNhanVien se bao loi bien dich vi maNhanVien la tham so constructor
    // khong khai bao val/var nen khong tro thanh thuoc tinh (property) cua class,
    // chi ton tai ben trong constructor, khong the truy cap qua dau cham tu ben ngoai.

    val nv2 = NhanVien("Tran Thi B")

    println("NV1: ${nv1.ten} - ${nv1.luongThang}")
    println("NV2: ${nv2.ten} - ${nv2.luongThang}")
}
