class SayiTahminOyunu {
    private val rastgeleSayi = (1..100).random()
    var denemeSayisi = 0

    fun tahminYap(tahmin: Int): String {
        denemeSayisi++
        return when {
            tahmin < rastgeleSayi -> "Daha büyük bir sayı girin."
            tahmin > rastgeleSayi -> "Daha küçük bir sayı girin."
            else -> "Tebrikler! $denemeSayisi denemede buldunuz."
        }
    }
}