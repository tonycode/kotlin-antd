package antd


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
// language=JavaScript
@JsName("""(/*union*/{
    small: 'small', default: 'default', large: 'large'
}/*union*/)""")
sealed external interface SpinSize {

    companion object {
        val small: SpinSize
        val default: SpinSize
        val large: SpinSize
    }

}


object SpinSizeFactory {
    fun ofValue(value: String): SpinSize {
        return when (value) {
            SpinSize.small.toString() -> SpinSize.small
            SpinSize.large.toString() -> SpinSize.large
            else -> SpinSize.default
        }
    }
}
