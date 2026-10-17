// 25810035 _ Nguyen Van Phuoc
// Bai 06: Ke thua va ghi de cho lop dong vat
package com.example.ltdd.buoi04

open class DongVat(val ten: String) {
    open fun keu(): String {
        return "..."
    }
}

class Cho(ten: String) : DongVat(ten) {
    override fun keu(): String {
        return "Gau gau"
    }
}

class Meo(ten: String) : DongVat(ten) {
    override fun keu(): String {
        return "Meo meo"
    }
}

fun main() {
    val danhSachDongVat = listOf(Cho("Lu"), Meo("Mit"))

    for (dongVat in danhSachDongVat) {
        println("${dongVat.ten} keu: ${dongVat.keu()}")
    }
}
