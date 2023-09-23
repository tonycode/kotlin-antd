package antd


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
// language=JavaScript
@JsName("""(/*union*/{
    default: 'default', button: 'button'
}/*union*/)""")
sealed external interface RadioOptionType {

    companion object {
        val default: RadioOptionType
        val button: RadioOptionType
    }

}


object RadioOptionTypeFactory {
    fun ofValue(value: String): RadioOptionType {
        return when (value) {
            RadioOptionType.button.toString() -> RadioOptionType.button
            else -> RadioOptionType.default
        }
    }
}
