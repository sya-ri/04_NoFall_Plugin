package com.github.syari.plugin.nofall

import com.github.syari.plugin.nofall.Main.Companion.plugin
import com.github.syari.spigot.api.config.config
import com.github.syari.spigot.api.config.type.ConfigDataType
import org.bukkit.command.CommandSender

object ConfigLoader {
    var isEnable = false

    fun load(sender: CommandSender) {
        plugin.config(sender, "config.yml") {
            isEnable = get("enable", ConfigDataType.Boolean, default = false)
        }
    }
}
