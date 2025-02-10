package me.tb.commands

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.core.Context

class Enums : CliktCommand() {

    override fun run() {
        // echo("Hello, $color")
    }

    override fun help(context: Context): String = "Choose a color"
}
