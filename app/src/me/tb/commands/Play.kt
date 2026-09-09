package me.tb.commands

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.core.Context
import com.github.ajalt.clikt.parameters.arguments.argument

// The play command uses an argument.
// You call it like so: ks play chess
// Note that the argument is required and must be singular,
// e.g. `ks play chess checkers` will throw an error.

class Play : CliktCommand() {
    private val game by argument(help = "The game to play")

    override fun run() {
        echo(message = "Playing $game",)
    }

    override fun help(context: Context): String = "Play a game"
}
