// Họ tên: Hồ Thanh Tình - MSSV: 25810044
fun main() {
    val danhSachSach = mutableListOf(
        "Doraemon",
        "Conan",
        "Shin",
        "Dragon Ball",
        "Naruto"
    )

    println("danh sách ban đầu")
    for (sach in danhSachSach) {
        println("- $sach")
    }

    danhSachSach.add("One Piece")
    danhSachSach.add("HxH")
    danhSachSach.remove("One Piece")
    danhSachSach.sort()

    println("danh sách sau")
    for (sach in danhSachSach) {
        println("- $sach")
    }
}
