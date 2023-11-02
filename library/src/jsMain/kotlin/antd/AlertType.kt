package antd


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
// language=JavaScript
@JsName("""(/*union*/{
    success: 'success', info: 'info', warning: 'warning', error: 'error'
}/*union*/)""")
sealed external interface AlertType {

    companion object {
        val success: AlertType
        val info: AlertType
        val warning: AlertType
        val error: AlertType
    }

}


object AlertTypeFactory {
    /**
     * default: [AlertType.info]
     */
    fun ofValue(value: String): AlertType {
        return when (value) {
            AlertType.success.toString() -> AlertType.success
            AlertType.warning.toString() -> AlertType.warning
            AlertType.error.toString() -> AlertType.error
            else -> AlertType.info
        }
    }
}
