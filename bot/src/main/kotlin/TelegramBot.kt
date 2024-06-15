package com.kushat

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import org.telegram.telegrambots.bots.TelegramLongPollingBot
import org.telegram.telegrambots.meta.api.methods.send.SendMessage
import org.telegram.telegrambots.meta.api.objects.Update

@Component
class TelegramBot(@Value("\${telegram.bot.token}") token: String) : TelegramLongPollingBot(token) {
    override fun getBotUsername(): String {
        return "Testik_1234_bot"
    }

    override fun onUpdateReceived(update: Update) {
        if (update.hasMessage() && update.message.hasPhoto()) {
            val chatId = update.message.chatId
            val photo = update.message.photo.last().fileId
            val responseText = processImage(photo)
            sendMessage(chatId, responseText)
        }
    }

    private fun processImage(fileId: String): String {
        return "Pizza: 100"
    }

    private fun sendMessage(chatId: Long, text: String) {
        val message = SendMessage()
        message.chatId = chatId.toString()
        message.text = text
        kotlin.runCatching {
            execute(message)
        }.onFailure {
            it.printStackTrace()
        }
    }
}
