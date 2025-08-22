package models

data class Game(
    val numberOfVictories: Int,
    val numberOfLosses: Int,
) {
    init {
        if (numberOfVictories !in 0..10)
            throw IllegalArgumentException("The number of victories must be between 0 and 10")
    }
    val flawless: Boolean = numberOfVictories == 10 && numberOfLosses == 0
}
