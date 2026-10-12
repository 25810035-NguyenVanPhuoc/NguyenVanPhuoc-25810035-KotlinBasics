// Ho va ten: Nguyen Van Phuoc - MSSV: 25810035
// Bai 07: Bo kiem tra mat khau bang lambda
package com.example.ltdd.buoi03

fun main() {
    val kiemTraDoDai: (String) -> Boolean = { matKhau -> matKhau.length >= 8 }

    val matKhau1 = "12345"
    val matKhau2 = "matkhau123"
    val matKhau3 = "abcdefg"

    println("$matKhau1 -> ${kiemTraDoDai(matKhau1)}")
    println("$matKhau2 -> ${kiemTraDoDai(matKhau2)}")
    println("$matKhau3 -> ${kiemTraDoDai(matKhau3)}")
}
