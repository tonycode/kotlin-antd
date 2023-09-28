package antd


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
// language=JavaScript
@JsName("""(/*union*/{
    default: 'default', small: 'small'
}/*union*/)""")
sealed external interface SwitchSize {

    companion object {
        val default: SwitchSize
        val small: SwitchSize
    }

}


object SwitchSizeFactory {
    fun ofValue(value: String): SwitchSize {
        return when (value) {
            SwitchSize.small.toString() -> SwitchSize.small
            else -> SwitchSize.default
        }
    }
}
