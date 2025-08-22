package models

enum class Hero {
    VANESSA,
    DOOLEY,
    PYGMALIEN,
    MAK,
    STELLE
}

fun formatHero(hero: Hero): String {
    return when (hero) {
        Hero.VANESSA -> "Vanessa"
        Hero.DOOLEY -> "Dooley"
        Hero.PYGMALIEN -> "PYGMALIEN"
        Hero.MAK -> "Mak"
        Hero.STELLE -> "Stelle"
    }
}