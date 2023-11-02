package antd


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
// language=JavaScript
@JsName("""(/*union*/{
    small: 'small', middle: 'middle', large: 'large'
}/*union*/)""")
sealed external interface Size {

    companion object {
        val small: Size
        val middle: Size
        val large: Size
    }

}


object SizeFactory {
    /**
     * default: [Size.small]
     */
    fun ofValue(value: String): Size {
        return when (value) {
            Size.middle.toString() -> Size.middle
            Size.large.toString() -> Size.large
            else -> Size.small
        }
    }
}
