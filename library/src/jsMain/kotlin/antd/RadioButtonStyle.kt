package antd


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
// language=JavaScript
@JsName("""(/*union*/{
    outline: 'outline', solid: 'solid'
}/*union*/)""")
sealed external interface RadioButtonStyle {

    companion object {
        val outline: RadioButtonStyle
        val solid: RadioButtonStyle
    }

}


object RadioButtonStyleFactory {
    fun ofValue(value: String): RadioButtonStyle {
        return when (value) {
            RadioButtonStyle.outline.toString() -> RadioButtonStyle.outline
            else -> RadioButtonStyle.outline
        }
    }
}
