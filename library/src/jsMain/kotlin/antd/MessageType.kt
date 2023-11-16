package antd


//
// Extensions for [MessageApi]
//

enum class MessageType {
    SUCCESS,
    ERROR,
    INFO,
    WARNING,
    LOADING,
}

object MessageTypeFactory {
    fun ofValue(value: String): MessageType {
        return MessageType.entries.firstOrNull {
            it.name.lowercase() == value.trim().lowercase()
        } ?: MessageType.INFO
    }
}


fun MessageApi.open(type: MessageType, content: String) {
    when (type) {
        MessageType.SUCCESS -> this.success(content)
        MessageType.ERROR -> this.error(content)
        MessageType.INFO -> this.info(content)
        MessageType.WARNING -> this.warning(content)
        MessageType.LOADING -> this.loading(content)
    }
}
