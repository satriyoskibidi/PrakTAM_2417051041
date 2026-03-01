package Model

data class News(
    val judul: String,
    val kategori: String,
    val tanggal: String,
    val deskripsi: String = "",
    val Imageres: Int
)