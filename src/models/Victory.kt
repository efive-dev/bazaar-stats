package models

enum class Victory {
    FLAWLESS,
    GOLD,
    SILVER,
    BRONZE,
    LOSS
}

fun formatVictory(game: Game): Victory {
    return if (game.flawless) {
        Victory.FLAWLESS
    }
    else {
        when (game.numberOfVictories) {
            10 -> Victory.GOLD
            in 7..9 -> Victory.SILVER
            in 4..6 -> Victory.BRONZE
            else -> Victory.LOSS
        }
    }
}