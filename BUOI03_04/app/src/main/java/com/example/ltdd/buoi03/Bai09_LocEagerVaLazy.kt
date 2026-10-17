// Ho va ten: Nguyen Van Phuoc - MSSV: 25810035
// Bai 09: So sanh loc eager va lazy tren danh sach
package com.example.ltdd.buoi03

fun main() {
    val nhacCu = listOf("Trong", "Trumpet", "Trombone", "Violin", "Guitar", "Trumpet nho", "Sao")

    // Loc thong thuong (eager): tao ngay danh sach ket qua
    val ketQuaEager = nhacCu.filter { it.startsWith("Tr") }
    println("Loc thong thuong (eager): $ketQuaEager")

    // Loc qua Sequence (lazy): nen dung khi danh sach lon va co nhieu buoc bien doi
    // lien tiep, vi Sequence xu ly lazy tung phan tu qua tat ca cac buoc thay vi
    // tao danh sach trung gian cho moi buoc nhu cach thong thuong.
    val ketQuaLazy = nhacCu.asSequence().filter { it.startsWith("Tr") }.toList()
    println("Loc qua Sequence (lazy): $ketQuaLazy")
}
