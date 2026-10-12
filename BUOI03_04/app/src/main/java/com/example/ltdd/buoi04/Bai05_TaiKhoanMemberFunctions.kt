// 25810035 _ Nguyen Van Phuoc
// Bai 05: Ham thanh vien cho tai khoan ngan hang
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

    fun napTien(soTien: Double) {
        soDu += soTien
        println("Nap $soTien, so du hien tai: $soDu")
    }

    fun rutTien(soTien: Double): Boolean {
        if (soTien > soDu) {
            println("Rut $soTien that bai, so du khong du")
            return false
        }
        soDu -= soTien
        println("Rut $soTien thanh cong, so du hien tai: $soDu")
        return true
    }
}

fun main() {
    val taiKhoan = TaiKhoanNganHang("TK001", 1000000.0)
    taiKhoan.napTien(500000.0)
    taiKhoan.rutTien(2000000.0)
    taiKhoan.rutTien(300000.0)
}
