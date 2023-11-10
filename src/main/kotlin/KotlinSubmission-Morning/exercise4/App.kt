package `KotlinSubmission-Morning`.exercise4

fun main() {
    try {
        val result = divide(10, 0)
        println("Hasil pembagian: $result")
    } catch (e: ArithmeticException) {
        println("Terjadi kesalahan aritmatika: ${e.message}")
    }
}

fun divide(a: Int, b: Int): Int {
    if (b == 0) {
        throw ArithmeticException("Pembagian dengan nol tidak diizinkan.")
    }
    return a / b
}
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
