enum class GameResult(val label: String) {
    WIN("승리"),
    LOSE("패배"),
    DRAW("무승부")
}


interface Playable {
    fun play(opponent: RockPaperScissors): GameResult
}

enum class RockPaperScissors(val label: String, val value: Int): Playable {
    ROCK("바위", 0) {
        override fun play(opponent: RockPaperScissors): GameResult = when (opponent) {
            PAPER -> GameResult.LOSE
            SCISSORS -> GameResult.WIN
            ROCK -> GameResult.DRAW
        }
    },
    PAPER("보", 1) {
        override fun play(opponent: RockPaperScissors): GameResult = when (opponent) {
            PAPER -> GameResult.DRAW
            SCISSORS -> GameResult.LOSE
            ROCK -> GameResult.WIN
        }
    },
    SCISSORS("가위", 2) {
        override fun play(opponent: RockPaperScissors): GameResult = when (opponent) {
            PAPER -> GameResult.WIN
            SCISSORS -> GameResult.DRAW
            ROCK -> GameResult.LOSE
        }
    };
    companion object {
        fun random(): RockPaperScissors {
            return values().random()
        }
    }
}