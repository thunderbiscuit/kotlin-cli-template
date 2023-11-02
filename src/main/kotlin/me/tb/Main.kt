package me.tb

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.options.default
import com.github.ajalt.clikt.parameters.options.help
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.options.prompt
import com.github.ajalt.clikt.parameters.types.int

fun main(args: Array<String>) = Hello().main(args)

class Hello : CliktCommand() {
    private val count: Int by option().int().default(1).help("Number of greetings")
    private val name: String by option().prompt("Your name").help("The person to greet")

    override fun run() {
        repeat(count) {
            echo("Hello $name!")
        }
    }
}
