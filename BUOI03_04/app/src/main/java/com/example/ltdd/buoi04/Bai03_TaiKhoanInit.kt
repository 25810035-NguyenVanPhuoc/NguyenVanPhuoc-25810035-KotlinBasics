// 25810035 _ Nguyen Van Phuoc
// Bai 03: Kiem tra hop le bang khoi init
package com.example.ltdd.buoi04

class TaiKhoanNganHang(val soTaiKhoan: String, soDuBanDau: Double) {
    var soDu: Double = soDuBanDau

    init {
        if (soDuBanDau < 0) {
            println("So du khong hop le")
        } else {
            println("Tao tai khoan thanh cong, so du ban dau: $soDuBanDau")
        }
    }
}

fun main() {
    val taiKhoan1 = TaiKhoanNganHang("TK001", 1000000.0)
    val taiKhoan2 = TaiKhoanNganHang("TK002", -500000.0)
}
