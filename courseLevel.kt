enum class courseLevel(val description: String) {
    N5("Beginner"),
    N4("Upper Beginner"),
    N3("Intermediate Level"),
    N2("Advanced Level"),
    N1("Near-Native Level");

    fun nextLevel(): courseLevel {
        return when (this) {
            N5 -> N4
            N4 -> N3
            N3 -> N2
            N2 -> N1
            N1 -> N1
        }
    }
}