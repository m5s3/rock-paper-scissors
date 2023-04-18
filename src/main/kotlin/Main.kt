fun main(args: Array<String>) {
    while (true) {
        print("Enter your choice (rock, paper, or scissors) [if you quit press 0]: ")
        val userInput: String? = readlnOrNull()
        if (userInput == "0") {
            break
        }
        val player = userInput?.uppercase()?.let {
            RockPaperScissors.valueOf(it)
        }
        println(player)

        val computerChoice = RockPaperScissors.random()
        println(computerChoice)
        println(player!!.play(computerChoice))
    }

    println("test")
}