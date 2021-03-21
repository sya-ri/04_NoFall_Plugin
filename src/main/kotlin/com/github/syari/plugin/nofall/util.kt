package com.github.syari.plugin.nofall

import com.github.syari.spigot.api.string.toColor
import org.bukkit.command.CommandSender

fun CommandSender.send(message: String) {
    sendMessage("&b[NoFall] &r$message".toColor())
}