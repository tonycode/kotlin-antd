package antd


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
// language=JavaScript
@JsName("""(/*union*/{
    large: 'large', middle: 'middle', small: 'small'
}/*union*/)""")
sealed external interface Size {

    companion object {
        val large: Size
        val middle: Size
        val small: Size
    }

}


object SizeFactory {
    fun ofValue(value: String): Size {
        return when (value) {
            Size.small.toString() -> Size.small
            Size.large.toString() -> Size.large
            else -> Size.middle
        }
    }
}
