package me.tb.commands

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.core.Context
import com.github.ajalt.clikt.parameters.arguments.argument

class Scream : CliktCommand() {
    val message: String by argument(help = "The message to scream")

    override fun run() {
        echo(message.uppercase())
    }

    override fun help(context: Context): String {
        return "Repeat really loud"
    }
}
