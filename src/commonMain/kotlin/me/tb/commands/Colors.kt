package me.tb.commands

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.core.Context

class Colors : CliktCommand() {
    override fun run() {
        echo("Hello, Colors!")
    }

    override fun help(context: Context): String = "Show some colors"
}
