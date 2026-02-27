package Model
import androidx.annotation.DrawableRes

data class Food(
    val nama: String,
    val deskripsi: String,
    val harga: String,
    @DrawableRes val Imageres: Int
)