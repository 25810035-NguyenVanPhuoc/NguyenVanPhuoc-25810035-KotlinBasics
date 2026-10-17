// 25810035 _ Nguyen Van Phuoc
// Bai 09: Hai extension function cho String va Int
package com.example.ltdd.buoi04

fun String.demNguyenAm(): Int {
    val nguyenAm = "aeiouAEIOU"
    return this.count { it in nguyenAm }
}

fun Int.laSoNguyenTo(): Boolean {
    if (this < 2) return false
    for (i in 2..Math.sqrt(this.toDouble()).toInt()) {
        if (this % i == 0) return false
    }
    return true
}

fun main() {
    println("Xin chao the gioi".demNguyenAm())
    println("Kotlin Programming".demNguyenAm())
    println("Android Studio".demNguyenAm())

    println(7.laSoNguyenTo())
    println(10.laSoNguyenTo())
    println(13.laSoNguyenTo())
}
